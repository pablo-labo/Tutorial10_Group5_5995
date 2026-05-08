package com.facebook.imagepipeline.backends.okhttp3;

import kotlin.Metadata;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcherException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "responseCode", "Ljava/lang/Integer;", "getResponseCode", "()Ljava/lang/Integer;", "Lokhttp3/Headers;", "responseHeaders", "Lokhttp3/Headers;", "getResponseHeaders", "()Lokhttp3/Headers;", "imagepipeline-okhttp3_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OkHttpNetworkFetcherException extends Exception {
    private final Integer responseCode;
    private final Headers responseHeaders;

    public OkHttpNetworkFetcherException(Integer num, Headers headers) {
        this.responseCode = num;
        this.responseHeaders = headers;
    }
}
