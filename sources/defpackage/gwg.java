package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$1", f = "WebSocketNetworkTransport.kt", l = {94}, m = "invokeSuspend", v = 1)
public final class gwg extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ iwg this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwg(iwg iwgVar, lu2<? super gwg> lu2Var) {
        super(2, lu2Var);
        this.this$0 = iwgVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        gwg gwgVar = new gwg(this.this$0, lu2Var);
        gwgVar.L$0 = obj;
        return gwgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((gwg) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            e13 e13Var = (e13) this.L$0;
            iwg iwgVar = this.this$0;
            this.label = 1;
            Object objC = iwg.c(iwgVar, e13Var, this);
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
