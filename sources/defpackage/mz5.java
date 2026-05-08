package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mz5 {
    public final double a;
    public final double b;
    public final e29 c;

    public mz5(double d, double d2, e29 e29Var) {
        this.a = d;
        this.b = d2;
        this.c = e29Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz5)) {
            return false;
        }
        mz5 mz5Var = (mz5) obj;
        return Double.compare(this.a, mz5Var.a) == 0 && Double.compare(this.b, mz5Var.b) == 0 && this.c == mz5Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "GeoLocation(lat=" + this.a + ", lng=" + this.b + ", source=" + this.c + ")";
    }
}
