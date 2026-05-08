package defpackage;

import androidx.compose.runtime.r;
import defpackage.p2e;
import defpackage.u2e;
import defpackage.wle;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rgf {
    public final a A;
    public boolean B;
    public final c6g a;
    public roa b;
    public Function1<? super jhf, j6g> c;
    public lu8 d;
    public final g4a<jhf> e;
    public gu5<j6g> f;
    public y72 g;
    public e13 h;
    public dcb i;
    public ujf j;
    public yf6 k;
    public sm5 l;
    public final g4a m;
    public final g4a n;
    public long o;
    public kjf p;
    public long q;
    public final g4a r;
    public final g4a s;
    public int t;
    public jhf u;
    public uhe v;
    public kjf w;
    public final g4a x;
    public final tu2 y;
    public final b z;

    public static final class a implements b0a {
        public boolean a = true;
        public kjf b;

        public a() {
        }

        @Override // defpackage.b0a
        public final void a() {
            if (this.a) {
                rgf.a(rgf.this, this.b);
            }
        }

        @Override // defpackage.b0a
        public final boolean b(long j, u2e u2eVar) {
            lu8 lu8Var;
            rgf rgfVar = rgf.this;
            if (!rgfVar.j() || rgfVar.m().a.b.length() == 0 || (lu8Var = rgfVar.d) == null || lu8Var.d() == null) {
                return false;
            }
            d(rgfVar.m(), j, false, u2eVar);
            return true;
        }

        @Override // defpackage.b0a
        public final boolean c(long j, u2e u2eVar, int i) {
            lu8 lu8Var;
            rgf rgfVar = rgf.this;
            if (!rgfVar.j() || rgfVar.m().a.b.length() == 0 || (lu8Var = rgfVar.d) == null || lu8Var.d() == null) {
                return false;
            }
            sm5 sm5Var = rgfVar.l;
            if (sm5Var != null) {
                sm5.b(sm5Var);
            }
            rgfVar.o = j;
            rgfVar.t = -1;
            rgfVar.h(true);
            long jD = d(rgfVar.m(), rgfVar.o, true, u2eVar);
            if (i >= 2) {
                this.a = true;
                this.b = new kjf(jD);
            }
            return true;
        }

        public final long d(jhf jhfVar, long j, boolean z, u2e u2eVar) {
            rgf rgfVar = rgf.this;
            long jC = rgf.c(rgfVar, jhfVar, j, z, false, u2eVar, false);
            if (!kjf.a(this.b, jC)) {
                this.a = false;
            }
            rgfVar.p(kjf.c(jC) ? mf6.c : mf6.b);
            return jC;
        }
    }

    public static final class b implements udf {
        public boolean a = true;

        public b() {
        }

        @Override // defpackage.udf
        public final void a() {
        }

        @Override // defpackage.udf
        public final void b(long j) {
            long j2;
            nif nifVarD;
            nif nifVarD2;
            rgf rgfVar = rgf.this;
            g4a g4aVar = rgfVar.r;
            if (rgfVar.j() && ((jf6) ((gme) g4aVar).getValue()) == null) {
                ((gme) g4aVar).setValue(jf6.c);
                rgfVar.t = -1;
                this.a = true;
                rgfVar.n();
                lu8 lu8Var = rgfVar.d;
                if (lu8Var == null || (nifVarD2 = lu8Var.d()) == null || !nifVarD2.c(j)) {
                    j2 = j;
                    lu8 lu8Var2 = rgfVar.d;
                    if (lu8Var2 != null && (nifVarD = lu8Var2.d()) != null) {
                        int iA = rgfVar.b.a(nifVarD.b(j2, true));
                        jhf jhfVarE = rgf.e(rgfVar.m().a, cr8.c(iA, iA));
                        rgfVar.h(false);
                        yf6 yf6Var = rgfVar.k;
                        if (yf6Var != null) {
                            yf6Var.a(9);
                        }
                        rgfVar.c.invoke(jhfVarE);
                        rgfVar.w = new kjf(jhfVarE.b);
                    }
                    this.a = false;
                } else {
                    if (rgfVar.m().a.b.length() == 0) {
                        return;
                    }
                    rgfVar.h(false);
                    j2 = j;
                    rgfVar.p = new kjf(rgf.c(rgfVar, jhf.a(rgfVar.m(), null, kjf.b, 5), j, true, false, u2e.a.b, true));
                }
                rgfVar.p(mf6.a);
                rgfVar.o = j2;
                ((gme) rgfVar.s).setValue(new ooa(j2));
                rgfVar.q = 0L;
            }
        }

        @Override // defpackage.udf
        public final void c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
        @Override // defpackage.udf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(long r10) {
            /*
                Method dump skipped, instruction units count: 212
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: rgf.b.d(long):void");
        }

        public final void e() {
            rgf rgfVar = rgf.this;
            ((gme) rgfVar.r).setValue(null);
            ((gme) rgfVar.s).setValue(null);
            rgfVar.s(true);
            boolean zC = kjf.c(rgfVar.m().b);
            rgfVar.p(zC ? mf6.c : mf6.b);
            lu8 lu8Var = rgfVar.d;
            if (lu8Var != null) {
                ((gme) lu8Var.m).setValue(Boolean.valueOf(!zC && wgf.b(rgfVar, true)));
            }
            lu8 lu8Var2 = rgfVar.d;
            if (lu8Var2 != null) {
                ((gme) lu8Var2.n).setValue(Boolean.valueOf(!zC && wgf.b(rgfVar, false)));
            }
            lu8 lu8Var3 = rgfVar.d;
            if (lu8Var3 != null) {
                ((gme) lu8Var3.o).setValue(Boolean.valueOf(zC && wgf.b(rgfVar, true)));
            }
            if (this.a) {
                rgf.a(rgfVar, rgfVar.p);
            }
            rgfVar.p = null;
        }

        @Override // defpackage.udf
        public final void onCancel() {
            e();
        }

        @Override // defpackage.udf
        public final void onStop() {
            e();
        }
    }

    public rgf(c6g c6gVar) {
        this.a = c6gVar;
        this.b = clg.a;
        this.c = new lt(12);
        this.e = r.f(new jhf((String) null, 0L, 7));
        Boolean bool = Boolean.TRUE;
        this.m = r.f(bool);
        this.n = r.f(bool);
        this.o = 0L;
        this.q = 0L;
        this.r = r.f(null);
        this.s = r.f(null);
        this.t = -1;
        this.u = new jhf((String) null, 0L, 7);
        this.x = r.f(null);
        this.y = new tu2();
        this.z = new b();
        this.A = new a();
    }

    public static final void a(rgf rgfVar, kjf kjfVar) {
        le0 le0VarL;
        String str;
        e13 e13Var;
        if (kjfVar == null) {
            return;
        }
        long j = kjfVar.a;
        dcb dcbVar = rgfVar.i;
        if (dcbVar == null || (le0VarL = rgfVar.l()) == null || (str = le0VarL.b) == null) {
            return;
        }
        roa roaVar = rgfVar.b;
        long jC = cr8.c(roaVar.c((int) (j >> 32)), roaVar.c((int) (j & 4294967295L)));
        if (str.length() <= 0 || kjf.c(jC) || (e13Var = rgfVar.h) == null) {
            return;
        }
        u63.Y(e13Var, null, null, new qgf(dcbVar, str, jC, kjfVar, rgfVar, roaVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.rgf r8, defpackage.pu2 r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof defpackage.sgf
            if (r0 == 0) goto L16
            r0 = r9
            sgf r0 = (defpackage.sgf) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            sgf r0 = new sgf
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            defpackage.r7d.b(r9)
            goto L6d
        L28:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            r8 = 0
            return r8
        L2f:
            defpackage.r7d.b(r9)
            le0 r9 = r8.l()
            if (r9 == 0) goto L6d
            java.lang.String r9 = r9.b
            if (r9 == 0) goto L6d
            kjf r1 = r8.w
            if (r1 == 0) goto L6d
            long r3 = r1.a
            dcb r1 = r8.i
            if (r1 == 0) goto L6d
            roa r5 = r8.b
            r6 = 32
            long r6 = r3 >> r6
            int r6 = (int) r6
            int r5 = r5.c(r6)
            roa r8 = r8.b
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3
            int r8 = r8.c(r3)
            long r3 = defpackage.cr8.c(r5, r8)
            r0.label = r2
            java.lang.Object r8 = r1.a(r9, r3, r0)
            g13 r9 = defpackage.g13.a
            if (r8 != r9) goto L6d
            return r9
        L6d:
            j6g r8 = defpackage.j6g.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgf.b(rgf, pu2):java.lang.Object");
    }

    public static final long c(rgf rgfVar, jhf jhfVar, long j, boolean z, boolean z2, u2e u2eVar, boolean z3) {
        nif nifVarD;
        long j2;
        long j3;
        p2e p2eVar;
        boolean z4;
        boolean z5;
        yf6 yf6Var;
        int i;
        lu8 lu8Var = rgfVar.d;
        if (lu8Var == null || (nifVarD = lu8Var.d()) == null) {
            return kjf.b;
        }
        roa roaVar = rgfVar.b;
        long j4 = jhfVar.b;
        le0 le0Var = jhfVar.a;
        int i2 = kjf.c;
        long jC = cr8.c(roaVar.c((int) (j4 >> 32)), rgfVar.b.c((int) (j4 & 4294967295L)));
        int iB = nifVarD.b(j, false);
        int i3 = (z2 || z) ? iB : (int) (jC >> 32);
        int i4 = (!z2 || z) ? iB : (int) (jC & 4294967295L);
        uhe uheVar = rgfVar.v;
        int i5 = (z || uheVar == null || (i = rgfVar.t) == -1) ? -1 : i;
        mif mifVar = nifVarD.a;
        if (z) {
            j3 = j4;
            j2 = 4294967295L;
            p2eVar = null;
        } else {
            j2 = 4294967295L;
            int i6 = (int) (jC >> 32);
            j3 = j4;
            p2e.a aVar = new p2e.a(w74.n(mifVar, i6), i6, 1L);
            int i7 = (int) (jC & 4294967295L);
            p2eVar = new p2e(aVar, new p2e.a(w74.n(mifVar, i7), i7, 1L), kjf.g(jC));
        }
        uhe uheVar2 = new uhe(z2, 1, 1, p2eVar, new vzd(1L, 1, i3, i4, i5, mifVar));
        if (!uheVar2.l(uheVar)) {
            return j3;
        }
        rgfVar.v = uheVar2;
        rgfVar.t = iB;
        p2e p2eVarA = u2eVar.a(uheVar2);
        long jC2 = cr8.c(rgfVar.b.a(p2eVarA.a.b), rgfVar.b.a(p2eVarA.b.b));
        long j5 = j3;
        if (kjf.b(jC2, j5)) {
            return j5;
        }
        boolean z6 = kjf.g(jC2) != kjf.g(j5) && kjf.b(cr8.c((int) (jC2 & j2), (int) (jC2 >> 32)), j5);
        boolean z7 = kjf.c(jC2) && kjf.c(j5);
        if (z3 && le0Var.b.length() > 0 && !z6 && !z7 && (yf6Var = rgfVar.k) != null) {
            yf6Var.a(9);
        }
        rgfVar.c.invoke(e(le0Var, jC2));
        rgfVar.w = new kjf(jC2);
        if (!z3) {
            rgfVar.s(!kjf.c(jC2));
        }
        lu8 lu8Var2 = rgfVar.d;
        if (lu8Var2 != null) {
            ((gme) lu8Var2.q).setValue(Boolean.valueOf(z3));
        }
        lu8 lu8Var3 = rgfVar.d;
        if (lu8Var3 != null) {
            ((gme) lu8Var3.m).setValue(Boolean.valueOf(!kjf.c(jC2) && wgf.b(rgfVar, true)));
        }
        lu8 lu8Var4 = rgfVar.d;
        if (lu8Var4 != null) {
            if (kjf.c(jC2)) {
                z4 = false;
            } else {
                z4 = false;
                if (wgf.b(rgfVar, false)) {
                    z5 = true;
                }
                ((gme) lu8Var4.n).setValue(Boolean.valueOf(z5));
            }
            z5 = z4;
            ((gme) lu8Var4.n).setValue(Boolean.valueOf(z5));
        } else {
            z4 = false;
        }
        lu8 lu8Var5 = rgfVar.d;
        if (lu8Var5 != null) {
            ((gme) lu8Var5.o).setValue(Boolean.valueOf((kjf.c(jC2) && wgf.b(rgfVar, true)) ? true : z4));
        }
        return jC2;
    }

    public static jhf e(le0 le0Var, long j) {
        return new jhf(le0Var, j, (kjf) null);
    }

    public final uqe d(boolean z) {
        e13 e13Var = this.h;
        if (e13Var == null) {
            return null;
        }
        return u63.Y(e13Var, null, i13.d, new mgf(this, z, null), 1);
    }

    public final void f() {
        e13 e13Var = this.h;
        if (e13Var != null) {
            u63.Y(e13Var, null, i13.d, new ogf(this, null), 1);
        }
    }

    public final void g(ooa ooaVar) {
        if (!kjf.c(m().b)) {
            lu8 lu8Var = this.d;
            nif nifVarD = lu8Var != null ? lu8Var.d() : null;
            int iE = (ooaVar == null || nifVarD == null) ? kjf.e(m().b) : this.b.a(nifVarD.b(ooaVar.a, true));
            jhf jhfVarA = jhf.a(m(), null, cr8.c(iE, iE), 5);
            this.c.invoke(jhfVarA);
            this.w = new kjf(jhfVarA.b);
        }
        p((ooaVar == null || m().a.b.length() <= 0) ? mf6.a : mf6.c);
        s(false);
    }

    public final void h(boolean z) {
        sm5 sm5Var;
        lu8 lu8Var = this.d;
        if (lu8Var != null && !lu8Var.b() && (sm5Var = this.l) != null) {
            sm5.b(sm5Var);
        }
        this.u = m();
        s(z);
        p(mf6.b);
    }

    public final ooa i() {
        return (ooa) ((gme) this.s).getValue();
    }

    public final boolean j() {
        return ((Boolean) ((gme) this.n).getValue()).booleanValue();
    }

    public final long k(boolean z) {
        nif nifVarD;
        mif mifVar;
        le0 le0VarL;
        long j;
        lu8 lu8Var = this.d;
        if (lu8Var == null || (nifVarD = lu8Var.d()) == null || (mifVar = nifVarD.a) == null || (le0VarL = l()) == null) {
            return 9205357640488583168L;
        }
        if (!wl7.b(le0VarL.b, mifVar.a.a.b)) {
            return 9205357640488583168L;
        }
        jhf jhfVarM = m();
        if (z) {
            long j2 = jhfVarM.b;
            int i = kjf.c;
            j = j2 >> 32;
        } else {
            long j3 = jhfVarM.b;
            int i2 = kjf.c;
            j = j3 & 4294967295L;
        }
        return zte.b(mifVar, this.b.c((int) j), z, kjf.g(m().b));
    }

    public final le0 l() {
        lu8 lu8Var = this.d;
        if (lu8Var != null) {
            return lu8Var.a.a;
        }
        return null;
    }

    public final jhf m() {
        return (jhf) ((gme) this.e).getValue();
    }

    public final void n() {
        uqe uqeVar;
        ndf ndfVar = (ndf) this.y.a;
        if (ndfVar == null || (uqeVar = ndfVar.j0) == null) {
            return;
        }
        uqeVar.h(null);
        ndfVar.j0 = null;
    }

    public final void o() {
        e13 e13Var = this.h;
        if (e13Var != null) {
            u63.Y(e13Var, null, i13.d, new tgf(this, null), 1);
        }
    }

    public final void p(mf6 mf6Var) {
        lu8 lu8Var = this.d;
        if (lu8Var != null) {
            if (lu8Var.a() == mf6Var) {
                lu8Var = null;
            }
            if (lu8Var != null) {
                ((gme) lu8Var.k).setValue(mf6Var);
            }
        }
    }

    public final void q() {
        lu8 lu8Var;
        wle.e.getClass();
        wle wleVarA = wle.a.a();
        Function1<Object, j6g> function1E = wleVarA != null ? wleVarA.e() : null;
        wle wleVarB = wle.a.b(wleVarA);
        try {
            if (j() && ((lu8Var = this.d) == null || ((Boolean) ((gme) lu8Var.q).getValue()).booleanValue())) {
                j6g j6gVar = j6g.a;
                wle.a.e(wleVarA, wleVarB, function1E);
                this.y.k();
            }
        } finally {
            wle.a.e(wleVarA, wleVarB, function1E);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(defpackage.pu2 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ugf
            if (r0 == 0) goto L13
            r0 = r5
            ugf r0 = (defpackage.ugf) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ugf r0 = new ugf
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            java.lang.Object r4 = r0.L$0
            rgf r4 = (defpackage.rgf) r4
            defpackage.r7d.b(r5)
            goto L44
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L30:
            defpackage.r7d.b(r5)
            y72 r5 = r4.g
            if (r5 == 0) goto L47
            r0.L$0 = r4
            r0.label = r3
            x72 r5 = r5.a()
            g13 r0 = defpackage.g13.a
            if (r5 != r0) goto L44
            return r0
        L44:
            r2 = r5
            x72 r2 = (defpackage.x72) r2
        L47:
            g4a r4 = r4.x
            gme r4 = (defpackage.gme) r4
            r4.setValue(r2)
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgf.r(pu2):java.lang.Object");
    }

    public final void s(boolean z) {
        lu8 lu8Var = this.d;
        if (lu8Var != null) {
            ((gme) lu8Var.l).setValue(Boolean.valueOf(z));
        }
        if (z) {
            q();
        } else {
            n();
        }
    }

    public rgf() {
        this(null);
    }
}
