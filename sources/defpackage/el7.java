package defpackage;

import com.indeed.android.myjobs.data.model.dto.InterviewJobsDto;
import defpackage.ude;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.InterviewsTabKt$DisplayJobList$2$1$1$4$1$1$1", f = "InterviewsTab.kt", l = {}, m = "invokeSuspend")
public final class el7 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ InterviewJobsDto $job;
    final /* synthetic */ mhg $localUriHandler;
    final /* synthetic */ ude $sharedViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el7(InterviewJobsDto interviewJobsDto, ude udeVar, mhg mhgVar, lu2<? super el7> lu2Var) {
        super(2, lu2Var);
        this.$job = interviewJobsDto;
        this.$sharedViewModel = udeVar;
        this.$localUriHandler = mhgVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new el7(this.$job, this.$sharedViewModel, this.$localUriHandler, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((el7) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        String joinLink = this.$job.getJoinLink();
        if (joinLink != null) {
            this.$localUriHandler.a(joinLink);
        }
        this.$sharedViewModel.m(new ude.c.C0432c());
        return j6g.a;
    }
}
