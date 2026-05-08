package defpackage;

import com.apollographql.apollo.exception.ApolloNetworkException;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$2", f = "SubscriptionWsProtocol.kt", l = {39}, m = "invokeSuspend", v = 1)
public final class pxe extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ nxe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxe(nxe nxeVar, lu2<? super pxe> lu2Var) {
        super(2, lu2Var);
        this.this$0 = nxeVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new pxe(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((pxe) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            nxe nxeVar = this.this$0;
            this.label = 1;
            obj = nxeVar.b(this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        Map map = (Map) obj;
        Object obj2 = map.get("type");
        if (wl7.b(obj2, "connection_ack")) {
            return j6g.a;
        }
        if (wl7.b(obj2, "connection_error")) {
            throw new ApolloNetworkException(null, "Connection error:\n" + map);
        }
        System.out.println((Object) t40.i(obj2, "unknown message while waiting for connection_ack: '"));
        return j6g.a;
    }
}
