package com.datadog.android.rum;

import com.datadog.android.rum.internal.RumFeature;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bg\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\u000b"}, d2 = {"Lcom/datadog/android/rum/RumResourceAttributesProvider;", "", "onProvideAttributes", "", "", "request", "Lokhttp3/Request;", "response", "Lokhttp3/Response;", RumFeature.EVENT_THROWABLE_PROPERTY, "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface RumResourceAttributesProvider {
    Map<String, Object> onProvideAttributes(Request request, Response response, Throwable throwable);
}
