package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {520}, m = "anchoredDrag")
public final class l30 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q30<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(q30 q30Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = q30Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
