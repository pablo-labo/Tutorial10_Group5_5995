package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hz4 {
    public final vk0 a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final List<String> k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    public hz4(vk0 vk0Var, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, String str12) {
        vk0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        list.getClass();
        this.a = vk0Var;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = list;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz4)) {
            return false;
        }
        hz4 hz4Var = (hz4) obj;
        return this.a == hz4Var.a && wl7.b(this.b, hz4Var.b) && this.c == hz4Var.c && wl7.b(this.d, hz4Var.d) && wl7.b(this.e, hz4Var.e) && wl7.b(this.f, hz4Var.f) && wl7.b(this.g, hz4Var.g) && wl7.b(this.h, hz4Var.h) && wl7.b(this.i, hz4Var.i) && wl7.b(this.j, hz4Var.j) && wl7.b(this.k, hz4Var.k) && wl7.b(this.l, hz4Var.l) && wl7.b(this.m, hz4Var.m) && wl7.b(this.n, hz4Var.n) && wl7.b(this.o, hz4Var.o);
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(w40.c(this.c, akb.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iG = ia.g(this.k, akb.d(akb.d(akb.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31);
        String str3 = this.l;
        int iHashCode2 = (iG + (str3 == null ? 0 : str3.hashCode())) * 961;
        String str4 = this.m;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventLoggerConfig(appId=");
        sb.append(this.a);
        sb.append(", appVersion=");
        sb.append(this.b);
        sb.append(", appBuildNum=");
        sb.append(this.c);
        sb.append(", appVariant=");
        sb.append(this.d);
        sb.append(", appEnvironment=");
        ia.r(sb, this.e, ", appCountry=", this.f, ", ipCountry=");
        ia.r(sb, this.g, ", appInstallId=", this.h, ", appSessionId=");
        ia.r(sb, this.i, ", sessionId=", this.j, ", groups=");
        sb.append(this.k);
        sb.append(", accountId=");
        sb.append(this.l);
        sb.append(", secondaryAccountId=null, ctk=");
        ia.r(sb, this.m, ", deviceId=", this.n, ", advertisingId=");
        return l6.i(sb, this.o, ")");
    }
}
