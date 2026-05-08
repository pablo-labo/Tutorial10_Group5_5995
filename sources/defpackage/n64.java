package defpackage;

import android.annotation.TargetApi;
import android.os.StrictMode;
import io.jsonwebtoken.JwtParser;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class n64 implements Closeable {
    public BufferedWriter X;
    public int Z;
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final long f;
    public long W = 0;
    public final LinkedHashMap<String, d> Y = new LinkedHashMap<>(0, 0.75f, true);
    public long a0 = 0;
    public final ThreadPoolExecutor b0 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
    public final a c0 = new a();
    public final int e = 1;
    public final int V = 1;

    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            synchronized (n64.this) {
                try {
                    n64 n64Var = n64.this;
                    if (n64Var.X == null) {
                        return null;
                    }
                    n64Var.h0();
                    if (n64.this.N()) {
                        n64.this.d0();
                        n64.this.Z = 0;
                    }
                    return null;
                } finally {
                }
            }
        }
    }

    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {
        public final d a;
        public final boolean[] b;
        public boolean c;

        public c(d dVar) {
            this.a = dVar;
            this.b = dVar.e ? null : new boolean[n64.this.V];
        }

        public final void a() {
            n64.a(n64.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (n64.this) {
                try {
                    d dVar = this.a;
                    if (dVar.f != this) {
                        throw new IllegalStateException();
                    }
                    if (!dVar.e) {
                        this.b[0] = true;
                    }
                    file = dVar.d[0];
                    n64.this.a.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return file;
        }
    }

    public final class d {
        public final String a;
        public final long[] b;
        public final File[] c;
        public final File[] d;
        public boolean e;
        public c f;

        public d(String str) {
            this.a = str;
            int i = n64.this.V;
            File file = n64.this.a;
            this.b = new long[i];
            this.c = new File[i];
            this.d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append(JwtParser.SEPARATOR_CHAR);
            int length = sb.length();
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.c[i2] = new File(file, sb.toString());
                sb.append(".tmp");
                this.d[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    public final class e {
        public final File[] a;

        public e(File[] fileArr) {
            this.a = fileArr;
        }
    }

    public n64(File file, long j) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.f = j;
    }

    public static n64 P(File file, long j) throws IOException {
        if (j <= 0) {
            l5.q("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                f0(file2, file3, false);
            }
        }
        n64 n64Var = new n64(file, j);
        if (n64Var.b.exists()) {
            try {
                n64Var.W();
                n64Var.Q();
                return n64Var;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                n64Var.close();
                wjg.a(n64Var.a);
            }
        }
        file.mkdirs();
        n64 n64Var2 = new n64(file, j);
        n64Var2.d0();
        return n64Var2;
    }

    public static void a(n64 n64Var, c cVar, boolean z) {
        synchronized (n64Var) {
            d dVar = cVar.a;
            if (dVar.f != cVar) {
                throw new IllegalStateException();
            }
            if (z && !dVar.e) {
                for (int i = 0; i < n64Var.V; i++) {
                    if (!cVar.b[i]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!dVar.d[i].exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < n64Var.V; i2++) {
                File file = dVar.d[i2];
                if (!z) {
                    p(file);
                } else if (file.exists()) {
                    File file2 = dVar.c[i2];
                    file.renameTo(file2);
                    long j = dVar.b[i2];
                    long length = file2.length();
                    dVar.b[i2] = length;
                    n64Var.W = (n64Var.W - j) + length;
                }
            }
            n64Var.Z++;
            dVar.f = null;
            if (dVar.e || z) {
                dVar.e = true;
                n64Var.X.append((CharSequence) "CLEAN");
                n64Var.X.append(' ');
                n64Var.X.append((CharSequence) dVar.a);
                n64Var.X.append((CharSequence) dVar.a());
                n64Var.X.append('\n');
                if (z) {
                    n64Var.a0++;
                }
            } else {
                n64Var.Y.remove(dVar.a);
                n64Var.X.append((CharSequence) "REMOVE");
                n64Var.X.append(' ');
                n64Var.X.append((CharSequence) dVar.a);
                n64Var.X.append('\n');
            }
            v(n64Var.X);
            if (n64Var.W > n64Var.f || n64Var.N()) {
                n64Var.b0.submit(n64Var.c0);
            }
        }
    }

    public static void f0(File file, File file2, boolean z) throws IOException {
        if (z) {
            p(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void h(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void p(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void v(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final synchronized e G(String str) {
        if (this.X == null) {
            throw new IllegalStateException("cache is closed");
        }
        d dVar = this.Y.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.e) {
            return null;
        }
        for (File file : dVar.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.Z++;
        this.X.append((CharSequence) "READ");
        this.X.append(' ');
        this.X.append((CharSequence) str);
        this.X.append('\n');
        if (N()) {
            this.b0.submit(this.c0);
        }
        return new e(dVar.c);
    }

    public final boolean N() {
        int i = this.Z;
        return i >= 2000 && i >= this.Y.size();
    }

    public final void Q() throws IOException {
        p(this.c);
        Iterator<d> it = this.Y.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f;
            int i = this.V;
            int i2 = 0;
            if (cVar == null) {
                while (i2 < i) {
                    this.W += next.b[i2];
                    i2++;
                }
            } else {
                next.f = null;
                while (i2 < i) {
                    p(next.c[i2]);
                    p(next.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void W() {
        File file = this.b;
        vue vueVar = new vue(new FileInputStream(file), wjg.a);
        try {
            String strA = vueVar.a();
            String strA2 = vueVar.a();
            String strA3 = vueVar.a();
            String strA4 = vueVar.a();
            String strA5 = vueVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.e).equals(strA3) || !Integer.toString(this.V).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    b0(vueVar.a());
                    i++;
                } catch (EOFException unused) {
                    this.Z = i - this.Y.size();
                    if (vueVar.e == -1) {
                        d0();
                    } else {
                        this.X = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), wjg.a));
                    }
                    try {
                        vueVar.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                vueVar.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void b0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            r40.h("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap<String, d> linkedHashMap = this.Y;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        d dVar = linkedHashMap.get(strSubstring);
        if (dVar == null) {
            dVar = new d(strSubstring);
            linkedHashMap.put(strSubstring, dVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f = new c(dVar);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                r40.h("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        dVar.e = true;
        dVar.f = null;
        if (strArrSplit.length != n64.this.V) {
            w20.o(Arrays.toString(strArrSplit), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                dVar.b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                w20.o(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.X == null) {
                return;
            }
            Iterator it = new ArrayList(this.Y.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            h0();
            h(this.X);
            this.X = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d0() {
        try {
            BufferedWriter bufferedWriter = this.X;
            if (bufferedWriter != null) {
                h(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), wjg.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.V));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d dVar : this.Y.values()) {
                    if (dVar.f != null) {
                        bufferedWriter2.write("DIRTY " + dVar.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.a + dVar.a() + '\n');
                    }
                }
                h(bufferedWriter2);
                if (this.b.exists()) {
                    f0(this.b, this.d, true);
                }
                f0(this.c, this.b, false);
                this.d.delete();
                this.X = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), wjg.a));
            } catch (Throwable th) {
                h(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void h0() {
        while (this.W > this.f) {
            String key = this.Y.entrySet().iterator().next().getKey();
            synchronized (this) {
                try {
                    if (this.X == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    d dVar = this.Y.get(key);
                    if (dVar != null && dVar.f == null) {
                        for (int i = 0; i < this.V; i++) {
                            File file = dVar.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.W;
                            long[] jArr = dVar.b;
                            this.W = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.Z++;
                        this.X.append((CharSequence) "REMOVE");
                        this.X.append(' ');
                        this.X.append((CharSequence) key);
                        this.X.append('\n');
                        this.Y.remove(key);
                        if (N()) {
                            this.b0.submit(this.c0);
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final c s(String str) {
        synchronized (this) {
            try {
                if (this.X == null) {
                    throw new IllegalStateException("cache is closed");
                }
                d dVar = this.Y.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.Y.put(str, dVar);
                } else if (dVar.f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f = cVar;
                this.X.append((CharSequence) "DIRTY");
                this.X.append(' ');
                this.X.append((CharSequence) str);
                this.X.append('\n');
                v(this.X);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
