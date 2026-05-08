package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.driver.SupportSQLitePooledConnection", f = "SupportSQLiteConnectionPool.android.kt", l = {83}, m = "transaction")
public final class vze<R> extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ uze this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vze(uze uzeVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = uzeVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, this);
    }
}
