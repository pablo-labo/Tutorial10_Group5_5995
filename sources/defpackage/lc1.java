package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class lc1 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof lc1) {
            return Float.compare(this.a, ((lc1) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
