package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.network.ws.WsProtocol", f = "WsProtocol.kt", l = {143}, m = "run$suspendImpl", v = 1)
public final class n5h extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l5h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5h(l5h l5hVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = l5hVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return l5h.c(this.this$0, this);
    }
}
