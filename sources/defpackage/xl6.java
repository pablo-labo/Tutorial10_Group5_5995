package defpackage;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$2", f = "HttpNetworkTransport.kt", l = {235}, m = "invokeSuspend", v = 1)
public final class xl6 extends c1f implements wu5<wi5<? super sh0<Object>>, Throwable, lu2<? super j6g>, Object> {
    final /* synthetic */ pua<Object> $operation;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ tl6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl6(pua<Object> puaVar, tl6 tl6Var, lu2<? super xl6> lu2Var) {
        super(3, lu2Var);
        this.$operation = puaVar;
        this.this$0 = tl6Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            wi5 wi5Var = (wi5) this.L$0;
            Throwable th = (Throwable) this.L$1;
            pua<Object> puaVar = this.$operation;
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            puaVar.getClass();
            this.this$0.getClass();
            sh0 sh0Var = new sh0(uuidRandomUUID, puaVar, null, null, th instanceof ApolloException ? (ApolloException) th : new ApolloNetworkException(th, "Error while reading response"), bs4.a, wr4.a, false);
            this.L$0 = null;
            this.label = 1;
            Object objA = wi5Var.a(sh0Var, this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
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

    @Override // defpackage.wu5
    public final Object q(wi5<? super sh0<Object>> wi5Var, Throwable th, lu2<? super j6g> lu2Var) {
        xl6 xl6Var = new xl6(this.$operation, this.this$0, lu2Var);
        xl6Var.L$0 = wi5Var;
        xl6Var.L$1 = th;
        return xl6Var.invokeSuspend(j6g.a);
    }
}
