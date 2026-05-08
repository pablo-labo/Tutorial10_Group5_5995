package defpackage;

import defpackage.pua;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.ApolloCall", f = "ApolloCall.kt", l = {206}, m = "singleSuccessOrException", v = 1)
public final class jh0 extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ kh0<pua.a> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh0(kh0 kh0Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = kh0Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
