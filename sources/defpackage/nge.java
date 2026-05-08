package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class nge extends mge {
    public final kwf b;
    public final List<wxf> c;
    public final boolean d;
    public final in9 e;
    public final Function1<bj8, mge> f;

    /* JADX WARN: Multi-variable type inference failed */
    public nge(kwf kwfVar, List<? extends wxf> list, boolean z, in9 in9Var, Function1<? super bj8, ? extends mge> function1) {
        kwfVar.getClass();
        list.getClass();
        in9Var.getClass();
        this.b = kwfVar;
        this.c = list;
        this.d = z;
        this.e = in9Var;
        this.f = function1;
        if (!(in9Var instanceof ww4) || (in9Var instanceof klf)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + in9Var + '\n' + kwfVar);
    }

    @Override // defpackage.ui8
    public final List<wxf> K0() {
        return this.c;
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
        return this.d;
    }

    @Override // defpackage.ui8
    public final ui8 O0(bj8 bj8Var) {
        bj8Var.getClass();
        mge mgeVarInvoke = this.f.invoke(bj8Var);
        return mgeVarInvoke == null ? this : mgeVarInvoke;
    }

    @Override // defpackage.p7g
    /* JADX INFO: renamed from: R0 */
    public final p7g O0(bj8 bj8Var) {
        bj8Var.getClass();
        mge mgeVarInvoke = this.f.invoke(bj8Var);
        return mgeVarInvoke == null ? this : mgeVarInvoke;
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: T0 */
    public final mge Q0(boolean z) {
        return z == this.d ? this : z ? new uma(this) : new gla(this);
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: U0 */
    public final mge S0(gwf gwfVar) {
        gwfVar.getClass();
        return gwfVar.isEmpty() ? this : new pge(this, gwfVar);
    }

    @Override // defpackage.ui8
    public final in9 n() {
        return this.e;
    }
}
