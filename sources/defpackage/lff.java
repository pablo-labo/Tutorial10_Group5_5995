package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lff extends mj8 implements Function1<gb4, j6g> {
    final /* synthetic */ oa2 $color;
    final /* synthetic */ jwa $outline;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lff(jwa jwaVar, oa2 oa2Var) {
        super(1);
        this.$outline = jwaVar;
        this.$color = oa2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(gb4 gb4Var) {
        lwa.a(gb4Var, this.$outline, this.$color.a());
        return j6g.a;
    }
}
