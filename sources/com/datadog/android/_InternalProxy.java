package com.datadog.android;

import com.datadog.android.api.SdkCore;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.system.AppVersionProvider;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.lint.InternalApi;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@InternalApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001d\u0010\r\u001a\u00020\f8\u0006¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/datadog/android/_InternalProxy;", "", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "<init>", "(Lcom/datadog/android/api/SdkCore;)V", "", "version", "Lj6g;", "setCustomAppVersion", "(Ljava/lang/String;)V", "Lcom/datadog/android/api/SdkCore;", "Lcom/datadog/android/_InternalProxy$_TelemetryProxy;", "_telemetry", "Lcom/datadog/android/_InternalProxy$_TelemetryProxy;", "get_telemetry", "()Lcom/datadog/android/_InternalProxy$_TelemetryProxy;", "get_telemetry$annotations", "()V", "Companion", "_TelemetryProxy", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class _InternalProxy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final _TelemetryProxy _telemetry;
    private final SdkCore sdkCore;

    public _InternalProxy(SdkCore sdkCore) {
        sdkCore.getClass();
        this.sdkCore = sdkCore;
        this._telemetry = new _TelemetryProxy(sdkCore);
    }

    public static /* synthetic */ void get_telemetry$annotations() {
    }

    public final _TelemetryProxy get_telemetry() {
        return this._telemetry;
    }

    public final void setCustomAppVersion(String version) {
        version.getClass();
        SdkCore sdkCore = this.sdkCore;
        DatadogCore datadogCore = sdkCore instanceof DatadogCore ? (DatadogCore) sdkCore : null;
        CoreFeature coreFeature$dd_sdk_android_core_release = datadogCore != null ? datadogCore.getCoreFeature$dd_sdk_android_core_release() : null;
        AppVersionProvider packageVersionProvider = coreFeature$dd_sdk_android_core_release != null ? coreFeature$dd_sdk_android_core_release.getPackageVersionProvider() : null;
        if (packageVersionProvider == null) {
            return;
        }
        packageVersionProvider.setVersion(version);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/datadog/android/_InternalProxy$Companion;", "", "()V", "allowClearTextHttp", "Lcom/datadog/android/core/configuration/Configuration$Builder;", "builder", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Configuration.Builder allowClearTextHttp(Configuration.Builder builder) {
            builder.getClass();
            return builder.allowClearTextHttp$dd_sdk_android_core_release();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/datadog/android/_InternalProxy$_TelemetryProxy;", "", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "<init>", "(Lcom/datadog/android/api/SdkCore;)V", "", "message", "Lj6g;", RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "(Ljava/lang/String;)V", "", RumFeature.EVENT_THROWABLE_PROPERTY, "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "stack", "kind", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/datadog/android/api/SdkCore;", "Lcom/datadog/android/api/feature/FeatureScope;", "getRumFeature", "()Lcom/datadog/android/api/feature/FeatureScope;", "rumFeature", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class _TelemetryProxy {
        private final SdkCore sdkCore;

        public _TelemetryProxy(SdkCore sdkCore) {
            sdkCore.getClass();
            this.sdkCore = sdkCore;
        }

        public static /* synthetic */ void error$default(_TelemetryProxy _telemetryproxy, String str, Throwable th, int i, Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            _telemetryproxy.error(str, th);
        }

        private final FeatureScope getRumFeature() {
            SdkCore sdkCore = this.sdkCore;
            FeatureSdkCore featureSdkCore = sdkCore instanceof FeatureSdkCore ? (FeatureSdkCore) sdkCore : null;
            if (featureSdkCore != null) {
                return featureSdkCore.getFeature("rum");
            }
            return null;
        }

        public final void debug(String message) {
            message.getClass();
            InternalTelemetryEvent.Log.Debug debug = new InternalTelemetryEvent.Log.Debug(message, null);
            FeatureScope rumFeature = getRumFeature();
            if (rumFeature != null) {
                rumFeature.sendEvent(debug);
            }
        }

        public final void error(String message, Throwable throwable) {
            message.getClass();
            InternalTelemetryEvent.Log.Error error = new InternalTelemetryEvent.Log.Error(message, null, throwable, null, null, 26, null);
            FeatureScope rumFeature = getRumFeature();
            if (rumFeature != null) {
                rumFeature.sendEvent(error);
            }
        }

        public final void error(String message, String stack, String kind) {
            message.getClass();
            InternalTelemetryEvent.Log.Error error = new InternalTelemetryEvent.Log.Error(message, null, null, stack, kind, 6, null);
            FeatureScope rumFeature = getRumFeature();
            if (rumFeature != null) {
                rumFeature.sendEvent(error);
            }
        }
    }
}
