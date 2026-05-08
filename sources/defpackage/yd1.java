package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1$1", f = "BasicTooltip.kt", l = {}, m = "invokeSuspend")
public final class yd1 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ fe1 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd1(fe1 fe1Var, lu2<? super yd1> lu2Var) {
        super(2, lu2Var);
        this.$state = fe1Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new yd1(this.$state, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((yd1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$state.dismiss();
        return j6g.a;
    }
}
