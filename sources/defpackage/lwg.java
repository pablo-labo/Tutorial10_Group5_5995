package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$3", f = "WebSocketNetworkTransport.kt", l = {225}, m = "invokeSuspend", v = 1)
public final class lwg extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ luc<l5h> $protocol;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwg(lu2 lu2Var, luc lucVar) {
        super(2, lu2Var);
        this.$protocol = lucVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new lwg(lu2Var, this.$protocol);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((lwg) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            l5h l5hVar = this.$protocol.element;
            l5hVar.getClass();
            this.label = 1;
            Object objC = l5h.c(l5hVar, this);
            g13 g13Var = g13.a;
            if (objC == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
