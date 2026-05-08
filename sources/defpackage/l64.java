package defpackage;

import defpackage.v03;
import defpackage.y03;
import io.jsonwebtoken.JwtParser;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class l64 implements AutoCloseable {
    public static final pxc g0 = new pxc("[a-z0-9_-]{1,120}");
    public final eu2 V;
    public final Object W;
    public long X;
    public int Y;
    public tqc Z;
    public final w5b a;
    public boolean a0;
    public final long b;
    public boolean b0;
    public final w5b c;
    public boolean c0;
    public final w5b d;
    public boolean d0;
    public final w5b e;
    public boolean e0;
    public final LinkedHashMap f;
    public final j64 f0;

    @uh3(c = "coil3.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return l64.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            l64 l64Var = l64.this;
            synchronized (l64Var.W) {
                if (!l64Var.b0 || l64Var.c0) {
                    return j6g.a;
                }
                try {
                    l64Var.W();
                } catch (IOException unused) {
                    l64Var.d0 = true;
                }
                try {
                    if (l64Var.Y >= 2000) {
                        l64Var.d0();
                    }
                } catch (IOException unused2) {
                    l64Var.e0 = true;
                    l64Var.Z = new tqc(new gh1());
                }
                return j6g.a;
            }
        }
    }

    public final class b {
        public final c a;
        public boolean b;
        public final boolean[] c = new boolean[2];

        public b(c cVar) {
            this.a = cVar;
        }

        public final void a(boolean z) {
            l64 l64Var = l64.this;
            synchronized (l64Var.W) {
                try {
                    if (this.b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (wl7.b(this.a.g, this)) {
                        l64.a(l64Var, this, z);
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
            l64 l64Var = l64.this;
            synchronized (l64Var.W) {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.c[i] = true;
                w5b w5bVar2 = this.a.d.get(i);
                va5.a(l64Var.f0, w5bVar2);
                w5bVar = w5bVar2;
            }
            return w5bVar;
        }
    }

    public final class c {
        public final String a;
        public final long[] b = new long[2];
        public final ArrayList<w5b> c = new ArrayList<>(2);
        public final ArrayList<w5b> d = new ArrayList<>(2);
        public boolean e;
        public boolean f;
        public b g;
        public int h;

        public c(String str) {
            this.a = str;
            StringBuilder sb = new StringBuilder(str);
            sb.append(JwtParser.SEPARATOR_CHAR);
            int length = sb.length();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                this.c.add(l64.this.a.h(sb.toString()));
                sb.append(".tmp");
                this.d.add(l64.this.a.h(sb.toString()));
                sb.setLength(length);
            }
        }

        public final d a() {
            if (!this.e || this.g != null || this.f) {
                return null;
            }
            ArrayList<w5b> arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                l64 l64Var = l64.this;
                if (i >= size) {
                    this.h++;
                    return l64Var.new d(this);
                }
                if (!l64Var.f0.g(arrayList.get(i))) {
                    try {
                        l64Var.Q(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i++;
            }
        }
    }

    public final class d implements AutoCloseable {
        public final c a;
        public boolean b;

        public d(c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            l64 l64Var = l64.this;
            synchronized (l64Var.W) {
                try {
                    c cVar = this.a;
                    int i = cVar.h - 1;
                    cVar.h = i;
                    if (i == 0 && cVar.f) {
                        l64Var.Q(cVar);
                    }
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public l64(long j, y03 y03Var, pa5 pa5Var, w5b w5bVar) {
        this.a = w5bVar;
        this.b = j;
        if (j <= 0) {
            l5.q("maxSize <= 0");
            throw null;
        }
        this.c = w5bVar.h("journal");
        this.d = w5bVar.h("journal.tmp");
        this.e = w5bVar.h("journal.bkp");
        this.f = new LinkedHashMap(0, 0.75f, true);
        eze ezeVarA = wea.a();
        y03.a aVar = y03.b;
        this.V = f13.a(v03.a.C0438a.c(ezeVarA, y03Var.E1(1)));
        this.W = new Object();
        this.f0 = new j64(pa5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x010b A[Catch: all -> 0x0033, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0011, B:12:0x0018, B:14:0x001e, B:16:0x002e, B:24:0x003c, B:27:0x0056, B:29:0x0065, B:31:0x0073, B:33:0x007a, B:28:0x005a, B:37:0x009a, B:39:0x00a1, B:42:0x00a6, B:44:0x00b7, B:47:0x00bc, B:52:0x00f7, B:54:0x0102, B:59:0x010e, B:58:0x010b, B:48:0x00d4, B:50:0x00e9, B:51:0x00f4, B:36:0x008a, B:62:0x0112, B:63:0x0119), top: B:66:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.l64 r10, l64.b r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l64.a(l64, l64$b, boolean):void");
    }

    public static void b0(String str) {
        if (g0.d(str)) {
            return;
        }
        h5.k(ja.f('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final void G() {
        Iterator it = this.f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i = 0;
            if (cVar.g == null) {
                while (i < 2) {
                    j += cVar.b[i];
                    i++;
                }
            } else {
                cVar.g = null;
                while (i < 2) {
                    w5b w5bVar = cVar.c.get(i);
                    j64 j64Var = this.f0;
                    j64Var.f(w5bVar);
                    j64Var.f(cVar.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.X = j;
    }

    public final void N() throws Throwable {
        j64 j64Var = this.f0;
        w5b w5bVar = this.c;
        uqc uqcVarK = c0h.k(j64Var.m(w5bVar));
        try {
            String strS = uqcVarK.S(Long.MAX_VALUE);
            String strS2 = uqcVarK.S(Long.MAX_VALUE);
            String strS3 = uqcVarK.S(Long.MAX_VALUE);
            String strS4 = uqcVarK.S(Long.MAX_VALUE);
            String strS5 = uqcVarK.S(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strS) || !"1".equals(strS2) || !wl7.b(String.valueOf(3), strS3) || !wl7.b(String.valueOf(2), strS4) || strS5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strS + ", " + strS2 + ", " + strS3 + ", " + strS4 + ", " + strS5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    P(uqcVarK.S(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.Y = i - this.f.size();
                    if (uqcVarK.W0()) {
                        j64Var.getClass();
                        w5bVar.getClass();
                        this.Z = new tqc(new g75(j64Var.a(w5bVar), new me(this, 6)));
                    } else {
                        d0();
                    }
                    j6g j6gVar = j6g.a;
                    try {
                        uqcVarK.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                uqcVarK.close();
            } catch (Throwable th3) {
                boa.h(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
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
        LinkedHashMap linkedHashMap = this.f;
        if (iR2 == -1) {
            strSubstring = str.substring(i);
            if (iR == 6 && wve.K(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iR2);
        }
        Object cVar = linkedHashMap.get(strSubstring);
        if (cVar == null) {
            cVar = new c(strSubstring);
            linkedHashMap.put(strSubstring, cVar);
        }
        c cVar2 = (c) cVar;
        if (iR2 == -1 || iR != 5 || !wve.K(str, "CLEAN", false)) {
            if (iR2 == -1 && iR == 5 && wve.K(str, "DIRTY", false)) {
                cVar2.g = new b(cVar2);
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
        cVar2.e = true;
        cVar2.g = null;
        if (listJ0.size() != 2) {
            z3.p(listJ0, "unexpected journal line: ");
            return;
        }
        try {
            int size = listJ0.size();
            for (int i2 = 0; i2 < size; i2++) {
                cVar2.b[i2] = Long.parseLong((String) listJ0.get(i2));
            }
        } catch (NumberFormatException unused) {
            z3.p(listJ0, "unexpected journal line: ");
        }
    }

    public final void Q(c cVar) {
        tqc tqcVar;
        int i = cVar.h;
        String str = cVar.a;
        if (i > 0 && (tqcVar = this.Z) != null) {
            tqcVar.Y("DIRTY");
            tqcVar.writeByte(32);
            tqcVar.Y(str);
            tqcVar.writeByte(10);
            tqcVar.flush();
        }
        if (cVar.h > 0 || cVar.g != null) {
            cVar.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.f0.f(cVar.c.get(i2));
            long j = this.X;
            long[] jArr = cVar.b;
            this.X = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.Y++;
        tqc tqcVar2 = this.Z;
        if (tqcVar2 != null) {
            tqcVar2.Y("REMOVE");
            tqcVar2.writeByte(32);
            tqcVar2.Y(str);
            tqcVar2.writeByte(10);
            tqcVar2.flush();
        }
        this.f.remove(str);
        if (this.Y >= 2000) {
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
            long r0 = r4.X
            long r2 = r4.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            l64$c r1 = (l64.c) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.Q(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.d0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l64.W():void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.W) {
            try {
                if (this.b0 && !this.c0) {
                    for (c cVar : (c[]) this.f.values().toArray(new c[0])) {
                        b bVar = cVar.g;
                        if (bVar != null) {
                            c cVar2 = bVar.a;
                            if (wl7.b(cVar2.g, bVar)) {
                                cVar2.f = true;
                            }
                        }
                    }
                    W();
                    f13.c(this.V, null);
                    tqc tqcVar = this.Z;
                    tqcVar.getClass();
                    tqcVar.close();
                    this.Z = null;
                    this.c0 = true;
                    j6g j6gVar = j6g.a;
                    return;
                }
                this.c0 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d0() {
        Throwable th;
        synchronized (this.W) {
            try {
                tqc tqcVar = this.Z;
                if (tqcVar != null) {
                    tqcVar.close();
                }
                tqc tqcVarJ = c0h.j(this.f0.l(this.d, false));
                try {
                    tqcVarJ.Y("libcore.io.DiskLruCache");
                    tqcVarJ.writeByte(10);
                    tqcVarJ.Y("1");
                    tqcVarJ.writeByte(10);
                    tqcVarJ.z0(3L);
                    tqcVarJ.writeByte(10);
                    tqcVarJ.z0(2L);
                    tqcVarJ.writeByte(10);
                    tqcVarJ.writeByte(10);
                    for (c cVar : this.f.values()) {
                        if (cVar.g != null) {
                            tqcVarJ.Y("DIRTY");
                            tqcVarJ.writeByte(32);
                            tqcVarJ.Y(cVar.a);
                            tqcVarJ.writeByte(10);
                        } else {
                            tqcVarJ.Y("CLEAN");
                            tqcVarJ.writeByte(32);
                            tqcVarJ.Y(cVar.a);
                            for (long j : cVar.b) {
                                tqcVarJ.writeByte(32);
                                tqcVarJ.z0(j);
                            }
                            tqcVarJ.writeByte(10);
                        }
                    }
                    j6g j6gVar = j6g.a;
                    try {
                        tqcVarJ.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        tqcVarJ.close();
                    } catch (Throwable th4) {
                        boa.h(th3, th4);
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                boolean zG = this.f0.g(this.c);
                j64 j64Var = this.f0;
                if (zG) {
                    j64Var.b(this.c, this.e);
                    this.f0.b(this.d, this.c);
                    this.f0.f(this.e);
                } else {
                    j64Var.b(this.d, this.c);
                }
                j64 j64Var2 = this.f0;
                w5b w5bVar = this.c;
                j64Var2.getClass();
                w5bVar.getClass();
                this.Z = new tqc(new g75(j64Var2.a(w5bVar), new me(this, 6)));
                this.Y = 0;
                this.a0 = false;
                this.e0 = false;
                j6g j6gVar2 = j6g.a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public final b h(String str) {
        synchronized (this.W) {
            if (this.c0) {
                throw new IllegalStateException("cache is closed");
            }
            b0(str);
            s();
            c cVar = (c) this.f.get(str);
            if ((cVar != null ? cVar.g : null) != null) {
                return null;
            }
            if (cVar != null && cVar.h != 0) {
                return null;
            }
            if (!this.d0 && !this.e0) {
                tqc tqcVar = this.Z;
                tqcVar.getClass();
                tqcVar.Y("DIRTY");
                tqcVar.writeByte(32);
                tqcVar.Y(str);
                tqcVar.writeByte(10);
                tqcVar.flush();
                if (this.a0) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new c(str);
                    this.f.put(str, cVar);
                }
                b bVar = new b(cVar);
                cVar.g = bVar;
                return bVar;
            }
            v();
            return null;
        }
    }

    public final d p(String str) {
        d dVarA;
        synchronized (this.W) {
            if (this.c0) {
                throw new IllegalStateException("cache is closed");
            }
            b0(str);
            s();
            c cVar = (c) this.f.get(str);
            if (cVar != null && (dVarA = cVar.a()) != null) {
                boolean z = true;
                this.Y++;
                tqc tqcVar = this.Z;
                tqcVar.getClass();
                tqcVar.Y("READ");
                tqcVar.writeByte(32);
                tqcVar.Y(str);
                tqcVar.writeByte(10);
                tqcVar.flush();
                if (this.Y < 2000) {
                    z = false;
                }
                if (z) {
                    v();
                }
                return dVarA;
            }
            return null;
        }
    }

    public final void s() {
        synchronized (this.W) {
            try {
                if (this.b0) {
                    return;
                }
                this.f0.f(this.d);
                if (this.f0.g(this.e)) {
                    boolean zG = this.f0.g(this.c);
                    j64 j64Var = this.f0;
                    w5b w5bVar = this.e;
                    if (zG) {
                        j64Var.f(w5bVar);
                    } else {
                        j64Var.b(w5bVar, this.c);
                    }
                }
                if (this.f0.g(this.c)) {
                    try {
                        N();
                        G();
                        this.b0 = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            va5.b(this.f0, this.a);
                            this.c0 = false;
                            d0();
                            this.b0 = true;
                            j6g j6gVar = j6g.a;
                        } catch (Throwable th) {
                            this.c0 = false;
                            throw th;
                        }
                    }
                }
                d0();
                this.b0 = true;
                j6g j6gVar2 = j6g.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void v() {
        u63.Y(this.V, null, null, new a(null), 3);
    }
}
