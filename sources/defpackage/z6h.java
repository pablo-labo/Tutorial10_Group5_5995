package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z6h {
    public final float a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public /* synthetic */ z6h() {
        this(1.0f, 0L, 0L, 0L, 0L);
    }

    public static z6h b(z6h z6hVar, float f, long j, long j2, long j3, long j4, int i) {
        if ((i & 1) != 0) {
            f = z6hVar.a;
        }
        float f2 = f;
        if ((i & 2) != 0) {
            j = z6hVar.b;
        }
        long j5 = j;
        if ((i & 4) != 0) {
            j2 = z6hVar.c;
        }
        long j6 = j2;
        long j7 = (i & 8) != 0 ? z6hVar.d : j3;
        long j8 = (i & 16) != 0 ? z6hVar.e : j4;
        z6hVar.getClass();
        return new z6h(f2, j5, j6, j7, j8);
    }

    public final long a(long j) {
        if (this.a <= 1.0f) {
            return 0L;
        }
        long j2 = this.d;
        return c(Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public final long c(float f, float f2) {
        long j = this.b;
        float f3 = (int) (j >> 32);
        float f4 = this.a;
        float f5 = (int) (j >> 32);
        float f6 = (int) (j & 4294967295L);
        float f7 = (int) (j & 4294967295L);
        return (((long) Float.floatToRawIntBits(nic.B(f, -(((f3 * f4) - f3) / 2.0f), ((f5 * f4) - f5) / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(nic.B(f2, -(((f6 * f4) - f6) / 2.0f), ((f4 * f7) - f7) / 2.0f))) & 4294967295L);
    }

    public final z6h d(neb nebVar, int i, int i2) {
        char c;
        char c2;
        float fIntBitsToFloat;
        long jC;
        float fE = pyd.e(nebVar, true);
        float fE2 = pyd.e(nebVar, false);
        float fIntBitsToFloat2 = 0.0f;
        float f = (fE == 0.0f || fE2 == 0.0f) ? 1.0f : fE / fE2;
        float f2 = this.a;
        float fB = nic.B(f * f2, 1.0f, 3.0f);
        long jD = pyd.d(nebVar, true);
        if (fB <= 1.0f) {
            jC = 0;
        } else {
            boolean zC = ooa.c(jD, 0L);
            long j = this.c;
            if (zC) {
                c = ' ';
            } else {
                c = ' ';
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD >> 32)) / ((int) (j >> 32));
            }
            if (ooa.c(jD, 0L)) {
                c2 = c;
                fIntBitsToFloat = 0.0f;
            } else {
                c2 = c;
                fIntBitsToFloat = (Float.intBitsToFloat((int) (jD & 4294967295L)) + i) / (i2 + ((int) (j & 4294967295L)));
            }
            float f3 = fB - f2;
            long j2 = this.b;
            float f4 = ((int) (j2 >> c2)) * f3;
            float f5 = f3 * ((int) (j2 & 4294967295L));
            long j3 = this.d;
            jC = c(k6.b(0.5f, fIntBitsToFloat2, f4, Float.intBitsToFloat((int) (j3 >> c2))), k6.b(0.5f, fIntBitsToFloat, f5, Float.intBitsToFloat((int) (j3 & 4294967295L))));
        }
        z6h z6hVarB = b(this, fB, 0L, 0L, jC, 0L, 22);
        long jD2 = pyd.d(nebVar, true);
        return b(z6hVarB, 0.0f, 0L, 0L, z6hVarB.a(ooa.c(jD2, 9205357640488583168L) ? 0L : ooa.e(jD2, pyd.d(nebVar, false))), jD, 7);
    }

    public final z6h e(neb nebVar) {
        if (nebVar.e == 1) {
            return b(this, 0.0f, 0L, 0L, 0L, ((yeb) z92.O0(nebVar.a)).c, 15);
        }
        long jD = pyd.d(nebVar, true);
        return b(this, 0.0f, 0L, 0L, a(ooa.c(jD, 9205357640488583168L) ? 0L : ooa.e(jD, pyd.d(nebVar, false))), pyd.d(nebVar, true), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6h)) {
            return false;
        }
        z6h z6hVar = (z6h) obj;
        return Float.compare(this.a, z6hVar.a) == 0 && th7.b(this.b, z6hVar.b) && th7.b(this.c, z6hVar.c) && ooa.c(this.d, z6hVar.d) && ooa.c(this.e, z6hVar.e);
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ia.d(ia.d(ia.d(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strC = th7.c(this.b);
        String strC2 = th7.c(this.c);
        String strH = ooa.h(this.d);
        String strH2 = ooa.h(this.e);
        StringBuilder sb = new StringBuilder("ZoomState(scaleFactor=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(strC);
        sb.append(", containerSize=");
        ia.r(sb, strC2, ", transformOffset=", strH, ", lastTouch=");
        return l6.i(sb, strH2, ")");
    }

    public z6h(float f, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }
}
