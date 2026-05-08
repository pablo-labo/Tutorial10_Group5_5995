package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ca {
    public final String a;
    public final String b;
    public final String c;

    public ca(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        return wl7.b(this.a, caVar.a) && wl7.b(this.b, caVar.b) && wl7.b(this.c, caVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + akb.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return l6.i(u40.f("AdTransparencyData(adSponsor=", this.a, ", adBeneficiary=", this.b, ", adTargetingCriteria="), this.c, ")");
    }
}
