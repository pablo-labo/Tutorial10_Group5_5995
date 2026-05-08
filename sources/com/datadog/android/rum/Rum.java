package com.datadog.android.rum;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.sampling.RateBasedSampler;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import com.datadog.android.telemetry.internal.TelemetryEventHandler;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.zve;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/datadog/android/rum/Rum;", "", "<init>", "()V", "Lcom/datadog/android/rum/RumConfiguration;", "rumConfiguration", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Lj6g;", "enable", "(Lcom/datadog/android/rum/RumConfiguration;Lcom/datadog/android/api/SdkCore;)V", "Lcom/datadog/android/core/InternalSdkCore;", "Lcom/datadog/android/rum/internal/RumFeature;", "rumFeature", "Lcom/datadog/android/rum/internal/monitor/DatadogRumMonitor;", "createMonitor", "(Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/rum/internal/RumFeature;)Lcom/datadog/android/rum/internal/monitor/DatadogRumMonitor;", "", "UNEXPECTED_SDK_CORE_TYPE", "Ljava/lang/String;", "INVALID_APPLICATION_ID_ERROR_MESSAGE", "RUM_FEATURE_ALREADY_ENABLED", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class Rum {
    public static final Rum INSTANCE = new Rum();
    public static final String INVALID_APPLICATION_ID_ERROR_MESSAGE = "You're trying to create a RumMonitor instance, but the RUM application id was empty. No RUM data will be sent.";
    public static final String RUM_FEATURE_ALREADY_ENABLED = "RUM Feature is already enabled in this SDK core, ignoring the call to enable it.";
    public static final String UNEXPECTED_SDK_CORE_TYPE = "SDK instance provided doesn't implement InternalSdkCore.";

    private Rum() {
    }

    private final DatadogRumMonitor createMonitor(InternalSdkCore sdkCore, RumFeature rumFeature) {
        SessionEndedMetricDispatcher sessionEndedMetricDispatcher = new SessionEndedMetricDispatcher(sdkCore.getInternalLogger());
        return new DatadogRumMonitor(rumFeature.getApplicationId(), sdkCore, rumFeature.getSampleRate(), rumFeature.getBackgroundEventTracking(), rumFeature.getTrackFrustrations(), rumFeature.getDataWriter$dd_sdk_android_rum_release(), new Handler(Looper.getMainLooper()), new TelemetryEventHandler(sdkCore, new RateBasedSampler(rumFeature.getTelemetrySampleRate()), new RateBasedSampler(rumFeature.getTelemetryConfigurationSampleRate()), sessionEndedMetricDispatcher, 0, 16, null), sessionEndedMetricDispatcher, sdkCore.getFirstPartyHostResolver(), rumFeature.getCpuVitalMonitor(), rumFeature.getMemoryVitalMonitor(), rumFeature.getFrameRateVitalMonitor(), rumFeature.getSessionListener(), sdkCore.createSingleThreadExecutorService("rum-pipeline"), rumFeature.getInitialResourceIdentifier(), rumFeature.getLastInteractionIdentifier());
    }

    public static final void enable(RumConfiguration rumConfiguration, SdkCore sdkCore) {
        InternalLogger unbound;
        rumConfiguration.getClass();
        sdkCore.getClass();
        if (!(sdkCore instanceof InternalSdkCore)) {
            FeatureSdkCore featureSdkCore = sdkCore instanceof FeatureSdkCore ? (FeatureSdkCore) sdkCore : null;
            if (featureSdkCore == null || (unbound = featureSdkCore.getInternalLogger()) == null) {
                unbound = InternalLogger.INSTANCE.getUNBOUND();
            }
            InternalLogger.DefaultImpls.log$default(unbound, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        if (zve.U(rumConfiguration.getApplicationId$dd_sdk_android_rum_release())) {
            InternalLogger.DefaultImpls.log$default(((InternalSdkCore) sdkCore).getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) AnonymousClass2.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        InternalSdkCore internalSdkCore = (InternalSdkCore) sdkCore;
        if (internalSdkCore.getFeature("rum") != null) {
            InternalLogger.DefaultImpls.log$default(internalSdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) AnonymousClass3.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        RumFeature rumFeature = new RumFeature((FeatureSdkCore) sdkCore, rumConfiguration.getApplicationId$dd_sdk_android_rum_release(), rumConfiguration.getFeatureConfiguration$dd_sdk_android_rum_release(), null, 8, null);
        internalSdkCore.registerFeature(rumFeature);
        DatadogRumMonitor datadogRumMonitorCreateMonitor = INSTANCE.createMonitor(internalSdkCore, rumFeature);
        if (Build.VERSION.SDK_INT >= 30) {
            rumFeature.consumeLastFatalAnr$dd_sdk_android_rum_release(datadogRumMonitorCreateMonitor.getExecutorService());
        }
        GlobalRumMonitor.INSTANCE.registerIfAbsent$dd_sdk_android_rum_release(datadogRumMonitorCreateMonitor, sdkCore);
        datadogRumMonitorCreateMonitor.start();
    }

    public static /* synthetic */ void enable$default(RumConfiguration rumConfiguration, SdkCore sdkCore, int i, Object obj) {
        if ((i & 2) != 0) {
            sdkCore = Datadog.getInstance$default(null, 1, null);
        }
        enable(rumConfiguration, sdkCore);
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.Rum$enable$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return Rum.UNEXPECTED_SDK_CORE_TYPE;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.Rum$enable$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return Rum.INVALID_APPLICATION_ID_ERROR_MESSAGE;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.Rum$enable$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<String> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return Rum.RUM_FEATURE_ALREADY_ENABLED;
        }
    }

    public static final void enable(RumConfiguration rumConfiguration) {
        rumConfiguration.getClass();
        enable$default(rumConfiguration, null, 2, null);
    }
}
