package defpackage;

import androidx.compose.ui.e;
import defpackage.ax1;

/* JADX INFO: loaded from: classes.dex */
public final class sm8 implements gb4, ss2 {
    public final ax1 a = new ax1();
    public eb4 b;

    @Override // defpackage.gb4
    public final void B0(sn1 sn1Var, long j, long j2, float f, ib4 ib4Var) {
        this.a.B0(sn1Var, j, j2, f, ib4Var);
    }

    @Override // defpackage.iy3
    public final float C0(long j) {
        return this.a.C0(j);
    }

    @Override // defpackage.gb4
    public final void D(v5b v5bVar, long j, float f, ib4 ib4Var) {
        this.a.D(v5bVar, j, f, ib4Var);
    }

    @Override // defpackage.gb4
    public final void D1(long j, long j2, long j3, float f, ib4 ib4Var, ga2 ga2Var, int i) {
        this.a.D1(j, j2, j3, f, ib4Var, ga2Var, i);
    }

    @Override // defpackage.gb4
    public final long F1() {
        return this.a.F1();
    }

    @Override // defpackage.iy3
    public final long H(float f) {
        return this.a.H(f);
    }

    @Override // defpackage.iy3
    public final long I(long j) {
        return this.a.I(j);
    }

    @Override // defpackage.iy3
    public final long I1(long j) {
        return this.a.I1(j);
    }

    @Override // defpackage.ss2
    public final void N1() {
        ax1 ax1Var = this.a;
        ww1 ww1VarA = ax1Var.b.a();
        eb4 eb4Var = this.b;
        if (eb4Var == null) {
            throw l6.k("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        e.c cVarB = eb4Var.k().f;
        if (cVarB == null || (cVarB.d & 4) == 0) {
            cVarB = null;
        } else {
            while (cVarB != null) {
                int i = cVarB.c;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    cVarB = cVarB.f;
                }
            }
            cVarB = null;
        }
        if (cVarB == null) {
            tia tiaVarD = us3.d(eb4Var, 4);
            if (tiaVarD.f1() == eb4Var.k()) {
                tiaVarD = tiaVarD.h0;
                tiaVarD.getClass();
            }
            tiaVarD.S1(ww1VarA, ax1Var.b.b);
            return;
        }
        j4a j4aVar = null;
        while (cVarB != null) {
            if (cVarB instanceof eb4) {
                eb4 eb4Var2 = (eb4) cVarB;
                xc6 xc6Var = ax1Var.b.b;
                tia tiaVarD2 = us3.d(eb4Var2, 4);
                long jY = hh1.Y(tiaVarD2.c);
                pm8 pm8Var = tiaVarD2.e0;
                pm8Var.getClass();
                tm8.a(pm8Var).getSharedDrawScope().d(ww1VarA, jY, tiaVarD2, eb4Var2, xc6Var);
            } else if ((cVarB.c & 4) != 0 && (cVarB instanceof zs3)) {
                int i2 = 0;
                for (e.c cVar = ((zs3) cVarB).e0; cVar != null; cVar = cVar.f) {
                    if ((cVar.c & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            cVarB = cVar;
                        } else {
                            if (j4aVar == null) {
                                j4aVar = new j4a(new e.c[16]);
                            }
                            if (cVarB != null) {
                                j4aVar.b(cVarB);
                                cVarB = null;
                            }
                            j4aVar.b(cVar);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            cVarB = us3.b(j4aVar);
        }
    }

    @Override // defpackage.gb4
    public final void Q(long j, float f, float f2, long j2, long j3, float f3, ib4 ib4Var) {
        this.a.Q(j, f, f2, j2, j3, f3, ib4Var);
    }

    @Override // defpackage.iy3
    public final float S(long j) {
        return this.a.S(j);
    }

    @Override // defpackage.gb4
    public final void W(long j, long j2, long j3, float f, int i) {
        this.a.W(j, j2, j3, f, i);
    }

    @Override // defpackage.gb4
    public final void X0(m07 m07Var, long j, long j2, long j3, long j4, float f, ib4 ib4Var, ga2 ga2Var, int i, int i2) {
        this.a.X0(m07Var, j, j2, j3, j4, f, ib4Var, ga2Var, i, i2);
    }

    @Override // defpackage.gb4
    public final long c() {
        return this.a.c();
    }

    public final void d(ww1 ww1Var, long j, tia tiaVar, eb4 eb4Var, xc6 xc6Var) {
        eb4 eb4Var2 = this.b;
        this.b = eb4Var;
        vl8 vl8Var = tiaVar.e0.n0;
        ax1 ax1Var = this.a;
        iy3 iy3VarB = ax1Var.b.b();
        ax1.b bVar = ax1Var.b;
        vl8 vl8VarC = bVar.c();
        ww1 ww1VarA = bVar.a();
        long jD = bVar.d();
        xc6 xc6Var2 = bVar.b;
        bVar.f(tiaVar);
        bVar.g(vl8Var);
        bVar.e(ww1Var);
        bVar.h(j);
        bVar.b = xc6Var;
        ww1Var.o();
        try {
            eb4Var.y(this);
            ww1Var.h();
            bVar.f(iy3VarB);
            bVar.g(vl8VarC);
            bVar.e(ww1VarA);
            bVar.h(jD);
            bVar.b = xc6Var2;
            this.b = eb4Var2;
        } catch (Throwable th) {
            ww1Var.h();
            bVar.f(iy3VarB);
            bVar.g(vl8VarC);
            bVar.e(ww1VarA);
            bVar.h(jD);
            bVar.b = xc6Var2;
            throw th;
        }
    }

    @Override // defpackage.iy3
    public final long d0(float f) {
        return this.a.d0(f);
    }

    @Override // defpackage.iy3
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.gb4
    public final vl8 getLayoutDirection() {
        return this.a.a.b;
    }

    @Override // defpackage.gb4
    public final void h1(long j, float f, long j2, ib4 ib4Var) {
        this.a.h1(j, f, j2, ib4Var);
    }

    @Override // defpackage.iy3
    public final float k1(int i) {
        return this.a.k1(i);
    }

    @Override // defpackage.iy3
    public final float l1(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.gb4
    public final void m1(v5b v5bVar, sn1 sn1Var, float f, ib4 ib4Var, int i) {
        this.a.m1(v5bVar, sn1Var, f, ib4Var, i);
    }

    @Override // defpackage.gb4
    public final void o0(m07 m07Var, ib4 ib4Var, ih1 ih1Var) {
        this.a.o0(m07Var, ib4Var, ih1Var);
    }

    @Override // defpackage.gb4
    public final void p0(long j, long j2, long j3, long j4, ib4 ib4Var) {
        this.a.p0(j, j2, j3, j4, ib4Var);
    }

    @Override // defpackage.iy3
    public final float p1() {
        return this.a.p1();
    }

    @Override // defpackage.gb4
    public final void q1(sn1 sn1Var, long j, long j2, long j3, float f, ib4 ib4Var) {
        this.a.q1(sn1Var, j, j2, j3, f, ib4Var);
    }

    @Override // defpackage.gb4
    public final void s1(kne kneVar, long j, long j2, float f, float f2) {
        this.a.s1(kneVar, j, j2, f, f2);
    }

    @Override // defpackage.iy3
    public final float t1(float f) {
        return this.a.getDensity() * f;
    }

    @Override // defpackage.gb4
    public final ax1.b w1() {
        return this.a.b;
    }

    @Override // defpackage.iy3
    public final int x0(float f) {
        return this.a.x0(f);
    }

    @Override // defpackage.iy3
    public final int x1(long j) {
        return this.a.x1(j);
    }
}
