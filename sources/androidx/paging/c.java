package androidx.paging;

import defpackage.pu2;
import defpackage.uh3;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", l = {49}, m = "runInIsolation")
public final class c extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SingleRunner singleRunner, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = singleRunner;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0, null, this);
    }
}
