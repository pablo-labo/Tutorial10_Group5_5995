package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ti0 {

    @b8e("eventName")
    public final String a;

    @b8e("appTk")
    public final String b;

    @b8e("userJobStatusState")
    public final String c;

    @b8e("userJobStatusTimestamp")
    public final long d;

    @b8e("displayStatusState")
    public final String e;

    @b8e("displayStatusSource")
    public final String f;

    @b8e("displayStatusTimestamp")
    public final long g;

    @b8e("displayRank")
    public final int h;

    @b8e("tab")
    public final String i;

    public ti0(String str, String str2, long j, String str3, String str4, long j2, int i, String str5) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.a = "appCardViewed";
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = str4;
        this.g = j2;
        this.h = i;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti0)) {
            return false;
        }
        ti0 ti0Var = (ti0) obj;
        return this.a.equals(ti0Var.a) && wl7.b(this.b, ti0Var.b) && this.c.equals(ti0Var.c) && this.d == ti0Var.d && wl7.b(this.e, ti0Var.e) && wl7.b(this.f, ti0Var.f) && this.g == ti0Var.g && this.h == ti0Var.h && wl7.b(this.i, ti0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + w40.c(this.h, ia.d(akb.d(akb.d(ia.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("AppCardViewedEvent(eventName=", this.a, ", appTk=", this.b, ", userJobStatusState=");
        sbF.append(this.c);
        sbF.append(", userJobStatusTimestamp=");
        sbF.append(this.d);
        ia.r(sbF, ", displayStatusState=", this.e, ", displayStatusSource=", this.f);
        o6.p(sbF, ", displayStatusTimestamp=", this.g, ", displayRank=");
        sbF.append(this.h);
        sbF.append(", tab=");
        sbF.append(this.i);
        sbF.append(")");
        return sbF.toString();
    }
}
