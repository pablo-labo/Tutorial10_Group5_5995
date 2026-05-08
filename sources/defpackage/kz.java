package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kz {
    public final String a;
    public final Long b;

    public kz(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz)) {
            return false;
        }
        kz kzVar = (kz) obj;
        return wl7.b(this.a, kzVar.a) && wl7.b(this.b, kzVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalFileData(fileName=" + this.a + ", fileSize=" + this.b + ")";
    }
}
