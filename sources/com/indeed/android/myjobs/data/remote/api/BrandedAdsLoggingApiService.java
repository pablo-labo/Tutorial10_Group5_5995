package com.indeed.android.myjobs.data.remote.api;

import defpackage.bya;
import defpackage.i9c;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.m6d;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jh\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/indeed/android/myjobs/data/remote/api/BrandedAdsLoggingApiService;", "", "", "flowPage", "flowType", "logType", "creativeKey", "mobtk", "fccKey", "logLabel", "reason", "Lm6d;", "Lj6g;", "logBrandedAds", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BrandedAdsLoggingApiService {
    @bya("/ita/v1/logs/brandedAd")
    Object logBrandedAds(@i9c("flowPage") String str, @i9c("flowType") String str2, @i9c("logtype") String str3, @i9c("creativeKey") String str4, @i9c("mobtk") String str5, @i9c("fccKey") String str6, @i9c("logLabel") String str7, @i9c("reason") String str8, lu2<? super m6d<j6g>> lu2Var);
}
