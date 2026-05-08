package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jha extends mge implements px1 {
    public final boolean V;
    public final hx1 b;
    public final lha c;
    public final p7g d;
    public final gwf e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public jha(hx1 hx1Var, lha lhaVar, p7g p7gVar, gwf gwfVar, boolean z, int i) {
        if ((i & 8) != 0) {
            gwf.b.getClass();
            gwfVar = gwf.c;
        }
        this(hx1Var, lhaVar, p7gVar, gwfVar, (i & 16) != 0 ? false : z, false);
    }

    @Override // defpackage.ui8
    public final List<wxf> K0() {
        return zr4.a;
    }

    @Override // defpackage.ui8
    public final gwf L0() {
        return this.e;
    }

    @Override // defpackage.ui8
    public final kwf M0() {
        return this.c;
    }

    @Override // defpackage.ui8
    public final boolean N0() {
        return this.f;
    }

    @Override // defpackage.mge, defpackage.p7g
    public final p7g Q0(boolean z) {
        return new jha(this.b, this.c, this.d, this.e, z, 32);
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: T0 */
    public final mge Q0(boolean z) {
        return new jha(this.b, this.c, this.d, this.e, z, 32);
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: U0 */
    public final mge S0(gwf gwfVar) {
        gwfVar.getClass();
        return new jha(this.b, this.c, this.d, gwfVar, this.f, this.V);
    }

    @Override // defpackage.p7g
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final jha O0(bj8 bj8Var) {
        bj8Var.getClass();
        lha lhaVar = this.c;
        lhaVar.getClass();
        bj8Var.getClass();
        wxf wxfVarA = lhaVar.a.a(bj8Var);
        kha khaVar = lhaVar.b != null ? new kha(0, lhaVar, bj8Var) : null;
        lha lhaVar2 = lhaVar.c;
        if (lhaVar2 == null) {
            lhaVar2 = lhaVar;
        }
        lha lhaVar3 = new lha(wxfVarA, khaVar, lhaVar2, lhaVar.d);
        p7g p7gVar = this.d;
        return new jha(this.b, lhaVar3, p7gVar != null ? bj8Var.A0(p7gVar).P0() : null, this.e, this.f, 32);
    }

    @Override // defpackage.ui8
    public final in9 n() {
        return lx4.a(xw4.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public jha(hx1 hx1Var, lha lhaVar, p7g p7gVar, gwf gwfVar, boolean z, boolean z2) {
        hx1Var.getClass();
        lhaVar.getClass();
        gwfVar.getClass();
        this.b = hx1Var;
        this.c = lhaVar;
        this.d = p7gVar;
        this.e = gwfVar;
        this.f = z;
        this.V = z2;
    }
}
