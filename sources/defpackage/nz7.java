package defpackage;

import com.indeed.android.myjobs.data.model.Response;
import com.indeed.android.myjobs.data.model.WithdrawApplicationRequest;
import com.indeed.android.myjobs.data.remote.api.AppstatusJobsService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.data.repository.JobRemoteRepositoryImpl$withdrawApplication$2", f = "JobRemoteRepositoryImpl.kt", l = {81}, m = "invokeSuspend")
public final class nz7 extends c1f implements Function1<lu2<? super m6d<Response>>, Object> {
    final /* synthetic */ WithdrawApplicationRequest $body;
    final /* synthetic */ String $encryptedAdvCandId;
    final /* synthetic */ String $from;
    final /* synthetic */ String $jobKey;
    final /* synthetic */ String $tk;
    int label;
    final /* synthetic */ oz7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz7(oz7 oz7Var, String str, String str2, String str3, String str4, WithdrawApplicationRequest withdrawApplicationRequest, lu2<? super nz7> lu2Var) {
        super(1, lu2Var);
        this.this$0 = oz7Var;
        this.$jobKey = str;
        this.$encryptedAdvCandId = str2;
        this.$tk = str3;
        this.$from = str4;
        this.$body = withdrawApplicationRequest;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new nz7(this.this$0, this.$jobKey, this.$encryptedAdvCandId, this.$tk, this.$from, this.$body, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<Response>> lu2Var) {
        return ((nz7) create(lu2Var)).invokeSuspend(j6g.a);
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
        String str = this.$jobKey;
        String str2 = this.$encryptedAdvCandId;
        String str3 = this.$tk;
        String str4 = this.$from;
        WithdrawApplicationRequest withdrawApplicationRequest = this.$body;
        this.label = 1;
        Object objWithdrawApplication = appstatusJobsService.withdrawApplication(str, str2, str3, str4, withdrawApplicationRequest, this);
        g13 g13Var = g13.a;
        return objWithdrawApplication == g13Var ? g13Var : objWithdrawApplication;
    }
}
