package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {523}, m = "anchoredDrag")
public final class m30 extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d40<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(d40 d40Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = d40Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
