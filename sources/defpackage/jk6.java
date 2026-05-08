package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {106}, m = "emitEnter")
public final class jk6 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ lk6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk6(lk6 lk6Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = lk6Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return lk6.c2(this.this$0, this);
    }
}
