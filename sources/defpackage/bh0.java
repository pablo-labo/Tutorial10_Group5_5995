package defpackage;

import defpackage.p4a;
import p4a.a;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.onegraph.tasks.ApolloApiExecutor", f = "ApolloApiExecutor.kt", l = {51}, m = "execute")
public final class bh0<D extends p4a.a> extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ah0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh0(ah0 ah0Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = ah0Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
