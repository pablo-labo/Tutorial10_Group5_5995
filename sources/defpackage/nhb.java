package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nhb {
    public final String a;
    public final String b;
    public final String c;

    public nhb(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhb)) {
            return false;
        }
        nhb nhbVar = (nhb) obj;
        return wl7.b(this.a, nhbVar.a) && wl7.b(this.b, nhbVar.b) && wl7.b(this.c, nhbVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return l6.i(u40.f("PostApplyRequest(url=", this.a, ", confirmMessage=", this.b, ", confirmUrl="), this.c, ")");
    }
}
