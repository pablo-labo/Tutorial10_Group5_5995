package defpackage;

import com.indeed.android.myjobs.data.model.InterviewLinkGenerationRequest;
import com.indeed.android.myjobs.data.model.InterviewLinkGenerationResponse;
import com.indeed.android.myjobs.data.remote.api.ButtonRestApiService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.data.repository.JobRemoteRepositoryImpl$generateInterviewLink$2", f = "JobRemoteRepositoryImpl.kt", l = {72}, m = "invokeSuspend")
public final class ez7 extends c1f implements Function1<lu2<? super m6d<InterviewLinkGenerationResponse>>, Object> {
    final /* synthetic */ InterviewLinkGenerationRequest $body;
    int label;
    final /* synthetic */ oz7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez7(oz7 oz7Var, InterviewLinkGenerationRequest interviewLinkGenerationRequest, lu2<? super ez7> lu2Var) {
        super(1, lu2Var);
        this.this$0 = oz7Var;
        this.$body = interviewLinkGenerationRequest;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new ez7(this.this$0, this.$body, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<InterviewLinkGenerationResponse>> lu2Var) {
        return ((ez7) create(lu2Var)).invokeSuspend(j6g.a);
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
        ButtonRestApiService buttonRestApiService = this.this$0.l0;
        InterviewLinkGenerationRequest interviewLinkGenerationRequest = this.$body;
        this.label = 1;
        Object objGenerateInterviewLink = buttonRestApiService.generateInterviewLink(interviewLinkGenerationRequest, this);
        g13 g13Var = g13.a;
        return objGenerateInterviewLink == g13Var ? g13Var : objGenerateInterviewLink;
    }
}
