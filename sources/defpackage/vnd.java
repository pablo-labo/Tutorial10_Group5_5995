package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vnd {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final o09 i;
    public final o09 j;
    public final String k;
    public final aod l;
    public final String m;
    public final List<snd> n;

    public vnd(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, o09 o09Var, o09 o09Var2, String str9, aod aodVar, String str10, List<snd> list) {
        w20.p(str, str2, str3, str4, str5);
        str6.getClass();
        str8.getClass();
        o09Var.getClass();
        o09Var2.getClass();
        aodVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = o09Var;
        this.j = o09Var2;
        this.k = str9;
        this.l = aodVar;
        this.m = str10;
        this.n = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnd)) {
            return false;
        }
        vnd vndVar = (vnd) obj;
        return wl7.b(this.a, vndVar.a) && wl7.b(this.b, vndVar.b) && wl7.b(this.c, vndVar.c) && wl7.b(this.d, vndVar.d) && wl7.b(this.e, vndVar.e) && wl7.b(this.f, vndVar.f) && wl7.b(this.g, vndVar.g) && wl7.b(this.h, vndVar.h) && wl7.b(this.i, vndVar.i) && wl7.b(this.j, vndVar.j) && wl7.b(this.k, vndVar.k) && wl7.b(this.l, vndVar.l) && wl7.b(this.m, vndVar.m) && this.n.equals(vndVar.n);
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode = (this.j.a.hashCode() + ((this.i.a.hashCode() + akb.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.h)) * 31)) * 31;
        String str2 = this.k;
        int iHashCode2 = (this.l.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.m;
        return this.n.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("ScheduleApplyJob(jobId=", this.a, ", jobUrl=", this.b, ", title=");
        ia.r(sbF, this.c, ", description=", this.d, ", location=");
        ia.r(sbF, this.e, ", company=", this.f, ", salary=");
        ia.r(sbF, this.g, ", applicationId=", this.h, ", applicationUpdatedDate=");
        sbF.append(this.i);
        sbF.append(", applicationCreatedDate=");
        sbF.append(this.j);
        sbF.append(", applicationNotes=");
        sbF.append(this.k);
        sbF.append(", applicationStatus=");
        sbF.append(this.l);
        sbF.append(", externalApplicationId=");
        sbF.append(this.m);
        sbF.append(", applicationFormFieldGroups=");
        sbF.append(this.n);
        sbF.append(")");
        return sbF.toString();
    }
}
