package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uaa {
    public final String a;
    public final String b;
    public final String c;

    public uaa(String str, String str2, String str3) {
        q6.m(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaa)) {
            return false;
        }
        uaa uaaVar = (uaa) obj;
        return wl7.b(this.a, uaaVar.a) && wl7.b(this.b, uaaVar.b) && wl7.b(this.c, uaaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return l6.i(u40.f("NavBarRightItem(id=", this.a, ", destinationUrl=", this.b, ", label="), this.c, ")");
    }
}
