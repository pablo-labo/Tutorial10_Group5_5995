package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class psc {
    public final String a;
    public final String b;

    public psc(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psc)) {
            return false;
        }
        psc pscVar = (psc) obj;
        return wl7.b(this.a, pscVar.a) && wl7.b(this.b, pscVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return akb.k("RecentSearchData(encodedKeyword=", this.a, ", encodedLocation=", this.b, ")");
    }

    public psc() {
        this("", "");
    }
}
