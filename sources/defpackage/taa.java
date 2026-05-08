package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class taa {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public taa(String str, String str2, String str3, String str4) {
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
        if (!(obj instanceof taa)) {
            return false;
        }
        taa taaVar = (taa) obj;
        return wl7.b(this.a, taaVar.a) && wl7.b(this.b, taaVar.b) && wl7.b(this.c, taaVar.c) && wl7.b(this.d, taaVar.d);
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return z3.n(u40.f("NavBarLeftItem(id=", this.a, ", destinationUrl=", this.b, ", label="), this.c, ", logoUrl=", this.d, ")");
    }
}
