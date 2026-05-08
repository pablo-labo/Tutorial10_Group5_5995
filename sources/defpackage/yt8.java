package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", f = "LegacyAdaptingPlatformTextInputModifierNode.kt", l = {137}, m = "invokeSuspend")
public final class yt8 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<tcb, lu2<?>, Object> $block;
    int label;
    final /* synthetic */ zt8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yt8(zt8 zt8Var, Function2<? super tcb, ? super lu2<?>, ? extends Object> function2, lu2<? super yt8> lu2Var) {
        super(2, lu2Var);
        this.this$0 = zt8Var;
        this.$block = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new yt8(this.this$0, this.$block, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        ((yt8) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        return g13.a;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                throw s6.e(obj);
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        zt8 zt8Var = this.this$0;
        Function2<tcb, lu2<?>, Object> function2 = this.$block;
        this.label = 1;
        pcb.a(zt8Var, function2, this);
        return g13.a;
    }
}
