package com.datadog.android.okhttp.trace;

import com.datadog.android.rum.internal.RumFeature;
import defpackage.doe;
import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/okhttp/trace/TracedRequestListener;", "", "Lokhttp3/Request;", "request", "Ldoe;", "span", "Lokhttp3/Response;", "response", "", RumFeature.EVENT_THROWABLE_PROPERTY, "Lj6g;", "onRequestIntercepted", "(Lokhttp3/Request;Ldoe;Lokhttp3/Response;Ljava/lang/Throwable;)V", "dd-sdk-android-okhttp_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface TracedRequestListener {
    void onRequestIntercepted(Request request, doe span, Response response, Throwable throwable);
}
