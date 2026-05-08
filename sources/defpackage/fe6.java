package defpackage;

import defpackage.gq2;
import defpackage.wp2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fe6 extends gq2 {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public wp2 t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public fe6() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.gq2
    public final void H(ox8 ox8Var, boolean z) {
        if (this.U == null) {
            return;
        }
        wp2 wp2Var = this.t0;
        ox8Var.getClass();
        int iN = ox8.n(wp2Var);
        if (this.u0 == 1) {
            this.Z = iN;
            this.a0 = 0;
            C(this.U.i());
            F(0);
            return;
        }
        this.Z = 0;
        this.a0 = iN;
        F(this.U.l());
        C(0);
    }

    public final void I(int i) {
        this.t0.i(i);
        this.v0 = true;
    }

    public final void J(int i) {
        if (this.u0 == i) {
            return;
        }
        this.u0 = i;
        ArrayList<wp2> arrayList = this.R;
        arrayList.clear();
        if (this.u0 == 1) {
            this.t0 = this.I;
        } else {
            this.t0 = this.J;
        }
        arrayList.add(this.t0);
        wp2[] wp2VarArr = this.Q;
        int length = wp2VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            wp2VarArr[i2] = this.t0;
        }
    }

    @Override // defpackage.gq2
    public final void b(ox8 ox8Var, boolean z) {
        hq2 hq2Var = (hq2) this.U;
        if (hq2Var == null) {
            return;
        }
        Object objG = hq2Var.g(wp2.a.a);
        Object objG2 = hq2Var.g(wp2.a.c);
        gq2 gq2Var = this.U;
        gq2.a aVar = gq2.a.b;
        boolean z2 = gq2Var != null && gq2Var.T[0] == aVar;
        if (this.u0 == 0) {
            objG = hq2Var.g(wp2.a.b);
            objG2 = hq2Var.g(wp2.a.d);
            gq2 gq2Var2 = this.U;
            z2 = gq2Var2 != null && gq2Var2.T[1] == aVar;
        }
        if (this.v0) {
            wp2 wp2Var = this.t0;
            if (wp2Var.c) {
                mne mneVarK = ox8Var.k(wp2Var);
                ox8Var.d(mneVarK, this.t0.c());
                if (this.r0 != -1) {
                    if (z2) {
                        ox8Var.f(ox8Var.k(objG2), mneVarK, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    mne mneVarK2 = ox8Var.k(objG2);
                    ox8Var.f(mneVarK, ox8Var.k(objG), 0, 5);
                    ox8Var.f(mneVarK2, mneVarK, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            mne mneVarK3 = ox8Var.k(this.t0);
            ox8Var.e(mneVarK3, ox8Var.k(objG), this.r0, 8);
            if (z2) {
                ox8Var.f(ox8Var.k(objG2), mneVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            mne mneVarK4 = ox8Var.k(this.t0);
            mne mneVarK5 = ox8Var.k(objG2);
            ox8Var.e(mneVarK4, mneVarK5, -this.s0, 8);
            if (z2) {
                ox8Var.f(mneVarK4, ox8Var.k(objG), 0, 5);
                ox8Var.f(mneVarK5, mneVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            mne mneVarK6 = ox8Var.k(this.t0);
            mne mneVarK7 = ox8Var.k(objG2);
            float f = this.q0;
            nt0 nt0VarL = ox8Var.l();
            nt0VarL.d.k(mneVarK6, -1.0f);
            nt0VarL.d.k(mneVarK7, f);
            ox8Var.c(nt0VarL);
        }
    }

    @Override // defpackage.gq2
    public final boolean c() {
        return true;
    }

    @Override // defpackage.gq2
    public final wp2 g(wp2.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }

    @Override // defpackage.gq2
    public final boolean v() {
        return this.v0;
    }

    @Override // defpackage.gq2
    public final boolean w() {
        return this.v0;
    }
}
