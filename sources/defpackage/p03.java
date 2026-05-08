package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class p03 implements dce {
    public final t03 a;
    public final t03 b;
    public final t03 c;
    public final t03 d;

    public p03(t03 t03Var, t03 t03Var2, t03 t03Var3, t03 t03Var4) {
        this.a = t03Var;
        this.b = t03Var2;
        this.c = t03Var3;
        this.d = t03Var4;
    }

    public static /* synthetic */ p03 c(p03 p03Var, k94 k94Var, t03 t03Var, t03 t03Var2, int i) {
        t03 t03Var3 = k94Var;
        if ((i & 1) != 0) {
            t03Var3 = p03Var.a;
        }
        t03 t03Var4 = p03Var.b;
        if ((i & 4) != 0) {
            t03Var = p03Var.c;
        }
        return p03Var.b(t03Var3, t03Var4, t03Var, t03Var2);
    }

    @Override // defpackage.dce
    public final jwa a(long j, vl8 vl8Var, iy3 iy3Var) {
        float fA = this.a.a(j, iy3Var);
        float fA2 = this.b.a(j, iy3Var);
        float fA3 = this.c.a(j, iy3Var);
        float fA4 = this.d.a(j, iy3Var);
        float fC = kie.c(j);
        float f = fA + fA4;
        if (f > fC) {
            float f2 = fC / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fC) {
            float f4 = fC / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            de7.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return d(j, fA, fA2, fA3, fA4, vl8Var);
    }

    public abstract p03 b(t03 t03Var, t03 t03Var2, t03 t03Var3, t03 t03Var4);

    public abstract jwa d(long j, float f, float f2, float f3, float f4, vl8 vl8Var);
}
