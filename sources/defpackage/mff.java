package defpackage;

import defpackage.fef;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mff extends mj8 implements Function1<ft1, nfa> {
    final /* synthetic */ oa2 $color;
    final /* synthetic */ dce $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mff(dce dceVar, fef.e eVar) {
        super(1);
        this.$shape = dceVar;
        this.$color = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final nfa invoke(ft1 ft1Var) {
        ft1 ft1Var2 = ft1Var;
        return ft1Var2.d(new et1(new lff(this.$shape.a(ft1Var2.a.c(), ft1Var2.a.getLayoutDirection(), ft1Var2), this.$color)));
    }
}
