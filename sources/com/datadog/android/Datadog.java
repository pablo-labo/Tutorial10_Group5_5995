package com.datadog.android;

import android.content.Context;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.HashGenerator;
import com.datadog.android.core.internal.NoOpInternalSdkCore;
import com.datadog.android.core.internal.SdkCoreRegistry;
import com.datadog.android.core.internal.Sha256HashGenerator;
import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.datadog.android.core.internal.utils.RuntimeUtilsKt;
import com.datadog.android.lint.InternalApi;
import com.datadog.android.privacy.TrackingConsent;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.bs4;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.kc9;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u000f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\u000fH\u0007¢\u0006\u0004\b#\u0010$JU\u0010*\u001a\u00020\u00182\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010(2\b\b\u0002\u0010\"\u001a\u00020\u000fH\u0007¢\u0006\u0004\b*\u0010+J/\u0010,\u001a\u00020\u00182\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010(2\b\b\u0002\u0010\"\u001a\u00020\u000fH\u0007¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u000fH\u0007¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0018H\u0003¢\u0006\u0004\b0\u0010\u0003R\u001a\u00102\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010=\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010 \"\u0004\b@\u0010\u001eR\u0014\u0010A\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010D\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bD\u0010BR\u0014\u0010E\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010BR\u0014\u0010F\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u0010BR\u0014\u0010G\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010BR\u0014\u0010H\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010B¨\u0006I"}, d2 = {"Lcom/datadog/android/Datadog;", "", "<init>", "()V", "", "instanceName", "Lcom/datadog/android/_InternalProxy;", "_internalProxy", "(Ljava/lang/String;)Lcom/datadog/android/_InternalProxy;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/datadog/android/core/configuration/Configuration;", "configuration", "Lcom/datadog/android/privacy/TrackingConsent;", "trackingConsent", "Lcom/datadog/android/api/SdkCore;", "initialize", "(Ljava/lang/String;Landroid/content/Context;Lcom/datadog/android/core/configuration/Configuration;Lcom/datadog/android/privacy/TrackingConsent;)Lcom/datadog/android/api/SdkCore;", "(Landroid/content/Context;Lcom/datadog/android/core/configuration/Configuration;Lcom/datadog/android/privacy/TrackingConsent;)Lcom/datadog/android/api/SdkCore;", "getInstance", "(Ljava/lang/String;)Lcom/datadog/android/api/SdkCore;", "", "isInitialized", "(Ljava/lang/String;)Z", "Lj6g;", "stopInstance", "(Ljava/lang/String;)V", "", "level", "setVerbosity", "(I)V", "getVerbosity", "()I", BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "sdkCore", "setTrackingConsent", "(Lcom/datadog/android/privacy/TrackingConsent;Lcom/datadog/android/api/SdkCore;)V", "id", "name", "email", "", "extraInfo", "setUserInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/api/SdkCore;)V", "addUserProperties", "(Ljava/util/Map;Lcom/datadog/android/api/SdkCore;)V", "clearAllData", "(Lcom/datadog/android/api/SdkCore;)V", "flushAndShutdownExecutors", "Lcom/datadog/android/core/internal/SdkCoreRegistry;", "registry", "Lcom/datadog/android/core/internal/SdkCoreRegistry;", "getRegistry$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/SdkCoreRegistry;", "Lcom/datadog/android/core/internal/HashGenerator;", "hashGenerator", "Lcom/datadog/android/core/internal/HashGenerator;", "getHashGenerator$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/HashGenerator;", "setHashGenerator$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/HashGenerator;)V", "libraryVerbosity", "I", "getLibraryVerbosity$dd_sdk_android_core_release", "setLibraryVerbosity$dd_sdk_android_core_release", "MESSAGE_ALREADY_INITIALIZED", "Ljava/lang/String;", "MESSAGE_SDK_NOT_INITIALIZED", "CANNOT_CREATE_SDK_INSTANCE_ID_ERROR", "DD_SOURCE_TAG", "DD_SDK_VERSION_TAG", "DD_APP_VERSION_TAG", "DD_NATIVE_SOURCE_TYPE", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class Datadog {
    public static final String CANNOT_CREATE_SDK_INSTANCE_ID_ERROR = "Cannot create SDK instance ID, stopping SDK initialization.";
    public static final String DD_APP_VERSION_TAG = "_dd.version";
    public static final String DD_NATIVE_SOURCE_TYPE = "_dd.native_source_type";
    public static final String DD_SDK_VERSION_TAG = "_dd.sdk_version";
    public static final String DD_SOURCE_TAG = "_dd.source";
    public static final String MESSAGE_ALREADY_INITIALIZED = "The Datadog library has already been initialized.";
    public static final String MESSAGE_SDK_NOT_INITIALIZED = "SDK instance with name %s is not found, returning no-op implementation. Please make sure to call Datadog.initialize([instanceName]) before getting the instance. SDK instance was requested from:\n%s";
    public static final Datadog INSTANCE = new Datadog();
    private static final SdkCoreRegistry registry = new SdkCoreRegistry(RuntimeUtilsKt.getUnboundInternalLogger());
    private static HashGenerator hashGenerator = new Sha256HashGenerator();
    private static int libraryVerbosity = Integer.MAX_VALUE;

    private Datadog() {
    }

    public static /* synthetic */ _InternalProxy _internalProxy$default(Datadog datadog, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return datadog._internalProxy(str);
    }

    public static final void addUserProperties(Map<String, ? extends Object> extraInfo, SdkCore sdkCore) {
        extraInfo.getClass();
        sdkCore.getClass();
        sdkCore.addUserProperties(extraInfo);
    }

    public static /* synthetic */ void addUserProperties$default(Map map, SdkCore sdkCore, int i, Object obj) {
        if ((i & 2) != 0) {
            sdkCore = getInstance$default(null, 1, null);
        }
        addUserProperties(map, sdkCore);
    }

    public static final void clearAllData(SdkCore sdkCore) {
        sdkCore.getClass();
        sdkCore.clearAllData();
    }

    public static /* synthetic */ void clearAllData$default(SdkCore sdkCore, int i, Object obj) {
        if ((i & 1) != 0) {
            sdkCore = getInstance$default(null, 1, null);
        }
        clearAllData(sdkCore);
    }

    private final void flushAndShutdownExecutors() {
        SdkCoreRegistry sdkCoreRegistry = registry;
        synchronized (sdkCoreRegistry) {
            try {
                SdkCore instance$default = SdkCoreRegistry.getInstance$default(sdkCoreRegistry, null, 1, null);
                FeatureSdkCore featureSdkCore = instance$default instanceof FeatureSdkCore ? (FeatureSdkCore) instance$default : null;
                if (featureSdkCore != null) {
                    FeatureScope feature = featureSdkCore.getFeature("rum");
                    if (feature != null) {
                        feature.sendEvent(kc9.W(new Pair("type", RumFeature.FLUSH_AND_STOP_MONITOR_MESSAGE_TYPE)));
                    }
                    DatadogCore datadogCore = featureSdkCore instanceof DatadogCore ? (DatadogCore) featureSdkCore : null;
                    if (datadogCore != null) {
                        datadogCore.flushStoredData$dd_sdk_android_core_release();
                    }
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final SdkCore getInstance(String instanceName) {
        SdkCore sdkCoreRegistry;
        SdkCoreRegistry sdkCoreRegistry2 = registry;
        synchronized (sdkCoreRegistry2) {
            if (instanceName == null) {
                instanceName = SdkCoreRegistry.DEFAULT_INSTANCE_NAME;
            }
            try {
                sdkCoreRegistry = sdkCoreRegistry2.getInstance(instanceName);
                if (sdkCoreRegistry == null) {
                    InternalLogger.DefaultImpls.log$default(RuntimeUtilsKt.getUnboundInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new Datadog$getInstance$1$1(instanceName, new Throwable().fillInStackTrace()), (Throwable) null, false, (Map) null, 56, (Object) null);
                    sdkCoreRegistry = NoOpInternalSdkCore.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sdkCoreRegistry;
    }

    public static /* synthetic */ SdkCore getInstance$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return getInstance(str);
    }

    public static final int getVerbosity() {
        return libraryVerbosity;
    }

    public static final SdkCore initialize(String instanceName, Context context, Configuration configuration, TrackingConsent trackingConsent) {
        String str = instanceName;
        context.getClass();
        configuration.getClass();
        trackingConsent.getClass();
        SdkCoreRegistry sdkCoreRegistry = registry;
        synchronized (sdkCoreRegistry) {
            SdkCore sdkCoreRegistry2 = sdkCoreRegistry.getInstance(str);
            if (sdkCoreRegistry2 != null) {
                InternalLogger.DefaultImpls.log$default(RuntimeUtilsKt.getUnboundInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) Datadog$initialize$1$1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
                return sdkCoreRegistry2;
            }
            String strGenerate = hashGenerator.generate(str + "/" + configuration.getCoreConfig$dd_sdk_android_core_release().getSite().getSiteName());
            if (strGenerate == null) {
                InternalLogger.DefaultImpls.log$default(RuntimeUtilsKt.getUnboundInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) Datadog$initialize$1$2.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
                return null;
            }
            if (str == null) {
                str = SdkCoreRegistry.DEFAULT_INSTANCE_NAME;
            }
            String str2 = str;
            DatadogCore datadogCore = new DatadogCore(context, strGenerate, str2, null, null, null, 56, null);
            datadogCore.initialize$dd_sdk_android_core_release(configuration);
            datadogCore.setTrackingConsent(trackingConsent);
            sdkCoreRegistry.register(str2, datadogCore);
            return datadogCore;
        }
    }

    public static final boolean isInitialized(String instanceName) {
        boolean z;
        SdkCoreRegistry sdkCoreRegistry = registry;
        synchronized (sdkCoreRegistry) {
            z = sdkCoreRegistry.getInstance(instanceName) != null;
        }
        return z;
    }

    public static /* synthetic */ boolean isInitialized$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return isInitialized(str);
    }

    public static final void setTrackingConsent(TrackingConsent consent, SdkCore sdkCore) {
        consent.getClass();
        sdkCore.getClass();
        sdkCore.setTrackingConsent(consent);
    }

    public static /* synthetic */ void setTrackingConsent$default(TrackingConsent trackingConsent, SdkCore sdkCore, int i, Object obj) {
        if ((i & 2) != 0) {
            sdkCore = getInstance$default(null, 1, null);
        }
        setTrackingConsent(trackingConsent, sdkCore);
    }

    public static final void setUserInfo(String str, String str2, String str3, Map<String, ? extends Object> map) {
        map.getClass();
        setUserInfo$default(str, str2, str3, map, null, 16, null);
    }

    public static /* synthetic */ void setUserInfo$default(String str, String str2, String str3, Map map, SdkCore sdkCore, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            map = bs4.a;
        }
        if ((i & 16) != 0) {
            sdkCore = getInstance$default(null, 1, null);
        }
        setUserInfo(str, str2, str3, map, sdkCore);
    }

    public static final void setVerbosity(int level) {
        libraryVerbosity = level;
    }

    public static final void stopInstance(String instanceName) {
        SdkCoreRegistry sdkCoreRegistry = registry;
        synchronized (sdkCoreRegistry) {
            try {
                SdkCore sdkCoreUnregister = sdkCoreRegistry.unregister(instanceName);
                DatadogCore datadogCore = sdkCoreUnregister instanceof DatadogCore ? (DatadogCore) sdkCoreUnregister : null;
                if (datadogCore != null) {
                    datadogCore.stop$dd_sdk_android_core_release();
                    j6g j6gVar = j6g.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void stopInstance$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        stopInstance(str);
    }

    @InternalApi
    public final _InternalProxy _internalProxy(String instanceName) {
        return new _InternalProxy(getInstance(instanceName));
    }

    public final HashGenerator getHashGenerator$dd_sdk_android_core_release() {
        return hashGenerator;
    }

    public final int getLibraryVerbosity$dd_sdk_android_core_release() {
        return libraryVerbosity;
    }

    public final SdkCoreRegistry getRegistry$dd_sdk_android_core_release() {
        return registry;
    }

    public final void setHashGenerator$dd_sdk_android_core_release(HashGenerator hashGenerator2) {
        hashGenerator2.getClass();
        hashGenerator = hashGenerator2;
    }

    public final void setLibraryVerbosity$dd_sdk_android_core_release(int i) {
        libraryVerbosity = i;
    }

    public static final void clearAllData() {
        clearAllData$default(null, 1, null);
    }

    public static final void addUserProperties(Map<String, ? extends Object> map) {
        map.getClass();
        addUserProperties$default(map, null, 2, null);
    }

    public static final void setTrackingConsent(TrackingConsent trackingConsent) {
        trackingConsent.getClass();
        setTrackingConsent$default(trackingConsent, null, 2, null);
    }

    public static final void setUserInfo(String str) {
        setUserInfo$default(str, null, null, null, null, 30, null);
    }

    public static final void setUserInfo(String str, String str2) {
        setUserInfo$default(str, str2, null, null, null, 28, null);
    }

    public static final boolean isInitialized() {
        return isInitialized$default(null, 1, null);
    }

    public static final void setUserInfo(String str, String str2, String str3) {
        setUserInfo$default(str, str2, str3, null, null, 24, null);
    }

    public static final void setUserInfo() {
        setUserInfo$default(null, null, null, null, null, 31, null);
    }

    public static final void setUserInfo(String id, String name, String email, Map<String, ? extends Object> extraInfo, SdkCore sdkCore) {
        extraInfo.getClass();
        sdkCore.getClass();
        sdkCore.setUserInfo(id, name, email, extraInfo);
    }

    public static final void stopInstance() {
        stopInstance$default(null, 1, null);
    }

    public static final SdkCore getInstance() {
        return getInstance$default(null, 1, null);
    }

    public static final SdkCore initialize(Context context, Configuration configuration, TrackingConsent trackingConsent) {
        context.getClass();
        configuration.getClass();
        trackingConsent.getClass();
        return initialize(null, context, configuration, trackingConsent);
    }
}
