package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", l = {210}, m = "generateNewPagingSource")
public final class nza extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ lza<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nza(lza lzaVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = lzaVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return lza.a(this.this$0, null, this);
    }
}
