package defpackage;

import com.indeed.android.myjobs.data.model.DeleteSavedJobRequest;
import com.indeed.android.myjobs.data.model.InterviewLinkGenerationRequest;
import com.indeed.android.myjobs.data.model.UpdateJobsStatusUsecase;
import com.indeed.android.myjobs.data.model.WithdrawApplicationRequest;
import com.indeed.android.myjobs.data.model.dto.LogEventData;
import com.indeed.android.myjobs.data.model.request.ContactedDeclineRequest;
import com.indeed.android.myjobs.data.model.request.ContactedDeclineSurveyRequest;
import com.indeed.android.myjobs.data.model.request.ContactedInterestedRequest;
import defpackage.mk7;

/* JADX INFO: loaded from: classes3.dex */
public interface i88 {
    vi5 b(String str, String str2, String str3, pu2 pu2Var);

    vi5 c(ContactedDeclineRequest contactedDeclineRequest, pu2 pu2Var);

    vi5 e(InterviewLinkGenerationRequest interviewLinkGenerationRequest, mk7.c cVar);

    vi5 f(String str, UpdateJobsStatusUsecase updateJobsStatusUsecase, String str2, String str3, pu2 pu2Var);

    vi5 h(ContactedInterestedRequest contactedInterestedRequest, pu2 pu2Var);

    vi5 j(long j, String str, String str2, String str3, pu2 pu2Var);

    vi5 k(String str, String str2, long j, String str3, String str4, pu2 pu2Var);

    vi5 l(String str, DeleteSavedJobRequest deleteSavedJobRequest, String str2, String str3, pu2 pu2Var);

    vi5 m(LogEventData logEventData, pu2 pu2Var);

    vi5 n(ContactedDeclineSurveyRequest contactedDeclineSurveyRequest, pu2 pu2Var);

    vi5 o(long j, String str, String str2, pu2 pu2Var);

    vi5 q(String str, String str2, String str3, String str4, WithdrawApplicationRequest withdrawApplicationRequest, pu2 pu2Var);
}
