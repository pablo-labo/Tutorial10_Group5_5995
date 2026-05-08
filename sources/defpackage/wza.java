package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {646}, m = "currentPagingState")
public final class wza extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ rza<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wza(rza rzaVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = rzaVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(this);
    }
}
