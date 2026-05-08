package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gi5 implements zh5 {
    public final int a;
    public final af4 b;
    public final long c;
    public final long d;

    public gi5(int i, int i2, af4 af4Var) {
        this.a = i;
        this.b = af4Var;
        this.c = ((long) i) * 1000000;
        this.d = ((long) i2) * 1000000;
    }

    @Override // defpackage.zh5
    public final float d(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fB = this.b.b(this.a == 0 ? 1.0f : j2 / j3);
        return (f2 * fB) + ((1.0f - fB) * f);
    }

    @Override // defpackage.zh5
    public final float e(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (d(j4, f, f2, f3) - d(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.zh5
    public final long f(float f, float f2, float f3) {
        return this.d + this.c;
    }
}
