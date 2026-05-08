package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl")
public final class ho1<E> extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ go1<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho1(go1 go1Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = go1Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objD = go1.D(this.this$0, this);
        return objD == g13.a ? objD : new j22(objD);
    }
}
