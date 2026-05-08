package defpackage;

import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes3.dex */
public class nic extends ojh {
    public static double A(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + JwtParser.SEPARATOR_CHAR);
    }

    public static float B(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + JwtParser.SEPARATOR_CHAR);
    }

    public static int C(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + JwtParser.SEPARATOR_CHAR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int D(int i, oh7 oh7Var) {
        int i2 = oh7Var.b;
        int i3 = oh7Var.a;
        if (oh7Var instanceof t82) {
            return ((Number) F(Integer.valueOf(i), (s82) ((t82) oh7Var))).intValue();
        }
        if (!oh7Var.isEmpty()) {
            return i < Integer.valueOf(i3).intValue() ? Integer.valueOf(i3).intValue() : i > Integer.valueOf(i2).intValue() ? Integer.valueOf(i2).intValue() : i;
        }
        l6.n("Cannot coerce value to an empty range: ", 46, oh7Var);
        return 0;
    }

    public static long E(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        StringBuilder sbI = w40.i(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbI.append(j2);
        sbI.append(JwtParser.SEPARATOR_CHAR);
        throw new IllegalArgumentException(sbI.toString());
    }

    public static Comparable F(Comparable comparable, s82 s82Var) {
        float f = s82Var.b;
        float f2 = s82Var.a;
        if (!s82Var.a()) {
            return (!s82Var.b(comparable, Float.valueOf(f2)) || s82Var.b(Float.valueOf(f2), comparable)) ? (!s82Var.b(Float.valueOf(f), comparable) || s82Var.b(comparable, Float.valueOf(f))) ? comparable : Float.valueOf(f) : Float.valueOf(f2);
        }
        l6.n("Cannot coerce value to an empty range: ", 46, s82Var);
        return null;
    }

    public static mh7 G(int i, oh7 oh7Var) {
        oh7Var.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            l6.n("Step must be positive, was: ", 46, numValueOf);
            return null;
        }
        int i2 = oh7Var.a;
        int i3 = oh7Var.b;
        if (oh7Var.c <= 0) {
            i = -i;
        }
        return new mh7(i2, i3, i);
    }

    public static oh7 H(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new oh7(i, i2 - 1, 1);
        }
        oh7 oh7Var = oh7.d;
        return oh7.d;
    }
}
