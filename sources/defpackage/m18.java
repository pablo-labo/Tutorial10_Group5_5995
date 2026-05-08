package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m18 {
    public final String a;
    public final hva<o18> b;

    /* JADX WARN: Multi-variable type inference failed */
    public m18(String str, hva<? extends o18> hvaVar) {
        hvaVar.getClass();
        this.a = str;
        this.b = hvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m18)) {
            return false;
        }
        m18 m18Var = (m18) obj;
        return this.a.equals(m18Var.a) && wl7.b(this.b, m18Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JobSeekerProfileEmploymentEligibilitiesInput(id=" + this.a + ", employmentEligibility=" + this.b + ")";
    }
}
