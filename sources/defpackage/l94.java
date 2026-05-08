package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class l94 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof l94) {
            return this.a == ((l94) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) j94.e(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) j94.e(Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
    }
}
