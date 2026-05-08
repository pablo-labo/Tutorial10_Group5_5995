package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {212}, m = "acquire")
public final class rfb extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ tfb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfb(tfb tfbVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = tfbVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
