package com.datadog.android.api;

import com.datadog.android.core.internal.logger.SdkInternalLogger;
import com.datadog.android.core.metrics.PerformanceMetric;
import com.datadog.android.core.metrics.TelemetryMetricType;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.lint.InternalApi;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.b0;
import defpackage.gu5;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000 %2\u00020\u0001:\u0003%&'J]\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rH&¢\u0006\u0004\b\u0010\u0010\u0011Jc\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rH&¢\u0006\u0004\b\u0010\u0010\u0014JI\u0010\u0018\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2\b\b\u0001\u0010\u0016\u001a\u00020\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H'¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u000f2\b\b\u0003\u0010\u0016\u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0006H'¢\u0006\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/datadog/android/api/InternalLogger;", "", "Lcom/datadog/android/api/InternalLogger$Level;", "level", "Lcom/datadog/android/api/InternalLogger$Target;", "target", "Lkotlin/Function0;", "", "messageBuilder", "", RumFeature.EVENT_THROWABLE_PROPERTY, "", "onlyOnce", "", "additionalProperties", "Lj6g;", "log", "(Lcom/datadog/android/api/InternalLogger$Level;Lcom/datadog/android/api/InternalLogger$Target;Lgu5;Ljava/lang/Throwable;ZLjava/util/Map;)V", "", "targets", "(Lcom/datadog/android/api/InternalLogger$Level;Ljava/util/List;Lgu5;Ljava/lang/Throwable;ZLjava/util/Map;)V", "", "samplingRate", "creationSampleRate", "logMetric", "(Lgu5;Ljava/util/Map;FLjava/lang/Float;)V", "callerClass", "Lcom/datadog/android/core/metrics/TelemetryMetricType;", "metric", "operationName", "Lcom/datadog/android/core/metrics/PerformanceMetric;", "startPerformanceMeasure", "(Ljava/lang/String;Lcom/datadog/android/core/metrics/TelemetryMetricType;FLjava/lang/String;)Lcom/datadog/android/core/metrics/PerformanceMetric;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "apiUsageEventBuilder", "logApiUsage", "(FLgu5;)V", "Companion", "Level", "Target", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface InternalLogger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/datadog/android/api/InternalLogger$Companion;", "", "()V", "DEFAULT_API_USAGE_TELEMETRY_SAMPLING_RATE", "", "UNBOUND", "Lcom/datadog/android/api/InternalLogger;", "getUNBOUND", "()Lcom/datadog/android/api/InternalLogger;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private static final float DEFAULT_API_USAGE_TELEMETRY_SAMPLING_RATE = 15.0f;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final InternalLogger UNBOUND = new SdkInternalLogger(null, null, null, 6, null);

        private Companion() {
        }

        public final InternalLogger getUNBOUND() {
            return UNBOUND;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/datadog/android/api/InternalLogger$Level;", "", "(Ljava/lang/String;I)V", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Level {
        VERBOSE,
        DEBUG,
        INFO,
        WARN,
        ERROR
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/datadog/android/api/InternalLogger$Target;", "", "(Ljava/lang/String;I)V", "USER", "MAINTAINER", "TELEMETRY", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Target {
        USER,
        MAINTAINER,
        TELEMETRY
    }

    void log(Level level, Target target, gu5<String> messageBuilder, Throwable throwable, boolean onlyOnce, Map<String, ? extends Object> additionalProperties);

    void log(Level level, List<? extends Target> targets, gu5<String> messageBuilder, Throwable throwable, boolean onlyOnce, Map<String, ? extends Object> additionalProperties);

    @InternalApi
    void logApiUsage(float samplingRate, gu5<? extends InternalTelemetryEvent.ApiUsage> apiUsageEventBuilder);

    @InternalApi
    void logMetric(gu5<String> messageBuilder, Map<String, ? extends Object> additionalProperties, float samplingRate, Float creationSampleRate);

    @InternalApi
    PerformanceMetric startPerformanceMeasure(String callerClass, TelemetryMetricType metric, float samplingRate, String operationName);

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void log$default(InternalLogger internalLogger, Level level, Target target, gu5 gu5Var, Throwable th, boolean z, Map map, int i, Object obj) {
            if (obj != null) {
                b0.u("Super calls with default arguments not supported in this target, function: log");
                return;
            }
            if ((i & 8) != 0) {
                th = null;
            }
            if ((i & 16) != 0) {
                z = false;
            }
            if ((i & 32) != 0) {
                map = null;
            }
            internalLogger.log(level, target, (gu5<String>) gu5Var, th, z, (Map<String, ? extends Object>) map);
        }

        public static /* synthetic */ void logApiUsage$default(InternalLogger internalLogger, float f, gu5 gu5Var, int i, Object obj) {
            if (obj != null) {
                b0.u("Super calls with default arguments not supported in this target, function: logApiUsage");
                return;
            }
            if ((i & 1) != 0) {
                f = 15.0f;
            }
            internalLogger.logApiUsage(f, gu5Var);
        }

        public static /* synthetic */ void logMetric$default(InternalLogger internalLogger, gu5 gu5Var, Map map, float f, Float f2, int i, Object obj) {
            if (obj != null) {
                b0.u("Super calls with default arguments not supported in this target, function: logMetric");
                return;
            }
            if ((i & 8) != 0) {
                f2 = null;
            }
            internalLogger.logMetric(gu5Var, map, f, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void log$default(InternalLogger internalLogger, Level level, List list, gu5 gu5Var, Throwable th, boolean z, Map map, int i, Object obj) {
            if (obj != null) {
                b0.u("Super calls with default arguments not supported in this target, function: log");
                return;
            }
            if ((i & 8) != 0) {
                th = null;
            }
            if ((i & 16) != 0) {
                z = false;
            }
            if ((i & 32) != 0) {
                map = null;
            }
            internalLogger.log(level, (List<? extends Target>) list, (gu5<String>) gu5Var, th, z, (Map<String, ? extends Object>) map);
        }
    }
}
