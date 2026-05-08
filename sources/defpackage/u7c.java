package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {359, 362}, m = "onRelease")
public final class u7c extends pu2 {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t7c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7c(t7c t7cVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = t7cVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.j2(0.0f, this);
    }
}
