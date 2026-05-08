package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", l = {101}, m = "awaitClose")
public final class dge extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ fge<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dge(fge fgeVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = fgeVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.N(null, this);
    }
}
