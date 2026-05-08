package defpackage;

import defpackage.gq2;
import defpackage.wp2;

/* JADX INFO: loaded from: classes.dex */
public final class n81 extends oh6 {
    public int s0 = 0;
    public boolean t0 = true;
    public int u0 = 0;
    public boolean v0 = false;

    public final boolean J() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            gq2 gq2Var = this.q0[i4];
            if ((this.t0 || gq2Var.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !gq2Var.v()) || (((i3 = this.s0) == 2 || i3 == 3) && !gq2Var.w()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.r0; i5++) {
            gq2 gq2Var2 = this.q0[i5];
            if (this.t0 || gq2Var2.c()) {
                wp2.a aVar = wp2.a.d;
                wp2.a aVar2 = wp2.a.b;
                wp2.a aVar3 = wp2.a.c;
                wp2.a aVar4 = wp2.a.a;
                if (!z2) {
                    int i6 = this.s0;
                    if (i6 == 0) {
                        iMax = gq2Var2.g(aVar4).c();
                    } else if (i6 == 1) {
                        iMax = gq2Var2.g(aVar3).c();
                    } else if (i6 == 2) {
                        iMax = gq2Var2.g(aVar2).c();
                    } else if (i6 == 3) {
                        iMax = gq2Var2.g(aVar).c();
                    }
                    z2 = true;
                }
                int i7 = this.s0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, gq2Var2.g(aVar4).c());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, gq2Var2.g(aVar3).c());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, gq2Var2.g(aVar2).c());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, gq2Var2.g(aVar).c());
                }
            }
        }
        int i8 = iMax + this.u0;
        int i9 = this.s0;
        if (i9 == 0 || i9 == 1) {
            A(i8, i8);
        } else {
            B(i8, i8);
        }
        this.v0 = true;
        return true;
    }

    public final int K() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.gq2
    public final void b(ox8 ox8Var, boolean z) {
        boolean z2;
        int i;
        wp2[] wp2VarArr = this.Q;
        wp2 wp2Var = this.I;
        wp2VarArr[0] = wp2Var;
        int i2 = 2;
        wp2 wp2Var2 = this.J;
        wp2VarArr[2] = wp2Var2;
        wp2 wp2Var3 = this.K;
        wp2VarArr[1] = wp2Var3;
        wp2 wp2Var4 = this.L;
        wp2VarArr[3] = wp2Var4;
        for (wp2 wp2Var5 : wp2VarArr) {
            wp2Var5.i = ox8Var.k(wp2Var5);
        }
        int i3 = this.s0;
        if (i3 < 0 || i3 >= 4) {
            return;
        }
        wp2 wp2Var6 = wp2VarArr[i3];
        if (!this.v0) {
            J();
        }
        if (this.v0) {
            this.v0 = false;
            int i4 = this.s0;
            if (i4 == 0 || i4 == 1) {
                ox8Var.d(wp2Var.i, this.Z);
                ox8Var.d(wp2Var3.i, this.Z);
                return;
            } else {
                if (i4 == 2 || i4 == 3) {
                    ox8Var.d(wp2Var2.i, this.a0);
                    ox8Var.d(wp2Var4.i, this.a0);
                    return;
                }
                return;
            }
        }
        for (int i5 = 0; i5 < this.r0; i5++) {
            gq2 gq2Var = this.q0[i5];
            if (this.t0 || gq2Var.c()) {
                int i6 = this.s0;
                gq2.a aVar = gq2.a.c;
                if (((i6 == 0 || i6 == 1) && gq2Var.T[0] == aVar && gq2Var.I.f != null && gq2Var.K.f != null) || ((i6 == 2 || i6 == 3) && gq2Var.T[1] == aVar && gq2Var.J.f != null && gq2Var.L.f != null)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = wp2Var.e() || wp2Var3.e();
        boolean z4 = wp2Var2.e() || wp2Var4.e();
        int i7 = !(!z2 && (((i = this.s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.r0) {
            gq2 gq2Var2 = this.q0[i8];
            if (this.t0 || gq2Var2.c()) {
                mne mneVarK = ox8Var.k(gq2Var2.Q[this.s0]);
                wp2[] wp2VarArr2 = gq2Var2.Q;
                int i9 = this.s0;
                wp2 wp2Var7 = wp2VarArr2[i9];
                wp2Var7.i = mneVarK;
                wp2 wp2Var8 = wp2Var7.f;
                int i10 = (wp2Var8 == null || wp2Var8.d != this) ? 0 : wp2Var7.g;
                if (i9 == 0 || i9 == i2) {
                    mne mneVar = wp2Var6.i;
                    int i11 = this.u0 - i10;
                    nt0 nt0VarL = ox8Var.l();
                    mne mneVarM = ox8Var.m();
                    mneVarM.d = 0;
                    nt0VarL.d(mneVar, mneVarK, mneVarM, i11);
                    ox8Var.c(nt0VarL);
                } else {
                    mne mneVar2 = wp2Var6.i;
                    int i12 = this.u0 + i10;
                    nt0 nt0VarL2 = ox8Var.l();
                    mne mneVarM2 = ox8Var.m();
                    mneVarM2.d = 0;
                    nt0VarL2.c(mneVar2, mneVarK, mneVarM2, i12);
                    ox8Var.c(nt0VarL2);
                }
                ox8Var.e(wp2Var6.i, mneVarK, this.u0 + i10, i7);
            }
            i8++;
            i2 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            ox8Var.e(wp2Var3.i, wp2Var.i, 0, 8);
            ox8Var.e(wp2Var.i, this.U.K.i, 0, 4);
            ox8Var.e(wp2Var.i, this.U.I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            ox8Var.e(wp2Var.i, wp2Var3.i, 0, 8);
            ox8Var.e(wp2Var.i, this.U.I.i, 0, 4);
            ox8Var.e(wp2Var.i, this.U.K.i, 0, 0);
        } else if (i13 == 2) {
            ox8Var.e(wp2Var4.i, wp2Var2.i, 0, 8);
            ox8Var.e(wp2Var2.i, this.U.L.i, 0, 4);
            ox8Var.e(wp2Var2.i, this.U.J.i, 0, 0);
        } else if (i13 == 3) {
            ox8Var.e(wp2Var2.i, wp2Var4.i, 0, 8);
            ox8Var.e(wp2Var2.i, this.U.J.i, 0, 4);
            ox8Var.e(wp2Var2.i, this.U.L.i, 0, 0);
        }
    }

    @Override // defpackage.gq2
    public final boolean c() {
        return true;
    }

    @Override // defpackage.gq2
    public final String toString() {
        String strI = l6.i(new StringBuilder("[Barrier] "), this.i0, " {");
        for (int i = 0; i < this.r0; i++) {
            gq2 gq2Var = this.q0[i];
            if (i > 0) {
                strI = strI.concat(", ");
            }
            StringBuilder sbG = q6.g(strI);
            sbG.append(gq2Var.i0);
            strI = sbG.toString();
        }
        return strI.concat("}");
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
