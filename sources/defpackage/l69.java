package defpackage;

import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class l69 implements h69 {
    public final g4a V;
    public final az3 W;
    public final g4a X;
    public final g4a Y;
    public final g4a Z;
    public final g4a a;
    public final g4a a0;
    public final g4a b;
    public final az3 b0;
    public final g4a c;
    public final y4a c0;
    public final g4a d;
    public final g4a e;
    public final g4a f;

    public static final class a extends mj8 implements gu5<Float> {
        public a() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Float invoke() {
            float fA = 0.0f;
            if (l69.this.t() != null) {
                float fP = l69.this.p();
                l69 l69Var = l69.this;
                if (fP < 0.0f) {
                    r69 r69VarU = l69Var.u();
                    if (r69VarU != null) {
                        fA = r69VarU.b();
                    }
                } else {
                    r69 r69VarU2 = l69Var.u();
                    fA = r69VarU2 != null ? r69VarU2.a() : 1.0f;
                }
            }
            return Float.valueOf(fA);
        }
    }

    public static final class b extends mj8 implements gu5<Float> {
        public b() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Float invoke() {
            return Float.valueOf((((Boolean) ((gme) l69.this.d).getValue()).booleanValue() && l69.this.r() % 2 == 0) ? -l69.this.p() : l69.this.p());
        }
    }

    public static final class c extends mj8 implements gu5<Boolean> {
        public c() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Boolean invoke() {
            return Boolean.valueOf(l69.this.r() == ((Number) ((gme) l69.this.c).getValue()).intValue() && l69.this.b() == l69.this.o());
        }
    }

    public l69() {
        Boolean bool = Boolean.FALSE;
        this.a = r.f(bool);
        this.b = r.f(1);
        this.c = r.f(1);
        this.d = r.f(bool);
        this.e = r.f(null);
        this.f = r.f(Float.valueOf(1.0f));
        this.V = r.f(bool);
        this.W = r.c(new b());
        this.X = r.f(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.Y = r.f(fValueOf);
        this.Z = r.f(fValueOf);
        this.a0 = r.f(Long.MIN_VALUE);
        this.b0 = r.c(new a());
        r.c(new c());
        this.c0 = new y4a();
    }

    public static final boolean i(l69 l69Var, int i, long j) {
        s69 s69VarT = l69Var.t();
        g4a g4aVar = l69Var.Y;
        az3 az3Var = l69Var.W;
        g4a g4aVar2 = l69Var.a0;
        if (s69VarT == null) {
            return true;
        }
        long jLongValue = ((Number) ((gme) g4aVar2).getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) ((gme) g4aVar2).getValue()).longValue();
        ((gme) g4aVar2).setValue(Long.valueOf(j));
        r69 r69VarU = l69Var.u();
        float fB = r69VarU != null ? r69VarU.b() : 0.0f;
        r69 r69VarU2 = l69Var.u();
        float fA = r69VarU2 != null ? r69VarU2.a() : 1.0f;
        float fFloatValue = ((Number) az3Var.getValue()).floatValue() * ((jLongValue / 1000000) / s69VarT.b());
        float fFloatValue2 = ((Number) az3Var.getValue()).floatValue() < 0.0f ? fB - (((Number) ((gme) g4aVar).getValue()).floatValue() + fFloatValue) : (((Number) ((gme) g4aVar).getValue()).floatValue() + fFloatValue) - fA;
        if (fB == fA) {
            l69Var.z(fB);
            return false;
        }
        if (fFloatValue2 < 0.0f) {
            l69Var.z(nic.B(((Number) ((gme) g4aVar).getValue()).floatValue(), fB, fA) + fFloatValue);
            return true;
        }
        float f = fA - fB;
        int i2 = (int) (fFloatValue2 / f);
        int i3 = i2 + 1;
        if (l69Var.r() + i3 > i) {
            l69Var.z(l69Var.o());
            l69Var.y(i);
            return false;
        }
        l69Var.y(l69Var.r() + i3);
        float f2 = fFloatValue2 - (i2 * f);
        l69Var.z(((Number) az3Var.getValue()).floatValue() < 0.0f ? fA - f2 : fB + f2);
        return true;
    }

    public static final void n(l69 l69Var, boolean z) {
        ((gme) l69Var.a).setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.p69
    public final float b() {
        return ((Number) ((gme) this.Z).getValue()).floatValue();
    }

    @Override // defpackage.ese
    public final Float getValue() {
        return Float.valueOf(b());
    }

    public final float o() {
        return ((Number) this.b0.getValue()).floatValue();
    }

    @Override // defpackage.p69
    public final float p() {
        return ((Number) ((gme) this.f).getValue()).floatValue();
    }

    @Override // defpackage.p69
    public final int r() {
        return ((Number) ((gme) this.b).getValue()).intValue();
    }

    @Override // defpackage.h69
    public final Object s(s69 s69Var, float f, boolean z, yc0 yc0Var) {
        Object objB = y4a.b(this.c0, new m69(this, s69Var, f, 1, z, null), yc0Var);
        return objB == g13.a ? objB : j6g.a;
    }

    @Override // defpackage.p69
    public final s69 t() {
        return (s69) ((gme) this.X).getValue();
    }

    @Override // defpackage.p69
    public final r69 u() {
        return (r69) ((gme) this.e).getValue();
    }

    @Override // defpackage.h69
    public final Object x(s69 s69Var, int i, int i2, boolean z, float f, r69 r69Var, float f2, q69 q69Var, boolean z2, yc0 yc0Var) {
        Object objB = y4a.b(this.c0, new i69(this, i, i2, z, f, r69Var, s69Var, f2, z2, false, q69Var, null), yc0Var);
        return objB == g13.a ? objB : j6g.a;
    }

    public final void y(int i) {
        ((gme) this.b).setValue(Integer.valueOf(i));
    }

    public final void z(float f) {
        s69 s69VarT;
        ((gme) this.Y).setValue(Float.valueOf(f));
        if (((Boolean) ((gme) this.V).getValue()).booleanValue() && (s69VarT = t()) != null) {
            f -= f % (1.0f / s69VarT.n);
        }
        ((gme) this.Z).setValue(Float.valueOf(f));
    }
}
