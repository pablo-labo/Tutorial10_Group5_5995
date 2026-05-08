package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$8$1", f = "MyJobsScreen.kt", l = {}, m = "invokeSuspend")
public final class h7a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ fr0 $appliedTabViewModel;
    final /* synthetic */ rs0 $archivedTabViewModel;
    final /* synthetic */ g4a<Integer> $currentTabIndex$delegate;
    final /* synthetic */ g4a<Boolean> $hasMyJobsBeenViewed$delegate;
    final /* synthetic */ mk7 $interviewTabViewModel;
    final /* synthetic */ bn7 $invitationTabViewModel;
    final /* synthetic */ g4a<Integer> $lastLoggedTabIndex$delegate;
    final /* synthetic */ pld $savedTabViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7a(g4a<Boolean> g4aVar, g4a<Integer> g4aVar2, g4a<Integer> g4aVar3, pld pldVar, fr0 fr0Var, mk7 mk7Var, rs0 rs0Var, bn7 bn7Var, lu2<? super h7a> lu2Var) {
        super(2, lu2Var);
        this.$hasMyJobsBeenViewed$delegate = g4aVar;
        this.$currentTabIndex$delegate = g4aVar2;
        this.$lastLoggedTabIndex$delegate = g4aVar3;
        this.$savedTabViewModel = pldVar;
        this.$appliedTabViewModel = fr0Var;
        this.$interviewTabViewModel = mk7Var;
        this.$archivedTabViewModel = rs0Var;
        this.$invitationTabViewModel = bn7Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new h7a(this.$hasMyJobsBeenViewed$delegate, this.$currentTabIndex$delegate, this.$lastLoggedTabIndex$delegate, this.$savedTabViewModel, this.$appliedTabViewModel, this.$interviewTabViewModel, this.$archivedTabViewModel, this.$invitationTabViewModel, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((h7a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (this.$hasMyJobsBeenViewed$delegate.getValue().booleanValue() && v7a.d(this.$currentTabIndex$delegate) != this.$lastLoggedTabIndex$delegate.getValue().intValue() && u63.M(v7a.d(this.$currentTabIndex$delegate)) != j7f.c) {
            v7a.e(this.$hasMyJobsBeenViewed$delegate, this.$lastLoggedTabIndex$delegate, this.$savedTabViewModel, this.$appliedTabViewModel, this.$interviewTabViewModel, this.$archivedTabViewModel, this.$invitationTabViewModel, v7a.d(this.$currentTabIndex$delegate));
        }
        return j6g.a;
    }
}
