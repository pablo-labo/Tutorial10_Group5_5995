package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y59 implements sl8 {
    public final x59 a;

    public y59(x59 x59Var) {
        this.a = x59Var;
    }

    @Override // defpackage.sl8
    public final void A(sl8 sl8Var, float[] fArr) {
        this.a.e0.A(sl8Var, fArr);
    }

    @Override // defpackage.sl8
    public final long B(long j) {
        return ooa.f(this.a.e0.B(j), b());
    }

    @Override // defpackage.sl8
    public final long G(sl8 sl8Var, long j) {
        return c(sl8Var, j);
    }

    @Override // defpackage.sl8
    public final qtc J(sl8 sl8Var, boolean z) {
        return this.a.e0.J(sl8Var, z);
    }

    @Override // defpackage.sl8
    public final long L(long j) {
        return this.a.e0.L(ooa.f(j, b()));
    }

    @Override // defpackage.sl8
    public final void N(float[] fArr) {
        this.a.e0.N(fArr);
    }

    @Override // defpackage.sl8
    public final sl8 U() {
        x59 x59VarD1;
        if (!d()) {
            ae7.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        tia tiaVar = this.a.e0.e0.t0.d.i0;
        if (tiaVar == null || (x59VarD1 = tiaVar.d1()) == null) {
            return null;
        }
        return x59VarD1.h0;
    }

    @Override // defpackage.sl8
    public final long a() {
        x59 x59Var = this.a;
        return (((long) x59Var.a) << 32) | (((long) x59Var.b) & 4294967295L);
    }

    @Override // defpackage.sl8
    public final long a0(long j) {
        return this.a.e0.a0(ooa.f(j, b()));
    }

    public final long b() {
        x59 x59Var = this.a;
        x59 x59VarI = wg2.I(x59Var);
        return ooa.e(c(x59VarI.h0, 0L), x59Var.e0.K1(x59VarI.e0, 0L));
    }

    public final long c(sl8 sl8Var, long j) {
        boolean z = sl8Var instanceof y59;
        x59 x59Var = this.a;
        if (!z) {
            x59 x59VarI = wg2.I(x59Var);
            sl8 sl8Var2 = x59VarI.e0;
            long jE = ooa.e(c(x59VarI.h0, j), (4294967295L & ((long) Float.floatToRawIntBits((int) (x59VarI.f0 & 4294967295L)))) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            sl8 sl8VarY = sl8Var2.y();
            if (sl8VarY != null) {
                sl8Var2 = sl8VarY;
            }
            return ooa.f(jE, ((tia) sl8Var2).K1(sl8Var, 0L));
        }
        x59 x59Var2 = ((y59) sl8Var).a;
        tia tiaVar = x59Var2.e0;
        tiaVar.L1();
        x59 x59VarD1 = x59Var.e0.b1(tiaVar).d1();
        if (x59VarD1 != null) {
            long jC = lh7.c(lh7.d(x59Var2.U0(x59VarD1, false), ak2.E(j)), x59Var.U0(x59VarD1, false));
            return (((long) Float.floatToRawIntBits((int) (jC >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jC & 4294967295L))) & 4294967295L);
        }
        x59 x59VarI2 = wg2.I(x59Var2);
        long jD = lh7.d(lh7.d(x59Var2.U0(x59VarI2, false), x59VarI2.f0), ak2.E(j));
        x59 x59VarI3 = wg2.I(x59Var);
        long jC2 = lh7.c(jD, lh7.d(x59Var.U0(x59VarI3, false), x59VarI3.f0));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jC2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jC2 & 4294967295L))) & 4294967295L;
        tia tiaVar2 = x59VarI3.e0.i0;
        tiaVar2.getClass();
        tia tiaVar3 = x59VarI2.e0.i0;
        tiaVar3.getClass();
        return tiaVar2.K1(tiaVar3, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // defpackage.sl8
    public final boolean d() {
        return this.a.e0.f1().c0;
    }

    @Override // defpackage.sl8
    public final long p(long j) {
        return ooa.f(this.a.e0.p(j), b());
    }

    @Override // defpackage.sl8
    public final long v(long j) {
        return this.a.e0.v(ooa.f(0L, b()));
    }

    @Override // defpackage.sl8
    public final sl8 y() {
        x59 x59VarD1;
        if (!d()) {
            ae7.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        tia tiaVar = this.a.e0.i0;
        if (tiaVar == null || (x59VarD1 = tiaVar.d1()) == null) {
            return null;
        }
        return x59VarD1.h0;
    }
}
