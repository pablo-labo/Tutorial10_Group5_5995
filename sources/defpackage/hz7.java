package defpackage;

import com.indeed.android.myjobs.data.model.ApiResponse;
import com.indeed.android.myjobs.data.remote.api.AppstatusJobsService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.data.repository.JobRemoteRepositoryImpl$getVisitedJobs$2", f = "JobRemoteRepositoryImpl.kt", l = {89}, m = "invokeSuspend")
public final class hz7 extends c1f implements Function1<lu2<? super m6d<ApiResponse>>, Object> {
    final /* synthetic */ String $applyStarts;
    final /* synthetic */ long $applyUpdateStartTime;
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ oz7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz7(oz7 oz7Var, String str, long j, String str2, lu2<? super hz7> lu2Var) {
        super(1, lu2Var);
        this.this$0 = oz7Var;
        this.$type = str;
        this.$applyUpdateStartTime = j;
        this.$applyStarts = str2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new hz7(this.this$0, this.$type, this.$applyUpdateStartTime, this.$applyStarts, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<ApiResponse>> lu2Var) {
        return ((hz7) create(lu2Var)).invokeSuspend(j6g.a);
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
        AppstatusJobsService appstatusJobsService = this.this$0.j0;
        String str = this.$type;
        long j = this.$applyUpdateStartTime;
        String str2 = this.$applyStarts;
        this.label = 1;
        Object visitedJobs = appstatusJobsService.getVisitedJobs(str, j, str2, this);
        g13 g13Var = g13.a;
        return visitedJobs == g13Var ? g13Var : visitedJobs;
    }
}
