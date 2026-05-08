package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yr7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ yr7() {
        this(null, "TEST LANGUAGE", "test-123", "Expert", "testid-123");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr7)) {
            return false;
        }
        yr7 yr7Var = (yr7) obj;
        return wl7.b(this.a, yr7Var.a) && wl7.b(this.b, yr7Var.b) && wl7.b(this.c, yr7Var.c) && wl7.b(this.d, yr7Var.d) && wl7.b(this.e, yr7Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("JSTProfileLanguage(id=", this.a, ", language=", this.b, ", languageTaxonomyId=");
        ia.r(sbF, this.c, ", proficiency=", this.d, ", proficiencyTaxonomyId=");
        return l6.i(sbF, this.e, ")");
    }

    public yr7(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }
}
