package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", l = {385}, m = "performFling")
public final class i2b extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j2b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2b(j2b j2bVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = j2bVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, 0.0f, this);
    }
}
