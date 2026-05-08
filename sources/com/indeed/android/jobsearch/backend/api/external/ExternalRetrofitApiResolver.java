package com.indeed.android.jobsearch.backend.api.external;

import com.indeed.android.jobsearch.backend.tasks.NewJobsCountResponse;
import defpackage.av1;
import defpackage.bw5;
import defpackage.i9c;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J=\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/indeed/android/jobsearch/backend/api/external/ExternalRetrofitApiResolver;", "", "", "language", "keyword", "location", "", "since", "Lav1;", "Lcom/indeed/android/jobsearch/backend/tasks/NewJobsCountResponse;", "getNewJobsCount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lav1;", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ExternalRetrofitApiResolver {
    @bw5("newjobs")
    av1<NewJobsCountResponse> getNewJobsCount(@i9c("hl") String language, @i9c(encoded = true, value = "q") String keyword, @i9c(encoded = true, value = "l") String location, @i9c("since") long since);
}
