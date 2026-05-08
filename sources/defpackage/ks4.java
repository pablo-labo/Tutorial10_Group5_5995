package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class ks4 {
    public final x2b a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final gu5<j6g> f;
    public final String g;
    public final gu5<j6g> h;
    public final boolean i;

    public ks4(x2b x2bVar, String str, String str2, String str3, String str4, gu5<j6g> gu5Var, String str5, gu5<j6g> gu5Var2, boolean z) {
        x2bVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = x2bVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = gu5Var;
        this.g = str5;
        this.h = gu5Var2;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks4)) {
            return false;
        }
        ks4 ks4Var = (ks4) obj;
        return wl7.b(this.a, ks4Var.a) && wl7.b(this.b, ks4Var.b) && wl7.b(this.c, ks4Var.c) && wl7.b(this.d, ks4Var.d) && wl7.b(this.e, ks4Var.e) && wl7.b(this.f, ks4Var.f) && wl7.b(this.g, ks4Var.g) && wl7.b(this.h, ks4Var.h) && this.i == ks4Var.i;
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        gu5<j6g> gu5Var = this.f;
        int iHashCode2 = (iHashCode + (gu5Var == null ? 0 : gu5Var.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        gu5<j6g> gu5Var2 = this.h;
        return Boolean.hashCode(this.i) + ((iHashCode3 + (gu5Var2 != null ? gu5Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmptyStateConfig(icon=");
        sb.append(this.a);
        sb.append(", iconDescription=");
        sb.append(this.b);
        sb.append(", title=");
        ia.r(sb, this.c, ", subtitle=", this.d, ", linkText=");
        sb.append(this.e);
        sb.append(", onClickLink=");
        sb.append(this.f);
        sb.append(", buttonText=");
        sb.append(this.g);
        sb.append(", onClickButton=");
        sb.append(this.h);
        sb.append(", shouldShowInterviewPrepButton=");
        return z3.o(sb, this.i, ")");
    }

    public /* synthetic */ ks4(x2b x2bVar, String str, String str2, String str3, String str4, gu5 gu5Var, String str5, gu5 gu5Var2, int i) {
        this(x2bVar, str, str2, str3, str4, (gu5<j6g>) gu5Var, str5, (gu5<j6g>) ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : gu5Var2), false);
    }
}
