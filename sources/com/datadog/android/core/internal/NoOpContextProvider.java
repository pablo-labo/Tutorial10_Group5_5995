package com.datadog.android.core.internal;

import com.datadog.android.DatadogSite;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.DeviceInfo;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.ProcessInfo;
import com.datadog.android.api.context.TimeInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.privacy.TrackingConsent;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.bs4;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/datadog/android/core/internal/NoOpContextProvider;", "Lcom/datadog/android/core/internal/ContextProvider;", "<init>", "()V", "", "feature", "", "", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lj6g;", "setFeatureContext", "(Ljava/lang/String;Ljava/util/Map;)V", "getFeatureContext", "(Ljava/lang/String;)Ljava/util/Map;", "Lcom/datadog/android/api/context/DatadogContext;", "getContext", "()Lcom/datadog/android/api/context/DatadogContext;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpContextProvider implements ContextProvider {
    @Override // com.datadog.android.core.internal.ContextProvider
    public DatadogContext getContext() {
        DatadogSite datadogSite = DatadogSite.US1;
        TimeInfo timeInfo = new TimeInfo(0L, 0L, 0L, 0L);
        ProcessInfo processInfo = new ProcessInfo(true);
        NetworkInfo networkInfo = new NetworkInfo(NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null);
        DeviceInfo deviceInfo = new DeviceInfo("", "", "", DeviceType.OTHER, "", "", "", "", "");
        bs4 bs4Var = bs4.a;
        return new DatadogContext(datadogSite, "", "", "", "", "", "", "", timeInfo, processInfo, networkInfo, deviceInfo, new UserInfo(null, null, null, bs4Var), TrackingConsent.NOT_GRANTED, null, bs4Var);
    }

    @Override // com.datadog.android.core.internal.ContextProvider
    public Map<String, Object> getFeatureContext(String feature) {
        feature.getClass();
        return bs4.a;
    }

    @Override // com.datadog.android.core.internal.ContextProvider
    public void setFeatureContext(String feature, Map<String, ? extends Object> context) {
        feature.getClass();
        context.getClass();
    }
}
