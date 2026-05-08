package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {100}, m = "performFling")
public final class mle extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ole this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mle(ole oleVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = oleVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, 0.0f, null, this);
    }
}
