package okhttp3.internal.cache;

import defpackage.dxa;
import defpackage.fie;
import defpackage.fq5;
import defpackage.gh1;
import defpackage.h5;
import defpackage.j6g;
import defpackage.ja;
import defpackage.l5;
import defpackage.l6;
import defpackage.pne;
import defpackage.pxc;
import defpackage.r40;
import defpackage.tqc;
import defpackage.uqc;
import defpackage.wl7;
import defpackage.wve;
import defpackage.z3;
import defpackage.zve;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiskLruCache implements Closeable, Flushable {
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final long n0;
    public static final pxc o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public long V;
    public tqc W;
    public final LinkedHashMap<String, Entry> X;
    public int Y;
    public boolean Z;
    public final FileSystem a;
    public boolean a0;
    public final File b;
    public boolean b0;
    public final long c;
    public boolean c0;
    public final File d;
    public boolean d0;
    public final File e;
    public boolean e0;
    public final File f;
    public long f0;
    public final TaskQueue g0;
    public final DiskLruCache$cleanupTask$1 h0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Editor {
        public final Entry a;
        public final boolean[] b;
        public boolean c;

        public Editor(Entry entry) {
            boolean[] zArr;
            this.a = entry;
            if (entry.e) {
                zArr = null;
            } else {
                DiskLruCache.this.getClass();
                zArr = new boolean[2];
            }
            this.b = zArr;
        }

        public final void a() {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (wl7.b(this.a.g, this)) {
                        diskLruCache.h(this, false);
                    }
                    this.c = true;
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (wl7.b(this.a.g, this)) {
                        diskLruCache.h(this, true);
                    }
                    this.c = true;
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            Entry entry = this.a;
            if (wl7.b(entry.g, this)) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (diskLruCache.a0) {
                    diskLruCache.h(this, false);
                } else {
                    entry.f = true;
                }
            }
        }

        public final fie d(int i) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!wl7.b(this.a.g, this)) {
                        return new gh1();
                    }
                    if (!this.a.e) {
                        boolean[] zArr = this.b;
                        zArr.getClass();
                        zArr[i] = true;
                    }
                    try {
                        return new FaultHidingSink(diskLruCache.a.f((File) this.a.d.get(i)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                    } catch (FileNotFoundException unused) {
                        return new gh1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Entry {
        public final String a;
        public final long[] b;
        public final ArrayList c;
        public final ArrayList d;
        public boolean e;
        public boolean f;
        public Editor g;
        public int h;
        public long i;
        public final /* synthetic */ DiskLruCache j;

        public Entry(DiskLruCache diskLruCache, String str) {
            str.getClass();
            this.j = diskLruCache;
            this.a = str;
            diskLruCache.getClass();
            this.b = new long[2];
            this.c = new ArrayList();
            this.d = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append(JwtParser.SEPARATOR_CHAR);
            int length = sb.length();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                this.c.add(new File(this.j.b, sb.toString()));
                sb.append(".tmp");
                this.d.add(new File(this.j.b, sb.toString()));
                sb.setLength(length);
            }
        }

        public final Snapshot a() {
            byte[] bArr = Util.a;
            if (!this.e) {
                return null;
            }
            final DiskLruCache diskLruCache = this.j;
            if (!diskLruCache.a0 && (this.g != null || this.f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.b.clone();
            for (int i = 0; i < 2; i++) {
                try {
                    final pne pneVarE = diskLruCache.a.e((File) this.c.get(i));
                    if (!diskLruCache.a0) {
                        this.h++;
                        pneVarE = new fq5(pneVarE) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                            public boolean b;

                            @Override // defpackage.fq5, java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                super.close();
                                if (this.b) {
                                    return;
                                }
                                this.b = true;
                                DiskLruCache diskLruCache2 = diskLruCache;
                                DiskLruCache.Entry entry = this;
                                synchronized (diskLruCache2) {
                                    try {
                                        int i2 = entry.h - 1;
                                        entry.h = i2;
                                        if (i2 == 0 && entry.f) {
                                            diskLruCache2.b0(entry);
                                        }
                                        j6g j6gVar = j6g.a;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        };
                    }
                    arrayList.add(pneVarE);
                } catch (FileNotFoundException unused) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Util.c((pne) it.next());
                    }
                    try {
                        diskLruCache.b0(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            }
            return new Snapshot(this.j, this.a, this.i, arrayList, jArr);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Snapshot implements Closeable {
        public final String a;
        public final long b;
        public final ArrayList c;
        public final /* synthetic */ DiskLruCache d;

        public Snapshot(DiskLruCache diskLruCache, String str, long j, ArrayList arrayList, long[] jArr) {
            str.getClass();
            jArr.getClass();
            this.d = diskLruCache;
            this.a = str;
            this.b = j;
            this.c = arrayList;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                Util.c((pne) it.next());
            }
        }
    }

    static {
        new Companion(0);
        i0 = "journal";
        j0 = "journal.tmp";
        k0 = "journal.bkp";
        l0 = "libcore.io.DiskLruCache";
        m0 = "1";
        n0 = -1L;
        o0 = new pxc("[a-z0-9_-]{1,120}");
        p0 = "CLEAN";
        q0 = "DIRTY";
        r0 = "REMOVE";
        s0 = "READ";
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File file, long j, TaskRunner taskRunner) {
        fileSystem.getClass();
        taskRunner.getClass();
        this.a = fileSystem;
        this.b = file;
        this.c = j;
        this.X = new LinkedHashMap<>(0, 0.75f, true);
        this.g0 = taskRunner.e();
        final String strI = l6.i(new StringBuilder(), Util.g, " Cache");
        this.h0 = new Task(strI) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                DiskLruCache diskLruCache = this.e;
                synchronized (diskLruCache) {
                    if (!diskLruCache.b0 || diskLruCache.c0) {
                        return -1L;
                    }
                    try {
                        diskLruCache.d0();
                    } catch (IOException unused) {
                        diskLruCache.d0 = true;
                    }
                    try {
                        if (diskLruCache.G()) {
                            diskLruCache.W();
                            diskLruCache.Y = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.e0 = true;
                        diskLruCache.W = new tqc(new gh1());
                    }
                    return -1L;
                }
            }
        };
        if (j <= 0) {
            l5.q("maxSize <= 0");
            throw null;
        }
        this.d = new File(file, i0);
        this.e = new File(file, j0);
        this.f = new File(file, k0);
    }

    public static void f0(String str) {
        if (o0.d(str)) {
            return;
        }
        h5.k(ja.f('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final boolean G() {
        int i = this.Y;
        return i >= 2000 && i >= this.X.size();
    }

    public final void N() {
        File file = this.e;
        FileSystem fileSystem = this.a;
        fileSystem.h(file);
        Iterator<Entry> it = this.X.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            next.getClass();
            Entry entry = next;
            int i = 0;
            if (entry.g == null) {
                while (i < 2) {
                    this.V += entry.b[i];
                    i++;
                }
            } else {
                entry.g = null;
                while (i < 2) {
                    fileSystem.h((File) entry.c.get(i));
                    fileSystem.h((File) entry.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void P() throws IOException {
        FileSystem fileSystem = this.a;
        File file = this.d;
        uqc uqcVar = new uqc(fileSystem.e(file));
        try {
            String strS = uqcVar.S(Long.MAX_VALUE);
            String strS2 = uqcVar.S(Long.MAX_VALUE);
            String strS3 = uqcVar.S(Long.MAX_VALUE);
            String strS4 = uqcVar.S(Long.MAX_VALUE);
            String strS5 = uqcVar.S(Long.MAX_VALUE);
            if (!wl7.b(l0, strS) || !wl7.b(m0, strS2) || !wl7.b(String.valueOf(201105), strS3) || !wl7.b(String.valueOf(2), strS4) || strS5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strS + ", " + strS2 + ", " + strS4 + ", " + strS5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    Q(uqcVar.S(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.Y = i - this.X.size();
                    if (uqcVar.W0()) {
                        this.W = new tqc(new FaultHidingSink(fileSystem.c(file), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
                    } else {
                        W();
                    }
                    j6g j6gVar = j6g.a;
                    uqcVar.close();
                    return;
                }
            }
        } finally {
        }
    }

    public final void Q(String str) throws IOException {
        String strSubstring;
        int iR = zve.R(str, ' ', 0, false, 6);
        if (iR == -1) {
            r40.h("unexpected journal line: ".concat(str));
            return;
        }
        int i = iR + 1;
        int iR2 = zve.R(str, ' ', i, false, 4);
        LinkedHashMap<String, Entry> linkedHashMap = this.X;
        if (iR2 == -1) {
            strSubstring = str.substring(i);
            String str2 = r0;
            if (iR == str2.length() && wve.K(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iR2);
        }
        Entry entry = linkedHashMap.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            linkedHashMap.put(strSubstring, entry);
        }
        if (iR2 != -1) {
            String str3 = p0;
            if (iR == str3.length() && wve.K(str, str3, false)) {
                List listJ0 = zve.j0(str.substring(iR2 + 1), new char[]{' '});
                entry.e = true;
                entry.g = null;
                int size = listJ0.size();
                entry.j.getClass();
                if (size != 2) {
                    z3.p(listJ0, "unexpected journal line: ");
                    return;
                }
                try {
                    int size2 = listJ0.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        entry.b[i2] = Long.parseLong((String) listJ0.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    z3.p(listJ0, "unexpected journal line: ");
                    return;
                }
            }
        }
        if (iR2 == -1) {
            String str4 = q0;
            if (iR == str4.length() && wve.K(str, str4, false)) {
                entry.g = new Editor(entry);
                return;
            }
        }
        if (iR2 == -1) {
            String str5 = s0;
            if (iR == str5.length() && wve.K(str, str5, false)) {
                return;
            }
        }
        r40.h("unexpected journal line: ".concat(str));
    }

    public final synchronized void W() {
        tqc tqcVar;
        Iterator<Entry> it;
        try {
            tqc tqcVar2 = this.W;
            if (tqcVar2 != null) {
                tqcVar2.close();
            }
            tqcVar = new tqc(this.a.f(this.e));
            try {
                tqcVar.Y(l0);
                tqcVar.writeByte(10);
                tqcVar.Y(m0);
                tqcVar.writeByte(10);
                tqcVar.z0(201105L);
                tqcVar.writeByte(10);
                tqcVar.z0(2L);
                tqcVar.writeByte(10);
                tqcVar.writeByte(10);
                it = this.X.values().iterator();
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Entry next = it.next();
            if (next.g != null) {
                tqcVar.Y(q0);
                tqcVar.writeByte(32);
                tqcVar.Y(next.a);
                tqcVar.writeByte(10);
            } else {
                tqcVar.Y(p0);
                tqcVar.writeByte(32);
                tqcVar.Y(next.a);
                for (long j : next.b) {
                    tqcVar.writeByte(32);
                    tqcVar.z0(j);
                }
                tqcVar.writeByte(10);
            }
            throw th;
        }
        j6g j6gVar = j6g.a;
        tqcVar.close();
        if (this.a.b(this.d)) {
            this.a.g(this.d, this.f);
        }
        this.a.g(this.e, this.d);
        this.a.h(this.f);
        this.W = new tqc(new FaultHidingSink(this.a.c(this.d), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
        this.Z = false;
        this.e0 = false;
    }

    public final synchronized void a() {
        if (this.c0) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void b0(Entry entry) {
        tqc tqcVar;
        String str = entry.a;
        if (!this.a0) {
            if (entry.h > 0 && (tqcVar = this.W) != null) {
                tqcVar.Y(q0);
                tqcVar.writeByte(32);
                tqcVar.Y(str);
                tqcVar.writeByte(10);
                tqcVar.flush();
            }
            if (entry.h > 0 || entry.g != null) {
                entry.f = true;
                return;
            }
        }
        Editor editor = entry.g;
        if (editor != null) {
            editor.c();
        }
        for (int i = 0; i < 2; i++) {
            this.a.h((File) entry.c.get(i));
            long j = this.V;
            long[] jArr = entry.b;
            this.V = j - jArr[i];
            jArr[i] = 0;
        }
        this.Y++;
        tqc tqcVar2 = this.W;
        if (tqcVar2 != null) {
            tqcVar2.Y(r0);
            tqcVar2.writeByte(32);
            tqcVar2.Y(str);
            tqcVar2.writeByte(10);
        }
        this.X.remove(str);
        if (G()) {
            this.g0.c(this.h0, 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.b0 && !this.c0) {
                Collection<Entry> collectionValues = this.X.values();
                collectionValues.getClass();
                for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                    Editor editor = entry.g;
                    if (editor != null) {
                        editor.c();
                    }
                }
                d0();
                tqc tqcVar = this.W;
                tqcVar.getClass();
                tqcVar.close();
                this.W = null;
                this.c0 = true;
                return;
            }
            this.c0 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        b0(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d0() {
        /*
            r4 = this;
        L0:
            long r0 = r4.V
            long r2 = r4.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r4.X
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            okhttp3.internal.cache.DiskLruCache$Entry r1 = (okhttp3.internal.cache.DiskLruCache.Entry) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.b0(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.d0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.d0():void");
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.b0) {
            a();
            d0();
            tqc tqcVar = this.W;
            tqcVar.getClass();
            tqcVar.flush();
        }
    }

    public final synchronized void h(Editor editor, boolean z) {
        Entry entry = editor.a;
        if (!wl7.b(entry.g, editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !entry.e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = editor.b;
                zArr.getClass();
                if (!zArr[i]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.a.b((File) entry.d.get(i))) {
                    editor.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            File file = (File) entry.d.get(i2);
            if (!z || entry.f) {
                this.a.h(file);
            } else if (this.a.b(file)) {
                File file2 = (File) entry.c.get(i2);
                this.a.g(file, file2);
                long j = entry.b[i2];
                long jD = this.a.d(file2);
                entry.b[i2] = jD;
                this.V = (this.V - j) + jD;
            }
        }
        entry.g = null;
        if (entry.f) {
            b0(entry);
            return;
        }
        this.Y++;
        tqc tqcVar = this.W;
        tqcVar.getClass();
        if (entry.e || z) {
            entry.e = true;
            tqcVar.Y(p0);
            tqcVar.writeByte(32);
            tqcVar.Y(entry.a);
            for (long j2 : entry.b) {
                tqcVar.writeByte(32);
                tqcVar.z0(j2);
            }
            tqcVar.writeByte(10);
            if (z) {
                long j3 = this.f0;
                this.f0 = 1 + j3;
                entry.i = j3;
            }
        } else {
            this.X.remove(entry.a);
            tqcVar.Y(r0);
            tqcVar.writeByte(32);
            tqcVar.Y(entry.a);
            tqcVar.writeByte(10);
        }
        tqcVar.flush();
        if (this.V > this.c || G()) {
            this.g0.c(this.h0, 0L);
        }
    }

    public final synchronized Editor p(long j, String str) {
        str.getClass();
        v();
        a();
        f0(str);
        Entry entry = this.X.get(str);
        if (j != n0 && (entry == null || entry.i != j)) {
            return null;
        }
        if ((entry != null ? entry.g : null) != null) {
            return null;
        }
        if (entry != null && entry.h != 0) {
            return null;
        }
        if (!this.d0 && !this.e0) {
            tqc tqcVar = this.W;
            tqcVar.getClass();
            tqcVar.Y(q0);
            tqcVar.writeByte(32);
            tqcVar.Y(str);
            tqcVar.writeByte(10);
            tqcVar.flush();
            if (this.Z) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, str);
                this.X.put(str, entry);
            }
            Editor editor = new Editor(entry);
            entry.g = editor;
            return editor;
        }
        this.g0.c(this.h0, 0L);
        return null;
    }

    public final synchronized Snapshot s(String str) {
        str.getClass();
        v();
        a();
        f0(str);
        Entry entry = this.X.get(str);
        if (entry == null) {
            return null;
        }
        Snapshot snapshotA = entry.a();
        if (snapshotA == null) {
            return null;
        }
        this.Y++;
        tqc tqcVar = this.W;
        tqcVar.getClass();
        tqcVar.Y(s0);
        tqcVar.writeByte(32);
        tqcVar.Y(str);
        tqcVar.writeByte(10);
        if (G()) {
            this.g0.c(this.h0, 0L);
        }
        return snapshotA;
    }

    public final synchronized void v() {
        boolean z;
        try {
            byte[] bArr = Util.a;
            if (this.b0) {
                return;
            }
            if (this.a.b(this.f)) {
                boolean zB = this.a.b(this.d);
                FileSystem fileSystem = this.a;
                File file = this.f;
                if (zB) {
                    fileSystem.h(file);
                } else {
                    fileSystem.g(file, this.d);
                }
            }
            FileSystem fileSystem2 = this.a;
            File file2 = this.f;
            fileSystem2.getClass();
            file2.getClass();
            dxa dxaVarF = fileSystem2.f(file2);
            try {
                try {
                    fileSystem2.h(file2);
                    dxaVarF.close();
                    z = true;
                } finally {
                }
            } catch (IOException unused) {
                j6g j6gVar = j6g.a;
                dxaVarF.close();
                fileSystem2.h(file2);
                z = false;
            }
            this.a0 = z;
            if (this.a.b(this.d)) {
                try {
                    P();
                    N();
                    this.b0 = true;
                    return;
                } catch (IOException e) {
                    Platform.a.getClass();
                    Platform platform = Platform.b;
                    String str = "DiskLruCache " + this.b + " is corrupt: " + e.getMessage() + ", removing";
                    platform.getClass();
                    Platform.i(5, str, e);
                    try {
                        close();
                        this.a.a(this.b);
                        this.c0 = false;
                        W();
                        this.b0 = true;
                    } catch (Throwable th) {
                        this.c0 = false;
                        throw th;
                    }
                }
            }
            W();
            this.b0 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "<init>", "()V", "", "ANY_SEQUENCE_NUMBER", "J", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "Lpxc;", "LEGAL_KEY_PATTERN", "Lpxc;", "MAGIC", "READ", "REMOVE", "VERSION_1", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
