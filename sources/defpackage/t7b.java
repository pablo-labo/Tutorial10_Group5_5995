package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t7b {
    public final String a;
    public final String b;
    public final String c;
    public final gu5<j6g> d;
    public final gu5<j6g> e;
    public final nl7 f;
    public final String g;
    public final String h;
    public final String i;
    public final gu5<j6g> j;
    public final boolean k;
    public final boolean l;
    public final String m;

    public t7b(String str, String str2, String str3, gu5 gu5Var, gu5 gu5Var2, nl7 nl7Var, String str4, String str5, String str6, gu5 gu5Var3, boolean z, boolean z2, String str7) {
        str.getClass();
        str2.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        nl7Var.getClass();
        str6.getClass();
        gu5Var3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gu5Var;
        this.e = gu5Var2;
        this.f = nl7Var;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = gu5Var3;
        this.k = z;
        this.l = z2;
        this.m = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7b)) {
            return false;
        }
        t7b t7bVar = (t7b) obj;
        return wl7.b(this.a, t7bVar.a) && wl7.b(this.b, t7bVar.b) && wl7.b(this.c, t7bVar.c) && wl7.b(this.d, t7bVar.d) && wl7.b(this.e, t7bVar.e) && this.f == t7bVar.f && wl7.b(this.g, t7bVar.g) && wl7.b(this.h, t7bVar.h) && wl7.b(this.i, t7bVar.i) && wl7.b(this.j, t7bVar.j) && this.k == t7bVar.k && this.l == t7bVar.l && wl7.b(this.m, t7bVar.m);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + w40.d(w40.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iF = ia.f(ia.f(w40.d(akb.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i), 961, this.j), 31, this.k), 31, this.l);
        String str3 = this.m;
        return iF + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("PendingInterviewJobCardState(title=", this.a, ", company=", this.b, ", location=");
        sbF.append(this.c);
        sbF.append(", onScheduleClick=");
        sbF.append(this.d);
        sbF.append(", onDeclineClick=");
        sbF.append(this.e);
        sbF.append(", interviewType=");
        sbF.append(this.f);
        sbF.append(", phoneNumber=");
        ia.r(sbF, this.g, ", address=", this.h, ", statusLabel=");
        sbF.append(this.i);
        sbF.append(", onCardClick=");
        sbF.append(this.j);
        sbF.append(", interviewStatus=null, isScheduleLinkGenInprogress=");
        p6.j(sbF, this.k, ", isDeclineLinkGenInProgress=", this.l, ", interviewTime=");
        return l6.i(sbF, this.m, ")");
    }
}
