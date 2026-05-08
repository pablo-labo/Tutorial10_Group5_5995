package com.indeed.android.myjobs.data.remote.api;

import com.indeed.android.myjobs.data.model.ApiResponse;
import com.indeed.android.myjobs.data.model.DeleteSavedJobRequest;
import com.indeed.android.myjobs.data.model.Response;
import com.indeed.android.myjobs.data.model.UpdateJobsStatusUsecase;
import com.indeed.android.myjobs.data.model.WithdrawApplicationRequest;
import defpackage.bw5;
import defpackage.fi1;
import defpackage.i9c;
import defpackage.lu2;
import defpackage.m6d;
import defpackage.re6;
import defpackage.wxa;
import defpackage.x5b;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015JH\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/indeed/android/myjobs/data/remote/api/AppstatusJobsService;", "", "", "type", "", "applyUpdateStartTime", "tk", "from", "Lm6d;", "Lcom/indeed/android/myjobs/data/model/ApiResponse;", "getAppStatusJobs", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "jobKey", "Lcom/indeed/android/myjobs/data/model/UpdateJobsStatusUsecase;", "body", "Lcom/indeed/android/myjobs/data/model/Response;", "updateSavedJob", "(Ljava/lang/String;Lcom/indeed/android/myjobs/data/model/UpdateJobsStatusUsecase;Ljava/lang/String;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "Lcom/indeed/android/myjobs/data/model/DeleteSavedJobRequest;", "params", "deleteSavedJob", "(Ljava/lang/String;Lcom/indeed/android/myjobs/data/model/DeleteSavedJobRequest;Ljava/lang/String;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "encryptedAdvCandId", "Lcom/indeed/android/myjobs/data/model/WithdrawApplicationRequest;", "withdrawApplication", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/indeed/android/myjobs/data/model/WithdrawApplicationRequest;Llu2;)Ljava/lang/Object;", "applyStarts", "getVisitedJobs", "(Ljava/lang/String;JLjava/lang/String;Llu2;)Ljava/lang/Object;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AppstatusJobsService {
    @re6(hasBody = true, method = "DELETE", path = "/api/v1/savedJobs/{jobKey}")
    Object deleteSavedJob(@x5b("jobKey") String str, @fi1 DeleteSavedJobRequest deleteSavedJobRequest, @i9c("tk") String str2, @i9c("from") String str3, lu2<? super m6d<Response>> lu2Var);

    @bw5("api/v1/appStatusJobs")
    Object getAppStatusJobs(@i9c("type") String str, @i9c("applyUpdateStartTime") long j, @i9c("tk") String str2, @i9c("from") String str3, lu2<? super m6d<ApiResponse>> lu2Var);

    @bw5("api/v1/appStatusJobs")
    Object getVisitedJobs(@i9c("type") String str, @i9c("applyUpdateStartTime") long j, @i9c("applyStarts") String str2, lu2<? super m6d<ApiResponse>> lu2Var);

    @wxa("/api/v1/savedJobs/{jobKey}")
    Object updateSavedJob(@x5b("jobKey") String str, @fi1 UpdateJobsStatusUsecase updateJobsStatusUsecase, @i9c("tk") String str2, @i9c("from") String str3, lu2<? super m6d<Response>> lu2Var);

    @re6(hasBody = true, method = "PATCH", path = "/api/v1/savedJobs/{jobKey}/candidate/{encryptedAdvCandId}")
    Object withdrawApplication(@x5b("jobKey") String str, @x5b("encryptedAdvCandId") String str2, @i9c("tk") String str3, @i9c("from") String str4, @fi1 WithdrawApplicationRequest withdrawApplicationRequest, lu2<? super m6d<Response>> lu2Var);
}
