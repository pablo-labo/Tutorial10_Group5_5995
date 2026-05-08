package defpackage;

import com.indeed.android.myjobs.data.model.Response;
import com.indeed.android.myjobs.data.remote.api.InterviewJobsService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.data.repository.JobRemoteRepositoryImpl$getAllInterviewJobs$2", f = "JobRemoteRepositoryImpl.kt", l = {53}, m = "invokeSuspend")
public final class fz7 extends c1f implements Function1<lu2<? super m6d<Response>>, Object> {
    final /* synthetic */ String $formats;
    final /* synthetic */ String $from;
    final /* synthetic */ long $start;
    final /* synthetic */ String $statuses;
    final /* synthetic */ String $tk;
    int label;
    final /* synthetic */ oz7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz7(oz7 oz7Var, String str, String str2, long j, String str3, String str4, lu2<? super fz7> lu2Var) {
        super(1, lu2Var);
        this.this$0 = oz7Var;
        this.$statuses = str;
        this.$formats = str2;
        this.$start = j;
        this.$tk = str3;
        this.$from = str4;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new fz7(this.this$0, this.$statuses, this.$formats, this.$start, this.$tk, this.$from, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<Response>> lu2Var) {
        return ((fz7) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        InterviewJobsService interviewJobsService = this.this$0.k0;
        String str = this.$statuses;
        String str2 = this.$formats;
        long j = this.$start;
        String str3 = this.$tk;
        String str4 = this.$from;
        this.label = 1;
        Object interviewJobs = interviewJobsService.getInterviewJobs(str, str2, j, str3, str4, this);
        g13 g13Var = g13.a;
        return interviewJobs == g13Var ? g13Var : interviewJobs;
    }
}
