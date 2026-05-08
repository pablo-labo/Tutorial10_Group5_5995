package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {376, 380, 393, 393, 393}, m = "transaction")
public final class hgb<R> extends pu2 {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ egb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgb(egb egbVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = egbVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(null, null, this);
    }
}
