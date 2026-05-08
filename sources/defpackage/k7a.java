package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$3$1", f = "MyJobsScreen.kt", l = {}, m = "invokeSuspend")
public final class k7a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ fr0 $appliedTabViewModel;
    final /* synthetic */ mk7 $interviewTabViewModel;
    final /* synthetic */ bn7 $invitationTabViewModel;
    final /* synthetic */ e8a $myJobsViewModel;
    final /* synthetic */ pld $savedTabViewModel;
    final /* synthetic */ ese<Boolean> $shouldOpenDashboard$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7a(e8a e8aVar, pld pldVar, fr0 fr0Var, bn7 bn7Var, mk7 mk7Var, ese<Boolean> eseVar, lu2<? super k7a> lu2Var) {
        super(2, lu2Var);
        this.$myJobsViewModel = e8aVar;
        this.$savedTabViewModel = pldVar;
        this.$appliedTabViewModel = fr0Var;
        this.$invitationTabViewModel = bn7Var;
        this.$interviewTabViewModel = mk7Var;
        this.$shouldOpenDashboard$delegate = eseVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new k7a(this.$myJobsViewModel, this.$savedTabViewModel, this.$appliedTabViewModel, this.$invitationTabViewModel, this.$interviewTabViewModel, this.$shouldOpenDashboard$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((k7a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (this.$shouldOpenDashboard$delegate.getValue().booleanValue()) {
            this.$myJobsViewModel.f0.k(Boolean.FALSE);
            this.$myJobsViewModel.k(this.$savedTabViewModel, this.$appliedTabViewModel, this.$invitationTabViewModel, this.$interviewTabViewModel);
        }
        return j6g.a;
    }
}
