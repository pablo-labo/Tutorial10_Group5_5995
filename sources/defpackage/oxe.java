package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol", f = "SubscriptionWsProtocol.kt", l = {31, 38}, m = "connectionInit", v = 1)
public final class oxe extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ nxe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxe(nxe nxeVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = nxeVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(this);
    }
}
