package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {100, 151}, m = "animateToZero")
public final class r7g extends pu2 {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s7g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7g(s7g s7gVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = s7gVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
