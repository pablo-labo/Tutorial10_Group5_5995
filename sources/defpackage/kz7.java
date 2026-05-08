package defpackage;

import com.indeed.android.myjobs.data.model.ServiceResultResponse;
import com.indeed.android.myjobs.data.model.request.ContactedInterestedRequest;
import com.indeed.android.myjobs.data.remote.api.ResumeContactsService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.data.repository.JobRemoteRepositoryImpl$postContactedInterested$2", f = "JobRemoteRepositoryImpl.kt", l = {105}, m = "invokeSuspend")
public final class kz7 extends c1f implements Function1<lu2<? super m6d<ServiceResultResponse>>, Object> {
    final /* synthetic */ ContactedInterestedRequest $body;
    int label;
    final /* synthetic */ oz7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz7(oz7 oz7Var, ContactedInterestedRequest contactedInterestedRequest, lu2<? super kz7> lu2Var) {
        super(1, lu2Var);
        this.this$0 = oz7Var;
        this.$body = contactedInterestedRequest;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new kz7(this.this$0, this.$body, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<ServiceResultResponse>> lu2Var) {
        return ((kz7) create(lu2Var)).invokeSuspend(j6g.a);
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
        ResumeContactsService resumeContactsService = this.this$0.n0;
        ContactedInterestedRequest contactedInterestedRequest = this.$body;
        String str = ie7.X;
        this.label = 1;
        Object objPostInterested = resumeContactsService.postInterested(contactedInterestedRequest, str, this);
        g13 g13Var = g13.a;
        return objPostInterested == g13Var ? g13Var : objPostInterested;
    }
}
