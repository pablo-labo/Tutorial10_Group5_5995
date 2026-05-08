package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class bkf {
    public static final ckf[] b = {new ckf(0), new ckf(4294967296L), new ckf(8589934592L)};
    public static final long c = hh2.y(0, Float.NaN);
    public final long a;

    public /* synthetic */ bkf(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long jB = b(j);
        if (ckf.a(jB, 0L)) {
            return "Unspecified";
        }
        if (ckf.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!ckf.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bkf) {
            return this.a == ((bkf) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
