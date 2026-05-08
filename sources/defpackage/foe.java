package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.khf;
import defpackage.le0;

/* JADX INFO: loaded from: classes.dex */
public final class foe implements le0.a {
    public final khf a;
    public final long b;
    public final to5 c;
    public final mo5 d;
    public final no5 e;
    public final pn5 f;
    public final String g;
    public final long h;
    public final lc1 i;
    public final lhf j;
    public final b19 k;
    public final long l;
    public final odf m;
    public final vbe n;
    public final lcb o;
    public final ib4 p;

    public foe(long j, long j2, to5 to5Var, mo5 mo5Var, no5 no5Var, pn5 pn5Var, String str, long j3, lc1 lc1Var, lhf lhfVar, b19 b19Var, long j4, odf odfVar, vbe vbeVar, int i) {
        this((i & 1) != 0 ? da2.i : j, (i & 2) != 0 ? bkf.c : j2, (i & 4) != 0 ? null : to5Var, (i & 8) != 0 ? null : mo5Var, (i & 16) != 0 ? null : no5Var, (i & 32) != 0 ? null : pn5Var, (i & 64) != 0 ? null : str, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? bkf.c : j3, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : lc1Var, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : lhfVar, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : b19Var, (i & 2048) != 0 ? da2.i : j4, (i & 4096) != 0 ? null : odfVar, (i & 8192) != 0 ? null : vbeVar, (lcb) null);
    }

    public final boolean a(foe foeVar) {
        if (this == foeVar) {
            return true;
        }
        return bkf.a(this.b, foeVar.b) && wl7.b(this.c, foeVar.c) && wl7.b(this.d, foeVar.d) && wl7.b(this.e, foeVar.e) && wl7.b(this.f, foeVar.f) && wl7.b(this.g, foeVar.g) && bkf.a(this.h, foeVar.h) && wl7.b(this.i, foeVar.i) && wl7.b(this.j, foeVar.j) && wl7.b(this.k, foeVar.k) && da2.c(this.l, foeVar.l) && wl7.b(this.o, foeVar.o);
    }

    public final boolean b(foe foeVar) {
        return wl7.b(this.a, foeVar.a) && wl7.b(this.m, foeVar.m) && wl7.b(this.n, foeVar.n) && wl7.b(this.p, foeVar.p);
    }

    public final foe c(foe foeVar) {
        if (foeVar == null) {
            return this;
        }
        khf khfVar = foeVar.a;
        return goe.a(this, khfVar.c(), khfVar.e(), khfVar.a(), foeVar.b, foeVar.c, foeVar.d, foeVar.e, foeVar.f, foeVar.g, foeVar.h, foeVar.i, foeVar.j, foeVar.k, foeVar.l, foeVar.m, foeVar.n, foeVar.o, foeVar.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof foe)) {
            return false;
        }
        foe foeVar = (foe) obj;
        return a(foeVar) && b(foeVar);
    }

    public final int hashCode() {
        khf khfVar = this.a;
        long jC = khfVar.c();
        int i = da2.j;
        int iHashCode = Long.hashCode(jC) * 31;
        sn1 sn1VarE = khfVar.e();
        int iHashCode2 = (Float.hashCode(khfVar.a()) + ((iHashCode + (sn1VarE != null ? sn1VarE.hashCode() : 0)) * 31)) * 31;
        ckf[] ckfVarArr = bkf.b;
        int iD = ia.d(iHashCode2, 31, this.b);
        to5 to5Var = this.c;
        int i2 = (iD + (to5Var != null ? to5Var.a : 0)) * 31;
        mo5 mo5Var = this.d;
        int iHashCode3 = (i2 + (mo5Var != null ? Integer.hashCode(mo5Var.a) : 0)) * 31;
        no5 no5Var = this.e;
        int iHashCode4 = (iHashCode3 + (no5Var != null ? Integer.hashCode(no5Var.a) : 0)) * 31;
        pn5 pn5Var = this.f;
        int iHashCode5 = (iHashCode4 + (pn5Var != null ? pn5Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iD2 = ia.d((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        lc1 lc1Var = this.i;
        int iHashCode6 = (iD2 + (lc1Var != null ? Float.hashCode(lc1Var.a) : 0)) * 31;
        lhf lhfVar = this.j;
        int iHashCode7 = (iHashCode6 + (lhfVar != null ? lhfVar.hashCode() : 0)) * 31;
        b19 b19Var = this.k;
        int iD3 = ia.d((iHashCode7 + (b19Var != null ? b19Var.a.hashCode() : 0)) * 31, 31, this.l);
        odf odfVar = this.m;
        int i3 = (iD3 + (odfVar != null ? odfVar.a : 0)) * 31;
        vbe vbeVar = this.n;
        int iHashCode8 = (i3 + (vbeVar != null ? vbeVar.hashCode() : 0)) * 31;
        lcb lcbVar = this.o;
        int iHashCode9 = (iHashCode8 + (lcbVar != null ? lcbVar.hashCode() : 0)) * 31;
        ib4 ib4Var = this.p;
        return iHashCode9 + (ib4Var != null ? ib4Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        khf khfVar = this.a;
        sb.append((Object) da2.i(khfVar.c()));
        sb.append(", brush=");
        sb.append(khfVar.e());
        sb.append(", alpha=");
        sb.append(khfVar.a());
        sb.append(", fontSize=");
        sb.append((Object) bkf.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) bkf.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        h5.j(this.l, ", textDecoration=", sb);
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public foe(khf khfVar, long j, to5 to5Var, mo5 mo5Var, no5 no5Var, pn5 pn5Var, String str, long j2, lc1 lc1Var, lhf lhfVar, b19 b19Var, long j3, odf odfVar, vbe vbeVar, lcb lcbVar, ib4 ib4Var) {
        this.a = khfVar;
        this.b = j;
        this.c = to5Var;
        this.d = mo5Var;
        this.e = no5Var;
        this.f = pn5Var;
        this.g = str;
        this.h = j2;
        this.i = lc1Var;
        this.j = lhfVar;
        this.k = b19Var;
        this.l = j3;
        this.m = odfVar;
        this.n = vbeVar;
        this.o = lcbVar;
        this.p = ib4Var;
    }

    public foe(long j, long j2, to5 to5Var, mo5 mo5Var, no5 no5Var, pn5 pn5Var, String str, long j3, lc1 lc1Var, lhf lhfVar, b19 b19Var, long j4, odf odfVar, vbe vbeVar, lcb lcbVar) {
        this(j != 16 ? new bb2(j) : khf.a.a, j2, to5Var, mo5Var, no5Var, pn5Var, str, j3, lc1Var, lhfVar, b19Var, j4, odfVar, vbeVar, lcbVar, null);
    }
}
