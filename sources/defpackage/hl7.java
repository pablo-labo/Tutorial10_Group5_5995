package defpackage;

import androidx.fragment.app.g;
import com.indeed.android.myjobs.data.model.dto.InterviewJobsDto;
import defpackage.jq7;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewsTabKt$DisplayJobList$2$1$1$4$4$1$1", f = "InterviewsTab.kt", l = {}, m = "invokeSuspend")
public final class hl7 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g $activity;
    final /* synthetic */ InterviewJobsDto $job;
    final /* synthetic */ iba $navController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl7(g gVar, iba ibaVar, InterviewJobsDto interviewJobsDto, lu2<? super hl7> lu2Var) {
        super(2, lu2Var);
        this.$activity = gVar;
        this.$navController = ibaVar;
        this.$job = interviewJobsDto;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new hl7(this.$activity, this.$navController, this.$job, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((hl7) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        g gVar = this.$activity;
        if (gVar != null) {
            iba ibaVar = this.$navController;
            InterviewJobsDto interviewJobsDto = this.$job;
            rq7 rq7Var = (rq7) cr8.p(rq7.class);
            lr5 lr5VarU = gVar.u();
            lr5VarU.getClass();
            rq7Var.f(lr5VarU, ibaVar, new jq7.l((String) z92.Q0(interviewJobsDto.getMostLikelySuids()), new hq7(interviewJobsDto.getJobKey(), interviewJobsDto.getTitle()), 2), "MyJobs");
        }
        return j6g.a;
    }
}
