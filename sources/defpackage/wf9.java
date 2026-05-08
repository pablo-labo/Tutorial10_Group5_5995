package defpackage;

import androidx.compose.ui.layout.w;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.pm8;
import defpackage.rxa;

/* JADX INFO: loaded from: classes.dex */
public final class wf9 {
    public final pm8 a;
    public boolean c;
    public boolean d;
    public iq2 i;
    public final yy3 b = new yy3();
    public final by3 e = new by3(2);
    public final j4a<rxa.a> f = new j4a<>(new rxa.a[16]);
    public final long g = 1;
    public final j4a<a> h = new j4a<>(new a[16]);

    public static final class a {
        public final pm8 a;
        public final boolean b;
        public final boolean c;

        public a(pm8 pm8Var, boolean z, boolean z2) {
            this.a = pm8Var;
            this.b = z;
            this.c = z2;
        }
    }

    public wf9(pm8 pm8Var) {
        this.a = pm8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(defpackage.pm8 r5, defpackage.iq2 r6) throws java.lang.Throwable {
        /*
            pm8 r0 = r5.V
            um8 r1 = r5.u0
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            z59 r0 = r1.q
            r0.getClass()
            long r3 = r6.a
            boolean r6 = r0.G0(r3)
            goto L2f
        L18:
            r6 = r2
            goto L2f
        L1a:
            z59 r6 = r1.q
            if (r6 == 0) goto L21
            iq2 r1 = r6.c0
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L18
            if (r0 == 0) goto L18
            r6.getClass()
            long r0 = r1.a
            boolean r6 = r6.G0(r0)
        L2f:
            pm8 r0 = r5.K()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            pm8 r1 = r0.V
            r3 = 3
            if (r1 != 0) goto L40
            defpackage.pm8.j0(r0, r2, r3)
            return r6
        L40:
            pm8$f r1 = r5.I()
            pm8$f r4 = pm8.f.a
            if (r1 != r4) goto L4c
            defpackage.pm8.h0(r0, r2, r3)
            return r6
        L4c:
            pm8$f r5 = r5.I()
            pm8$f r1 = pm8.f.b
            if (r5 != r1) goto L57
            r0.g0(r2)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf9.b(pm8, iq2):boolean");
    }

    public static boolean c(pm8 pm8Var, iq2 iq2Var) {
        boolean zB0 = iq2Var != null ? pm8Var.b0(iq2Var) : pm8.c0(pm8Var);
        pm8 pm8VarK = pm8Var.K();
        if (zB0 && pm8VarK != null) {
            if (pm8Var.H() == pm8.f.a) {
                pm8.j0(pm8VarK, false, 3);
                return zB0;
            }
            if (pm8Var.H() == pm8.f.b) {
                pm8VarK.i0(false);
            }
        }
        return zB0;
    }

    public static boolean h(pm8 pm8Var) {
        z59 z59Var;
        v59 v59Var;
        if (pm8Var.u0.e) {
            return (pm8Var.I() == pm8.f.c && ((z59Var = pm8Var.u0.q) == null || (v59Var = z59Var.h0) == null || !v59Var.f())) ? false : true;
        }
        return false;
    }

    public static boolean i(pm8 pm8Var) {
        if (!pm8Var.G()) {
            return false;
        }
        do {
            if (pm8Var.H() == pm8.f.c && !pm8Var.u0.p.n0.f()) {
                pm8 pm8VarK = pm8Var.K();
                if ((pm8VarK != null ? pm8VarK.u0.d : null) != pm8.d.a) {
                    return false;
                }
            }
            pm8Var = pm8Var.K();
            if (pm8Var == null) {
                return false;
            }
        } while (!pm8Var.k());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r7) {
        /*
            r6 = this;
            r0 = 1
            by3 r1 = r6.e
            if (r7 == 0) goto L17
            java.lang.Object r7 = r1.a
            j4a r7 = (defpackage.j4a) r7
            pm8 r6 = r6.a
            int r2 = r6.D0
            if (r2 <= 0) goto L17
            r7.g()
            r7.b(r6)
            r6.C0 = r0
        L17:
            java.lang.Object r6 = r1.a
            j4a r6 = (defpackage.j4a) r6
            int r7 = r6.c
            if (r7 == 0) goto L62
            zqa r2 = defpackage.zqa.b
            T[] r3 = r6.a
            r4 = 0
            java.util.Arrays.sort(r3, r4, r7, r2)
            int r7 = r6.c
            java.lang.Object r2 = r1.b
            pm8[] r2 = (defpackage.pm8[]) r2
            if (r2 == 0) goto L32
            int r3 = r2.length
            if (r3 >= r7) goto L3a
        L32:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r7)
            pm8[] r2 = new defpackage.pm8[r2]
        L3a:
            r3 = 0
            r1.b = r3
        L3d:
            if (r4 >= r7) goto L48
            T[] r5 = r6.a
            r5 = r5[r4]
            r2[r4] = r5
            int r4 = r4 + 1
            goto L3d
        L48:
            r6.g()
            int r7 = r7 - r0
        L4c:
            r6 = -1
            if (r6 >= r7) goto L60
            r6 = r2[r7]
            r6.getClass()
            boolean r0 = r6.C0
            if (r0 == 0) goto L5b
            defpackage.by3.d(r6)
        L5b:
            r2[r7] = r3
            int r7 = r7 + (-1)
            goto L4c
        L60:
            r1.b = r2
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf9.a(boolean):void");
    }

    public final void d() {
        j4a<a> j4aVar = this.h;
        int i = j4aVar.c;
        if (i != 0) {
            a[] aVarArr = j4aVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                a aVar = aVarArr[i2];
                if (aVar.a.d()) {
                    boolean z = aVar.b;
                    pm8 pm8Var = aVar.a;
                    boolean z2 = aVar.c;
                    if (z) {
                        pm8.h0(pm8Var, z2, 2);
                    } else {
                        pm8.j0(pm8Var, z2, 2);
                    }
                }
            }
            j4aVar.g();
        }
    }

    public final void e(pm8 pm8Var) {
        j4a<pm8> j4aVarN = pm8Var.N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8 pm8Var2 = pm8VarArr[i2];
            if (wl7.b(pm8Var2.W(), Boolean.TRUE) && !pm8Var2.E0) {
                if (this.b.b(pm8Var2)) {
                    pm8Var2.X();
                }
                e(pm8Var2);
            }
        }
    }

    public final void f(pm8 pm8Var, boolean z) {
        if (!this.c) {
            ae7.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? pm8Var.u0.e : pm8Var.G()) {
            ae7.a("node not yet measured");
        }
        g(pm8Var, z);
    }

    public final void g(pm8 pm8Var, boolean z) {
        z59 z59Var;
        v59 v59Var;
        j4a<pm8> j4aVarN = pm8Var.N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8 pm8Var2 = pm8VarArr[i2];
            pm8.f fVar = pm8.f.a;
            if ((!z && (pm8Var2.H() == fVar || pm8Var2.u0.p.n0.f())) || (z && (pm8Var2.I() == fVar || ((z59Var = pm8Var2.u0.q) != null && (v59Var = z59Var.h0) != null && v59Var.f())))) {
                boolean zE = pnb.E(pm8Var2);
                um8 um8Var = pm8Var2.u0;
                if (zE && !z) {
                    if (um8Var.e && this.b.b(pm8Var2)) {
                        m(pm8Var2, true, false);
                    } else {
                        f(pm8Var2, true);
                    }
                }
                if (z ? um8Var.e : pm8Var2.G()) {
                    m(pm8Var2, z, false);
                }
                if (!(z ? um8Var.e : pm8Var2.G())) {
                    g(pm8Var2, z);
                }
            }
        }
        if (z ? pm8Var.u0.e : pm8Var.G()) {
            m(pm8Var, z, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(AndroidComposeView.o oVar) {
        boolean z;
        boolean z2;
        pm8 pm8Var;
        boolean z3;
        yy3 yy3Var = this.b;
        pm8 pm8Var2 = this.a;
        if (!pm8Var2.d()) {
            ae7.a("performMeasureAndLayout called with unattached root");
        }
        if (!pm8Var2.k()) {
            ae7.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            ae7.a("performMeasureAndLayout called during measure layout");
        }
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean zC = yy3Var.c();
                wy3 wy3Var = yy3Var.a;
                if (zC) {
                    z = false;
                    while (true) {
                        wy3 wy3Var2 = yy3Var.c;
                        wy3 wy3Var3 = yy3Var.b;
                        if (!((one) wy3Var.b).isEmpty()) {
                            pm8Var = (pm8) ((one) wy3Var.b).first();
                            wy3Var.f(pm8Var);
                            z3 = pm8Var.V != null;
                            z2 = false;
                        } else if (!((one) wy3Var3.b).isEmpty()) {
                            pm8Var = (pm8) ((one) wy3Var3.b).first();
                            wy3Var3.f(pm8Var);
                            z3 = pm8Var.V != null;
                            z2 = true;
                        } else {
                            if (((one) wy3Var2.b).isEmpty()) {
                                break;
                            }
                            pm8 pm8Var3 = (pm8) ((one) wy3Var2.b).first();
                            wy3Var2.f(pm8Var3);
                            z2 = true;
                            pm8Var = pm8Var3;
                            z3 = false;
                        }
                        boolean zM = m(pm8Var, z3, z2);
                        if (!z2) {
                            if (pm8Var.u0.f) {
                                yy3Var.a(pm8Var, hm7.b);
                            }
                            if (pm8Var.F()) {
                                yy3Var.a(pm8Var, hm7.d);
                            }
                        }
                        if (pm8Var == pm8Var2 && zM) {
                            z = true;
                        }
                    }
                    if (oVar != null) {
                        oVar.invoke();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        j4a<rxa.a> j4aVar = this.f;
        rxa.a[] aVarArr = j4aVar.a;
        int i = j4aVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            aVarArr[i2].l();
        }
        j4aVar.g();
        return z;
    }

    public final void k(pm8 pm8Var, long j) {
        if (pm8Var.E0) {
            return;
        }
        pm8 pm8Var2 = this.a;
        if (pm8Var == pm8Var2) {
            ae7.a("measureAndLayout called on root");
        }
        if (!pm8Var2.d()) {
            ae7.a("performMeasureAndLayout called with unattached root");
        }
        if (!pm8Var2.k()) {
            ae7.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            ae7.a("performMeasureAndLayout called during measure layout");
        }
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                yy3 yy3Var = this.b;
                yy3Var.a.f(pm8Var);
                yy3Var.b.f(pm8Var);
                yy3Var.c.f(pm8Var);
                if ((b(pm8Var, new iq2(j)) || pm8Var.u0.f) && wl7.b(pm8Var.W(), Boolean.TRUE)) {
                    pm8Var.X();
                }
                e(pm8Var);
                c(pm8Var, new iq2(j));
                if (pm8Var.F() && pm8Var.k()) {
                    pm8Var.f0();
                    by3 by3Var = this.e;
                    by3Var.getClass();
                    if (pm8Var.D0 > 0) {
                        ((j4a) by3Var.a).b(pm8Var);
                        pm8Var.C0 = true;
                    }
                }
                d();
            } finally {
            }
        }
        j4a<rxa.a> j4aVar = this.f;
        rxa.a[] aVarArr = j4aVar.a;
        int i = j4aVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            aVarArr[i2].l();
        }
        j4aVar.g();
    }

    public final void l() {
        yy3 yy3Var = this.b;
        if (yy3Var.c()) {
            pm8 pm8Var = this.a;
            if (!pm8Var.d()) {
                ae7.a("performMeasureAndLayout called with unattached root");
            }
            if (!pm8Var.k()) {
                ae7.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                ae7.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((one) yy3Var.c.b).isEmpty() && !((one) yy3Var.a.b).isEmpty()) {
                        if (pm8Var.V != null) {
                            o(pm8Var, true);
                        } else {
                            n(pm8Var);
                        }
                    }
                    o(pm8Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    public final boolean m(pm8 pm8Var, boolean z, boolean z2) {
        iq2 iq2Var;
        boolean zB;
        w.a placementScope;
        pe7 pe7Var;
        pm8 pm8VarK;
        z59 z59Var;
        v59 v59Var;
        boolean z3 = pm8Var.E0;
        um8 um8Var = pm8Var.u0;
        if (z3 || (!pm8Var.k() && !um8Var.p.j0 && !i(pm8Var) && !wl7.b(pm8Var.W(), Boolean.TRUE) && !h(pm8Var) && !um8Var.p.n0.f() && ((z59Var = um8Var.q) == null || (v59Var = z59Var.h0) == null || !v59Var.f()))) {
            return false;
        }
        pm8 pm8Var2 = this.a;
        if (pm8Var == pm8Var2) {
            iq2Var = this.i;
            iq2Var.getClass();
        } else {
            iq2Var = null;
        }
        if (z) {
            zB = um8Var.e ? b(pm8Var, iq2Var) : false;
            if (z2 && ((zB || um8Var.f) && wl7.b(pm8Var.W(), Boolean.TRUE))) {
                pm8Var.X();
            }
        } else {
            boolean zC = pm8Var.G() ? c(pm8Var, iq2Var) : false;
            if (z2 && pm8Var.F() && (pm8Var == pm8Var2 || ((pm8VarK = pm8Var.K()) != null && pm8VarK.k() && um8Var.p.j0))) {
                if (pm8Var == pm8Var2) {
                    if (pm8Var.q0 == pm8.f.c) {
                        pm8Var.w();
                    }
                    pm8 pm8VarK2 = pm8Var.K();
                    if (pm8VarK2 == null || (pe7Var = pm8VarK2.t0.c) == null || (placementScope = pe7Var.a0) == null) {
                        placementScope = tm8.a(pm8Var).getPlacementScope();
                    }
                    w.a.y(placementScope, um8Var.p, 0, 0);
                } else {
                    pm8Var.f0();
                }
                by3 by3Var = this.e;
                by3Var.getClass();
                if (pm8Var.D0 > 0) {
                    ((j4a) by3Var.a).b(pm8Var);
                    pm8Var.C0 = true;
                }
                tm8.a(pm8Var).getRectManager().d(pm8Var);
            }
            zB = zC;
        }
        d();
        return zB;
    }

    public final void n(pm8 pm8Var) throws Throwable {
        j4a<pm8> j4aVarN = pm8Var.N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8 pm8Var2 = pm8VarArr[i2];
            if (pm8Var2.H() == pm8.f.a || pm8Var2.u0.p.n0.f()) {
                if (pnb.E(pm8Var2)) {
                    o(pm8Var2, true);
                } else {
                    n(pm8Var2);
                }
            }
        }
    }

    public final void o(pm8 pm8Var, boolean z) throws Throwable {
        iq2 iq2Var;
        if (pm8Var.E0) {
            return;
        }
        if (pm8Var == this.a) {
            iq2Var = this.i;
            iq2Var.getClass();
        } else {
            iq2Var = null;
        }
        if (z) {
            b(pm8Var, iq2Var);
        } else {
            c(pm8Var, iq2Var);
        }
    }

    public final boolean p(pm8 pm8Var, boolean z) {
        int iOrdinal = pm8Var.u0.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.h.b(new a(pm8Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    l.g();
                    return false;
                }
                if (!pm8Var.G() || z) {
                    pm8Var.u0.p.k0 = true;
                    if (!pm8Var.E0 && (pm8Var.k() || i(pm8Var))) {
                        pm8 pm8VarK = pm8Var.K();
                        if (pm8VarK == null || !pm8VarK.G()) {
                            this.b.a(pm8Var, hm7.c);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j) {
        iq2 iq2Var = this.i;
        if (iq2Var == null ? false : iq2.b(iq2Var.a, j)) {
            return;
        }
        if (this.c) {
            ae7.a("updateRootConstraints called while measuring");
        }
        this.i = new iq2(j);
        pm8 pm8Var = this.a;
        pm8 pm8Var2 = pm8Var.V;
        um8 um8Var = pm8Var.u0;
        if (pm8Var2 != null) {
            um8Var.e = true;
        }
        um8Var.p.k0 = true;
        this.b.a(pm8Var, pm8Var2 != null ? hm7.a : hm7.c);
    }
}
