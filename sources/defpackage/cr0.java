package defpackage;

import com.indeed.android.myjobs.data.model.UserJobStatus;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.b5a;
import defpackage.ude;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabKt$Jobcard$onCardClick$1$1$1", f = "AppliedTab.kt", l = {}, m = "invokeSuspend")
public final class cr0 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ SavedJobsDto $job;
    final /* synthetic */ e8a $myJobsViewModel;
    final /* synthetic */ ude $sharedViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr0(e8a e8aVar, SavedJobsDto savedJobsDto, ude udeVar, lu2<? super cr0> lu2Var) {
        super(2, lu2Var);
        this.$myJobsViewModel = e8aVar;
        this.$job = savedJobsDto;
        this.$sharedViewModel = udeVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new cr0(this.$myJobsViewModel, this.$job, this.$sharedViewModel, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((cr0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$myJobsViewModel.a0.k(new b5a.d(n7g.a(this.$job.getJobUrl(), "app-tracker-post_apply-appcard")));
        ude udeVar = this.$sharedViewModel;
        UserJobStatus userJobStatus = this.$job.getUserJobStatus();
        udeVar.m(new ude.c.C0432c(this.$job, "Applied", userJobStatus != null ? userJobStatus.getStatus() : null, this.$job.getAppTk()));
        return j6g.a;
    }
}
