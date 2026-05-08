package com.indeed.android.myjobs.data.remote.api;

import defpackage.bya;
import defpackage.g2a;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.m6d;
import defpackage.r4b;
import kotlin.Metadata;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JR\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/indeed/android/myjobs/data/remote/api/LoggingApiService;", "", "Lokhttp3/RequestBody;", "tk", "logType", "application", "moduleName", "ts", "data", "Lm6d;", "Lj6g;", "logEvent", "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Llu2;)Ljava/lang/Object;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoggingApiService {
    @bya("/rpc/log")
    @g2a
    Object logEvent(@r4b("tk") RequestBody requestBody, @r4b("logType") RequestBody requestBody2, @r4b("application") RequestBody requestBody3, @r4b("moduleName") RequestBody requestBody4, @r4b("ts") RequestBody requestBody5, @r4b("data") RequestBody requestBody6, lu2<? super m6d<j6g>> lu2Var);
}
