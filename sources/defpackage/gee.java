package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gee extends mj8 implements Function1<jee, hee> {
    final /* synthetic */ Function1<jee, Boolean> $confirmValueChange;
    final /* synthetic */ iy3 $density;
    final /* synthetic */ boolean $skipHiddenState = false;
    final /* synthetic */ boolean $skipPartiallyExpanded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gee(boolean z, iy3 iy3Var, Function1 function1) {
        super(1);
        this.$skipPartiallyExpanded = z;
        this.$density = iy3Var;
        this.$confirmValueChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final hee invoke(jee jeeVar) {
        return new hee(this.$skipPartiallyExpanded, this.$density, jeeVar, this.$confirmValueChange, this.$skipHiddenState);
    }
}
