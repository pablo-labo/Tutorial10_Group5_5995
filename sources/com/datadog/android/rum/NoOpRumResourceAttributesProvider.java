package com.datadog.android.rum;

import com.datadog.android.rum.internal.RumFeature;
import defpackage.bs4;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/NoOpRumResourceAttributesProvider;", "Lcom/datadog/android/rum/RumResourceAttributesProvider;", "()V", "onProvideAttributes", "", "", "", "request", "Lokhttp3/Request;", "response", "Lokhttp3/Response;", RumFeature.EVENT_THROWABLE_PROPERTY, "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpRumResourceAttributesProvider implements RumResourceAttributesProvider {
    @Override // com.datadog.android.rum.RumResourceAttributesProvider
    public Map<String, Object> onProvideAttributes(Request request, Response response, Throwable throwable) {
        request.getClass();
        return bs4.a;
    }
}
