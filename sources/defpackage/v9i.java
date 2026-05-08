package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class v9i extends i00 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Date d;
    public final String e;

    public /* synthetic */ v9i(Integer num, Integer num2, Integer num3, Date date, String str) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = date;
        this.e = str;
    }

    @Override // defpackage.i00
    public final Integer a() {
        return this.b;
    }

    @Override // defpackage.i00
    public final Integer b() {
        return this.c;
    }

    @Override // defpackage.i00
    public final String c() {
        return this.e;
    }

    @Override // defpackage.i00
    public final Date d() {
        return this.d;
    }

    @Override // defpackage.i00
    public final Integer e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i00)) {
            return false;
        }
        i00 i00Var = (i00) obj;
        Integer num = this.a;
        if (num == null) {
            if (i00Var.e() != null) {
                return false;
            }
        } else if (!num.equals(i00Var.e())) {
            return false;
        }
        Integer num2 = this.b;
        if (num2 == null) {
            if (i00Var.a() != null) {
                return false;
            }
        } else if (!num2.equals(i00Var.a())) {
            return false;
        }
        Integer num3 = this.c;
        if (num3 == null) {
            if (i00Var.b() != null) {
                return false;
            }
        } else if (!num3.equals(i00Var.b())) {
            return false;
        }
        Date date = this.d;
        if (date == null) {
            if (i00Var.d() != null) {
                return false;
            }
        } else if (!date.equals(i00Var.d())) {
            return false;
        }
        String str = this.e;
        return str == null ? i00Var.c() == null : str.equals(i00Var.c());
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.b;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int i = iHashCode ^ 1000003;
        Integer num3 = this.c;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Date date = this.d;
        int iHashCode4 = (iHashCode3 ^ (date == null ? 0 : date.hashCode())) * 1000003;
        String str = this.e;
        return iHashCode4 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder("AgeSignalsResult{userStatus=");
        sb.append(this.a);
        sb.append(", ageLower=");
        sb.append(this.b);
        sb.append(", ageUpper=");
        sb.append(this.c);
        sb.append(", mostRecentApprovalDate=");
        sb.append(strValueOf);
        sb.append(", installId=");
        return l6.i(sb, this.e, "}");
    }
}
