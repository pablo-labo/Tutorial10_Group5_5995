package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e8d {
    public final String a;
    public final s9d b;
    public final String c;
    public final u18 d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public e8d(String str, s9d s9dVar, String str2, u18 u18Var, Long l, String str3, String str4, String str5, String str6, String str7) {
        s9dVar.getClass();
        this.a = str;
        this.b = s9dVar;
        this.c = str2;
        this.d = u18Var;
        this.e = l;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8d)) {
            return false;
        }
        e8d e8dVar = (e8d) obj;
        return this.a.equals(e8dVar.a) && wl7.b(this.b, e8dVar.b) && wl7.b(this.c, e8dVar.c) && this.d == e8dVar.d && wl7.b(this.e, e8dVar.e) && wl7.b(this.f, e8dVar.f) && wl7.b(this.g, e8dVar.g) && wl7.b(this.h, e8dVar.h) && wl7.b(this.i, e8dVar.i) && wl7.b(this.j, e8dVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        u18 u18Var = this.d;
        int iHashCode3 = (iHashCode2 + (u18Var == null ? 0 : u18Var.hashCode())) * 31;
        Long l = this.e;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResumeFileMetadata(id=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", fileName=");
        sb.append(this.c);
        sb.append(", fileType=");
        sb.append(this.d);
        sb.append(", uploadTimestamp=");
        sb.append(this.e);
        sb.append(", mediaType=");
        sb.append(this.f);
        sb.append(", fileDescription=");
        ia.r(sb, this.g, ", extension=", this.h, ", standardHashCode=");
        return z3.n(sb, this.i, ", clientApp=", this.j, ")");
    }
}
