package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class exb {
    public final rxb a;
    public final cub b;
    public final yz7 c;
    public final qr2 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public exb(rxb rxbVar, cub cubVar, yz7 yz7Var, qr2 qr2Var, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.a = rxbVar;
        this.b = cubVar;
        this.c = yz7Var;
        this.d = qr2Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = z9;
    }

    public static exb a(exb exbVar, rxb rxbVar, cub cubVar, yz7 yz7Var, qr2 qr2Var, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i) {
        rxb rxbVar2 = (i & 1) != 0 ? exbVar.a : rxbVar;
        cub cubVar2 = (i & 2) != 0 ? exbVar.b : cubVar;
        yz7 yz7Var2 = (i & 4) != 0 ? exbVar.c : yz7Var;
        qr2 qr2Var2 = (i & 8) != 0 ? exbVar.d : qr2Var;
        boolean z10 = (i & 16) != 0 ? exbVar.e : z;
        boolean z11 = (i & 32) != 0 ? exbVar.f : z2;
        boolean z12 = (i & 64) != 0 ? exbVar.g : z3;
        exbVar.getClass();
        exbVar.getClass();
        String str2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? exbVar.h : str;
        boolean z13 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? exbVar.i : z4;
        boolean z14 = (i & 2048) != 0 ? exbVar.j : z5;
        boolean z15 = (i & 4096) != 0 ? exbVar.k : z6;
        boolean z16 = (i & 8192) != 0 ? exbVar.l : z7;
        boolean z17 = (i & 16384) != 0 ? exbVar.m : z8;
        boolean z18 = (i & 32768) != 0 ? exbVar.n : z9;
        exbVar.getClass();
        rxbVar2.getClass();
        cubVar2.getClass();
        qr2Var2.getClass();
        return new exb(rxbVar2, cubVar2, yz7Var2, qr2Var2, z10, z11, z12, str2, z13, z14, z15, z16, z17, z18);
    }

    public final yz7 b() {
        return this.c;
    }

    public final boolean c() {
        return this.i;
    }

    public final boolean d() {
        return this.m;
    }

    public final boolean e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exb)) {
            return false;
        }
        exb exbVar = (exb) obj;
        return this.a == exbVar.a && this.b == exbVar.b && wl7.b(this.c, exbVar.c) && this.d == exbVar.d && this.e == exbVar.e && this.f == exbVar.f && this.g == exbVar.g && wl7.b(this.h, exbVar.h) && this.i == exbVar.i && this.j == exbVar.j && this.k == exbVar.k && this.l == exbVar.l && this.m == exbVar.m && this.n == exbVar.n;
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.e;
    }

    public final boolean h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        yz7 yz7Var = this.c;
        int iF = ia.f(ia.f(ia.f(ia.f(ia.f((this.d.hashCode() + ((iHashCode + (yz7Var == null ? 0 : yz7Var.hashCode())) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, false), 31, false);
        String str = this.h;
        return Boolean.hashCode(this.n) + ia.f(ia.f(ia.f(ia.f(ia.f((iF + (str != null ? str.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileState(currentlyActiveSubTab=");
        sb.append(this.a);
        sb.append(", privacyLevel=");
        sb.append(this.b);
        sb.append(", lastSavedContactInfoValues=");
        sb.append(this.c);
        sb.append(", contactInformationErrorState=");
        sb.append(this.d);
        sb.append(", shouldShowResumeUploadSuccessToast=");
        p6.j(sb, this.e, ", shouldShowResumeDeletedSuccessToast=", this.f, ", shouldShowShareLinkPrivacyAlert=");
        k6.k(", shouldShowShareLinkErrorToast=false, shouldShowProfileDownloadErrorToast=false, indeedResumeId=", this.h, ", profileHasFraud=", sb, this.g);
        p6.j(sb, this.i, ", isOnlineStatusEnabled=", this.j, ", userHaveAutoMergeProfile=");
        p6.j(sb, this.k, ", shouldShowNonResumeAlertDialog=", this.l, ", shouldShowIndeedResumeUserAlertDialog=");
        sb.append(this.m);
        sb.append(", shouldShowFileResumeAlertDialog=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ exb(int i) {
        this(rxb.a, cub.b, null, qr2.a, false, false, false, null, false, false, false, false, false, false);
    }

    public exb() {
        this(0);
    }
}
