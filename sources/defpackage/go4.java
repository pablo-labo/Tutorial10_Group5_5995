package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.jo4;

/* JADX INFO: loaded from: classes3.dex */
public final class go4 {
    public final String a;
    public final jo4.b b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final ig3 j;

    public /* synthetic */ go4(String str, String str2, String str3, String str4, String str5, String str6, String str7, ig3 ig3Var, int i) {
        this(null, null, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str6, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str7, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : ig3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go4)) {
            return false;
        }
        go4 go4Var = (go4) obj;
        return wl7.b(this.a, go4Var.a) && wl7.b(this.b, go4Var.b) && wl7.b(this.c, go4Var.c) && wl7.b(this.d, go4Var.d) && wl7.b(this.e, go4Var.e) && wl7.b(this.f, go4Var.f) && wl7.b(this.g, go4Var.g) && wl7.b(this.h, go4Var.h) && wl7.b(this.i, go4Var.i) && wl7.b(this.j, go4Var.j);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        jo4.b bVar = this.b;
        int iD = akb.d((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ig3 ig3Var = this.j;
        return iHashCode7 + (ig3Var != null ? ig3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationItem(itemId=");
        sb.append(this.a);
        sb.append(", degree=");
        sb.append(this.b);
        sb.append(", degreeNameLevelOfEducation=");
        ia.r(sb, this.c, ", degreeNameLevelOfEducationTaxonomySuid=", this.d, ", fieldOfStudy=");
        ia.r(sb, this.e, ", fieldOfStudyTaxonomySuid=", this.f, ", schoolName=");
        ia.r(sb, this.g, ", schoolCountry=", this.h, ", schoolLocation=");
        sb.append(this.i);
        sb.append(", timePeriod=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

    public go4(String str, jo4.b bVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ig3 ig3Var) {
        str2.getClass();
        this.a = str;
        this.b = bVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = ig3Var;
    }

    public go4() {
        this(null, null, null, null, null, null, null, null, 1023);
    }
}
