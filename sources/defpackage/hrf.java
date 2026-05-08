package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hrf {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public hrf(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            l5.q("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            j6.g("Parameter d must be in the range [0..1], was ", d5);
            throw null;
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            l5.q("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            l5.q("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            l5.q("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            l5.q("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            l5.q("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrf)) {
            return false;
        }
        hrf hrfVar = (hrf) obj;
        return Double.compare(this.a, hrfVar.a) == 0 && Double.compare(this.b, hrfVar.b) == 0 && Double.compare(this.c, hrfVar.c) == 0 && Double.compare(this.d, hrfVar.d) == 0 && Double.compare(this.e, hrfVar.e) == 0 && Double.compare(this.f, hrfVar.f) == 0 && Double.compare(this.g, hrfVar.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + ((Double.hashCode(this.f) + ((Double.hashCode(this.e) + ((Double.hashCode(this.d) + ((Double.hashCode(this.c) + ((Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ')';
    }

    public /* synthetic */ hrf(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
