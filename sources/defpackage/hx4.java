package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hx4 extends mge {
    public final String[] V;
    public final String W;
    public final kwf b;
    public final in9 c;
    public final kx4 d;
    public final List<wxf> e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public hx4(kwf kwfVar, in9 in9Var, kx4 kx4Var, List<? extends wxf> list, boolean z, String... strArr) {
        kwfVar.getClass();
        in9Var.getClass();
        kx4Var.getClass();
        list.getClass();
        this.b = kwfVar;
        this.c = in9Var;
        this.d = kx4Var;
        this.e = list;
        this.f = z;
        this.V = strArr;
        String strA = kx4Var.a();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.W = String.format(strA, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // defpackage.ui8
    public final List<wxf> K0() {
        return this.e;
    }

    @Override // defpackage.ui8
    public final gwf L0() {
        gwf.b.getClass();
        return gwf.c;
    }

    @Override // defpackage.ui8
    public final kwf M0() {
        return this.b;
    }

    @Override // defpackage.ui8
    public final boolean N0() {
        return this.f;
    }

    @Override // defpackage.ui8
    /* JADX INFO: renamed from: O0 */
    public final ui8 R0(bj8 bj8Var) {
        bj8Var.getClass();
        return this;
    }

    @Override // defpackage.p7g
    public final p7g R0(bj8 bj8Var) {
        bj8Var.getClass();
        return this;
    }

    @Override // defpackage.mge, defpackage.p7g
    public final p7g S0(gwf gwfVar) {
        gwfVar.getClass();
        return this;
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: T0 */
    public final mge Q0(boolean z) {
        String[] strArr = this.V;
        return new hx4(this.b, this.c, this.d, this.e, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: U0 */
    public final mge S0(gwf gwfVar) {
        gwfVar.getClass();
        return this;
    }

    @Override // defpackage.ui8
    public final in9 n() {
        return this.c;
    }
}
