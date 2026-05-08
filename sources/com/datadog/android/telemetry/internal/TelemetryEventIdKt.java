package com.datadog.android.telemetry.internal;

import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import defpackage.l;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"identity", "Lcom/datadog/android/telemetry/internal/TelemetryEventId;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "getIdentity", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;)Lcom/datadog/android/telemetry/internal/TelemetryEventId;", "type", "Lcom/datadog/android/telemetry/internal/TelemetryType;", "dd-sdk-android-rum_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class TelemetryEventIdKt {
    public static final TelemetryEventId getIdentity(InternalTelemetryEvent internalTelemetryEvent) {
        internalTelemetryEvent.getClass();
        if (!(internalTelemetryEvent instanceof InternalTelemetryEvent.Log.Error)) {
            return internalTelemetryEvent instanceof InternalTelemetryEvent.Log.Debug ? new TelemetryEventId(type(internalTelemetryEvent), ((InternalTelemetryEvent.Log.Debug) internalTelemetryEvent).getMessage(), null) : new TelemetryEventId(type(internalTelemetryEvent), "", null);
        }
        TelemetryType telemetryTypeType = type(internalTelemetryEvent);
        InternalTelemetryEvent.Log.Error error = (InternalTelemetryEvent.Log.Error) internalTelemetryEvent;
        return new TelemetryEventId(telemetryTypeType, error.getMessage(), error.resolveKind());
    }

    public static final TelemetryType type(InternalTelemetryEvent internalTelemetryEvent) {
        internalTelemetryEvent.getClass();
        if (internalTelemetryEvent instanceof InternalTelemetryEvent.Log.Debug) {
            return TelemetryType.DEBUG;
        }
        if (internalTelemetryEvent instanceof InternalTelemetryEvent.Log.Error) {
            return TelemetryType.ERROR;
        }
        if (internalTelemetryEvent instanceof InternalTelemetryEvent.Configuration) {
            return TelemetryType.CONFIGURATION;
        }
        if (internalTelemetryEvent instanceof InternalTelemetryEvent.Metric) {
            return TelemetryType.METRIC;
        }
        if (internalTelemetryEvent instanceof InternalTelemetryEvent.ApiUsage) {
            return TelemetryType.API_USAGE;
        }
        if (internalTelemetryEvent instanceof InternalTelemetryEvent.InterceptorInstantiated) {
            return TelemetryType.INTERCEPTOR_SETUP;
        }
        l.g();
        return null;
    }
}
