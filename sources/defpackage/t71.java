package defpackage;

import androidx.compose.ui.e;
import defpackage.jwa;

/* JADX INFO: loaded from: classes.dex */
public final class t71 extends e.c implements eb4, joa, c5e {
    public long d0;
    public sn1 e0;
    public float f0;
    public dce g0;
    public long h0;
    public vl8 i0;
    public jwa j0;
    public dce k0;
    public jwa l0;

    @Override // defpackage.c5e
    public final boolean B() {
        return false;
    }

    @Override // defpackage.c5e
    public final void F0(s5e s5eVar) {
    }

    @Override // defpackage.joa
    public final void u0() {
        this.h0 = 9205357640488583168L;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        fb4.a(this);
    }

    @Override // defpackage.eb4
    public final void y(sm8 sm8Var) {
        jwa jwaVar;
        sn1 sn1Var;
        float f;
        v5b v5bVar;
        sm8 sm8Var2;
        ax1 ax1Var = sm8Var.a;
        if (this.g0 == ytc.a) {
            if (!da2.c(this.d0, da2.i)) {
                gb4.o1(sm8Var, this.d0, 0L, 0L, 0.0f, null, 126);
            }
            sn1 sn1Var2 = this.e0;
            if (sn1Var2 != null) {
                gb4.M1(sm8Var, sn1Var2, 0L, 0L, this.f0, null, 118);
            }
        } else {
            if (kie.a(ax1Var.c(), this.h0) && sm8Var.getLayoutDirection() == this.i0 && wl7.b(this.k0, this.g0)) {
                jwaVar = this.j0;
                jwaVar.getClass();
            } else {
                koa.a(this, new s71(0, this, sm8Var));
                jwaVar = this.l0;
                this.l0 = null;
            }
            this.j0 = jwaVar;
            this.h0 = ax1Var.c();
            this.i0 = sm8Var.getLayoutDirection();
            this.k0 = this.g0;
            jwaVar.getClass();
            if (!da2.c(this.d0, da2.i)) {
                lwa.a(sm8Var, jwaVar, this.d0);
            }
            sn1 sn1Var3 = this.e0;
            if (sn1Var3 != null) {
                float f2 = this.f0;
                ib5 ib5Var = ib5.a;
                if (jwaVar instanceof jwa.b) {
                    qtc qtcVar = ((jwa.b) jwaVar).a;
                    float f3 = qtcVar.a;
                    sm8Var.B0(sn1Var3, (4294967295L & ((long) Float.floatToRawIntBits(qtcVar.b))) | (Float.floatToRawIntBits(f3) << 32), lwa.b(qtcVar), f2, ib5Var);
                } else {
                    if (jwaVar instanceof jwa.c) {
                        jwa.c cVar = (jwa.c) jwaVar;
                        sn1Var = sn1Var3;
                        v5bVar = cVar.b;
                        if (v5bVar != null) {
                            sm8Var2 = sm8Var;
                            f = f2;
                        } else {
                            zfd zfdVar = cVar.a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (zfdVar.h >> 32));
                            float f4 = zfdVar.a;
                            sm8Var.q1(sn1Var, (((long) Float.floatToRawIntBits(zfdVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32), (((long) Float.floatToRawIntBits(zfdVar.b())) << 32) | (((long) Float.floatToRawIntBits(zfdVar.a())) & 4294967295L), (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), f2, ib5Var);
                        }
                    } else {
                        if (!(jwaVar instanceof jwa.a)) {
                            l.g();
                            return;
                        }
                        v5b v5bVar2 = ((jwa.a) jwaVar).a;
                        sn1Var = sn1Var3;
                        f = f2;
                        v5bVar = v5bVar2;
                        sm8Var2 = sm8Var;
                    }
                    sm8Var2.m1(v5bVar, sn1Var, f, ib5Var, 3);
                }
            }
        }
        sm8Var.N1();
    }
}
