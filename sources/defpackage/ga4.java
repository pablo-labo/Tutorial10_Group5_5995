package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {565, 568}, m = "processDragStart")
public final class ga4 extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ja4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga4(ja4 ja4Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = ja4Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ja4.g2(this.this$0, null, this);
    }
}
