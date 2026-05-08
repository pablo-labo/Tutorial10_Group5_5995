package com.datadog.android.rum;

import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.rum.internal.monitor.NoOpAdvancedRumMonitor;
import defpackage.gu5;
import defpackage.j6g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u0003J!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0003R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/GlobalRumMonitor;", "", "<init>", "()V", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "", "isRegistered", "(Lcom/datadog/android/api/SdkCore;)Z", "Lcom/datadog/android/rum/RumMonitor;", "get", "(Lcom/datadog/android/api/SdkCore;)Lcom/datadog/android/rum/RumMonitor;", "Lj6g;", "reset", "monitor", "registerIfAbsent$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/RumMonitor;Lcom/datadog/android/api/SdkCore;)Z", "registerIfAbsent", "unregister$dd_sdk_android_rum_release", "(Lcom/datadog/android/api/SdkCore;)V", "unregister", "clear$dd_sdk_android_rum_release", "clear", "", "registeredMonitors", "Ljava/util/Map;", "", "NO_MONITOR_REGISTERED_MESSAGE", "Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class GlobalRumMonitor {
    public static final String NO_MONITOR_REGISTERED_MESSAGE = "No RumMonitor for the SDK instance with name %s found, returning no-op implementation.";
    public static final GlobalRumMonitor INSTANCE = new GlobalRumMonitor();
    private static final Map<SdkCore, RumMonitor> registeredMonitors = new LinkedHashMap();

    private GlobalRumMonitor() {
    }

    public static final RumMonitor get(SdkCore sdkCore) {
        RumMonitor noOpAdvancedRumMonitor;
        InternalLogger internalLogger;
        sdkCore.getClass();
        Map<SdkCore, RumMonitor> map = registeredMonitors;
        synchronized (map) {
            try {
                noOpAdvancedRumMonitor = map.get(sdkCore);
                if (noOpAdvancedRumMonitor == null) {
                    FeatureSdkCore featureSdkCore = sdkCore instanceof FeatureSdkCore ? (FeatureSdkCore) sdkCore : null;
                    if (featureSdkCore != null && (internalLogger = featureSdkCore.getInternalLogger()) != null) {
                        InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new GlobalRumMonitor$get$1$1(sdkCore), (Throwable) null, false, (Map) null, 56, (Object) null);
                    }
                    noOpAdvancedRumMonitor = new NoOpAdvancedRumMonitor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return noOpAdvancedRumMonitor;
    }

    public static /* synthetic */ RumMonitor get$default(SdkCore sdkCore, int i, Object obj) {
        if ((i & 1) != 0) {
            sdkCore = Datadog.getInstance$default(null, 1, null);
        }
        return get(sdkCore);
    }

    public static final boolean isRegistered(SdkCore sdkCore) {
        boolean zContainsKey;
        sdkCore.getClass();
        Map<SdkCore, RumMonitor> map = registeredMonitors;
        synchronized (map) {
            zContainsKey = map.containsKey(sdkCore);
        }
        return zContainsKey;
    }

    public static /* synthetic */ boolean isRegistered$default(SdkCore sdkCore, int i, Object obj) {
        if ((i & 1) != 0) {
            sdkCore = Datadog.getInstance$default(null, 1, null);
        }
        return isRegistered(sdkCore);
    }

    public static /* synthetic */ boolean registerIfAbsent$dd_sdk_android_rum_release$default(GlobalRumMonitor globalRumMonitor, RumMonitor rumMonitor, SdkCore sdkCore, int i, Object obj) {
        if ((i & 2) != 0) {
            sdkCore = Datadog.getInstance$default(null, 1, null);
        }
        return globalRumMonitor.registerIfAbsent$dd_sdk_android_rum_release(rumMonitor, sdkCore);
    }

    private static final void reset() {
        INSTANCE.clear$dd_sdk_android_rum_release();
    }

    public static /* synthetic */ void unregister$dd_sdk_android_rum_release$default(GlobalRumMonitor globalRumMonitor, SdkCore sdkCore, int i, Object obj) {
        if ((i & 1) != 0) {
            sdkCore = Datadog.getInstance$default(null, 1, null);
        }
        globalRumMonitor.unregister$dd_sdk_android_rum_release(sdkCore);
    }

    public final void clear$dd_sdk_android_rum_release() {
        Map<SdkCore, RumMonitor> map = registeredMonitors;
        synchronized (map) {
            map.clear();
            j6g j6gVar = j6g.a;
        }
    }

    public final boolean registerIfAbsent$dd_sdk_android_rum_release(RumMonitor monitor, SdkCore sdkCore) {
        boolean z;
        monitor.getClass();
        sdkCore.getClass();
        Map<SdkCore, RumMonitor> map = registeredMonitors;
        synchronized (map) {
            try {
                if (map.containsKey(sdkCore)) {
                    InternalLogger.DefaultImpls.log$default(((FeatureSdkCore) sdkCore).getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) GlobalRumMonitor$registerIfAbsent$1$1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
                    z = false;
                } else {
                    map.put(sdkCore, monitor);
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void unregister$dd_sdk_android_rum_release(SdkCore sdkCore) {
        sdkCore.getClass();
        Map<SdkCore, RumMonitor> map = registeredMonitors;
        synchronized (map) {
            map.remove(sdkCore);
        }
    }

    public static final boolean isRegistered() {
        return isRegistered$default(null, 1, null);
    }

    public static final RumMonitor get() {
        return get$default(null, 1, null);
    }
}
