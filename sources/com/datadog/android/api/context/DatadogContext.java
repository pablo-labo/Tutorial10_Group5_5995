package com.datadog.android.api.context;

import com.datadog.android.DatadogSite;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.akb;
import defpackage.ia;
import defpackage.wl7;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012 \u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a0\u001a¢\u0006\u0002\u0010\u001bJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u000fHÆ\u0003J\t\u00107\u001a\u00020\u0011HÆ\u0003J\t\u00108\u001a\u00020\u0013HÆ\u0003J\t\u00109\u001a\u00020\u0015HÆ\u0003J\t\u0010:\u001a\u00020\u0017HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J#\u0010<\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a0\u001aHÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\rHÆ\u0003JÅ\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\"\b\u0002\u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a0\u001aHÆ\u0001J\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020JHÖ\u0001J\t\u0010K\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR+\u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001d¨\u0006L"}, d2 = {"Lcom/datadog/android/api/context/DatadogContext;", "", "site", "Lcom/datadog/android/DatadogSite;", "clientToken", "", "service", "env", "version", "variant", "source", "sdkVersion", "time", "Lcom/datadog/android/api/context/TimeInfo;", "processInfo", "Lcom/datadog/android/api/context/ProcessInfo;", "networkInfo", "Lcom/datadog/android/api/context/NetworkInfo;", "deviceInfo", "Lcom/datadog/android/api/context/DeviceInfo;", "userInfo", "Lcom/datadog/android/api/context/UserInfo;", "trackingConsent", "Lcom/datadog/android/privacy/TrackingConsent;", "appBuildId", "featuresContext", "", "(Lcom/datadog/android/DatadogSite;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/api/context/TimeInfo;Lcom/datadog/android/api/context/ProcessInfo;Lcom/datadog/android/api/context/NetworkInfo;Lcom/datadog/android/api/context/DeviceInfo;Lcom/datadog/android/api/context/UserInfo;Lcom/datadog/android/privacy/TrackingConsent;Ljava/lang/String;Ljava/util/Map;)V", "getAppBuildId", "()Ljava/lang/String;", "getClientToken", "getDeviceInfo", "()Lcom/datadog/android/api/context/DeviceInfo;", "getEnv", "getFeaturesContext", "()Ljava/util/Map;", "getNetworkInfo", "()Lcom/datadog/android/api/context/NetworkInfo;", "getProcessInfo", "()Lcom/datadog/android/api/context/ProcessInfo;", "getSdkVersion", "getService", "getSite", "()Lcom/datadog/android/DatadogSite;", "getSource", "getTime", "()Lcom/datadog/android/api/context/TimeInfo;", "getTrackingConsent", "()Lcom/datadog/android/privacy/TrackingConsent;", "getUserInfo", "()Lcom/datadog/android/api/context/UserInfo;", "getVariant", "getVersion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class DatadogContext {
    private final String appBuildId;
    private final String clientToken;
    private final DeviceInfo deviceInfo;
    private final String env;
    private final Map<String, Map<String, Object>> featuresContext;
    private final NetworkInfo networkInfo;
    private final ProcessInfo processInfo;
    private final String sdkVersion;
    private final String service;
    private final DatadogSite site;
    private final String source;
    private final TimeInfo time;
    private final TrackingConsent trackingConsent;
    private final UserInfo userInfo;
    private final String variant;
    private final String version;

    /* JADX WARN: Multi-variable type inference failed */
    public DatadogContext(DatadogSite datadogSite, String str, String str2, String str3, String str4, String str5, String str6, String str7, TimeInfo timeInfo, ProcessInfo processInfo, NetworkInfo networkInfo, DeviceInfo deviceInfo, UserInfo userInfo, TrackingConsent trackingConsent, String str8, Map<String, ? extends Map<String, ? extends Object>> map) {
        datadogSite.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        timeInfo.getClass();
        processInfo.getClass();
        networkInfo.getClass();
        deviceInfo.getClass();
        userInfo.getClass();
        trackingConsent.getClass();
        map.getClass();
        this.site = datadogSite;
        this.clientToken = str;
        this.service = str2;
        this.env = str3;
        this.version = str4;
        this.variant = str5;
        this.source = str6;
        this.sdkVersion = str7;
        this.time = timeInfo;
        this.processInfo = processInfo;
        this.networkInfo = networkInfo;
        this.deviceInfo = deviceInfo;
        this.userInfo = userInfo;
        this.trackingConsent = trackingConsent;
        this.appBuildId = str8;
        this.featuresContext = map;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DatadogSite getSite() {
        return this.site;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ProcessInfo getProcessInfo() {
        return this.processInfo;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final NetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final TrackingConsent getTrackingConsent() {
        return this.trackingConsent;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getAppBuildId() {
        return this.appBuildId;
    }

    public final Map<String, Map<String, Object>> component16() {
        return this.featuresContext;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientToken() {
        return this.clientToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getService() {
        return this.service;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEnv() {
        return this.env;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVariant() {
        return this.variant;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TimeInfo getTime() {
        return this.time;
    }

    public final DatadogContext copy(DatadogSite site, String clientToken, String service, String env, String version, String variant, String source, String sdkVersion, TimeInfo time, ProcessInfo processInfo, NetworkInfo networkInfo, DeviceInfo deviceInfo, UserInfo userInfo, TrackingConsent trackingConsent, String appBuildId, Map<String, ? extends Map<String, ? extends Object>> featuresContext) {
        site.getClass();
        clientToken.getClass();
        service.getClass();
        env.getClass();
        version.getClass();
        variant.getClass();
        source.getClass();
        sdkVersion.getClass();
        time.getClass();
        processInfo.getClass();
        networkInfo.getClass();
        deviceInfo.getClass();
        userInfo.getClass();
        trackingConsent.getClass();
        featuresContext.getClass();
        return new DatadogContext(site, clientToken, service, env, version, variant, source, sdkVersion, time, processInfo, networkInfo, deviceInfo, userInfo, trackingConsent, appBuildId, featuresContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DatadogContext)) {
            return false;
        }
        DatadogContext datadogContext = (DatadogContext) other;
        return this.site == datadogContext.site && wl7.b(this.clientToken, datadogContext.clientToken) && wl7.b(this.service, datadogContext.service) && wl7.b(this.env, datadogContext.env) && wl7.b(this.version, datadogContext.version) && wl7.b(this.variant, datadogContext.variant) && wl7.b(this.source, datadogContext.source) && wl7.b(this.sdkVersion, datadogContext.sdkVersion) && wl7.b(this.time, datadogContext.time) && wl7.b(this.processInfo, datadogContext.processInfo) && wl7.b(this.networkInfo, datadogContext.networkInfo) && wl7.b(this.deviceInfo, datadogContext.deviceInfo) && wl7.b(this.userInfo, datadogContext.userInfo) && this.trackingConsent == datadogContext.trackingConsent && wl7.b(this.appBuildId, datadogContext.appBuildId) && wl7.b(this.featuresContext, datadogContext.featuresContext);
    }

    public final String getAppBuildId() {
        return this.appBuildId;
    }

    public final String getClientToken() {
        return this.clientToken;
    }

    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final String getEnv() {
        return this.env;
    }

    public final Map<String, Map<String, Object>> getFeaturesContext() {
        return this.featuresContext;
    }

    public final NetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    public final ProcessInfo getProcessInfo() {
        return this.processInfo;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getService() {
        return this.service;
    }

    public final DatadogSite getSite() {
        return this.site;
    }

    public final String getSource() {
        return this.source;
    }

    public final TimeInfo getTime() {
        return this.time;
    }

    public final TrackingConsent getTrackingConsent() {
        return this.trackingConsent;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public final String getVariant() {
        return this.variant;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = (this.trackingConsent.hashCode() + ((this.userInfo.hashCode() + ((this.deviceInfo.hashCode() + ((this.networkInfo.hashCode() + ((this.processInfo.hashCode() + ((this.time.hashCode() + akb.d(akb.d(akb.d(akb.d(akb.d(akb.d(akb.d(this.site.hashCode() * 31, 31, this.clientToken), 31, this.service), 31, this.env), 31, this.version), 31, this.variant), 31, this.source), 31, this.sdkVersion)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.appBuildId;
        return this.featuresContext.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        DatadogSite datadogSite = this.site;
        String str = this.clientToken;
        String str2 = this.service;
        String str3 = this.env;
        String str4 = this.version;
        String str5 = this.variant;
        String str6 = this.source;
        String str7 = this.sdkVersion;
        TimeInfo timeInfo = this.time;
        ProcessInfo processInfo = this.processInfo;
        NetworkInfo networkInfo = this.networkInfo;
        DeviceInfo deviceInfo = this.deviceInfo;
        UserInfo userInfo = this.userInfo;
        TrackingConsent trackingConsent = this.trackingConsent;
        String str8 = this.appBuildId;
        Map<String, Map<String, Object>> map = this.featuresContext;
        StringBuilder sb = new StringBuilder("DatadogContext(site=");
        sb.append(datadogSite);
        sb.append(", clientToken=");
        sb.append(str);
        sb.append(", service=");
        ia.r(sb, str2, ", env=", str3, ", version=");
        ia.r(sb, str4, ", variant=", str5, ", source=");
        ia.r(sb, str6, ", sdkVersion=", str7, ", time=");
        sb.append(timeInfo);
        sb.append(", processInfo=");
        sb.append(processInfo);
        sb.append(", networkInfo=");
        sb.append(networkInfo);
        sb.append(", deviceInfo=");
        sb.append(deviceInfo);
        sb.append(", userInfo=");
        sb.append(userInfo);
        sb.append(", trackingConsent=");
        sb.append(trackingConsent);
        sb.append(", appBuildId=");
        sb.append(str8);
        sb.append(", featuresContext=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }
}
