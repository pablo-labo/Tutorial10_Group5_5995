package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wj8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public /* synthetic */ wj8(int i, String str, String str2, String str3, String str4, String str5) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, false, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public static wj8 a(wj8 wj8Var, boolean z) {
        return new wj8(wj8Var.a, wj8Var.b, z, wj8Var.c, wj8Var.d, wj8Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj8)) {
            return false;
        }
        wj8 wj8Var = (wj8) obj;
        return wl7.b(this.a, wj8Var.a) && wl7.b(this.b, wj8Var.b) && wl7.b(this.c, wj8Var.c) && wl7.b(this.d, wj8Var.d) && wl7.b(this.e, wj8Var.e) && this.f == wj8Var.f;
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
        return Boolean.hashCode(this.f) + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("LanguageSkillItem(id=", this.a, ", language=", this.b, ", languageTaxonomyId=");
        ia.r(sbF, this.c, ", proficiency=", this.d, ", proficiencyTaxonomyId=");
        sbF.append(this.e);
        sbF.append(", deletionCandidate=");
        sbF.append(this.f);
        sbF.append(")");
        return sbF.toString();
    }

    public wj8() {
        this(63, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public wj8(String str, String str2, boolean z, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
    }
}
