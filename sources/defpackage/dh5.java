package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {287}, m = "getStateAsEvents")
public final class dh5 extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ fh5<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh5(fh5 fh5Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = fh5Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
