package com.datadog.android.api;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.metrics.PerformanceMetric;
import com.datadog.android.core.metrics.TelemetryMetricType;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.gu5;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J]\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0017JE\u0010\u001b\u001a\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\bH\u0016¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/datadog/android/api/NoOpInternalLogger;", "Lcom/datadog/android/api/InternalLogger;", "<init>", "()V", "Lcom/datadog/android/api/InternalLogger$Level;", "level", "Lcom/datadog/android/api/InternalLogger$Target;", "target", "Lkotlin/Function0;", "", "messageBuilder", "", RumFeature.EVENT_THROWABLE_PROPERTY, "", "onlyOnce", "", "", "additionalProperties", "Lj6g;", "log", "(Lcom/datadog/android/api/InternalLogger$Level;Lcom/datadog/android/api/InternalLogger$Target;Lgu5;Ljava/lang/Throwable;ZLjava/util/Map;)V", "", "targets", "(Lcom/datadog/android/api/InternalLogger$Level;Ljava/util/List;Lgu5;Ljava/lang/Throwable;ZLjava/util/Map;)V", "", "samplingRate", "creationSampleRate", "logMetric", "(Lgu5;Ljava/util/Map;FLjava/lang/Float;)V", "callerClass", "Lcom/datadog/android/core/metrics/TelemetryMetricType;", "metric", "operationName", "Lcom/datadog/android/core/metrics/PerformanceMetric;", "startPerformanceMeasure", "(Ljava/lang/String;Lcom/datadog/android/core/metrics/TelemetryMetricType;FLjava/lang/String;)Lcom/datadog/android/core/metrics/PerformanceMetric;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "apiUsageEventBuilder", "logApiUsage", "(FLgu5;)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpInternalLogger implements InternalLogger {
    @Override // com.datadog.android.api.InternalLogger
    public void log(InternalLogger.Level level, InternalLogger.Target target, gu5<String> messageBuilder, Throwable throwable, boolean onlyOnce, Map<String, ? extends Object> additionalProperties) {
        level.getClass();
        target.getClass();
        messageBuilder.getClass();
    }

    @Override // com.datadog.android.api.InternalLogger
    public void logApiUsage(float samplingRate, gu5<? extends InternalTelemetryEvent.ApiUsage> apiUsageEventBuilder) {
        apiUsageEventBuilder.getClass();
    }

    @Override // com.datadog.android.api.InternalLogger
    public void logMetric(gu5<String> messageBuilder, Map<String, ? extends Object> additionalProperties, float samplingRate, Float creationSampleRate) {
        messageBuilder.getClass();
        additionalProperties.getClass();
    }

    @Override // com.datadog.android.api.InternalLogger
    public PerformanceMetric startPerformanceMeasure(String callerClass, TelemetryMetricType metric, float samplingRate, String operationName) {
        callerClass.getClass();
        metric.getClass();
        operationName.getClass();
        return null;
    }

    @Override // com.datadog.android.api.InternalLogger
    public void log(InternalLogger.Level level, List<? extends InternalLogger.Target> targets, gu5<String> messageBuilder, Throwable throwable, boolean onlyOnce, Map<String, ? extends Object> additionalProperties) {
        level.getClass();
        targets.getClass();
        messageBuilder.getClass();
    }
}
