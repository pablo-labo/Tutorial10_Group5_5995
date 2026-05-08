package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", l = {114, 118, 541, 147}, m = "useConnection")
public final class to2<R> extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ wo2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to2(wo2 wo2Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = wo2Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.F0(false, null, this);
    }
}
