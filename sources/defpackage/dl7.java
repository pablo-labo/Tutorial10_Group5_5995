package defpackage;

import com.indeed.android.myjobs.data.model.dto.InterviewJobsDto;
import defpackage.b5a;
import defpackage.ude;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewsTabKt$DisplayJobList$2$1$1$2$4$1$1", f = "InterviewsTab.kt", l = {}, m = "invokeSuspend")
public final class dl7 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ InterviewJobsDto $job;
    final /* synthetic */ e8a $myJobsViewModel;
    final /* synthetic */ ude $sharedViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl7(e8a e8aVar, InterviewJobsDto interviewJobsDto, ude udeVar, lu2<? super dl7> lu2Var) {
        super(2, lu2Var);
        this.$myJobsViewModel = e8aVar;
        this.$job = interviewJobsDto;
        this.$sharedViewModel = udeVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new dl7(this.$myJobsViewModel, this.$job, this.$sharedViewModel, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((dl7) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        g3a<b5a> g3aVar = this.$myJobsViewModel.a0;
        String jobLink = this.$job.getJobLink();
        g3aVar.k(jobLink != null ? new b5a.d(n7g.a(jobLink, "app-tracker--interviewcard")) : null);
        this.$sharedViewModel.m(new ude.c.C0432c());
        return j6g.a;
    }
}
