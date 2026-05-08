package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class swg {
    public final String a;
    public final boolean b;
    public final ex4 c;
    public final float d;
    public final boolean e;

    public swg(String str, boolean z, ex4 ex4Var, float f, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = ex4Var;
        this.d = f;
        this.e = z2;
    }

    public static swg a(swg swgVar, String str, boolean z, ex4 ex4Var, float f, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = swgVar.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = swgVar.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            ex4Var = swgVar.c;
        }
        ex4 ex4Var2 = ex4Var;
        if ((i & 8) != 0) {
            f = swgVar.d;
        }
        float f2 = f;
        if ((i & 16) != 0) {
            z2 = swgVar.e;
        }
        swgVar.getClass();
        ex4Var2.getClass();
        return new swg(str2, z3, ex4Var2, f2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swg)) {
            return false;
        }
        swg swgVar = (swg) obj;
        return wl7.b(this.a, swgVar.a) && this.b == swgVar.b && this.c == swgVar.c && Float.compare(this.d, swgVar.d) == 0 && this.e == swgVar.e;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.e) + k6.c((this.c.hashCode() + ia.f((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebViewBottomSheetModalState(title=");
        sb.append(this.a);
        sb.append(", shouldShowNetworkError=");
        sb.append(this.b);
        sb.append(", errorScreenType=");
        sb.append(this.c);
        sb.append(", grabberIconAlpha=");
        sb.append(this.d);
        sb.append(", shouldShowReportErrorToast=");
        return z3.o(sb, this.e, ")");
    }

    public /* synthetic */ swg(int i) {
        this(null, false, ex4.c, 1.0f, false);
    }

    public swg() {
        this(0);
    }
}
