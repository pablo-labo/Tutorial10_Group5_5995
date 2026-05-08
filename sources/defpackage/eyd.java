package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {354, 357}, m = "runAnimations")
public final class eyd extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ cyd<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyd(cyd cydVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = cydVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return cyd.g(this.this$0, this);
    }
}
