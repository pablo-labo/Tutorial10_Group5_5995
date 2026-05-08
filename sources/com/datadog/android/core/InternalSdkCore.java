package com.datadog.android.core;

import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver;
import com.datadog.android.lint.InternalApi;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.ab8;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H'¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00178&X§\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\b\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001c8&X§\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\b\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010%\u001a\u0004\u0018\u00010!8&X§\u0004¢\u0006\f\u0012\u0004\b$\u0010\b\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\u00020&8&X§\u0004¢\u0006\f\u0012\u0004\b)\u0010\b\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001c\u00102\u001a\u0004\u0018\u00010.8gX§\u0004¢\u0006\f\u0012\u0004\b1\u0010\b\u001a\u0004\b/\u00100R\u001c\u00106\u001a\u0004\u0018\u00010\t8gX§\u0004¢\u0006\f\u0012\u0004\b5\u0010\b\u001a\u0004\b3\u00104R\u001a\u0010:\u001a\u00020\t8&X§\u0004¢\u0006\f\u0012\u0004\b9\u0010\b\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/datadog/android/core/InternalSdkCore;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "", "data", "Lj6g;", "writeLastViewEvent", "([B)V", "deleteLastViewEvent", "()V", "", "anrTimestamp", "writeLastFatalAnrSent", "(J)V", "Ljava/util/concurrent/ExecutorService;", "getPersistenceExecutorService", "()Ljava/util/concurrent/ExecutorService;", "", "Lcom/datadog/android/api/feature/FeatureScope;", "getAllFeatures", "()Ljava/util/List;", "Lcom/datadog/android/api/context/DatadogContext;", "getDatadogContext", "()Lcom/datadog/android/api/context/DatadogContext;", "Lcom/datadog/android/api/context/NetworkInfo;", "getNetworkInfo", "()Lcom/datadog/android/api/context/NetworkInfo;", "getNetworkInfo$annotations", "networkInfo", "Lcom/datadog/android/privacy/TrackingConsent;", "getTrackingConsent", "()Lcom/datadog/android/privacy/TrackingConsent;", "getTrackingConsent$annotations", "trackingConsent", "Ljava/io/File;", "getRootStorageDir", "()Ljava/io/File;", "getRootStorageDir$annotations", "rootStorageDir", "", "isDeveloperModeEnabled", "()Z", "isDeveloperModeEnabled$annotations", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getFirstPartyHostResolver", "()Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostResolver", "Lab8;", "getLastViewEvent", "()Lab8;", "getLastViewEvent$annotations", "lastViewEvent", "getLastFatalAnrSent", "()Ljava/lang/Long;", "getLastFatalAnrSent$annotations", "lastFatalAnrSent", "getAppStartTimeNs", "()J", "getAppStartTimeNs$annotations", "appStartTimeNs", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface InternalSdkCore extends FeatureSdkCore {

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class DefaultImpls {
        @InternalApi
        public static /* synthetic */ void getAppStartTimeNs$annotations() {
        }

        @InternalApi
        public static /* synthetic */ void getLastFatalAnrSent$annotations() {
        }

        @InternalApi
        public static /* synthetic */ void getLastViewEvent$annotations() {
        }

        @InternalApi
        public static /* synthetic */ void getNetworkInfo$annotations() {
        }

        @InternalApi
        public static /* synthetic */ void getRootStorageDir$annotations() {
        }

        @InternalApi
        public static /* synthetic */ void getTrackingConsent$annotations() {
        }

        @InternalApi
        public static /* synthetic */ void isDeveloperModeEnabled$annotations() {
        }
    }

    @InternalApi
    void deleteLastViewEvent();

    @InternalApi
    List<FeatureScope> getAllFeatures();

    long getAppStartTimeNs();

    @InternalApi
    DatadogContext getDatadogContext();

    FirstPartyHostHeaderTypeResolver getFirstPartyHostResolver();

    Long getLastFatalAnrSent();

    ab8 getLastViewEvent();

    NetworkInfo getNetworkInfo();

    @InternalApi
    ExecutorService getPersistenceExecutorService();

    File getRootStorageDir();

    TrackingConsent getTrackingConsent();

    /* JADX INFO: renamed from: isDeveloperModeEnabled */
    boolean getIsDeveloperModeEnabled();

    @InternalApi
    void writeLastFatalAnrSent(long anrTimestamp);

    @InternalApi
    void writeLastViewEvent(byte[] data);
}
