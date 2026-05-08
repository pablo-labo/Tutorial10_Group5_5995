package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {422, 426}, m = "onSubscription")
public final class hxe extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ixe<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxe(ixe ixeVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = ixeVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
