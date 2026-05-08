package com.indeed.android.myjobs.data.remote.api;

import com.indeed.android.myjobs.data.model.HomepageLoggingResponse;
import com.indeed.android.myjobs.data.model.request.HomepageLoggingRequest;
import defpackage.bya;
import defpackage.fi1;
import defpackage.lu2;
import defpackage.m6d;
import defpackage.xg6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/indeed/android/myjobs/data/remote/api/HomepageLoggingService;", "", "Lcom/indeed/android/myjobs/data/model/request/HomepageLoggingRequest;", "request", "Lm6d;", "Lcom/indeed/android/myjobs/data/model/HomepageLoggingResponse;", "logHomepage", "(Lcom/indeed/android/myjobs/data/model/request/HomepageLoggingRequest;Llu2;)Ljava/lang/Object;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface HomepageLoggingService {
    @bya("/rpc/log/android/homepage")
    @xg6({"Content-Type: application/json"})
    Object logHomepage(@fi1 HomepageLoggingRequest homepageLoggingRequest, lu2<? super m6d<HomepageLoggingResponse>> lu2Var);
}
