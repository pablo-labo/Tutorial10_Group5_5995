package defpackage;

import com.apollographql.apollo.exception.ApolloException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.ApolloClient$apolloResponses$1$1", f = "ApolloClient.kt", l = {}, m = "invokeSuspend", v = 1)
public final class mh0 extends c1f implements Function2<sh0<Object>, lu2<? super j6g>, Object> {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        mh0 mh0Var = new mh0(2, lu2Var);
        mh0Var.L$0 = obj;
        return mh0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(sh0<Object> sh0Var, lu2<? super j6g> lu2Var) {
        return ((mh0) create(sh0Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        ApolloException apolloException = ((sh0) this.L$0).e;
        if (apolloException == null) {
            return j6g.a;
        }
        apolloException.getClass();
        throw apolloException;
    }
}
