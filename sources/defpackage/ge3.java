package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ge3 {
    public final fe3 a;
    public final fe3 b;
    public final double c;

    public ge3(fe3 fe3Var, fe3 fe3Var2, double d) {
        fe3Var.getClass();
        fe3Var2.getClass();
        this.a = fe3Var;
        this.b = fe3Var2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge3)) {
            return false;
        }
        ge3 ge3Var = (ge3) obj;
        return this.a == ge3Var.a && this.b == ge3Var.b && Double.valueOf(this.c).equals(Double.valueOf(ge3Var.c));
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ge3() {
        fe3 fe3Var = fe3.COLLECTION_SDK_NOT_INSTALLED;
        this(fe3Var, fe3Var, 1.0d);
    }
}
