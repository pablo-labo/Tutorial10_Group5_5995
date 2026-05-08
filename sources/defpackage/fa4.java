package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {583}, m = "processDragCancel")
public final class fa4 extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ja4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa4(ja4 ja4Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = ja4Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ja4.f2(this.this$0, this);
    }
}
