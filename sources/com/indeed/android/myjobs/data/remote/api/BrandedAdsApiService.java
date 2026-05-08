package com.indeed.android.myjobs.data.remote.api;

import com.indeed.android.myjobs.data.model.BrandedAdsApiResponse;
import defpackage.bw5;
import defpackage.i9c;
import defpackage.lu2;
import defpackage.m6d;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/indeed/android/myjobs/data/remote/api/BrandedAdsApiService;", "", "", "flowPage", "flowType", "Lm6d;", "Lcom/indeed/android/myjobs/data/model/BrandedAdsApiResponse;", "getBrandedAds", "(Ljava/lang/String;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BrandedAdsApiService {
    @bw5("/ita/v1/publisher")
    Object getBrandedAds(@i9c("flowPage") String str, @i9c("flowType") String str2, lu2<? super m6d<BrandedAdsApiResponse>> lu2Var);
}
