package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vsb {
    public final List<sjb> a;
    public final List<sjb> b;
    public final List<sjb> c;
    public final List<sjb> d;
    public final List<sjb> e;
    public final List<sjb> f;
    public final List<sjb> g;
    public final List<sjb> h;
    public final List<sjb> i;
    public final List<sjb> j;
    public final List<sjb> k;
    public final j1h l;
    public final List<sjb> m;
    public final g4h n;
    public final String o;
    public final zt9 p;
    public final List<e78> q;
    public final Boolean r;
    public final List<fzc> s;
    public final Integer t;
    public final usb u;

    public vsb(List<sjb> list, List<sjb> list2, List<sjb> list3, List<sjb> list4, List<sjb> list5, List<sjb> list6, List<sjb> list7, List<sjb> list8, List<sjb> list9, List<sjb> list10, List<sjb> list11, j1h j1hVar, List<sjb> list12, g4h g4hVar, String str, zt9 zt9Var, List<e78> list13, Boolean bool, List<fzc> list14, Integer num, usb usbVar) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = list6;
        this.g = list7;
        this.h = list8;
        this.i = list9;
        this.j = list10;
        this.k = list11;
        this.l = j1hVar;
        this.m = list12;
        this.n = g4hVar;
        this.o = str;
        this.p = zt9Var;
        this.q = list13;
        this.r = bool;
        this.s = list14;
        this.t = num;
        this.u = usbVar;
    }

    public static vsb a(vsb vsbVar, List list, ArrayList arrayList, ArrayList arrayList2, List list2, ArrayList arrayList3, List list3, ArrayList arrayList4, List list4, ArrayList arrayList5, List list5, List list6, j1h j1hVar, List list7, g4h g4hVar, String str, zt9 zt9Var, List list8, Boolean bool, List list9, Integer num, usb usbVar, int i) {
        List list10 = (i & 1) != 0 ? vsbVar.a : list;
        List<sjb> list11 = (i & 2) != 0 ? vsbVar.b : arrayList;
        List<sjb> list12 = (i & 4) != 0 ? vsbVar.c : arrayList2;
        List list13 = (i & 8) != 0 ? vsbVar.d : list2;
        List<sjb> list14 = (i & 16) != 0 ? vsbVar.e : arrayList3;
        List list15 = (i & 32) != 0 ? vsbVar.f : list3;
        List<sjb> list16 = (i & 64) != 0 ? vsbVar.g : arrayList4;
        List list17 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? vsbVar.h : list4;
        List<sjb> list18 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? vsbVar.i : arrayList5;
        List list19 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? vsbVar.j : list5;
        List list20 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? vsbVar.k : list6;
        j1h j1hVar2 = (i & 2048) != 0 ? vsbVar.l : j1hVar;
        List list21 = (i & 4096) != 0 ? vsbVar.m : list7;
        g4h g4hVar2 = (i & 8192) != 0 ? vsbVar.n : g4hVar;
        List list22 = list10;
        String str2 = (i & 16384) != 0 ? vsbVar.o : str;
        zt9 zt9Var2 = (i & 32768) != 0 ? vsbVar.p : zt9Var;
        List list23 = (i & 65536) != 0 ? vsbVar.q : list8;
        Boolean bool2 = (i & 131072) != 0 ? vsbVar.r : bool;
        List list24 = (i & 262144) != 0 ? vsbVar.s : list9;
        Integer num2 = (i & 524288) != 0 ? vsbVar.t : num;
        usb usbVar2 = (i & 1048576) != 0 ? vsbVar.u : usbVar;
        vsbVar.getClass();
        list22.getClass();
        list11.getClass();
        list12.getClass();
        list13.getClass();
        list14.getClass();
        list15.getClass();
        list16.getClass();
        list17.getClass();
        list18.getClass();
        list19.getClass();
        list20.getClass();
        list21.getClass();
        usbVar2.getClass();
        return new vsb(list22, list11, list12, list13, list14, list15, list16, list17, list18, list19, list20, j1hVar2, list21, g4hVar2, str2, zt9Var2, list23, bool2, list24, num2, usbVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsb)) {
            return false;
        }
        vsb vsbVar = (vsb) obj;
        return wl7.b(this.a, vsbVar.a) && wl7.b(this.b, vsbVar.b) && wl7.b(this.c, vsbVar.c) && wl7.b(this.d, vsbVar.d) && wl7.b(this.e, vsbVar.e) && wl7.b(this.f, vsbVar.f) && wl7.b(this.g, vsbVar.g) && wl7.b(this.h, vsbVar.h) && wl7.b(this.i, vsbVar.i) && wl7.b(this.j, vsbVar.j) && wl7.b(this.k, vsbVar.k) && wl7.b(this.l, vsbVar.l) && wl7.b(this.m, vsbVar.m) && wl7.b(this.n, vsbVar.n) && wl7.b(this.o, vsbVar.o) && wl7.b(this.p, vsbVar.p) && wl7.b(this.q, vsbVar.q) && wl7.b(this.r, vsbVar.r) && wl7.b(this.s, vsbVar.s) && wl7.b(this.t, vsbVar.t) && this.u == vsbVar.u;
    }

    public final int hashCode() {
        int iG = ia.g(this.k, ia.g(this.j, ia.g(this.i, ia.g(this.h, ia.g(this.g, ia.g(this.f, ia.g(this.e, ia.g(this.d, ia.g(this.c, ia.g(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        j1h j1hVar = this.l;
        int iG2 = ia.g(this.m, (iG + (j1hVar == null ? 0 : j1hVar.hashCode())) * 31, 31);
        g4h g4hVar = this.n;
        int iHashCode = (iG2 + (g4hVar == null ? 0 : g4hVar.hashCode())) * 31;
        String str = this.o;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        zt9 zt9Var = this.p;
        int iHashCode3 = (iHashCode2 + (zt9Var == null ? 0 : zt9Var.hashCode())) * 31;
        List<e78> list = this.q;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.r;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<fzc> list2 = this.s;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.t;
        return this.u.hashCode() + ((iHashCode6 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfilePreferencesState(remoteWorkPreferences=");
        sb.append(this.a);
        sb.append(", remoteWorkPreferenceOptions=");
        sb.append(this.b);
        sb.append(", jobTypePreferenceOptions=");
        l6.q(sb, this.c, ", jobTypePreferences=", this.d, ", workScheduleDaysOptions=");
        l6.q(sb, this.e, ", workScheduleDaysPreferences=", this.f, ", workScheduleShiftOptions=");
        l6.q(sb, this.g, ", workScheduleShiftPreferences=", this.h, ", workSchedulesOptions=");
        l6.q(sb, this.i, ", workSchedulesPreferences=", this.j, ", workAreasPreferencesSelectedOptions=");
        sb.append(this.k);
        sb.append(", workAreasPreferences=");
        sb.append(this.l);
        sb.append(", workWellBeingPreferencesSelectedOptions=");
        sb.append(this.m);
        sb.append(", workWellBeingPreferences=");
        sb.append(this.n);
        sb.append(", preferenceId=");
        sb.append(this.o);
        sb.append(", minimumPay=");
        sb.append(this.p);
        sb.append(", jobTitles=");
        sb.append(this.q);
        sb.append(", willingToRelocate=");
        sb.append(this.r);
        sb.append(", relocationLocations=");
        sb.append(this.s);
        sb.append(", maximumCommuteTimeMinutes=");
        sb.append(this.t);
        sb.append(", profilePreferencesErrorState=");
        sb.append(this.u);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ vsb(int i) {
        zr4 zr4Var = zr4.a;
        this(zr4Var, zr4Var, zr4Var, zr4Var, zr4Var, zr4Var, zr4Var, zr4Var, zr4Var, zr4Var, zr4Var, null, zr4Var, null, null, null, null, null, null, null, usb.a);
    }

    public vsb() {
        this(0);
    }
}
