package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.khf;

/* JADX INFO: loaded from: classes.dex */
public final class tjf {
    public static final tjf d = new tjf(0, 0, null, null, 0, 0, 0, 16777215);
    public final foe a;
    public final l3b b;
    public final vcb c;

    public tjf(long j, long j2, to5 to5Var, mo5 mo5Var, pn5 pn5Var, String str, long j3, vbe vbeVar, long j4, int i) {
        this(new foe((i & 1) != 0 ? da2.i : j, (i & 2) != 0 ? bkf.c : j2, (i & 4) != 0 ? null : to5Var, (i & 8) != 0 ? null : mo5Var, (no5) null, (i & 32) != 0 ? null : pn5Var, (i & 64) != 0 ? null : str, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? bkf.c : j3, (lc1) null, (lhf) null, (b19) null, da2.i, (odf) null, (i & 8192) != 0 ? null : vbeVar, (lcb) null), new l3b(Integer.MIN_VALUE, Integer.MIN_VALUE, (i & 65536) != 0 ? bkf.c : j4, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    public static tjf a(tjf tjfVar, long j, long j2, to5 to5Var, mo5 mo5Var, pn5 pn5Var, long j3, int i, long j4, vcb vcbVar, fx8 fx8Var, int i2, int i3) {
        long jC = (i3 & 1) != 0 ? tjfVar.a.a.c() : j;
        long j5 = (i3 & 2) != 0 ? tjfVar.a.b : j2;
        to5 to5Var2 = (i3 & 4) != 0 ? tjfVar.a.c : to5Var;
        mo5 mo5Var2 = (i3 & 8) != 0 ? tjfVar.a.d : mo5Var;
        foe foeVar = tjfVar.a;
        no5 no5Var = foeVar.e;
        pn5 pn5Var2 = (i3 & 32) != 0 ? foeVar.f : pn5Var;
        String str = foeVar.g;
        long j6 = (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? foeVar.h : j3;
        lc1 lc1Var = foeVar.i;
        lhf lhfVar = foeVar.j;
        b19 b19Var = foeVar.k;
        long j7 = foeVar.l;
        odf odfVar = (i3 & 4096) != 0 ? foeVar.m : odf.c;
        vbe vbeVar = foeVar.n;
        ib4 ib4Var = foeVar.p;
        int i4 = (i3 & 32768) != 0 ? tjfVar.b.a : i;
        l3b l3bVar = tjfVar.b;
        int i5 = l3bVar.b;
        long j8 = (i3 & 131072) != 0 ? l3bVar.c : j4;
        nhf nhfVar = l3bVar.d;
        vcb vcbVar2 = (i3 & 524288) != 0 ? tjfVar.c : vcbVar;
        return new tjf(new foe(da2.c(jC, foeVar.a.c()) ? foeVar.a : jC != 16 ? new bb2(jC) : khf.a.a, j5, to5Var2, mo5Var2, no5Var, pn5Var2, str, j6, lc1Var, lhfVar, b19Var, j7, odfVar, vbeVar, vcbVar2 != null ? vcbVar2.a : null, ib4Var), new l3b(i4, i5, j8, nhfVar, vcbVar2 != null ? vcbVar2.b : null, (i3 & 1048576) != 0 ? l3bVar.f : fx8Var, (i3 & 2097152) != 0 ? l3bVar.g : i2, l3bVar.h, l3bVar.i), vcbVar2);
    }

    public static tjf e(tjf tjfVar, long j, long j2, to5 to5Var, mo5 mo5Var, pn5 pn5Var, long j3, odf odfVar, int i, long j4, int i2) {
        long j5 = (i2 & 1) != 0 ? da2.i : j;
        long j6 = (i2 & 2) != 0 ? bkf.c : j2;
        to5 to5Var2 = (i2 & 4) != 0 ? null : to5Var;
        mo5 mo5Var2 = (i2 & 8) != 0 ? null : mo5Var;
        pn5 pn5Var2 = (i2 & 32) != 0 ? null : pn5Var;
        long j7 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? bkf.c : j3;
        long j8 = da2.i;
        odf odfVar2 = (i2 & 4096) != 0 ? null : odfVar;
        int i3 = (32768 & i2) != 0 ? Integer.MIN_VALUE : i;
        long j9 = (i2 & 131072) != 0 ? bkf.c : j4;
        foe foeVarA = goe.a(tjfVar.a, j5, null, Float.NaN, j6, to5Var2, mo5Var2, null, pn5Var2, null, j7, null, null, null, j8, odfVar2, null, null, null);
        l3b l3bVarA = m3b.a(tjfVar.b, i3, Integer.MIN_VALUE, j9, null, null, null, 0, Integer.MIN_VALUE, null);
        return (tjfVar.a == foeVarA && tjfVar.b == l3bVarA) ? tjfVar : new tjf(foeVarA, l3bVarA);
    }

    public final long b() {
        return this.a.a.c();
    }

    public final boolean c(tjf tjfVar) {
        if (this != tjfVar) {
            return wl7.b(this.b, tjfVar.b) && this.a.a(tjfVar.a);
        }
        return true;
    }

    public final tjf d(tjf tjfVar) {
        return (tjfVar == null || tjfVar.equals(d)) ? this : new tjf(this.a.c(tjfVar.a), this.b.a(tjfVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjf)) {
            return false;
        }
        tjf tjfVar = (tjf) obj;
        return wl7.b(this.a, tjfVar.a) && wl7.b(this.b, tjfVar.b) && wl7.b(this.c, tjfVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vcb vcbVar = this.c;
        return iHashCode + (vcbVar != null ? vcbVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) da2.i(b()));
        sb.append(", brush=");
        foe foeVar = this.a;
        sb.append(foeVar.a.e());
        sb.append(", alpha=");
        sb.append(foeVar.a.a());
        sb.append(", fontSize=");
        sb.append((Object) bkf.d(foeVar.b));
        sb.append(", fontWeight=");
        sb.append(foeVar.c);
        sb.append(", fontStyle=");
        sb.append(foeVar.d);
        sb.append(", fontSynthesis=");
        sb.append(foeVar.e);
        sb.append(", fontFamily=");
        sb.append(foeVar.f);
        sb.append(", fontFeatureSettings=");
        sb.append(foeVar.g);
        sb.append(", letterSpacing=");
        sb.append((Object) bkf.d(foeVar.h));
        sb.append(", baselineShift=");
        sb.append(foeVar.i);
        sb.append(", textGeometricTransform=");
        sb.append(foeVar.j);
        sb.append(", localeList=");
        sb.append(foeVar.k);
        sb.append(", background=");
        h5.j(foeVar.l, ", textDecoration=", sb);
        sb.append(foeVar.m);
        sb.append(", shadow=");
        sb.append(foeVar.n);
        sb.append(", drawStyle=");
        sb.append(foeVar.p);
        sb.append(", textAlign=");
        l3b l3bVar = this.b;
        sb.append((Object) dcf.a(l3bVar.a));
        sb.append(", textDirection=");
        sb.append((Object) sdf.a(l3bVar.b));
        sb.append(", lineHeight=");
        sb.append((Object) bkf.d(l3bVar.c));
        sb.append(", textIndent=");
        sb.append(l3bVar.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(l3bVar.f);
        sb.append(", lineBreak=");
        sb.append((Object) bx8.a(l3bVar.g));
        sb.append(", hyphens=");
        sb.append((Object) zm6.a(l3bVar.h));
        sb.append(", textMotion=");
        sb.append(l3bVar.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public tjf(foe foeVar, l3b l3bVar) {
        lcb lcbVar = foeVar.o;
        acb acbVar = l3bVar.e;
        this(foeVar, l3bVar, (lcbVar == null && acbVar == null) ? null : new vcb(lcbVar, acbVar));
    }

    public tjf(long j, long j2, to5 to5Var, pn5 pn5Var, long j3, int i, long j4, int i2) {
        this(new foe((i2 & 1) != 0 ? da2.i : j, (i2 & 2) != 0 ? bkf.c : j2, (i2 & 4) != 0 ? null : to5Var, (mo5) null, (no5) null, (i2 & 32) != 0 ? null : pn5Var, (String) null, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? bkf.c : j3, (lc1) null, (lhf) null, (b19) null, da2.i, (odf) null, (vbe) null, (lcb) null), new l3b((32768 & i2) != 0 ? Integer.MIN_VALUE : i, Integer.MIN_VALUE, (i2 & 131072) != 0 ? bkf.c : j4, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    public tjf(foe foeVar, l3b l3bVar, vcb vcbVar) {
        this.a = foeVar;
        this.b = l3bVar;
        this.c = vcbVar;
    }
}
