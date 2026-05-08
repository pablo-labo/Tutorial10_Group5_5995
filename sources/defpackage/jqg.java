package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes2.dex */
public final class jqg {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final ex4 e;
    public final boolean f;
    public final Boolean g;
    public final String h;
    public final float i;
    public final boolean j;
    public final boolean k;

    public /* synthetic */ jqg(float f, int i, boolean z) {
        this((i & 1) != 0 ? false : z, false, true, (i & 8) == 0, (i & 16) != 0 ? ex4.c : ex4.b, false, null, null, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 1.0f : f, false, false);
    }

    public static jqg a(jqg jqgVar, boolean z, boolean z2, boolean z3, boolean z4, ex4 ex4Var, boolean z5, Boolean bool, String str, float f, boolean z6, boolean z7, int i) {
        if ((i & 1) != 0) {
            z = jqgVar.a;
        }
        boolean z8 = z;
        if ((i & 2) != 0) {
            z2 = jqgVar.b;
        }
        boolean z9 = z2;
        if ((i & 4) != 0) {
            z3 = jqgVar.c;
        }
        boolean z10 = z3;
        boolean z11 = (i & 8) != 0 ? jqgVar.d : z4;
        ex4 ex4Var2 = (i & 16) != 0 ? jqgVar.e : ex4Var;
        boolean z12 = (i & 32) != 0 ? jqgVar.f : z5;
        Boolean bool2 = (i & 64) != 0 ? jqgVar.g : bool;
        String str2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? jqgVar.h : str;
        float f2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? jqgVar.i : f;
        jqgVar.getClass();
        boolean z13 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? jqgVar.j : z6;
        boolean z14 = (i & 2048) != 0 ? jqgVar.k : z7;
        jqgVar.getClass();
        ex4Var2.getClass();
        return new jqg(z8, z9, z10, z11, ex4Var2, z12, bool2, str2, f2, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqg)) {
            return false;
        }
        jqg jqgVar = (jqg) obj;
        return this.a == jqgVar.a && this.b == jqgVar.b && this.c == jqgVar.c && this.d == jqgVar.d && this.e == jqgVar.e && this.f == jqgVar.f && wl7.b(this.g, jqgVar.g) && wl7.b(this.h, jqgVar.h) && Float.compare(this.i, jqgVar.i) == 0 && this.j == jqgVar.j && this.k == jqgVar.k;
    }

    public final int hashCode() {
        int iF = ia.f((this.e.hashCode() + ia.f(ia.f(ia.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
        Boolean bool = this.g;
        int iHashCode = (iF + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.h;
        return Boolean.hashCode(this.k) + ia.f(w40.c(0, k6.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.i, 31), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewJobBottomSheetState(shouldShowShareIcon=");
        sb.append(this.a);
        sb.append(", shouldShowCloseButton=");
        sb.append(this.b);
        sb.append(", shouldAllowSwipeToClose=");
        p6.j(sb, this.c, ", shouldShowErrorUi=", this.d, ", errorScreenType=");
        sb.append(this.e);
        sb.append(", shouldShowSaveIcon=");
        sb.append(this.f);
        sb.append(", isSaved=");
        sb.append(this.g);
        sb.append(", handlerIdentifier=");
        sb.append(this.h);
        sb.append(", grabberIconAlpha=");
        sb.append(this.i);
        sb.append(", bottomPadding=0, shouldShowShareTooltip=");
        sb.append(this.j);
        sb.append(", shouldShowReportErrorToast=");
        return z3.o(sb, this.k, ")");
    }

    public jqg(boolean z, boolean z2, boolean z3, boolean z4, ex4 ex4Var, boolean z5, Boolean bool, String str, float f, boolean z6, boolean z7) {
        ex4Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = ex4Var;
        this.f = z5;
        this.g = bool;
        this.h = str;
        this.i = f;
        this.j = z6;
        this.k = z7;
    }

    public jqg() {
        this(0.0f, 4095, false);
    }
}
