package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o23 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List<String> e;
    public final List<String> f;

    public o23(String str, String str2, String str3, String str4, List<String> list, List<String> list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o23)) {
            return false;
        }
        o23 o23Var = (o23) obj;
        return wl7.b(this.a, o23Var.a) && wl7.b(this.b, o23Var.b) && wl7.b(this.c, o23Var.c) && wl7.b(this.d, o23Var.d) && wl7.b(this.e, o23Var.e) && wl7.b(this.f, o23Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ia.g(this.e, akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("CountrySiteItem(locale=", this.a, ", countryCode=", this.b, ", countryName=");
        ia.r(sbF, this.c, ", baseUrl=", this.d, ", supportedLanguageCodes=");
        sbF.append(this.e);
        sbF.append(", supportedLanguages=");
        sbF.append(this.f);
        sbF.append(")");
        return sbF.toString();
    }
}
