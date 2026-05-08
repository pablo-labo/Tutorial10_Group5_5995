package com.datadog.android.internal.telemetry;

import com.datadog.android.internal.utils.ThrowableExtKt;
import defpackage.ia;
import defpackage.o6;
import defpackage.p6;
import defpackage.w20;
import defpackage.wl7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "", "()V", "ApiUsage", "Companion", "Configuration", "InterceptorInstantiated", "Log", "Metric", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Configuration;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$InterceptorInstantiated;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Metric;", "dd-sdk-android-internal_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class InternalTelemetryEvent {
    public static final String CREATION_SAMPLING_RATE_KEY = "HEAD_SAMPLING_RATE_KEY";
    public static final String REPORTING_SAMPLING_RATE_KEY = "TAIL_SAMPLING_RATE_KEY";

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\""}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Configuration;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "trackErrors", "", "batchSize", "", "batchUploadFrequency", "useProxy", "useLocalEncryption", "batchProcessingLevel", "", "(ZJJZZI)V", "getBatchProcessingLevel", "()I", "getBatchSize", "()J", "getBatchUploadFrequency", "getTrackErrors", "()Z", "getUseLocalEncryption", "getUseProxy", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "", "dd-sdk-android-internal_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Configuration extends InternalTelemetryEvent {
        private final int batchProcessingLevel;
        private final long batchSize;
        private final long batchUploadFrequency;
        private final boolean trackErrors;
        private final boolean useLocalEncryption;
        private final boolean useProxy;

        public Configuration(boolean z, long j, long j2, boolean z2, boolean z3, int i) {
            super(null);
            this.trackErrors = z;
            this.batchSize = j;
            this.batchUploadFrequency = j2;
            this.useProxy = z2;
            this.useLocalEncryption = z3;
            this.batchProcessingLevel = i;
        }

        public static /* synthetic */ Configuration copy$default(Configuration configuration, boolean z, long j, long j2, boolean z2, boolean z3, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = configuration.trackErrors;
            }
            if ((i2 & 2) != 0) {
                j = configuration.batchSize;
            }
            if ((i2 & 4) != 0) {
                j2 = configuration.batchUploadFrequency;
            }
            if ((i2 & 8) != 0) {
                z2 = configuration.useProxy;
            }
            if ((i2 & 16) != 0) {
                z3 = configuration.useLocalEncryption;
            }
            if ((i2 & 32) != 0) {
                i = configuration.batchProcessingLevel;
            }
            int i3 = i;
            boolean z4 = z2;
            long j3 = j2;
            return configuration.copy(z, j, j3, z4, z3, i3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getTrackErrors() {
            return this.trackErrors;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getBatchSize() {
            return this.batchSize;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getBatchUploadFrequency() {
            return this.batchUploadFrequency;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getUseProxy() {
            return this.useProxy;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getUseLocalEncryption() {
            return this.useLocalEncryption;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getBatchProcessingLevel() {
            return this.batchProcessingLevel;
        }

        public final Configuration copy(boolean trackErrors, long batchSize, long batchUploadFrequency, boolean useProxy, boolean useLocalEncryption, int batchProcessingLevel) {
            return new Configuration(trackErrors, batchSize, batchUploadFrequency, useProxy, useLocalEncryption, batchProcessingLevel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.trackErrors == configuration.trackErrors && this.batchSize == configuration.batchSize && this.batchUploadFrequency == configuration.batchUploadFrequency && this.useProxy == configuration.useProxy && this.useLocalEncryption == configuration.useLocalEncryption && this.batchProcessingLevel == configuration.batchProcessingLevel;
        }

        public final int getBatchProcessingLevel() {
            return this.batchProcessingLevel;
        }

        public final long getBatchSize() {
            return this.batchSize;
        }

        public final long getBatchUploadFrequency() {
            return this.batchUploadFrequency;
        }

        public final boolean getTrackErrors() {
            return this.trackErrors;
        }

        public final boolean getUseLocalEncryption() {
            return this.useLocalEncryption;
        }

        public final boolean getUseProxy() {
            return this.useProxy;
        }

        public int hashCode() {
            return Integer.hashCode(this.batchProcessingLevel) + ia.f(ia.f(ia.d(ia.d(Boolean.hashCode(this.trackErrors) * 31, 31, this.batchSize), 31, this.batchUploadFrequency), 31, this.useProxy), 31, this.useLocalEncryption);
        }

        public String toString() {
            boolean z = this.trackErrors;
            long j = this.batchSize;
            long j2 = this.batchUploadFrequency;
            boolean z2 = this.useProxy;
            boolean z3 = this.useLocalEncryption;
            int i = this.batchProcessingLevel;
            StringBuilder sb = new StringBuilder("Configuration(trackErrors=");
            sb.append(z);
            sb.append(", batchSize=");
            sb.append(j);
            o6.p(sb, ", batchUploadFrequency=", j2, ", useProxy=");
            p6.j(sb, z2, ", useLocalEncryption=", z3, ", batchProcessingLevel=");
            return w20.k(sb, i, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$InterceptorInstantiated;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "()V", "dd-sdk-android-internal_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class InterceptorInstantiated extends InternalTelemetryEvent {
        public static final InterceptorInstantiated INSTANCE = new InterceptorInstantiated();

        private InterceptorInstantiated() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Metric;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "message", "", "additionalProperties", "", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getAdditionalProperties", "()Ljava/util/Map;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "dd-sdk-android-internal_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Metric extends InternalTelemetryEvent {
        private final Map<String, Object> additionalProperties;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Metric(String str, Map<String, ? extends Object> map) {
            super(null);
            str.getClass();
            this.message = str;
            this.additionalProperties = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Metric copy$default(Metric metric, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = metric.message;
            }
            if ((i & 2) != 0) {
                map = metric.additionalProperties;
            }
            return metric.copy(str, map);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Map<String, Object> component2() {
            return this.additionalProperties;
        }

        public final Metric copy(String message, Map<String, ? extends Object> additionalProperties) {
            message.getClass();
            return new Metric(message, additionalProperties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metric)) {
                return false;
            }
            Metric metric = (Metric) other;
            return wl7.b(this.message, metric.message) && wl7.b(this.additionalProperties, metric.additionalProperties);
        }

        public final Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Map<String, Object> map = this.additionalProperties;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            return "Metric(message=" + this.message + ", additionalProperties=" + this.additionalProperties + ")";
        }
    }

    public /* synthetic */ InternalTelemetryEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InternalTelemetryEvent() {
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB'\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "message", "", "additionalProperties", "", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getAdditionalProperties", "()Ljava/util/Map;", "getMessage", "()Ljava/lang/String;", "Debug", "Error", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log$Debug;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log$Error;", "dd-sdk-android-internal_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static abstract class Log extends InternalTelemetryEvent {
        private final Map<String, Object> additionalProperties;
        private final String message;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log$Debug;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log;", "message", "", "additionalProperties", "", "", "(Ljava/lang/String;Ljava/util/Map;)V", "dd-sdk-android-internal_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Debug extends Log {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Debug(String str, Map<String, ? extends Object> map) {
                super(str, map, null);
                str.getClass();
            }
        }

        private Log(String str, Map<String, ? extends Object> map) {
            super(null);
            this.message = str;
            this.additionalProperties = map;
        }

        public final Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final String getMessage() {
            return this.message;
        }

        public /* synthetic */ Log(String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, map);
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log$Error;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$Log;", "message", "", "additionalProperties", "", "", "error", "", "stacktrace", "kind", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/Throwable;", "getKind", "()Ljava/lang/String;", "getStacktrace", "resolveKind", "resolveStacktrace", "dd-sdk-android-internal_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Error extends Log {
            private final Throwable error;
            private final String kind;
            private final String stacktrace;

            public /* synthetic */ Error(String str, Map map, Throwable th, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
            }

            public final Throwable getError() {
                return this.error;
            }

            public final String getKind() {
                return this.kind;
            }

            public final String getStacktrace() {
                return this.stacktrace;
            }

            public final String resolveKind() {
                String canonicalName = this.kind;
                if (canonicalName == null) {
                    Throwable th = this.error;
                    canonicalName = th != null ? th.getClass().getCanonicalName() : null;
                    if (canonicalName == null) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            return th2.getClass().getSimpleName();
                        }
                        return null;
                    }
                }
                return canonicalName;
            }

            public final String resolveStacktrace() {
                String str = this.stacktrace;
                if (str != null) {
                    return str;
                }
                Throwable th = this.error;
                if (th != null) {
                    return ThrowableExtKt.loggableStackTrace(th);
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(String str, Map<String, ? extends Object> map, Throwable th, String str2, String str3) {
                super(str, map, null);
                str.getClass();
                this.error = th;
                this.stacktrace = str2;
                this.kind = str3;
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\tB\u001f\b\u0004\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0002\u0010\u0006R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "additionalProperties", "", "", "", "(Ljava/util/Map;)V", "getAdditionalProperties", "()Ljava/util/Map;", "AddViewLoadingTime", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$AddViewLoadingTime;", "dd-sdk-android-internal_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static abstract class ApiUsage extends InternalTelemetryEvent {
        private final Map<String, Object> additionalProperties;

        public /* synthetic */ ApiUsage(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashMap() : map, null);
        }

        public final Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007¢\u0006\u0002\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$AddViewLoadingTime;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "overwrite", "", "noView", "noActiveView", "additionalProperties", "", "", "", "(ZZZLjava/util/Map;)V", "getNoActiveView", "()Z", "getNoView", "getOverwrite", "dd-sdk-android-internal_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class AddViewLoadingTime extends ApiUsage {
            private final boolean noActiveView;
            private final boolean noView;
            private final boolean overwrite;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddViewLoadingTime(boolean z, boolean z2, boolean z3, Map<String, Object> map) {
                super(map, null);
                map.getClass();
                this.overwrite = z;
                this.noView = z2;
                this.noActiveView = z3;
            }

            public final boolean getNoActiveView() {
                return this.noActiveView;
            }

            public final boolean getNoView() {
                return this.noView;
            }

            public final boolean getOverwrite() {
                return this.overwrite;
            }

            public /* synthetic */ AddViewLoadingTime(boolean z, boolean z2, boolean z3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, z2, z3, (i & 8) != 0 ? new LinkedHashMap() : map);
            }
        }

        public /* synthetic */ ApiUsage(Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(map);
        }

        private ApiUsage(Map<String, Object> map) {
            super(null);
            this.additionalProperties = map;
        }
    }
}
