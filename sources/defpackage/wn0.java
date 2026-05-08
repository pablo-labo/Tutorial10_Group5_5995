package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wn0 {
    public final String a;
    public final String b;

    public wn0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn0)) {
            return false;
        }
        wn0 wn0Var = (wn0) obj;
        return wl7.b(this.a, wn0Var.a) && wl7.b(this.b, wn0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return akb.k("ApplicationInsightsData(reviewedPercentage=", this.a, ", reviewDays=", this.b, ")");
    }
}
