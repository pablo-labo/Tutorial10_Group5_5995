package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class zie {
    public final String a;
    public final String b;
    public final Integer c;
    public final q68 d;
    public final boolean e;
    public final String f;
    public final Boolean g;
    public final b42 h;
    public final dbf i;
    public final yie j;

    public /* synthetic */ zie(String str, String str2, Integer num, q68 q68Var, boolean z, String str3, Boolean bool, b42 b42Var, dbf dbfVar, yie yieVar, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : q68Var, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? Boolean.FALSE : bool, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : b42Var, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : dbfVar, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : yieVar);
    }

    public static zie a(zie zieVar, String str, Integer num, q68 q68Var, boolean z, String str2, dbf dbfVar, int i) {
        String str3 = zieVar.a;
        if ((i & 2) != 0) {
            str = zieVar.b;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            num = zieVar.c;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            q68Var = zieVar.d;
        }
        q68 q68Var2 = q68Var;
        boolean z2 = (i & 16) != 0 ? zieVar.e : z;
        String str5 = (i & 32) != 0 ? zieVar.f : str2;
        Boolean bool = zieVar.g;
        b42 b42Var = zieVar.h;
        dbf dbfVar2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? zieVar.i : dbfVar;
        yie yieVar = zieVar.j;
        zieVar.getClass();
        return new zie(str3, str4, num2, q68Var2, z2, str5, bool, b42Var, dbfVar2, yieVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zie)) {
            return false;
        }
        zie zieVar = (zie) obj;
        return wl7.b(this.a, zieVar.a) && wl7.b(this.b, zieVar.b) && wl7.b(this.c, zieVar.c) && this.d == zieVar.d && this.e == zieVar.e && wl7.b(this.f, zieVar.f) && wl7.b(this.g, zieVar.g) && wl7.b(this.h, zieVar.h) && wl7.b(this.i, zieVar.i) && wl7.b(this.j, zieVar.j);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        q68 q68Var = this.d;
        int iF = ia.f((iHashCode3 + (q68Var == null ? 0 : q68Var.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        int iHashCode4 = (iF + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        b42 b42Var = this.h;
        int iHashCode6 = (iHashCode5 + (b42Var == null ? 0 : b42Var.hashCode())) * 31;
        dbf dbfVar = this.i;
        int iHashCode7 = (iHashCode6 + (dbfVar == null ? 0 : dbfVar.hashCode())) * 31;
        yie yieVar = this.j;
        return iHashCode7 + (yieVar != null ? yieVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("SkillItem(id=", this.a, ", text=", this.b, ", experience=");
        sbF.append(this.c);
        sbF.append(", timeUnit=");
        sbF.append(this.d);
        sbF.append(", deletionCandidate=");
        k6.k(", taxonomyConceptTitle=", this.f, ", isParentCrowtaxoAttribute=", sbF, this.e);
        sbF.append(this.g);
        sbF.append(", childAchievementSkill=");
        sbF.append(this.h);
        sbF.append(", taxonomyConceptTitleItem=");
        sbF.append(this.i);
        sbF.append(", group=");
        sbF.append(this.j);
        sbF.append(")");
        return sbF.toString();
    }

    public zie(String str, String str2, Integer num, q68 q68Var, boolean z, String str3, Boolean bool, b42 b42Var, dbf dbfVar, yie yieVar) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = q68Var;
        this.e = z;
        this.f = str3;
        this.g = bool;
        this.h = b42Var;
        this.i = dbfVar;
        this.j = yieVar;
    }

    public zie() {
        this(null, null, null, null, false, null, null, null, null, null, 1023);
    }
}
