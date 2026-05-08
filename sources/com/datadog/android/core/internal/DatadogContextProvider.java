package com.datadog.android.core.internal;

import com.datadog.android.DatadogSite;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.DeviceInfo;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.ProcessInfo;
import com.datadog.android.api.context.TimeInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.core.internal.system.AndroidInfoProvider;
import com.datadog.android.core.internal.time.TimeProvider;
import com.datadog.android.privacy.TrackingConsent;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.bs4;
import defpackage.lc9;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/datadog/android/core/internal/DatadogContextProvider;", "Lcom/datadog/android/core/internal/ContextProvider;", "Lcom/datadog/android/core/internal/CoreFeature;", "coreFeature", "<init>", "(Lcom/datadog/android/core/internal/CoreFeature;)V", "", "feature", "", "", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lj6g;", "setFeatureContext", "(Ljava/lang/String;Ljava/util/Map;)V", "getFeatureContext", "(Ljava/lang/String;)Ljava/util/Map;", "Lcom/datadog/android/core/internal/CoreFeature;", "getCoreFeature", "()Lcom/datadog/android/core/internal/CoreFeature;", "Lcom/datadog/android/api/context/DatadogContext;", "getContext", "()Lcom/datadog/android/api/context/DatadogContext;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DatadogContextProvider implements ContextProvider {
    private final CoreFeature coreFeature;

    public DatadogContextProvider(CoreFeature coreFeature) {
        coreFeature.getClass();
        this.coreFeature = coreFeature;
    }

    @Override // com.datadog.android.core.internal.ContextProvider
    public DatadogContext getContext() {
        DatadogSite site = this.coreFeature.getSite();
        String clientToken = this.coreFeature.getClientToken();
        String serviceName = this.coreFeature.getServiceName();
        String envName = this.coreFeature.getEnvName();
        String version = this.coreFeature.getPackageVersionProvider().getVersion();
        String variant = this.coreFeature.getVariant();
        String sdkVersion = this.coreFeature.getSdkVersion();
        String sourceName = this.coreFeature.getSourceName();
        TimeProvider timeProvider = this.coreFeature.getTimeProvider();
        long deviceTimestamp = timeProvider.getDeviceTimestamp();
        long serverTimestamp = timeProvider.getServerTimestamp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long nanos = timeUnit.toNanos(deviceTimestamp);
        long nanos2 = timeUnit.toNanos(serverTimestamp);
        long j = serverTimestamp - deviceTimestamp;
        TimeInfo timeInfo = new TimeInfo(nanos, nanos2, timeUnit.toNanos(j), j);
        ProcessInfo processInfo = new ProcessInfo(this.coreFeature.getIsMainProcess());
        NetworkInfo networkInfo = this.coreFeature.getNetworkInfoProvider().getLastNetworkInfo();
        AndroidInfoProvider androidInfoProvider$dd_sdk_android_core_release = this.coreFeature.getAndroidInfoProvider$dd_sdk_android_core_release();
        String deviceName = androidInfoProvider$dd_sdk_android_core_release.getDeviceName();
        String deviceBrand = androidInfoProvider$dd_sdk_android_core_release.getDeviceBrand();
        DeviceType deviceType = androidInfoProvider$dd_sdk_android_core_release.getDeviceType();
        DeviceInfo deviceInfo = new DeviceInfo(deviceName, deviceBrand, androidInfoProvider$dd_sdk_android_core_release.getDeviceModel(), deviceType, androidInfoProvider$dd_sdk_android_core_release.getDeviceBuildId(), androidInfoProvider$dd_sdk_android_core_release.getOsName(), androidInfoProvider$dd_sdk_android_core_release.getOsMajorVersion(), androidInfoProvider$dd_sdk_android_core_release.getOsVersion(), androidInfoProvider$dd_sdk_android_core_release.getArchitecture());
        UserInfo internalUserInfo = this.coreFeature.getUserInfoProvider().getInternalUserInfo();
        TrackingConsent consent = this.coreFeature.getTrackingConsentProvider().getConsent();
        String appBuildId = this.coreFeature.getAppBuildId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Iterator<Map.Entry<String, Map<String, Object>>> it = this.coreFeature.getFeaturesContext$dd_sdk_android_core_release().entrySet().iterator(); it.hasNext(); it = it) {
            Map.Entry<String, Map<String, Object>> next = it.next();
            linkedHashMap.put(next.getKey(), lc9.g0(next.getValue()));
        }
        return new DatadogContext(site, clientToken, serviceName, envName, version, variant, sourceName, sdkVersion, timeInfo, processInfo, networkInfo, deviceInfo, internalUserInfo, consent, appBuildId, linkedHashMap);
    }

    public final CoreFeature getCoreFeature() {
        return this.coreFeature;
    }

    @Override // com.datadog.android.core.internal.ContextProvider
    public Map<String, Object> getFeatureContext(String feature) {
        feature.getClass();
        Map<String, Object> map = this.coreFeature.getFeaturesContext$dd_sdk_android_core_release().get(feature);
        return map == null ? bs4.a : map;
    }

    @Override // com.datadog.android.core.internal.ContextProvider
    public void setFeatureContext(String feature, Map<String, ? extends Object> context) {
        feature.getClass();
        context.getClass();
        this.coreFeature.getFeaturesContext$dd_sdk_android_core_release().put(feature, context);
    }
}
