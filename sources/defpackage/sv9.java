package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class sv9 extends mj8 implements Function1<cd6, j6g> {
    final /* synthetic */ zb0<Float, ce0> $predictiveBackProgress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv9(zb0<Float, ce0> zb0Var) {
        super(1);
        this.$predictiveBackProgress = zb0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(cd6 cd6Var) {
        cd6 cd6Var2 = cd6Var;
        float fFloatValue = this.$predictiveBackProgress.d().floatValue();
        float fD = hv9.d(cd6Var2, fFloatValue);
        float fE = hv9.e(cd6Var2, fFloatValue);
        cd6Var2.u(fE == 0.0f ? 1.0f : fD / fE);
        cd6Var2.y0(hv9.a);
        return j6g.a;
    }
}
