package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class yz7 {
    public final String a;
    public final String b;
    public final String c;
    public final jhf d;
    public final Boolean e;
    public final String f;
    public final String g;
    public final Locale h;
    public final z13 i;
    public final String j;
    public final String k;
    public final String l;
    public final List<to7> m;
    public final Set<er2> n;

    public yz7(int i) {
        Boolean bool = Boolean.TRUE;
        String str = (i & 2) != 0 ? null : "FirstName";
        jhf jhfVar = new jhf((String) null, 0L, 7);
        Boolean bool2 = (i & 16) != 0 ? Boolean.FALSE : bool;
        String str2 = (i & 32) == 0 ? "test@test.com" : null;
        z13 z13VarN = ee3.n("US");
        o18 o18Var = o18.c;
        String country = Locale.US.getCountry();
        country.getClass();
        this(null, str, null, jhfVar, bool2, str2, null, null, z13VarN, null, null, null, u63.Z(new to7(o18Var, country)), zz7.a);
    }

    public static yz7 a(yz7 yz7Var, String str, String str2, String str3, jhf jhfVar, Boolean bool, String str4, String str5, Locale locale, z13 z13Var, String str6, String str7, String str8, List list, Set set, int i) {
        String str9 = (i & 1) != 0 ? yz7Var.a : str;
        String str10 = (i & 2) != 0 ? yz7Var.b : str2;
        String str11 = (i & 4) != 0 ? yz7Var.c : str3;
        jhf jhfVar2 = (i & 8) != 0 ? yz7Var.d : jhfVar;
        Boolean bool2 = (i & 16) != 0 ? yz7Var.e : bool;
        String str12 = (i & 32) != 0 ? yz7Var.f : str4;
        String str13 = (i & 64) != 0 ? yz7Var.g : str5;
        Locale locale2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? yz7Var.h : locale;
        z13 z13Var2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? yz7Var.i : z13Var;
        String str14 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? yz7Var.j : str6;
        String str15 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? yz7Var.k : str7;
        String str16 = (i & 2048) != 0 ? yz7Var.l : str8;
        List list2 = (i & 4096) != 0 ? yz7Var.m : list;
        Set set2 = (i & 8192) != 0 ? yz7Var.n : set;
        yz7Var.getClass();
        z13Var2.getClass();
        set2.getClass();
        return new yz7(str9, str10, str11, jhfVar2, bool2, str12, str13, locale2, z13Var2, str14, str15, str16, list2, set2);
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz7)) {
            return false;
        }
        yz7 yz7Var = (yz7) obj;
        return wl7.b(this.a, yz7Var.a) && wl7.b(this.b, yz7Var.b) && wl7.b(this.c, yz7Var.c) && wl7.b(this.d, yz7Var.d) && wl7.b(this.e, yz7Var.e) && wl7.b(this.f, yz7Var.f) && wl7.b(this.g, yz7Var.g) && wl7.b(this.h, yz7Var.h) && wl7.b(this.i, yz7Var.i) && wl7.b(this.j, yz7Var.j) && wl7.b(this.k, yz7Var.k) && wl7.b(this.l, yz7Var.l) && wl7.b(this.m, yz7Var.m) && wl7.b(this.n, yz7Var.n);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        jhf jhfVar = this.d;
        int iHashCode4 = (iHashCode3 + (jhfVar == null ? 0 : jhfVar.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Locale locale = this.h;
        int iHashCode8 = (this.i.hashCode() + ((iHashCode7 + (locale == null ? 0 : locale.hashCode())) * 31)) * 31;
        String str6 = this.j;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.l;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<to7> list = this.m;
        return this.n.hashCode() + ((iHashCode11 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("JobSeekerContactInformationState(id=", this.a, ", firstName=", this.b, ", lastName=");
        sbF.append(this.c);
        sbF.append(", nationalPhoneNumberAndSelection=");
        sbF.append(this.d);
        sbF.append(", showNumberOnIndeed=");
        sbF.append(this.e);
        sbF.append(", email=");
        sbF.append(this.f);
        sbF.append(", headline=");
        sbF.append(this.g);
        sbF.append(", country=");
        sbF.append(this.h);
        sbF.append(", countryCode=");
        sbF.append(this.i);
        sbF.append(", streetAddress=");
        sbF.append(this.j);
        sbF.append(", formattedLocation=");
        ia.r(sbF, this.k, ", postalCode=", this.l, ", employmentEligibilities=");
        sbF.append(this.m);
        sbF.append(", contactInfoInvalidInputs=");
        sbF.append(this.n);
        sbF.append(")");
        return sbF.toString();
    }

    public yz7() {
        this(16383);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yz7(String str, String str2, String str3, jhf jhfVar, Boolean bool, String str4, String str5, Locale locale, z13 z13Var, String str6, String str7, String str8, List<to7> list, Set<? extends er2> set) {
        set.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = jhfVar;
        this.e = bool;
        this.f = str4;
        this.g = str5;
        this.h = locale;
        this.i = z13Var;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = list;
        this.n = set;
    }
}
