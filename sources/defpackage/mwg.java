package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$4", f = "WebSocketNetworkTransport.kt", l = {251}, m = "invokeSuspend", v = 1)
public final class mwg extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ luc<ex7> $connectionJob;
    final /* synthetic */ luc<ex7> $idleJob;
    final /* synthetic */ luc<l5h> $protocol;
    int label;
    final /* synthetic */ iwg this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwg(iwg iwgVar, luc<l5h> lucVar, luc<ex7> lucVar2, luc<ex7> lucVar3, lu2<? super mwg> lu2Var) {
        super(2, lu2Var);
        this.this$0 = iwgVar;
        this.$protocol = lucVar;
        this.$connectionJob = lucVar2;
        this.$idleJob = lucVar3;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new mwg(this.this$0, this.$protocol, this.$connectionJob, this.$idleJob, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((mwg) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            long j = this.this$0.d;
            this.label = 1;
            Object objB = ls3.b(j, this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        iwg.d(this.$protocol, this.$connectionJob, this.$idleJob);
        return j6g.a;
    }
}
