package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rsd extends zs3 implements nm2, joa {
    public nsd f0;
    public dwa g0;
    public boolean h0;
    public boolean i0;
    public nh5 j0;
    public d3a k0;
    public mn1 l0;
    public boolean m0;
    public nxa n0;
    public jsd o0;
    public ts3 p0;
    public oxa q0;
    public nxa r0;
    public boolean s0;

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public final void U1() {
        this.s0 = g2();
        f2();
        if (this.o0 == null) {
            nsd nsdVar = this.f0;
            nxa nxaVar = this.m0 ? this.r0 : this.n0;
            jsd jsdVar = new jsd(this.l0, this.j0, this.k0, this.g0, nxaVar, nsdVar, this.h0, this.s0);
            c2(jsdVar);
            this.o0 = jsdVar;
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        ts3 ts3Var = this.p0;
        if (ts3Var != null) {
            d2(ts3Var);
        }
    }

    public final void f2() {
        ts3 ts3Var = this.p0;
        if (ts3Var != null) {
            if (ts3Var.k().c0) {
                return;
            }
            c2(ts3Var);
            return;
        }
        if (this.m0) {
            koa.a(this, new n30(this, 13));
        }
        nxa nxaVar = this.m0 ? this.r0 : this.n0;
        if (nxaVar != null) {
            ts3 ts3VarK = nxaVar.k();
            if (ts3VarK.k().c0) {
                return;
            }
            c2(ts3VarK);
            this.p0 = ts3VarK;
        }
    }

    public final boolean g2() {
        vl8 vl8Var = this.c0 ? us3.f(this).n0 : vl8.a;
        dwa dwaVar = this.g0;
        boolean z = this.i0;
        return (vl8Var != vl8.b || dwaVar == dwa.a) ? !z : z;
    }

    @Override // defpackage.ts3
    public final void h0() {
        boolean zG2 = g2();
        if (this.s0 != zG2) {
            this.s0 = zG2;
            nsd nsdVar = this.f0;
            dwa dwaVar = this.g0;
            boolean z = this.m0;
            nxa nxaVar = z ? this.r0 : this.n0;
            h2(this.l0, this.j0, this.k0, dwaVar, nxaVar, nsdVar, z, this.h0, this.i0);
        }
    }

    public final void h2(mn1 mn1Var, nh5 nh5Var, d3a d3aVar, dwa dwaVar, nxa nxaVar, nsd nsdVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.f0 = nsdVar;
        this.g0 = dwaVar;
        boolean z5 = true;
        if (this.m0 != z) {
            this.m0 = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (wl7.b(this.n0, nxaVar)) {
            z5 = false;
        } else {
            this.n0 = nxaVar;
        }
        if (z4 || (z5 && !z)) {
            ts3 ts3Var = this.p0;
            if (ts3Var != null) {
                d2(ts3Var);
            }
            this.p0 = null;
            f2();
        }
        this.h0 = z2;
        this.i0 = z3;
        this.j0 = nh5Var;
        this.k0 = d3aVar;
        this.l0 = mn1Var;
        boolean zG2 = g2();
        this.s0 = zG2;
        jsd jsdVar = this.o0;
        if (jsdVar != null) {
            jsdVar.o2(mn1Var, nh5Var, d3aVar, dwaVar, this.m0 ? this.r0 : this.n0, nsdVar, z2, zG2);
        }
    }

    @Override // defpackage.joa
    public final void u0() {
        oxa oxaVar = (oxa) om2.a(this, pxa.a);
        if (wl7.b(oxaVar, this.q0)) {
            return;
        }
        this.q0 = oxaVar;
        this.r0 = null;
        ts3 ts3Var = this.p0;
        if (ts3Var != null) {
            d2(ts3Var);
        }
        this.p0 = null;
        f2();
        jsd jsdVar = this.o0;
        if (jsdVar != null) {
            nsd nsdVar = this.f0;
            dwa dwaVar = this.g0;
            nxa nxaVar = this.m0 ? this.r0 : this.n0;
            jsdVar.o2(this.l0, this.j0, this.k0, dwaVar, nxaVar, nsdVar, this.h0, this.s0);
        }
    }
}
