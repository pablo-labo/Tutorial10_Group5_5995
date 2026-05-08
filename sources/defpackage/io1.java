package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
public final class io1 extends pu2 {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ go1<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io1(go1 go1Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = go1Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        go1<Object> go1Var = this.this$0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = go1.b;
        Object objE = go1Var.E(null, 0, 0L, this);
        return objE == g13.a ? objE : new j22(objE);
    }
}
