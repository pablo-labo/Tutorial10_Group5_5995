package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class q98 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final mu9 g;
    public final List<String> h;
    public final ArrayList i;
    public final Map<String, Integer> j;
    public final gx0 k;
    public final List<String> l;

    public q98(String str, String str2, String str3, String str4, String str5, boolean z, mu9 mu9Var, List list, ArrayList arrayList, Map map, gx0 gx0Var, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = mu9Var;
        this.h = list;
        this.i = arrayList;
        this.j = map;
        this.k = gx0Var;
        this.l = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q98)) {
            return false;
        }
        q98 q98Var = (q98) obj;
        return this.a.equals(q98Var.a) && this.b.equals(q98Var.b) && wl7.b(this.c, q98Var.c) && this.d.equals(q98Var.d) && wl7.b(this.e, q98Var.e) && this.f == q98Var.f && this.g == q98Var.g && this.h.equals(q98Var.h) && this.i.equals(q98Var.i) && this.j.equals(q98Var.j) && wl7.b(this.k, q98Var.k) && this.l.equals(q98Var.l);
    }

    public final int hashCode() {
        int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iD2 = akb.d((((iD + (str == null ? 0 : str.hashCode())) * 31) + 47868885) * 31, 31, this.d);
        String str2 = this.e;
        int iB = k20.b(this.j, z3.d(this.i, ia.g(this.h, (this.g.hashCode() + ia.f((iD2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f)) * 31, 31), 31), 31);
        gx0 gx0Var = this.k;
        return this.l.hashCode() + ((iB + (gx0Var != null ? gx0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("JsMobileAppInitParameters(co=", this.a, ", locale=", this.b, ", ctk=");
        ia.r(sbF, this.c, ", appVersion=277.1, osVersion=", this.d, ", deviceId=");
        akb.q(this.e, ", isTablet=", ", selectionMethod=", sbF, this.f);
        sbF.append(this.g);
        sbF.append(", services=");
        sbF.append(this.h);
        sbF.append(", proctorTestNames=");
        sbF.append(this.i);
        sbF.append(", forcedProctorGroups=");
        sbF.append(this.j);
        sbF.append(", attributionParams=");
        sbF.append(this.k);
        sbF.append(", dynamicProctorMetatags=");
        sbF.append(this.l);
        sbF.append(")");
        return sbF.toString();
    }
}
