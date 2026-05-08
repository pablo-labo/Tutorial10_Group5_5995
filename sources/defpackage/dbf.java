package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dbf {
    public final String a;
    public final String b;

    public dbf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbf)) {
            return false;
        }
        dbf dbfVar = (dbf) obj;
        return wl7.b(this.a, dbfVar.a) && wl7.b(this.b, dbfVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return akb.k("TaxonomyConceptTitleItem(label=", this.a, ", suid=", this.b, ")");
    }
}
