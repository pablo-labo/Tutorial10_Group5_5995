package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {554}, m = "usePrepared")
public final class igb<R> extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ egb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igb(egb egbVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = egbVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
