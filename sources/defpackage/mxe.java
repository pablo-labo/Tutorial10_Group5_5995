package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol$Factory$1", f = "SubscriptionWsProtocol.kt", l = {}, m = "invokeSuspend", v = 1)
public final class mxe extends c1f implements Function1<lu2, Object> {
    int label;

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new mxe(1, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2 lu2Var) {
        ((mxe) create(lu2Var)).invokeSuspend(j6g.a);
        return null;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            r7d.b(obj);
            return null;
        }
        r6.g("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
