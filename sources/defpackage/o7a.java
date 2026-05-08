package defpackage;

import defpackage.wl7;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o7a extends qv5 implements gu5<j6g> {
    final /* synthetic */ fr0 $appliedTabViewModel;
    final /* synthetic */ rs0 $archivedTabViewModel;
    final /* synthetic */ mk7 $interviewTabViewModel;
    final /* synthetic */ bn7 $invitationTabViewModel;
    final /* synthetic */ e8a $myJobsViewModel;
    final /* synthetic */ gka $nonIaBottomSheetViewModel;
    final /* synthetic */ pld $savedTabViewModel;
    final /* synthetic */ e13 $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7a(e8a e8aVar, e13 e13Var, fr0 fr0Var, pld pldVar, bn7 bn7Var, mk7 mk7Var, rs0 rs0Var, gka gkaVar) {
        super(0, wl7.a.class, "reloadData", "MyJobsScreen$reloadData(Lcom/indeed/android/myjobs/MyJobsViewModel;Lkotlinx/coroutines/CoroutineScope;Lcom/indeed/android/myjobs/presentation/tabs/AppliedTabViewModel;Lcom/indeed/android/myjobs/presentation/tabs/SavedTabViewModel;Lcom/indeed/android/myjobs/presentation/tabs/InvitationTabViewModel;Lcom/indeed/android/myjobs/presentation/tabs/InterviewTabViewModel;Lcom/indeed/android/myjobs/presentation/tabs/ArchivedTabViewModel;Lcom/indeed/android/myjobs/presentation/tabs/NonIaBottomSheetViewModel;)V", 0);
        this.$myJobsViewModel = e8aVar;
        this.$scope = e13Var;
        this.$appliedTabViewModel = fr0Var;
        this.$savedTabViewModel = pldVar;
        this.$invitationTabViewModel = bn7Var;
        this.$interviewTabViewModel = mk7Var;
        this.$archivedTabViewModel = rs0Var;
        this.$nonIaBottomSheetViewModel = gkaVar;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        boolean z;
        e8a e8aVar = this.$myJobsViewModel;
        e13 e13Var = this.$scope;
        fr0 fr0Var = this.$appliedTabViewModel;
        pld pldVar = this.$savedTabViewModel;
        bn7 bn7Var = this.$invitationTabViewModel;
        mk7 mk7Var = this.$interviewTabViewModel;
        rs0 rs0Var = this.$archivedTabViewModel;
        gka gkaVar = this.$nonIaBottomSheetViewModel;
        j7f j7fVar = (j7f) ((gme) e8aVar.V).getValue();
        boolean z2 = true;
        boolean z3 = j7fVar == j7f.c;
        if (j7fVar == j7f.a) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        u63.Y(e13Var, null, null, new u7a(fr0Var, pldVar, z2, bn7Var, j7fVar == j7f.b ? z : false, z3, mk7Var, j7fVar == j7f.d ? z : false, rs0Var, j7fVar == j7f.e ? z : false, gkaVar, null), 3);
        return j6g.a;
    }
}
