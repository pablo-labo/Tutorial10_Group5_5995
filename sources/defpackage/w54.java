package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.ts1;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class w54 implements ts1 {
    public final ou7 c;
    public final LinkedHashMap a = new LinkedHashMap(16, 0.75f, true);
    public long b = 0;
    public final int d = 5242880;

    public w54(ou7 ou7Var) {
        this.c = ou7Var;
    }

    public static String c(String str) {
        int length = str.length() / 2;
        StringBuilder sbG = q6.g(String.valueOf(str.substring(0, length).hashCode()));
        sbG.append(String.valueOf(str.substring(length).hashCode()));
        return sbG.toString();
    }

    public static int h(b bVar) throws IOException {
        int i = bVar.read();
        if (i != -1) {
            return i;
        }
        k20.n();
        return 0;
    }

    public static int i(b bVar) {
        return (h(bVar) << 24) | h(bVar) | (h(bVar) << 8) | (h(bVar) << 16);
    }

    public static long j(b bVar) {
        return (((long) h(bVar)) & 255) | ((((long) h(bVar)) & 255) << 8) | ((((long) h(bVar)) & 255) << 16) | ((((long) h(bVar)) & 255) << 24) | ((((long) h(bVar)) & 255) << 32) | ((((long) h(bVar)) & 255) << 40) | ((((long) h(bVar)) & 255) << 48) | ((255 & ((long) h(bVar))) << 56);
    }

    public static String k(b bVar) {
        return new String(l(bVar, j(bVar)), "UTF-8");
    }

    public static byte[] l(b bVar, long j) throws IOException {
        long j2 = bVar.a - bVar.b;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbI = w40.i(j, "streamToBytes length=", ", maxLength=");
        sbI.append(j2);
        throw new IOException(sbI.toString());
    }

    public static void m(BufferedOutputStream bufferedOutputStream, int i) throws IOException {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static void n(BufferedOutputStream bufferedOutputStream, long j) throws IOException {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    public static void o(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        n(bufferedOutputStream, bytes.length);
        bufferedOutputStream.write(bytes, 0, bytes.length);
    }

    public final synchronized ts1.a a(String str) {
        a aVar = (a) this.a.get(str);
        if (aVar == null) {
            return null;
        }
        File fileB = b(str);
        try {
            b bVar = new b(new BufferedInputStream(new FileInputStream(fileB)), fileB.length());
            try {
                a aVarA = a.a(bVar);
                if (TextUtils.equals(str, aVarA.b)) {
                    return aVar.b(l(bVar, bVar.a - bVar.b));
                }
                jtg.b("%s: key=%s, found=%s", fileB.getAbsolutePath(), str, aVarA.b);
                a aVar2 = (a) this.a.remove(str);
                if (aVar2 != null) {
                    this.b -= aVar2.a;
                }
                return null;
            } finally {
                bVar.close();
            }
        } catch (IOException e) {
            jtg.b("%s: %s", fileB.getAbsolutePath(), e.toString());
            synchronized (this) {
                boolean zDelete = b(str).delete();
                a aVar3 = (a) this.a.remove(str);
                if (aVar3 != null) {
                    this.b -= aVar3.a;
                }
                if (!zDelete) {
                    jtg.b("Could not delete cache entry for key=%s, filename=%s", str, c(str));
                }
                return null;
            }
        }
    }

    public final File b(String str) {
        return new File(this.c.a(), c(str));
    }

    public final synchronized void d() {
        File fileA = this.c.a();
        if (!fileA.exists()) {
            if (!fileA.mkdirs()) {
                jtg.c("Unable to create cache dir %s", fileA.getAbsolutePath());
            }
            return;
        }
        File[] fileArrListFiles = fileA.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                long length = file.length();
                b bVar = new b(new BufferedInputStream(new FileInputStream(file)), length);
                try {
                    a aVarA = a.a(bVar);
                    aVarA.a = length;
                    g(aVarA.b, aVarA);
                    bVar.close();
                } catch (Throwable th) {
                    bVar.close();
                    throw th;
                }
            } catch (IOException unused) {
                file.delete();
            }
        }
    }

    public final void e() {
        long j = this.b;
        int i = this.d;
        if (j < i) {
            return;
        }
        int i2 = 0;
        if (jtg.a) {
            jtg.d("Pruning old cache entries.", new Object[0]);
        }
        long j2 = this.b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((Map.Entry) it.next()).getValue();
            if (b(aVar.b).delete()) {
                this.b -= aVar.a;
            } else {
                String str = aVar.b;
                jtg.b("Could not delete cache entry for key=%s, filename=%s", str, c(str));
            }
            it.remove();
            i2++;
            if (this.b < i * 0.9f) {
                break;
            }
        }
        if (jtg.a) {
            jtg.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.b - j2), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    public final synchronized void f(String str, ts1.a aVar) {
        BufferedOutputStream bufferedOutputStream;
        a aVar2;
        long length = this.b + ((long) aVar.a.length);
        int i = this.d;
        if (length <= i || r2.length <= i * 0.9f) {
            File fileB = b(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileB));
                aVar2 = new a(str, aVar);
            } catch (IOException unused) {
                if (!fileB.delete()) {
                    jtg.b("Could not clean up file %s", fileB.getAbsolutePath());
                }
                if (!this.c.a().exists()) {
                    jtg.b("Re-initializing cache after external clearing.", new Object[0]);
                    this.a.clear();
                    this.b = 0L;
                    d();
                }
            }
            if (!aVar2.c(bufferedOutputStream)) {
                bufferedOutputStream.close();
                jtg.b("Failed to write header for %s", fileB.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(aVar.a);
            bufferedOutputStream.close();
            aVar2.a = fileB.length();
            g(str, aVar2);
            e();
        }
    }

    public final void g(String str, a aVar) {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(str)) {
            this.b = (aVar.a - ((a) linkedHashMap.get(str)).a) + this.b;
        } else {
            this.b += aVar.a;
        }
        linkedHashMap.put(str, aVar);
    }

    public static class b extends FilterInputStream {
        public final long a;
        public long b;

        public b(BufferedInputStream bufferedInputStream, long j) {
            super(bufferedInputStream);
            this.a = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            int i = super.read();
            if (i != -1) {
                this.b++;
            }
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = super.read(bArr, i, i2);
            if (i3 != -1) {
                this.b += (long) i3;
            }
            return i3;
        }
    }

    public static class a {
        public long a;
        public final String b;
        public final String c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;
        public final List<pg6> h;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<pg6>] */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
        public a(String str, ts1.a aVar) {
            String str2 = aVar.b;
            long j = aVar.c;
            long j2 = aVar.d;
            long j3 = aVar.e;
            long j4 = aVar.f;
            ?? arrayList = aVar.h;
            if (arrayList == 0) {
                Map<String, String> map = aVar.g;
                arrayList = new ArrayList(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new pg6(entry.getKey(), entry.getValue()));
                }
            }
            this(str, str2, j, j2, j3, j4, arrayList);
        }

        public static a a(b bVar) throws IOException {
            if (w54.i(bVar) != 538247942) {
                throw new IOException();
            }
            String strK = w54.k(bVar);
            String strK2 = w54.k(bVar);
            long j = w54.j(bVar);
            long j2 = w54.j(bVar);
            long j3 = w54.j(bVar);
            long j4 = w54.j(bVar);
            int i = w54.i(bVar);
            if (i < 0) {
                r40.h(p6.c(i, "readHeaderList size="));
                return null;
            }
            List arrayList = i == 0 ? Collections.EMPTY_LIST : new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new pg6(w54.k(bVar).intern(), w54.k(bVar).intern()));
            }
            return new a(strK, strK2, j, j2, j3, j4, arrayList);
        }

        public final ts1.a b(byte[] bArr) {
            ts1.a aVar = new ts1.a();
            aVar.a = bArr;
            aVar.b = this.c;
            aVar.c = this.d;
            aVar.d = this.e;
            aVar.e = this.f;
            aVar.f = this.g;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            List<pg6> list = this.h;
            for (pg6 pg6Var : list) {
                treeMap.put(pg6Var.a, pg6Var.b);
            }
            aVar.g = treeMap;
            aVar.h = Collections.unmodifiableList(list);
            return aVar;
        }

        public final boolean c(BufferedOutputStream bufferedOutputStream) {
            try {
                w54.m(bufferedOutputStream, 538247942);
                w54.o(bufferedOutputStream, this.b);
                String str = this.c;
                if (str == null) {
                    str = "";
                }
                w54.o(bufferedOutputStream, str);
                w54.n(bufferedOutputStream, this.d);
                w54.n(bufferedOutputStream, this.e);
                w54.n(bufferedOutputStream, this.f);
                w54.n(bufferedOutputStream, this.g);
                List<pg6> list = this.h;
                if (list != null) {
                    w54.m(bufferedOutputStream, list.size());
                    for (pg6 pg6Var : list) {
                        w54.o(bufferedOutputStream, pg6Var.a);
                        w54.o(bufferedOutputStream, pg6Var.b);
                    }
                } else {
                    w54.m(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                return true;
            } catch (IOException e) {
                jtg.b("%s", e.toString());
                return false;
            }
        }

        public a(String str, String str2, long j, long j2, long j3, long j4, List<pg6> list) {
            this.b = str;
            this.c = "".equals(str2) ? null : str2;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = list;
        }
    }
}
