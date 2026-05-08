package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hde {
    public final String a;
    public final String b;

    public hde(String str, String str2, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hde)) {
            return false;
        }
        hde hdeVar = (hde) obj;
        return wl7.b(this.a, hdeVar.a) && wl7.b(this.b, hdeVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return akb.k("ShareButtonDetails(url=", this.a, ", message=", this.b, ", tk=null)");
    }

    public hde() {
        this(null, null, 7);
    }
}
