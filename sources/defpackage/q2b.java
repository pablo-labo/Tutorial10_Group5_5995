package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.PagingDataPresenter", f = "PagingDataPresenter.kt", l = {478}, m = "presentNewList")
public final class q2b extends pu2 {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n2b<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2b(n2b n2bVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = n2bVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return n2b.a(this.this$0, null, 0, 0, false, null, null, null, this);
    }
}
