package com.datadog.android.rum;

import android.content.Intent;
import android.os.Bundle;
import com.datadog.android.event.EventMapper;
import com.datadog.android.lint.InternalApi;
import com.datadog.android.rum.RumConfiguration;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy;
import com.datadog.android.telemetry.model.TelemetryConfigurationEvent;
import defpackage.zve;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@InternalApi
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/datadog/android/rum/_RumInternalProxy;", "", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "rumMonitor", "<init>", "(Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;)V", "", "durationNs", "", "target", "Lj6g;", "addLongTask", "(JLjava/lang/String;)V", "Lcom/datadog/android/rum/RumPerformanceMetric;", "metric", "", "value", "updatePerformanceMetric", "(Lcom/datadog/android/rum/RumPerformanceMetric;D)V", "testId", "resultId", "setSyntheticsAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "setSyntheticsAttributeFromIntent$dd_sdk_android_rum_release", "(Landroid/content/Intent;)V", "setSyntheticsAttributeFromIntent", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "", "handledSyntheticsAttribute", "Z", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class _RumInternalProxy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private volatile boolean handledSyntheticsAttribute;
    private final AdvancedRumMonitor rumMonitor;

    public _RumInternalProxy(AdvancedRumMonitor advancedRumMonitor) {
        advancedRumMonitor.getClass();
        this.rumMonitor = advancedRumMonitor;
    }

    public final void addLongTask(long durationNs, String target) {
        target.getClass();
        this.rumMonitor.addLongTask(durationNs, target);
    }

    public final void setSyntheticsAttribute(String testId, String resultId) {
        if (this.handledSyntheticsAttribute) {
            return;
        }
        this.handledSyntheticsAttribute = true;
        if (testId == null || zve.U(testId) || resultId == null || zve.U(resultId)) {
            return;
        }
        this.rumMonitor.setSyntheticsAttribute(testId, resultId);
    }

    public final void setSyntheticsAttributeFromIntent$dd_sdk_android_rum_release(Intent intent) {
        Bundle extras;
        intent.getClass();
        try {
            extras = intent.getExtras();
        } catch (Exception unused) {
            extras = null;
        }
        setSyntheticsAttribute(extras != null ? extras.getString(ActivityLifecycleTrackingStrategy.EXTRA_SYNTHETICS_TEST_ID) : null, extras != null ? extras.getString(ActivityLifecycleTrackingStrategy.EXTRA_SYNTHETICS_RESULT_ID) : null);
    }

    public final void updatePerformanceMetric(RumPerformanceMetric metric, double value) {
        metric.getClass();
        this.rumMonitor.updatePerformanceMetric(metric, value);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007J\u001c\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/_RumInternalProxy$Companion;", "", "()V", "setAdditionalConfiguration", "Lcom/datadog/android/rum/RumConfiguration$Builder;", "builder", "additionalConfig", "", "", "setTelemetryConfigurationEventMapper", "eventMapper", "Lcom/datadog/android/event/EventMapper;", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RumConfiguration.Builder setAdditionalConfiguration(RumConfiguration.Builder builder, Map<String, ? extends Object> additionalConfig) {
            builder.getClass();
            additionalConfig.getClass();
            return builder.setAdditionalConfiguration$dd_sdk_android_rum_release(additionalConfig);
        }

        public final RumConfiguration.Builder setTelemetryConfigurationEventMapper(RumConfiguration.Builder builder, EventMapper<TelemetryConfigurationEvent> eventMapper) {
            builder.getClass();
            eventMapper.getClass();
            return builder.setTelemetryConfigurationEventMapper$dd_sdk_android_rum_release(eventMapper);
        }

        private Companion() {
        }
    }
}
