package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class g2h {
    public final String a;
    public final String b;
    public final String c;
    public final Locale d;
    public final String e;
    public final ig3 f;
    public final String g;

    public g2h(String str, String str2, String str3, Locale locale, String str4, ig3 ig3Var, String str5, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? null : str3;
        locale = (i & 16) != 0 ? null : locale;
        str4 = (i & 32) != 0 ? null : str4;
        ig3Var = (i & 64) != 0 ? null : ig3Var;
        str5 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str5;
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = locale;
        this.e = str4;
        this.f = ig3Var;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2h)) {
            return false;
        }
        g2h g2hVar = (g2h) obj;
        return wl7.b(this.a, g2hVar.a) && wl7.b(this.b, g2hVar.b) && wl7.b(this.c, g2hVar.c) && wl7.b(this.d, g2hVar.d) && wl7.b(this.e, g2hVar.e) && wl7.b(this.f, g2hVar.f) && wl7.b(this.g, g2hVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = akb.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 961;
        Locale locale = this.d;
        int iHashCode2 = (iHashCode + (locale == null ? 0 : locale.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ig3 ig3Var = this.f;
        int iHashCode4 = (iHashCode3 + (ig3Var == null ? 0 : ig3Var.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("WorkExperienceInputItem(workExpInputItemId=", this.a, ", workExpInputJobTitle=", this.b, ", workExpInputCompany=");
        sbF.append(this.c);
        sbF.append(", workExpInputCompanyFccId=null, workExpInputLocale=");
        sbF.append(this.d);
        sbF.append(", workExpInputLocation=");
        sbF.append(this.e);
        sbF.append(", workExpInputTimePeriod=");
        sbF.append(this.f);
        sbF.append(", workExpInputDescription=");
        return l6.i(sbF, this.g, ")");
    }

    public g2h() {
        this(null, null, null, null, null, null, null, 255);
    }
}
