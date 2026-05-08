package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fpf {
    public final dwa a;
    public long b;

    public fpf(long j, dwa dwaVar) {
        this.a = dwaVar;
        this.b = j;
    }

    public final long a(yeb yebVar, float f) {
        long jF = ooa.f(this.b, ooa.e(yebVar.c, yebVar.g));
        this.b = jF;
        dwa dwaVar = this.a;
        if ((dwaVar == null ? ooa.d(jF) : Math.abs(b(jF))) < f) {
            return 9205357640488583168L;
        }
        long j = this.b;
        if (dwaVar == null) {
            return ooa.e(this.b, ooa.g(ooa.b(j, ooa.d(j)), f));
        }
        float fB = b(j) - (Math.signum(b(this.b)) * f);
        long j2 = this.b;
        dwa dwaVar2 = dwa.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dwaVar == dwaVar2 ? j2 & 4294967295L : j2 >> 32));
        if (dwaVar == dwaVar2) {
            return (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.a == dwa.b ? j >> 32 : j & 4294967295L));
    }
}
