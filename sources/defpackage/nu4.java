package defpackage;

import defpackage.csf;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nu4 extends mj8 implements Function1<cd6, j6g> {
    final /* synthetic */ ese<Float> $alpha;
    final /* synthetic */ ese<Float> $scale;
    final /* synthetic */ ese<mrf> $transformOrigin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu4(csf.a.C0199a c0199a, csf.a.C0199a c0199a2, csf.a.C0199a c0199a3) {
        super(1);
        this.$alpha = c0199a;
        this.$scale = c0199a2;
        this.$transformOrigin = c0199a3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(cd6 cd6Var) {
        cd6 cd6Var2 = cd6Var;
        ese<Float> eseVar = this.$alpha;
        cd6Var2.b(eseVar != null ? eseVar.getValue().floatValue() : 1.0f);
        ese<Float> eseVar2 = this.$scale;
        cd6Var2.m(eseVar2 != null ? eseVar2.getValue().floatValue() : 1.0f);
        ese<Float> eseVar3 = this.$scale;
        cd6Var2.u(eseVar3 != null ? eseVar3.getValue().floatValue() : 1.0f);
        ese<mrf> eseVar4 = this.$transformOrigin;
        cd6Var2.y0(eseVar4 != null ? eseVar4.getValue().a : mrf.b);
        return j6g.a;
    }
}
