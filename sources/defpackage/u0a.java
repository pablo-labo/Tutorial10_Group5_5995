package defpackage;

import defpackage.c1a;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class u0a implements m55 {
    public final long a;
    public final g4b b;
    public final c1a.a c;
    public final kw5 d;
    public final hr6 e;
    public final u54 f;
    public o55 g;
    public zpf h;
    public zpf i;
    public int j;
    public js9 k;
    public long l;
    public long m;
    public long n;
    public long o;
    public int p;
    public jyd q;
    public boolean r;
    public boolean s;
    public long t;

    public u0a(long j) {
        this.a = j;
        this.b = new g4b(10);
        this.c = new c1a.a();
        this.d = new kw5();
        this.l = -9223372036854775807L;
        this.e = new hr6();
        u54 u54Var = new u54();
        this.f = u54Var;
        this.i = u54Var;
        this.o = -1L;
    }

    public final void a() {
        zxd zxdVar = this.q;
        if ((zxdVar instanceof qp2) && ((pp2) zxdVar).h()) {
            long j = this.o;
            if (j == -1 || j == this.q.g()) {
                return;
            }
            qp2 qp2Var = (qp2) this.q;
            this.q = new qp2(this.o, qp2Var.h, qp2Var.i, qp2Var.j, qp2Var.k);
            o55 o55Var = this.g;
            o55Var.getClass();
            o55Var.b(this.q);
            this.h.getClass();
            this.q.k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x032d A[LOOP:2: B:153:0x032b->B:154:0x032d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.m55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(defpackage.n55 r54, defpackage.dhb r55) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u0a.b(n55, dhb):int");
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) {
        return g(n55Var, true);
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        this.j = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.p = 0;
        this.t = j2;
        if (this.q instanceof ja7) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(defpackage.n55 r9) {
        /*
            r8 = this;
            jyd r0 = r8.q
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.g()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.j()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L27
        L1b:
            g4b r8 = r8.b     // Catch: java.io.EOFException -> L27
            byte[] r8 = r8.a     // Catch: java.io.EOFException -> L27
            r0 = 0
            r2 = 4
            boolean r8 = r9.d(r8, r0, r2, r1)     // Catch: java.io.EOFException -> L27
            r8 = r8 ^ r1
            return r8
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u0a.e(n55):boolean");
    }

    public final boolean g(n55 n55Var, boolean z) throws Throwable {
        int iJ;
        int i;
        int iA;
        int i2 = z ? 32768 : 131072;
        n55Var.f();
        if (n55Var.getPosition() == 0) {
            g4b g4bVar = this.e.a;
            int i3 = 0;
            js9 js9VarJ1 = null;
            while (true) {
                try {
                    n55Var.h(0, g4bVar.a, 10);
                    g4bVar.J(0);
                    if (g4bVar.A() != 4801587) {
                        break;
                    }
                    g4bVar.K(3);
                    int iW = g4bVar.w();
                    int i4 = iW + 10;
                    if (js9VarJ1 == null) {
                        byte[] bArr = new byte[i4];
                        System.arraycopy(g4bVar.a, 0, bArr, 0, 10);
                        n55Var.h(10, bArr, iW);
                        js9VarJ1 = new fr6(null).J1(i4, bArr);
                    } else {
                        n55Var.k(iW);
                    }
                    i3 += i4;
                } catch (EOFException unused) {
                }
            }
            n55Var.f();
            n55Var.k(i3);
            this.k = js9VarJ1;
            if (js9VarJ1 != null) {
                this.d.b(js9VarJ1);
            }
            iJ = (int) n55Var.j();
            if (!z) {
                n55Var.n(iJ);
            }
            i = 0;
        } else {
            iJ = 0;
            i = 0;
        }
        int i5 = i;
        int i6 = i5;
        while (true) {
            if (!e(n55Var)) {
                g4b g4bVar2 = this.b;
                g4bVar2.J(0);
                int iJ2 = g4bVar2.j();
                if ((i == 0 || ((-128000) & iJ2) == (((long) i) & (-128000))) && (iA = c1a.a(iJ2)) != -1) {
                    i5++;
                    if (i5 != 1) {
                        if (i5 == 4) {
                            break;
                        }
                    } else {
                        this.c.a(iJ2);
                        i = iJ2;
                    }
                    n55Var.k(iA - 4);
                } else {
                    int i7 = i6 + 1;
                    if (i6 == i2) {
                        if (z) {
                            return false;
                        }
                        a();
                        k20.n();
                        return false;
                    }
                    if (z) {
                        n55Var.f();
                        n55Var.k(iJ + i7);
                    } else {
                        n55Var.n(1);
                    }
                    i5 = 0;
                    i6 = i7;
                    i = 0;
                }
            } else if (i5 <= 0) {
                a();
                k20.n();
                return false;
            }
        }
        if (z) {
            n55Var.n(iJ + i6);
        } else {
            n55Var.f();
        }
        this.j = i;
        return true;
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        this.g = o55Var;
        zpf zpfVarO = o55Var.o(0, 1);
        this.h = zpfVarO;
        this.i = zpfVarO;
        this.g.m();
    }

    @Override // defpackage.m55
    public final void release() {
    }

    public u0a(int i) {
        this(-9223372036854775807L);
    }
}
