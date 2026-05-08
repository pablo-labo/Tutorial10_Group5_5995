package defpackage;

import com.indeed.android.myjobs.data.model.ApiResponse;
import com.indeed.android.myjobs.data.remote.api.AppstatusJobsService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.data.repository.JobRemoteRepositoryImpl$getAllJobs$2", f = "JobRemoteRepositoryImpl.kt", l = {44}, m = "invokeSuspend")
public final class gz7 extends c1f implements Function1<lu2<? super m6d<ApiResponse>>, Object> {
    final /* synthetic */ long $applyUpdateStartTime;
    final /* synthetic */ String $from;
    final /* synthetic */ String $tk;
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ oz7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz7(oz7 oz7Var, String str, long j, String str2, String str3, lu2<? super gz7> lu2Var) {
        super(1, lu2Var);
        this.this$0 = oz7Var;
        this.$type = str;
        this.$applyUpdateStartTime = j;
        this.$tk = str2;
        this.$from = str3;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new gz7(this.this$0, this.$type, this.$applyUpdateStartTime, this.$tk, this.$from, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<ApiResponse>> lu2Var) {
        return ((gz7) create(lu2Var)).invokeSuspend(j6g.a);
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
        String str2 = this.$tk;
        String str3 = this.$from;
        this.label = 1;
        Object appStatusJobs = appstatusJobsService.getAppStatusJobs(str, j, str2, str3, this);
        g13 g13Var = g13.a;
        return appStatusJobs == g13Var ? g13Var : appStatusJobs;
    }
}
