package com.indeed.android.myjobs.data.remote.api;

import com.indeed.android.myjobs.data.model.Response;
import defpackage.bw5;
import defpackage.i9c;
import defpackage.lu2;
import defpackage.m6d;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JH\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/indeed/android/myjobs/data/remote/api/InterviewJobsService;", "", "", "statuses", "formats", "", "start", "tk", "from", "Lm6d;", "Lcom/indeed/android/myjobs/data/model/Response;", "getInterviewJobs", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InterviewJobsService {
    @bw5("api/v1/interviews")
    Object getInterviewJobs(@i9c("statuses") String str, @i9c("formats") String str2, @i9c("start") long j, @i9c("tk") String str3, @i9c("from") String str4, lu2<? super m6d<Response>> lu2Var);
}
