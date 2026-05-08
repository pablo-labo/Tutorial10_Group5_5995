package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class vde implements xo6 {
    public final kk1 a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final uz6 g;
    public final jz6 h;
    public final boolean i;
    public final String j;
    public final String k;
    public final Long l;

    public /* synthetic */ vde(int i) {
        this(null, false, false, "", "", "", new uz6(null, null, null, null, false, 127), new jz6(127, false), false, "", "", null);
    }

    public static vde a(vde vdeVar, kk1 kk1Var, boolean z, boolean z2, String str, String str2, String str3, uz6 uz6Var, jz6 jz6Var, boolean z3, String str4, String str5, Long l, int i) {
        if ((i & 1) != 0) {
            kk1Var = vdeVar.a;
        }
        kk1 kk1Var2 = kk1Var;
        if ((i & 2) != 0) {
            z = vdeVar.b;
        }
        boolean z4 = z;
        boolean z5 = (i & 4) != 0 ? vdeVar.c : z2;
        String str6 = (i & 8) != 0 ? vdeVar.d : str;
        String str7 = (i & 16) != 0 ? vdeVar.e : str2;
        String str8 = (i & 32) != 0 ? vdeVar.f : str3;
        uz6 uz6Var2 = (i & 64) != 0 ? vdeVar.g : uz6Var;
        jz6 jz6Var2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? vdeVar.h : jz6Var;
        boolean z6 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? vdeVar.i : z3;
        String str9 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? vdeVar.j : str4;
        String str10 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? vdeVar.k : str5;
        Long l2 = (i & 2048) != 0 ? vdeVar.l : l;
        vdeVar.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        uz6Var2.getClass();
        jz6Var2.getClass();
        str9.getClass();
        str10.getClass();
        return new vde(kk1Var2, z4, z5, str6, str7, str8, uz6Var2, jz6Var2, z6, str9, str10, l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vde)) {
            return false;
        }
        vde vdeVar = (vde) obj;
        return wl7.b(this.a, vdeVar.a) && this.b == vdeVar.b && this.c == vdeVar.c && wl7.b(this.d, vdeVar.d) && wl7.b(this.e, vdeVar.e) && wl7.b(this.f, vdeVar.f) && wl7.b(this.g, vdeVar.g) && wl7.b(this.h, vdeVar.h) && this.i == vdeVar.i && wl7.b(this.j, vdeVar.j) && wl7.b(this.k, vdeVar.k) && wl7.b(this.l, vdeVar.l);
    }

    public final int hashCode() {
        kk1 kk1Var = this.a;
        int iD = akb.d(akb.d(ia.f((this.h.hashCode() + ((this.g.hashCode() + akb.d(akb.d(akb.d(ia.f(ia.f((kk1Var == null ? 0 : kk1Var.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31, 31, this.i), 31, this.j), 31, this.k);
        Long l = this.l;
        return iD + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharedViewmodelState(bottomSheetItemList=");
        sb.append(this.a);
        sb.append(", showBottomSheet=");
        sb.append(this.b);
        sb.append(", isBottomSheetFromSuggestion=");
        k6.k(", title=", this.d, ", body=", sb, this.c);
        ia.r(sb, this.e, ", fromUrlAddition=", this.f, ", idlToastState=");
        sb.append(this.g);
        sb.append(", idlToastExplainState=");
        sb.append(this.h);
        sb.append(", showCelebrationSheet=");
        k6.k(", celebrationJobTitle=", this.j, ", celebrationCompanyName=", sb, this.i);
        sb.append(this.k);
        sb.append(", celebrationTimestamp=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }

    public vde(kk1 kk1Var, boolean z, boolean z2, String str, String str2, String str3, uz6 uz6Var, jz6 jz6Var, boolean z3, String str4, String str5, Long l) {
        this.a = kk1Var;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = uz6Var;
        this.h = jz6Var;
        this.i = z3;
        this.j = str4;
        this.k = str5;
        this.l = l;
    }

    public vde() {
        this(0);
    }
}
