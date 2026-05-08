package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bee extends mj8 implements gu5<hee> {
    final /* synthetic */ Function1<jee, Boolean> $confirmValueChange;
    final /* synthetic */ iy3 $density;
    final /* synthetic */ jee $initialValue;
    final /* synthetic */ boolean $skipHiddenState = false;
    final /* synthetic */ boolean $skipPartiallyExpanded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bee(boolean z, iy3 iy3Var, jee jeeVar, Function1 function1) {
        super(0);
        this.$skipPartiallyExpanded = z;
        this.$density = iy3Var;
        this.$initialValue = jeeVar;
        this.$confirmValueChange = function1;
    }

    @Override // defpackage.gu5
    public final hee invoke() {
        return new hee(this.$skipPartiallyExpanded, this.$density, this.$initialValue, this.$confirmValueChange, this.$skipHiddenState);
    }
}
