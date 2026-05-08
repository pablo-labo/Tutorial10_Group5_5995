package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl", f = "PlatformSelectionBehaviors.android.kt", l = {351, 361}, m = "classifyText-M8tDOmk")
public final class ecb extends pu2 {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ icb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecb(icb icbVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = icbVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return icb.c(this.this$0, null, 0L, null, this);
    }
}
