package defpackage;

import defpackage.pua;
import pua.a;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore", f = "DefaultApolloStore.kt", l = {168}, m = "writeOperation", v = 1)
public final class el3<D extends pua.a> extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ fl3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el3(fl3 fl3Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = fl3Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, null, null, this);
    }
}
