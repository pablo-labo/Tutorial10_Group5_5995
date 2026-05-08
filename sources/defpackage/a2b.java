package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {612, 619}, m = "animateScrollToPage")
public final class a2b extends pu2 {
    float F$0;
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e2b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2b(e2b e2bVar, lu2<? super a2b> lu2Var) {
        super(lu2Var);
        this.this$0 = e2bVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(0, null, this);
    }
}
