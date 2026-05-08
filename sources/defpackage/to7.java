package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class to7 {
    public final o18 a;
    public final String b;

    public to7(o18 o18Var, String str) {
        this.a = o18Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to7)) {
            return false;
        }
        to7 to7Var = (to7) obj;
        return this.a == to7Var.a && this.b.equals(to7Var.b);
    }

    public final int hashCode() {
        o18 o18Var = this.a;
        return this.b.hashCode() + ((o18Var == null ? 0 : o18Var.hashCode()) * 31);
    }

    public final String toString() {
        return "JSEmploymentEligibility(employmentEligibility=" + this.a + ", idCountryCode=" + this.b + ")";
    }
}
