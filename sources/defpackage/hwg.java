package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$Builder$serverUrl$1$1", f = "WebSocketNetworkTransport.kt", l = {}, m = "invokeSuspend", v = 1)
public final class hwg extends c1f implements Function1<lu2<? super String>, Object> {
    final /* synthetic */ String $serverUrl;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwg(String str, lu2<? super hwg> lu2Var) {
        super(1, lu2Var);
        this.$serverUrl = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new hwg(this.$serverUrl, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super String> lu2Var) {
        return ((hwg) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            r7d.b(obj);
            return this.$serverUrl;
        }
        r6.g("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
