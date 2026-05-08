package defpackage;

import com.indeed.android.myjobs.data.model.DeleteSavedJobRequest;
import com.indeed.android.myjobs.data.model.InterviewLinkGenerationRequest;
import com.indeed.android.myjobs.data.model.UpdateJobsStatusUsecase;
import com.indeed.android.myjobs.data.model.WithdrawApplicationRequest;
import com.indeed.android.myjobs.data.model.dto.LogEventData;
import com.indeed.android.myjobs.data.model.request.ContactedDeclineRequest;
import com.indeed.android.myjobs.data.model.request.ContactedDeclineSurveyRequest;
import com.indeed.android.myjobs.data.model.request.ContactedInterestedRequest;
import com.indeed.android.myjobs.data.remote.api.AppstatusJobsService;
import com.indeed.android.myjobs.data.remote.api.ButtonRestApiService;
import com.indeed.android.myjobs.data.remote.api.HomepageLoggingService;
import com.indeed.android.myjobs.data.remote.api.InterviewJobsService;
import com.indeed.android.myjobs.data.remote.api.LoggingApiService;
import com.indeed.android.myjobs.data.remote.api.ResumeContactsService;
import defpackage.mk7;

/* JADX INFO: loaded from: classes3.dex */
public final class oz7 extends ypd implements i88 {
    public final AppstatusJobsService j0;
    public final InterviewJobsService k0;
    public final ButtonRestApiService l0;
    public final LoggingApiService m0;
    public final ResumeContactsService n0;
    public final HomepageLoggingService o0;

    public oz7(AppstatusJobsService appstatusJobsService, InterviewJobsService interviewJobsService, ButtonRestApiService buttonRestApiService, LoggingApiService loggingApiService, ResumeContactsService resumeContactsService, HomepageLoggingService homepageLoggingService) {
        super(18);
        this.j0 = appstatusJobsService;
        this.k0 = interviewJobsService;
        this.l0 = buttonRestApiService;
        this.m0 = loggingApiService;
        this.n0 = resumeContactsService;
        this.o0 = homepageLoggingService;
    }

    @Override // defpackage.i88
    public final vi5 b(String str, String str2, String str3, pu2 pu2Var) {
        return ypd.z(new dz7(this, str, str2, str3, null));
    }

    @Override // defpackage.i88
    public final vi5 c(ContactedDeclineRequest contactedDeclineRequest, pu2 pu2Var) {
        return ypd.z(new iz7(this, contactedDeclineRequest, null));
    }

    @Override // defpackage.i88
    public final vi5 e(InterviewLinkGenerationRequest interviewLinkGenerationRequest, mk7.c cVar) {
        return ypd.z(new ez7(this, interviewLinkGenerationRequest, null));
    }

    @Override // defpackage.i88
    public final vi5 f(String str, UpdateJobsStatusUsecase updateJobsStatusUsecase, String str2, String str3, pu2 pu2Var) {
        return ypd.z(new mz7(this, str, updateJobsStatusUsecase, str2, str3, null));
    }

    @Override // defpackage.i88
    public final vi5 h(ContactedInterestedRequest contactedInterestedRequest, pu2 pu2Var) {
        return ypd.z(new kz7(this, contactedInterestedRequest, null));
    }

    @Override // defpackage.i88
    public final vi5 j(long j, String str, String str2, String str3, pu2 pu2Var) {
        return ypd.z(new gz7(this, str, j, str2, str3, null));
    }

    @Override // defpackage.i88
    public final vi5 k(String str, String str2, long j, String str3, String str4, pu2 pu2Var) {
        return ypd.z(new fz7(this, str, str2, j, str3, str4, null));
    }

    @Override // defpackage.i88
    public final vi5 l(String str, DeleteSavedJobRequest deleteSavedJobRequest, String str2, String str3, pu2 pu2Var) {
        return ypd.z(new cz7(this, str, deleteSavedJobRequest, str2, str3, null));
    }

    @Override // defpackage.i88
    public final vi5 m(LogEventData logEventData, pu2 pu2Var) {
        return ypd.z(new lz7(this, logEventData, null));
    }

    @Override // defpackage.i88
    public final vi5 n(ContactedDeclineSurveyRequest contactedDeclineSurveyRequest, pu2 pu2Var) {
        return ypd.z(new jz7(this, contactedDeclineSurveyRequest, null));
    }

    @Override // defpackage.i88
    public final vi5 o(long j, String str, String str2, pu2 pu2Var) {
        return ypd.z(new hz7(this, str, j, str2, null));
    }

    @Override // defpackage.i88
    public final vi5 q(String str, String str2, String str3, String str4, WithdrawApplicationRequest withdrawApplicationRequest, pu2 pu2Var) {
        return ypd.z(new nz7(this, str3, str4, str, str2, withdrawApplicationRequest, null));
    }
}
