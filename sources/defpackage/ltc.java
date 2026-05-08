package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ltc {
    public final String a;
    public final String b;

    public ltc(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltc)) {
            return false;
        }
        ltc ltcVar = (ltc) obj;
        return wl7.b(this.a, ltcVar.a) && wl7.b(this.b, ltcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return akb.k("RecordsForKeys(key=", this.a, ", record=", this.b, ")");
    }
}
