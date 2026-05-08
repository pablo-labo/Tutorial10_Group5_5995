package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s50 extends mj8 implements Function1<f5e, Boolean> {
    final /* synthetic */ jh7<i5e> $currentSemanticsNodes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s50(jh7<i5e> jh7Var) {
        super(1);
        this.$currentSemanticsNodes = jh7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(f5e f5eVar) {
        return Boolean.valueOf(this.$currentSemanticsNodes.a(f5eVar.g));
    }
}
