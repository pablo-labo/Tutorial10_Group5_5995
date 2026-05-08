package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class i12 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List<n97> e;
    public final List<n97> f;
    public final n12 g;
    public final boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    public i12(int i) {
        Lazy lazy = d93.a;
        String strE = bu8.a.e();
        String str = strE == null ? "" : strE;
        n12 n12Var = n12.a;
        zr4 zr4Var = zr4.a;
        this("", "", "", str, zr4Var, zr4Var, n12Var, false);
    }

    public static i12 a(i12 i12Var, String str, String str2, String str3, String str4, List list, List list2, n12 n12Var, boolean z, int i) {
        if ((i & 1) != 0) {
            str = i12Var.a;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = i12Var.b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = i12Var.c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = i12Var.d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            list = i12Var.e;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = i12Var.f;
        }
        List list4 = list2;
        n12 n12Var2 = (i & 64) != 0 ? i12Var.g : n12Var;
        boolean z2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? i12Var.h : z;
        i12Var.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        list3.getClass();
        list4.getClass();
        n12Var2.getClass();
        return new i12(str5, str6, str7, str8, list3, list4, n12Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i12)) {
            return false;
        }
        i12 i12Var = (i12) obj;
        return wl7.b(this.a, i12Var.a) && wl7.b(this.b, i12Var.b) && wl7.b(this.c, i12Var.c) && wl7.b(this.d, i12Var.d) && wl7.b(this.e, i12Var.e) && wl7.b(this.f, i12Var.f) && this.g == i12Var.g && this.h == i12Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ia.g(this.f, ia.g(this.e, akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("ChangeCountryState(searchInput=", this.a, ", currentLocaleCountryCode=", this.b, ", currentLocaleLanguageCode=");
        ia.r(sbF, this.c, ", expandedCountryCode=", this.d, ", allCountryOptions=");
        l6.q(sbF, this.e, ", filteredCountryOptions=", this.f, ", state=");
        sbF.append(this.g);
        sbF.append(", shouldShowReportErrorToast=");
        sbF.append(this.h);
        sbF.append(")");
        return sbF.toString();
    }

    public i12(String str, String str2, String str3, String str4, List<n97> list, List<n97> list2, n12 n12Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = list2;
        this.g = n12Var;
        this.h = z;
    }

    public i12() {
        this(0);
    }
}
