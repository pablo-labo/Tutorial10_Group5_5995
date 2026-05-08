package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface iy3 {
    default float C0(long j) {
        if (!ckf.a(bkf.b(j), 4294967296L)) {
            ce7.b("Only Sp can convert to Px");
        }
        return t1(S(j));
    }

    default long H(float f) {
        float[] fArr = jo5.a;
        if (p1() < 1.03f) {
            return hh2.y(4294967296L, f / p1());
        }
        io5 io5VarA = jo5.a(p1());
        return hh2.y(4294967296L, io5VarA != null ? io5VarA.a(f) : f / p1());
    }

    default long I(long j) {
        if (j != 9205357640488583168L) {
            return r03.d(l1(Float.intBitsToFloat((int) (j >> 32))), l1(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default long I1(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fT1 = t1(m94.b(j));
        float fT12 = t1(m94.a(j));
        return (((long) Float.floatToRawIntBits(fT1)) << 32) | (((long) Float.floatToRawIntBits(fT12)) & 4294967295L);
    }

    default float S(long j) {
        if (!ckf.a(bkf.b(j), 4294967296L)) {
            ce7.b("Only Sp can convert to Px");
        }
        float[] fArr = jo5.a;
        if (p1() < 1.03f) {
            return p1() * bkf.c(j);
        }
        io5 io5VarA = jo5.a(p1());
        if (io5VarA != null) {
            return io5VarA.b(bkf.c(j));
        }
        return p1() * bkf.c(j);
    }

    default long d0(float f) {
        return H(l1(f));
    }

    float getDensity();

    default float k1(int i) {
        return i / getDensity();
    }

    default float l1(float f) {
        return f / getDensity();
    }

    float p1();

    default float t1(float f) {
        return getDensity() * f;
    }

    default int x0(float f) {
        float fT1 = t1(f);
        if (Float.isInfinite(fT1)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fT1);
    }

    default int x1(long j) {
        return Math.round(C0(j));
    }
}
