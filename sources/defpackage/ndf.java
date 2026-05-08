package defpackage;

import androidx.compose.runtime.r;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ndf extends zs3 implements nm2, zcf {
    public tu2 f0;
    public Function1<? super lu2<? super j6g>, ? extends Object> g0;
    public Function1<? super lu2<? super j6g>, ? extends Object> h0;
    public Function1<? super sl8, qtc> i0;
    public uqe j0;
    public final az3 k0 = r.c(new dd(this, 19));
    public qtc l0 = qtc.e;

    public ndf(tu2 tu2Var, Function1<? super lu2<? super j6g>, ? extends Object> function1, Function1<? super lu2<? super j6g>, ? extends Object> function12, Function1<? super sl8, qtc> function13) {
        this.f0 = tu2Var;
        this.g0 = function1;
        this.h0 = function12;
        this.i0 = function13;
    }

    @Override // defpackage.zcf
    public final long L0(sl8 sl8Var) {
        return O0(sl8Var).d();
    }

    @Override // defpackage.zcf
    public final qtc O0(sl8 sl8Var) {
        qtc qtcVarInvoke;
        if (this.c0 && (qtcVarInvoke = this.i0.invoke(sl8Var)) != null) {
            this.l0 = qtcVarInvoke;
            return qtcVarInvoke;
        }
        return this.l0;
    }

    @Override // androidx.compose.ui.e.c
    public final void U1() {
        this.f0.a = this;
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        this.f0.a = null;
    }

    @Override // defpackage.zcf
    public final ycf g0() {
        return (ycf) this.k0.getValue();
    }
}
