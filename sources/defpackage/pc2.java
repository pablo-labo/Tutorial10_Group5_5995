package defpackage;

import defpackage.r2b;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.paging.CommonLimitOffsetImpl", f = "LimitOffsetPagingSource.kt", l = {139, 147}, m = "nonInitialLoad")
public final class pc2 extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ oc2<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc2(oc2 oc2Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = oc2Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        oc2<Object> oc2Var = this.this$0;
        r2b.b.C0406b<Object, Object> c0406b = oc2.i;
        return oc2Var.b(null, 0, this);
    }
}
