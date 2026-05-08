package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yff extends mj8 implements Function1<ss2, j6g> {
    final /* synthetic */ ese<bj1> $indicatorBorder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yff(g4a g4aVar) {
        super(1);
        this.$indicatorBorder = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(ss2 ss2Var) {
        ss2 ss2Var2 = ss2Var;
        ss2Var2.N1();
        float fT1 = ss2Var2.t1(this.$indicatorBorder.getValue().a);
        float fB = kie.b(ss2Var2.c()) - (fT1 / 2.0f);
        ss2Var2.s1(this.$indicatorBorder.getValue().b, wab.c(0.0f, fB), wab.c(kie.d(ss2Var2.c()), fB), fT1, (432 & 64) != 0 ? 1.0f : 0.0f);
        return j6g.a;
    }
}
