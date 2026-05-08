package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class raa {
    public final saa a;
    public final String b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final gu5<j6g> f;

    public /* synthetic */ raa(saa saaVar, String str, String str2, Integer num, gu5 gu5Var, int i) {
        this(saaVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0, (gu5<j6g>) ((i & 32) != 0 ? null : gu5Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof raa)) {
            return false;
        }
        raa raaVar = (raa) obj;
        return wl7.b(this.a, raaVar.a) && wl7.b(this.b, raaVar.b) && wl7.b(this.c, raaVar.c) && wl7.b(this.d, raaVar.d) && this.e == raaVar.e && wl7.b(this.f, raaVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iF = ia.f((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
        gu5<j6g> gu5Var = this.f;
        return iF + (gu5Var != null ? gu5Var.hashCode() : 0);
    }

    public final String toString() {
        return "NavBarItem(variant=" + this.a + ", screenName=" + this.b + ", title=" + this.c + ", badgeCount=" + this.d + ", enabled=" + this.e + ", onClick=" + this.f + ")";
    }

    public raa(saa saaVar, String str, String str2, Integer num, boolean z, gu5<j6g> gu5Var) {
        saaVar.getClass();
        this.a = saaVar;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = z;
        this.f = gu5Var;
    }
}
