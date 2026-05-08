package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class m94 {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m94) {
            return this.a == ((m94) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) j94.e(b(j))) + " x " + ((Object) j94.e(a(j)));
    }
}
