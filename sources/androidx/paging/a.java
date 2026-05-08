package androidx.paging;

import androidx.paging.SingleRunner;
import defpackage.pu2;
import defpackage.uh3;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {131}, m = "onFinish")
public final class a extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleRunner.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SingleRunner.a aVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = aVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
