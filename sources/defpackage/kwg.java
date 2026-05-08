package defpackage;

import com.datadog.android.rum.internal.debug.UiRumDebugListener;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport", f = "WebSocketNetworkTransport.kt", l = {149, 154, 156, 191, 190, UiRumDebugListener.DEFAULT_ALPHA, 210, 214, 241}, m = "supervise", v = 1)
public final class kwg extends pu2 {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ iwg this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwg(iwg iwgVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = iwgVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return iwg.c(this.this$0, null, this);
    }
}
