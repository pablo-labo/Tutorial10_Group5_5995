package com.datadog.android.okhttp.internal.utils;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"identifyRequest", "", "request", "Lokhttp3/Request;", "dd-sdk-android-okhttp_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class IdentifyRequestKt {
    public static final String identifyRequest(Request request) {
        long jContentLength;
        request.getClass();
        String str = request.b;
        HttpUrl httpUrl = request.a;
        RequestBody requestBody = request.d;
        if (requestBody == null) {
            return str + "•" + httpUrl;
        }
        try {
            jContentLength = requestBody.contentLength();
        } catch (IOException unused) {
            jContentLength = 0;
        }
        MediaType c = requestBody.getC();
        if (c == null && jContentLength == 0) {
            return str + "•" + httpUrl;
        }
        return str + "•" + httpUrl + "•" + jContentLength + "•" + c;
    }
}
