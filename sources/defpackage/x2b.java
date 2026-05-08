package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class x2b {
    public f80 a;
    public boolean b;
    public ga2 c;
    public float d = 1.0f;
    public vl8 e = vl8.a;

    public static final class a extends mj8 implements Function1<gb4, j6g> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gb4 gb4Var) {
            x2b.this.i(gb4Var);
            return j6g.a;
        }
    }

    public x2b() {
        new a();
    }

    public boolean a(float f) {
        return false;
    }

    public boolean c(ga2 ga2Var) {
        return false;
    }

    public void f(vl8 vl8Var) {
    }

    public final void g(gb4 gb4Var, long j, float f, ga2 ga2Var) {
        if (this.d != f) {
            if (!a(f)) {
                f80 f80VarA = this.a;
                if (f == 1.0f) {
                    if (f80VarA != null) {
                        f80VarA.b(f);
                    }
                    this.b = false;
                } else {
                    if (f80VarA == null) {
                        f80VarA = g80.a();
                        this.a = f80VarA;
                    }
                    f80VarA.b(f);
                    this.b = true;
                }
            }
            this.d = f;
        }
        if (!wl7.b(this.c, ga2Var)) {
            if (!c(ga2Var)) {
                f80 f80VarA2 = this.a;
                if (ga2Var == null) {
                    if (f80VarA2 != null) {
                        f80VarA2.k(null);
                    }
                    this.b = false;
                } else {
                    if (f80VarA2 == null) {
                        f80VarA2 = g80.a();
                        this.a = f80VarA2;
                    }
                    f80VarA2.k(ga2Var);
                    this.b = true;
                }
            }
            this.c = ga2Var;
        }
        vl8 layoutDirection = gb4Var.getLayoutDirection();
        if (this.e != layoutDirection) {
            f(layoutDirection);
            this.e = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gb4Var.c() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)) - Float.intBitsToFloat(i2);
        gb4Var.w1().a.e(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.b) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        qtc qtcVarA = web.a(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        ww1 ww1VarA = gb4Var.w1().a();
                        f80 f80VarA3 = this.a;
                        if (f80VarA3 == null) {
                            f80VarA3 = g80.a();
                            this.a = f80VarA3;
                        }
                        try {
                            ww1VarA.r(qtcVarA, f80VarA3);
                            i(gb4Var);
                            ww1VarA.h();
                        } catch (Throwable th) {
                            ww1VarA.h();
                            throw th;
                        }
                    } else {
                        i(gb4Var);
                    }
                }
            } catch (Throwable th2) {
                gb4Var.w1().a.e(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        gb4Var.w1().a.e(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(gb4 gb4Var);
}
