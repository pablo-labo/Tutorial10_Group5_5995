package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$reloadData$1", f = "MyJobsScreen.kt", l = {195}, m = "invokeSuspend")
public final class u7a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ fr0 $appliedTabViewModel;
    final /* synthetic */ rs0 $archivedTabViewModel;
    final /* synthetic */ mk7 $interviewTabViewModel;
    final /* synthetic */ bn7 $invitationTabViewModel;
    final /* synthetic */ boolean $isAppliedTab;
    final /* synthetic */ boolean $isArchivedTab;
    final /* synthetic */ boolean $isInterviewTab;
    final /* synthetic */ boolean $isInvitationTab;
    final /* synthetic */ boolean $isSavedTab;
    final /* synthetic */ gka $nonIaBottomSheetViewModel;
    final /* synthetic */ pld $savedTabViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7a(fr0 fr0Var, pld pldVar, boolean z, bn7 bn7Var, boolean z2, boolean z3, mk7 mk7Var, boolean z4, rs0 rs0Var, boolean z5, gka gkaVar, lu2<? super u7a> lu2Var) {
        super(2, lu2Var);
        this.$appliedTabViewModel = fr0Var;
        this.$savedTabViewModel = pldVar;
        this.$isSavedTab = z;
        this.$invitationTabViewModel = bn7Var;
        this.$isInvitationTab = z2;
        this.$isAppliedTab = z3;
        this.$interviewTabViewModel = mk7Var;
        this.$isInterviewTab = z4;
        this.$archivedTabViewModel = rs0Var;
        this.$isArchivedTab = z5;
        this.$nonIaBottomSheetViewModel = gkaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new u7a(this.$appliedTabViewModel, this.$savedTabViewModel, this.$isSavedTab, this.$invitationTabViewModel, this.$isInvitationTab, this.$isAppliedTab, this.$interviewTabViewModel, this.$isInterviewTab, this.$archivedTabViewModel, this.$isArchivedTab, this.$nonIaBottomSheetViewModel, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((u7a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            fr0 fr0Var = this.$appliedTabViewModel;
            this.label = 1;
            Object objL = fr0Var.l(this);
            g13 g13Var = g13.a;
            if (objL == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        this.$savedTabViewModel.o(this.$isSavedTab);
        if (i6a.i()) {
            bn7 bn7Var = this.$invitationTabViewModel;
            boolean z = this.$isInvitationTab;
            boolean z2 = bn7Var.f0;
            bn7Var.f0 = true;
            if (i6a.i()) {
                u63.Y(ee3.p(bn7Var), null, null, new en7(bn7Var, true, true, null), 3);
            }
            if (z && z2) {
                bn7Var.e0.b("Invitations", ee3.p(bn7Var));
            }
        }
        this.$appliedTabViewModel.p(this.$isAppliedTab);
        this.$interviewTabViewModel.q(this.$isInterviewTab);
        this.$archivedTabViewModel.l(this.$isArchivedTab);
        gka gkaVar = this.$nonIaBottomSheetViewModel;
        gkaVar.getClass();
        int i2 = i6a.d().a;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            u63.Y(ee3.p(gkaVar), null, null, new hka(gkaVar, null), 3);
        }
        return j6g.a;
    }
}
