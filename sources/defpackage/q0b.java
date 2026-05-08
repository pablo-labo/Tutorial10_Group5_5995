package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q0b {
    public final String a;
    public final String b;
    public final String c;

    public q0b(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0b)) {
            return false;
        }
        q0b q0bVar = (q0b) obj;
        return this.a.equals(q0bVar.a) && wl7.b(this.b, q0bVar.b) && wl7.b(this.c, q0bVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return l6.i(u40.f("PageMetadata(tk=", this.a, ", shareUrl=", this.b, ", shareMessage="), this.c, ")");
    }
}
