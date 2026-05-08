package defpackage;

import defpackage.v03;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i64 implements Closeable, Flushable {
    public static final pxc f0 = new pxc("[a-z0-9_-]{1,120}");
    public final eu2 V;
    public long W;
    public int X;
    public tqc Y;
    public boolean Z;
    public final w5b a;
    public boolean a0;
    public final long b;
    public boolean b0;
    public final w5b c;
    public boolean c0;
    public final w5b d;
    public boolean d0;
    public final w5b e;
    public final k64 e0;
    public final LinkedHashMap<String, b> f;

    public final class a {
        public final b a;
        public boolean b;
        public final boolean[] c = new boolean[2];

        public a(b bVar) {
            this.a = bVar;
        }

        public final void a(boolean z) {
            i64 i64Var = i64.this;
            synchronized (i64Var) {
                try {
                    if (this.b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (wl7.b(this.a.g, this)) {
                        i64.a(i64Var, this, z);
                    }
                    this.b = true;
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final w5b b(int i) {
            w5b w5bVar;
            i64 i64Var = i64.this;
            synchronized (i64Var) {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.c[i] = true;
                w5b w5bVar2 = this.a.d.get(i);
                k64 k64Var = i64Var.e0;
                w5b w5bVar3 = w5bVar2;
                if (!k64Var.g(w5bVar3)) {
                    m.a(k64Var.l(w5bVar3, false));
                }
                w5bVar = w5bVar2;
            }
            return w5bVar;
        }
    }

    public final class b {
        public final String a;
        public final long[] b = new long[2];
        public final ArrayList<w5b> c = new ArrayList<>(2);
        public final ArrayList<w5b> d = new ArrayList<>(2);
        public boolean e;
        public boolean f;
        public a g;
        public int h;

        public b(String str) {
            this.a = str;
            StringBuilder sb = new StringBuilder(str);
            sb.append(JwtParser.SEPARATOR_CHAR);
            int length = sb.length();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                this.c.add(i64.this.a.h(sb.toString()));
                sb.append(".tmp");
                this.d.add(i64.this.a.h(sb.toString()));
                sb.setLength(length);
            }
        }

        public final c a() {
            if (!this.e || this.g != null || this.f) {
                return null;
            }
            ArrayList<w5b> arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                i64 i64Var = i64.this;
                if (i >= size) {
                    this.h++;
                    return i64Var.new c(this);
                }
                if (!i64Var.e0.g(arrayList.get(i))) {
                    try {
                        i64Var.Q(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i++;
            }
        }
    }

    public final class c implements Closeable {
        public final b a;
        public boolean b;

        public c(b bVar) {
            this.a = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            i64 i64Var = i64.this;
            synchronized (i64Var) {
                try {
                    b bVar = this.a;
                    int i = bVar.h - 1;
                    bVar.h = i;
                    if (i == 0 && bVar.f) {
                        pxc pxcVar = i64.f0;
                        i64Var.Q(bVar);
                    }
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @uh3(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public d(lu2<? super d> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return i64.this.new d(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            i64 i64Var = i64.this;
            synchronized (i64Var) {
                if (!i64Var.a0 || i64Var.b0) {
                    return j6g.a;
                }
                try {
                    i64Var.W();
                } catch (IOException unused) {
                    i64Var.c0 = true;
                }
                try {
                    if (i64Var.X >= 2000) {
                        i64Var.d0();
                    }
                } catch (IOException unused2) {
                    i64Var.d0 = true;
                    i64Var.Y = new tqc(new gh1());
                }
                return j6g.a;
            }
        }
    }

    public i64(long j, y03 y03Var, pa5 pa5Var, w5b w5bVar) {
        this.a = w5bVar;
        this.b = j;
        if (j <= 0) {
            l5.q("maxSize <= 0");
            throw null;
        }
        this.c = w5bVar.h("journal");
        this.d = w5bVar.h("journal.tmp");
        this.e = w5bVar.h("journal.bkp");
        this.f = new LinkedHashMap<>(0, 0.75f, true);
        this.V = f13.a(v03.a.C0438a.c(wea.a(), y03Var.E1(1)));
        this.e0 = new k64(pa5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0113 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000f, B:11:0x0016, B:13:0x001c, B:15:0x002c, B:23:0x003a, B:26:0x0054, B:30:0x006d, B:32:0x007b, B:34:0x0082, B:27:0x0058, B:29:0x0066, B:38:0x00a2, B:40:0x00a9, B:43:0x00ae, B:45:0x00bf, B:48:0x00c4, B:53:0x00ff, B:55:0x010a, B:59:0x0113, B:49:0x00dc, B:51:0x00f1, B:52:0x00fc, B:37:0x0092, B:62:0x0118, B:63:0x011f), top: B:66:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.i64 r9, i64.a r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i64.a(i64, i64$a, boolean):void");
    }

    public static void b0(String str) {
        if (f0.d(str)) {
            return;
        }
        h5.k(ja.f('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final void G() {
        Iterator<b> it = this.f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            b next = it.next();
            int i = 0;
            if (next.g == null) {
                while (i < 2) {
                    j += next.b[i];
                    i++;
                }
            } else {
                next.g = null;
                while (i < 2) {
                    w5b w5bVar = next.c.get(i);
                    k64 k64Var = this.e0;
                    k64Var.f(w5bVar);
                    k64Var.f(next.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.W = j;
    }

    public final void N() throws Throwable {
        j6g j6gVar;
        k64 k64Var = this.e0;
        w5b w5bVar = this.c;
        uqc uqcVarK = c0h.k(k64Var.m(w5bVar));
        Throwable th = null;
        try {
            String strS = uqcVarK.S(Long.MAX_VALUE);
            String strS2 = uqcVarK.S(Long.MAX_VALUE);
            String strS3 = uqcVarK.S(Long.MAX_VALUE);
            String strS4 = uqcVarK.S(Long.MAX_VALUE);
            String strS5 = uqcVarK.S(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strS) || !"1".equals(strS2) || !wl7.b(String.valueOf(1), strS3) || !wl7.b(String.valueOf(2), strS4) || strS5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strS + ", " + strS2 + ", " + strS3 + ", " + strS4 + ", " + strS5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    P(uqcVarK.S(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.X = i - this.f.size();
                    if (uqcVarK.W0()) {
                        k64Var.getClass();
                        w5bVar.getClass();
                        this.Y = new tqc(new h75(k64Var.a(w5bVar), new m64(this)));
                    } else {
                        d0();
                    }
                    j6gVar = j6g.a;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            j6gVar = null;
        }
        try {
            uqcVarK.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            } else {
                boa.h(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
        j6gVar.getClass();
    }

    public final void P(String str) throws IOException {
        String strSubstring;
        int iR = zve.R(str, ' ', 0, false, 6);
        if (iR == -1) {
            r40.h("unexpected journal line: ".concat(str));
            return;
        }
        int i = iR + 1;
        int iR2 = zve.R(str, ' ', i, false, 4);
        LinkedHashMap<String, b> linkedHashMap = this.f;
        if (iR2 == -1) {
            strSubstring = str.substring(i);
            if (iR == 6 && wve.K(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iR2);
        }
        b bVar = linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        b bVar2 = bVar;
        if (iR2 == -1 || iR != 5 || !wve.K(str, "CLEAN", false)) {
            if (iR2 == -1 && iR == 5 && wve.K(str, "DIRTY", false)) {
                bVar2.g = new a(bVar2);
                return;
            } else {
                if (iR2 == -1 && iR == 4 && wve.K(str, "READ", false)) {
                    return;
                }
                r40.h("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listJ0 = zve.j0(str.substring(iR2 + 1), new char[]{' '});
        bVar2.e = true;
        bVar2.g = null;
        if (listJ0.size() != 2) {
            z3.p(listJ0, "unexpected journal line: ");
            return;
        }
        try {
            int size = listJ0.size();
            for (int i2 = 0; i2 < size; i2++) {
                bVar2.b[i2] = Long.parseLong((String) listJ0.get(i2));
            }
        } catch (NumberFormatException unused) {
            z3.p(listJ0, "unexpected journal line: ");
        }
    }

    public final void Q(b bVar) {
        tqc tqcVar;
        int i = bVar.h;
        String str = bVar.a;
        if (i > 0 && (tqcVar = this.Y) != null) {
            tqcVar.Y("DIRTY");
            tqcVar.writeByte(32);
            tqcVar.Y(str);
            tqcVar.writeByte(10);
            tqcVar.flush();
        }
        if (bVar.h > 0 || bVar.g != null) {
            bVar.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.e0.f(bVar.c.get(i2));
            long j = this.W;
            long[] jArr = bVar.b;
            this.W = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.X++;
        tqc tqcVar2 = this.Y;
        if (tqcVar2 != null) {
            tqcVar2.Y("REMOVE");
            tqcVar2.writeByte(32);
            tqcVar2.Y(str);
            tqcVar2.writeByte(10);
        }
        this.f.remove(str);
        if (this.X >= 2000) {
            v();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        Q(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W() {
        /*
            r4 = this;
        L0:
            long r0 = r4.W
            long r2 = r4.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap<java.lang.String, i64$b> r0 = r4.f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            i64$b r1 = (i64.b) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.Q(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.c0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i64.W():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.a0 && !this.b0) {
                Object[] array = this.f.values().toArray(new b[0]);
                array.getClass();
                for (b bVar : (b[]) array) {
                    a aVar = bVar.g;
                    if (aVar != null) {
                        b bVar2 = aVar.a;
                        if (wl7.b(bVar2.g, aVar)) {
                            bVar2.f = true;
                        }
                    }
                }
                W();
                f13.c(this.V, null);
                tqc tqcVar = this.Y;
                tqcVar.getClass();
                tqcVar.close();
                this.Y = null;
                this.b0 = true;
                return;
            }
            this.b0 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d0() {
        j6g j6gVar;
        try {
            tqc tqcVar = this.Y;
            if (tqcVar != null) {
                tqcVar.close();
            }
            tqc tqcVarJ = c0h.j(this.e0.l(this.d, false));
            Throwable th = null;
            try {
                tqcVarJ.Y("libcore.io.DiskLruCache");
                tqcVarJ.writeByte(10);
                tqcVarJ.Y("1");
                tqcVarJ.writeByte(10);
                tqcVarJ.z0(1L);
                tqcVarJ.writeByte(10);
                tqcVarJ.z0(2L);
                tqcVarJ.writeByte(10);
                tqcVarJ.writeByte(10);
                for (b bVar : this.f.values()) {
                    if (bVar.g != null) {
                        tqcVarJ.Y("DIRTY");
                        tqcVarJ.writeByte(32);
                        tqcVarJ.Y(bVar.a);
                        tqcVarJ.writeByte(10);
                    } else {
                        tqcVarJ.Y("CLEAN");
                        tqcVarJ.writeByte(32);
                        tqcVarJ.Y(bVar.a);
                        for (long j : bVar.b) {
                            tqcVarJ.writeByte(32);
                            tqcVarJ.z0(j);
                        }
                        tqcVarJ.writeByte(10);
                    }
                }
                j6gVar = j6g.a;
            } catch (Throwable th2) {
                j6gVar = null;
                th = th2;
            }
            try {
                tqcVarJ.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else {
                    boa.h(th, th3);
                }
            }
            if (th != null) {
                throw th;
            }
            j6gVar.getClass();
            boolean zG = this.e0.g(this.c);
            k64 k64Var = this.e0;
            if (zG) {
                k64Var.b(this.c, this.e);
                this.e0.b(this.d, this.c);
                this.e0.f(this.e);
            } else {
                k64Var.b(this.d, this.c);
            }
            k64 k64Var2 = this.e0;
            w5b w5bVar = this.c;
            k64Var2.getClass();
            w5bVar.getClass();
            this.Y = new tqc(new h75(k64Var2.a(w5bVar), new m64(this)));
            this.X = 0;
            this.Z = false;
            this.d0 = false;
        } finally {
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.a0) {
            if (this.b0) {
                throw new IllegalStateException("cache is closed");
            }
            W();
            tqc tqcVar = this.Y;
            tqcVar.getClass();
            tqcVar.flush();
        }
    }

    public final synchronized a h(String str) {
        if (this.b0) {
            throw new IllegalStateException("cache is closed");
        }
        b0(str);
        s();
        b bVar = this.f.get(str);
        if ((bVar != null ? bVar.g : null) != null) {
            return null;
        }
        if (bVar != null && bVar.h != 0) {
            return null;
        }
        if (!this.c0 && !this.d0) {
            tqc tqcVar = this.Y;
            tqcVar.getClass();
            tqcVar.Y("DIRTY");
            tqcVar.writeByte(32);
            tqcVar.Y(str);
            tqcVar.writeByte(10);
            tqcVar.flush();
            if (this.Z) {
                return null;
            }
            if (bVar == null) {
                bVar = new b(str);
                this.f.put(str, bVar);
            }
            a aVar = new a(bVar);
            bVar.g = aVar;
            return aVar;
        }
        v();
        return null;
    }

    public final synchronized c p(String str) {
        c cVarA;
        if (this.b0) {
            throw new IllegalStateException("cache is closed");
        }
        b0(str);
        s();
        b bVar = this.f.get(str);
        if (bVar != null && (cVarA = bVar.a()) != null) {
            boolean z = true;
            this.X++;
            tqc tqcVar = this.Y;
            tqcVar.getClass();
            tqcVar.Y("READ");
            tqcVar.writeByte(32);
            tqcVar.Y(str);
            tqcVar.writeByte(10);
            if (this.X < 2000) {
                z = false;
            }
            if (z) {
                v();
            }
            return cVarA;
        }
        return null;
    }

    public final synchronized void s() {
        try {
            if (this.a0) {
                return;
            }
            this.e0.f(this.d);
            if (this.e0.g(this.e)) {
                boolean zG = this.e0.g(this.c);
                k64 k64Var = this.e0;
                w5b w5bVar = this.e;
                if (zG) {
                    k64Var.f(w5bVar);
                } else {
                    k64Var.b(w5bVar, this.c);
                }
            }
            if (this.e0.g(this.c)) {
                try {
                    N();
                    G();
                    this.a0 = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        cr8.l(this.e0, this.a);
                        this.b0 = false;
                        d0();
                        this.a0 = true;
                    } catch (Throwable th) {
                        this.b0 = false;
                        throw th;
                    }
                }
            }
            d0();
            this.a0 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void v() {
        u63.Y(this.V, null, null, new d(null), 3);
    }
}
