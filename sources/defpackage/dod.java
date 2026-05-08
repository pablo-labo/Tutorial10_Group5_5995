package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dod {
    public final String a;
    public final String b;
    public final String c;
    public final und d;

    public dod(String str, String str2, String str3, und undVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = undVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dod)) {
            return false;
        }
        dod dodVar = (dod) obj;
        return this.a.equals(dodVar.a) && this.b.equals(dodVar.b) && this.c.equals(dodVar.c) && this.d == dodVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("ScheduleApplyUnboundFormFieldResponse(responseValue=", this.a, ", formFieldId=", this.b, ", formField=");
        sbF.append(this.c);
        sbF.append(", validationStatus=");
        sbF.append(this.d);
        sbF.append(")");
        return sbF.toString();
    }
}
