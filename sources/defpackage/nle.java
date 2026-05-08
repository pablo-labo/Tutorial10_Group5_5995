package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {174}, m = "tryApproach")
public final class nle extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ole this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nle(ole oleVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = oleVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ole.c(this.this$0, null, 0.0f, 0.0f, null, this);
    }
}
