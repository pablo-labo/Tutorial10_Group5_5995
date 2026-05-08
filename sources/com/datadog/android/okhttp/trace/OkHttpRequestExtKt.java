package com.datadog.android.okhttp.trace;

import defpackage.doe;
import kotlin.Metadata;
import okhttp3.Request;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/Request$Builder;", "Ldoe;", "span", "parentSpan", "(Lokhttp3/Request$Builder;Ldoe;)Lokhttp3/Request$Builder;", "dd-sdk-android-okhttp_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class OkHttpRequestExtKt {
    public static final Request.Builder parentSpan(Request.Builder builder, doe doeVar) {
        builder.getClass();
        doeVar.getClass();
        builder.f(doe.class, doeVar);
        return builder;
    }
}
