package defpackage;

import com.indeed.android.myjobs.data.model.dto.InterviewJobsDto;
import defpackage.mk7;
import defpackage.ude;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewsTabKt$DisplayJobList$2$1$1$2$3$1$1", f = "InterviewsTab.kt", l = {}, m = "invokeSuspend")
public final class cl7 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ mk7 $interviewTabViewmodel;
    final /* synthetic */ InterviewJobsDto $job;
    final /* synthetic */ ude $sharedViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl7(mk7 mk7Var, InterviewJobsDto interviewJobsDto, ude udeVar, lu2<? super cl7> lu2Var) {
        super(2, lu2Var);
        this.$interviewTabViewmodel = mk7Var;
        this.$job = interviewJobsDto;
        this.$sharedViewModel = udeVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new cl7(this.$interviewTabViewmodel, this.$job, this.$sharedViewModel, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((cl7) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$interviewTabViewmodel.r(new mk7.a.b(this.$job));
        this.$sharedViewModel.m(new ude.c.i(this.$job.getId()));
        return j6g.a;
    }
}
