package defpackage;

import defpackage.fr0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabKt$AppliedTab$refresh$1", f = "AppliedTab.kt", l = {}, m = "invokeSuspend")
public final class rq0 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ fr0 $appliedTabViewModel;
    final /* synthetic */ g4a<Boolean> $refreshing$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq0(fr0 fr0Var, g4a<Boolean> g4aVar, lu2<? super rq0> lu2Var) {
        super(2, lu2Var);
        this.$appliedTabViewModel = fr0Var;
        this.$refreshing$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new rq0(this.$appliedTabViewModel, this.$refreshing$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((rq0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$refreshing$delegate.setValue(Boolean.TRUE);
        this.$appliedTabViewModel.p(true);
        this.$appliedTabViewModel.r(fr0.b.n.a);
        this.$appliedTabViewModel.o();
        this.$refreshing$delegate.setValue(Boolean.FALSE);
        return j6g.a;
    }
}
