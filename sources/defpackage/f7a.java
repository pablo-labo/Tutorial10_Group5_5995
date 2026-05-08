package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$6$1", f = "MyJobsScreen.kt", l = {}, m = "invokeSuspend")
public final class f7a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g4a<Integer> $currentTabIndex$delegate;
    final /* synthetic */ e2b $pagerState;
    final /* synthetic */ g4a<j7f> $selectedFilter$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7a(e2b e2bVar, g4a<Integer> g4aVar, g4a<j7f> g4aVar2, lu2<? super f7a> lu2Var) {
        super(2, lu2Var);
        this.$pagerState = e2bVar;
        this.$currentTabIndex$delegate = g4aVar;
        this.$selectedFilter$delegate = g4aVar2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new f7a(this.$pagerState, this.$currentTabIndex$delegate, this.$selectedFilter$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((f7a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (!this.$pagerState.k.b() && this.$pagerState.k() != v7a.d(this.$currentTabIndex$delegate)) {
            this.$selectedFilter$delegate.setValue(u63.M(this.$pagerState.k()));
            this.$currentTabIndex$delegate.setValue(Integer.valueOf(this.$pagerState.k()));
        }
        return j6g.a;
    }
}
