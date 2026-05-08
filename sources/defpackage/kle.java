package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {114}, m = "fling")
public final class kle extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ole this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kle(ole oleVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = oleVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, 0.0f, null, this);
    }
}
