package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fig {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public fig(String str, String str2, String str3, String str4) {
        q6.m(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fig)) {
            return false;
        }
        fig figVar = (fig) obj;
        return wl7.b(this.a, figVar.a) && wl7.b(this.b, figVar.b) && wl7.b(this.c, figVar.c) && wl7.b(this.d, figVar.d);
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return z3.n(u40.f("UrlRegistryItem(id=", this.a, ", locale=", this.b, ", destinationUrl="), this.c, ", label=", this.d, ")");
    }
}
