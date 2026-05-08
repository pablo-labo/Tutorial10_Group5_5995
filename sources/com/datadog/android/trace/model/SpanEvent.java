package com.datadog.android.trace.model;

import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.datadog.android.trace.internal.domain.event.SpanEventSerializer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ab8;
import defpackage.akb;
import defpackage.b0;
import defpackage.bs4;
import defpackage.ey8;
import defpackage.fb8;
import defpackage.g7;
import defpackage.hh2;
import defpackage.ia;
import defpackage.ka8;
import defpackage.l5;
import defpackage.l6;
import defpackage.o6;
import defpackage.q6;
import defpackage.s6;
import defpackage.u40;
import defpackage.ut0;
import defpackage.w20;
import defpackage.wl7;
import defpackage.z3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u0000 C2\u00020\u0001:\u0010DECFGHIJKLMNOPQRBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J~\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0017J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u0017R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u00105R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010/\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u00105R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b8\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b;\u0010\u001eR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b<\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010\"R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010$R\u001a\u0010A\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\bA\u0010/\u001a\u0004\bB\u0010\u0017¨\u0006S"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent;", "", "", "traceId", "spanId", "parentId", RumEventDeserializer.EVENT_TYPE_RESOURCE, "name", "service", "", "duration", "start", "error", "Lcom/datadog/android/trace/model/SpanEvent$Metrics;", SpanEventSerializer.METRICS_KEY_PREFIX, "Lcom/datadog/android/trace/model/SpanEvent$Meta;", "meta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLcom/datadog/android/trace/model/SpanEvent$Metrics;Lcom/datadog/android/trace/model/SpanEvent$Meta;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()J", "component8", "component9", "component10", "()Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "component11", "()Lcom/datadog/android/trace/model/SpanEvent$Meta;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLcom/datadog/android/trace/model/SpanEvent$Metrics;Lcom/datadog/android/trace/model/SpanEvent$Meta;)Lcom/datadog/android/trace/model/SpanEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTraceId", "getSpanId", "getParentId", "getResource", "setResource", "(Ljava/lang/String;)V", "getName", "setName", "getService", "J", "getDuration", "getStart", "getError", "Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "getMetrics", "Lcom/datadog/android/trace/model/SpanEvent$Meta;", "getMeta", "type", "getType", "Companion", "Application", "Client", "Dd", "Device", "Meta", "Metrics", "Network", "Os", "Session", "SimCarrier", "Span", "Tracer", "Type", "Usr", "View", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class SpanEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long duration;
    private final long error;
    private final Meta meta;
    private final Metrics metrics;
    private String name;
    private final String parentId;
    private String resource;
    private final String service;
    private final String spanId;
    private final long start;
    private final String traceId;
    private final String type;

    public SpanEvent(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3, Metrics metrics, Meta meta) {
        w20.p(str, str2, str3, str4, str5);
        str6.getClass();
        metrics.getClass();
        meta.getClass();
        this.traceId = str;
        this.spanId = str2;
        this.parentId = str3;
        this.resource = str4;
        this.name = str5;
        this.service = str6;
        this.duration = j;
        this.start = j2;
        this.error = j3;
        this.metrics = metrics;
        this.meta = meta;
        this.type = "custom";
    }

    public static final SpanEvent fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public static final SpanEvent fromJsonObject(ab8 ab8Var) {
        return INSTANCE.fromJsonObject(ab8Var);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Metrics getMetrics() {
        return this.metrics;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSpanId() {
        return this.spanId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getResource() {
        return this.resource;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getService() {
        return this.service;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getError() {
        return this.error;
    }

    public final SpanEvent copy(String traceId, String spanId, String parentId, String resource, String name, String service, long duration, long start, long error, Metrics metrics, Meta meta) {
        w20.p(traceId, spanId, parentId, resource, name);
        service.getClass();
        metrics.getClass();
        meta.getClass();
        return new SpanEvent(traceId, spanId, parentId, resource, name, service, duration, start, error, metrics, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanEvent)) {
            return false;
        }
        SpanEvent spanEvent = (SpanEvent) other;
        return wl7.b(this.traceId, spanEvent.traceId) && wl7.b(this.spanId, spanEvent.spanId) && wl7.b(this.parentId, spanEvent.parentId) && wl7.b(this.resource, spanEvent.resource) && wl7.b(this.name, spanEvent.name) && wl7.b(this.service, spanEvent.service) && this.duration == spanEvent.duration && this.start == spanEvent.start && this.error == spanEvent.error && wl7.b(this.metrics, spanEvent.metrics) && wl7.b(this.meta, spanEvent.meta);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getError() {
        return this.error;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final Metrics getMetrics() {
        return this.metrics;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getResource() {
        return this.resource;
    }

    public final String getService() {
        return this.service;
    }

    public final String getSpanId() {
        return this.spanId;
    }

    public final long getStart() {
        return this.start;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.meta.hashCode() + ((this.metrics.hashCode() + ia.d(ia.d(ia.d(akb.d(akb.d(akb.d(akb.d(akb.d(this.traceId.hashCode() * 31, 31, this.spanId), 31, this.parentId), 31, this.resource), 31, this.name), 31, this.service), 31, this.duration), 31, this.start), 31, this.error)) * 31);
    }

    public final void setName(String str) {
        str.getClass();
        this.name = str;
    }

    public final void setResource(String str) {
        str.getClass();
        this.resource = str;
    }

    public final ka8 toJson() {
        ab8 ab8Var = new ab8();
        ab8Var.l("trace_id", this.traceId);
        ab8Var.l("span_id", this.spanId);
        ab8Var.l("parent_id", this.parentId);
        ab8Var.l(RumEventDeserializer.EVENT_TYPE_RESOURCE, this.resource);
        ab8Var.l("name", this.name);
        ab8Var.l("service", this.service);
        ab8Var.j(Long.valueOf(this.duration), "duration");
        ab8Var.j(Long.valueOf(this.start), "start");
        ab8Var.j(Long.valueOf(this.error), "error");
        ab8Var.l("type", this.type);
        ab8Var.i(SpanEventSerializer.METRICS_KEY_PREFIX, this.metrics.toJson());
        ab8Var.i("meta", this.meta.toJson());
        return ab8Var;
    }

    public String toString() {
        String str = this.traceId;
        String str2 = this.spanId;
        String str3 = this.parentId;
        String str4 = this.resource;
        String str5 = this.name;
        String str6 = this.service;
        long j = this.duration;
        long j2 = this.start;
        long j3 = this.error;
        Metrics metrics = this.metrics;
        Meta meta = this.meta;
        StringBuilder sbF = u40.f("SpanEvent(traceId=", str, ", spanId=", str2, ", parentId=");
        ia.r(sbF, str3, ", resource=", str4, ", name=");
        ia.r(sbF, str5, ", service=", str6, ", duration=");
        sbF.append(j);
        o6.p(sbF, ", start=", j2, ", error=");
        sbF.append(j3);
        sbF.append(", metrics=");
        sbF.append(metrics);
        sbF.append(", meta=");
        sbF.append(meta);
        sbF.append(")");
        return sbF.toString();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Application;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Application;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Application {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;

        public /* synthetic */ Application(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ Application copy$default(Application application, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = application.id;
            }
            return application.copy(str);
        }

        public static final Application fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Application fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Application copy(String id) {
            return new Application(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Application) && wl7.b(this.id, ((Application) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.id;
            if (str != null) {
                ab8Var.l("id", str);
            }
            return ab8Var;
        }

        public String toString() {
            return l5.m("Application(id=", this.id, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Application;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/trace/model/SpanEvent$Application;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Application fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Application", e);
                    return null;
                }
            }

            public final Application fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("id");
                    return new Application(ka8VarM != null ? ka8VarM.g() : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Application", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Application", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Application", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Application(String str) {
            this.id = str;
        }

        public Application() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011JL\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b%\u0010\u0011¨\u0006'"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Client;", "", "Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "simCarrier", "", "signalStrength", "downlinkKbps", "uplinkKbps", "connectivity", "<init>", "(Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Client;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "getSimCarrier", "Ljava/lang/String;", "getSignalStrength", "getDownlinkKbps", "getUplinkKbps", "getConnectivity", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Client {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String connectivity;
        private final String downlinkKbps;
        private final String signalStrength;
        private final SimCarrier simCarrier;
        private final String uplinkKbps;

        public /* synthetic */ Client(SimCarrier simCarrier, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : simCarrier, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public static /* synthetic */ Client copy$default(Client client, SimCarrier simCarrier, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                simCarrier = client.simCarrier;
            }
            if ((i & 2) != 0) {
                str = client.signalStrength;
            }
            if ((i & 4) != 0) {
                str2 = client.downlinkKbps;
            }
            if ((i & 8) != 0) {
                str3 = client.uplinkKbps;
            }
            if ((i & 16) != 0) {
                str4 = client.connectivity;
            }
            String str5 = str4;
            String str6 = str2;
            return client.copy(simCarrier, str, str6, str3, str5);
        }

        public static final Client fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Client fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SimCarrier getSimCarrier() {
            return this.simCarrier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSignalStrength() {
            return this.signalStrength;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDownlinkKbps() {
            return this.downlinkKbps;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUplinkKbps() {
            return this.uplinkKbps;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getConnectivity() {
            return this.connectivity;
        }

        public final Client copy(SimCarrier simCarrier, String signalStrength, String downlinkKbps, String uplinkKbps, String connectivity) {
            return new Client(simCarrier, signalStrength, downlinkKbps, uplinkKbps, connectivity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Client)) {
                return false;
            }
            Client client = (Client) other;
            return wl7.b(this.simCarrier, client.simCarrier) && wl7.b(this.signalStrength, client.signalStrength) && wl7.b(this.downlinkKbps, client.downlinkKbps) && wl7.b(this.uplinkKbps, client.uplinkKbps) && wl7.b(this.connectivity, client.connectivity);
        }

        public final String getConnectivity() {
            return this.connectivity;
        }

        public final String getDownlinkKbps() {
            return this.downlinkKbps;
        }

        public final String getSignalStrength() {
            return this.signalStrength;
        }

        public final SimCarrier getSimCarrier() {
            return this.simCarrier;
        }

        public final String getUplinkKbps() {
            return this.uplinkKbps;
        }

        public int hashCode() {
            SimCarrier simCarrier = this.simCarrier;
            int iHashCode = (simCarrier == null ? 0 : simCarrier.hashCode()) * 31;
            String str = this.signalStrength;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.downlinkKbps;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.uplinkKbps;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.connectivity;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            SimCarrier simCarrier = this.simCarrier;
            if (simCarrier != null) {
                ab8Var.i("sim_carrier", simCarrier.toJson());
            }
            String str = this.signalStrength;
            if (str != null) {
                ab8Var.l("signal_strength", str);
            }
            String str2 = this.downlinkKbps;
            if (str2 != null) {
                ab8Var.l("downlink_kbps", str2);
            }
            String str3 = this.uplinkKbps;
            if (str3 != null) {
                ab8Var.l("uplink_kbps", str3);
            }
            String str4 = this.connectivity;
            if (str4 != null) {
                ab8Var.l("connectivity", str4);
            }
            return ab8Var;
        }

        public String toString() {
            SimCarrier simCarrier = this.simCarrier;
            String str = this.signalStrength;
            String str2 = this.downlinkKbps;
            String str3 = this.uplinkKbps;
            String str4 = this.connectivity;
            StringBuilder sb = new StringBuilder("Client(simCarrier=");
            sb.append(simCarrier);
            sb.append(", signalStrength=");
            sb.append(str);
            sb.append(", downlinkKbps=");
            ia.r(sb, str2, ", uplinkKbps=", str3, ", connectivity=");
            return l6.i(sb, str4, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Client$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Client;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Client;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/trace/model/SpanEvent$Client;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Client fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Client", e);
                    return null;
                }
            }

            public final Client fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("sim_carrier");
                    SimCarrier simCarrierFromJsonObject = ka8VarM != null ? SimCarrier.INSTANCE.fromJsonObject(ka8VarM.d()) : null;
                    ka8 ka8VarM2 = jsonObject.m("signal_strength");
                    String strG = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("downlink_kbps");
                    String strG2 = ka8VarM3 != null ? ka8VarM3.g() : null;
                    ka8 ka8VarM4 = jsonObject.m("uplink_kbps");
                    String strG3 = ka8VarM4 != null ? ka8VarM4.g() : null;
                    ka8 ka8VarM5 = jsonObject.m("connectivity");
                    return new Client(simCarrierFromJsonObject, strG, strG2, strG3, ka8VarM5 != null ? ka8VarM5.g() : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Client", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Client", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Client", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Client(SimCarrier simCarrier, String str, String str2, String str3, String str4) {
            this.simCarrier = simCarrier;
            this.signalStrength = str;
            this.downlinkKbps = str2;
            this.uplinkKbps = str3;
            this.connectivity = str4;
        }

        public Client() {
            this(null, null, null, null, null, 31, null);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0016¨\u0006*"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Dd;", "", "", "source", "Lcom/datadog/android/trace/model/SpanEvent$Application;", "application", "Lcom/datadog/android/trace/model/SpanEvent$Session;", "session", "Lcom/datadog/android/trace/model/SpanEvent$View;", "view", "<init>", "(Ljava/lang/String;Lcom/datadog/android/trace/model/SpanEvent$Application;Lcom/datadog/android/trace/model/SpanEvent$Session;Lcom/datadog/android/trace/model/SpanEvent$View;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/datadog/android/trace/model/SpanEvent$Application;", "component3", "()Lcom/datadog/android/trace/model/SpanEvent$Session;", "component4", "()Lcom/datadog/android/trace/model/SpanEvent$View;", "copy", "(Ljava/lang/String;Lcom/datadog/android/trace/model/SpanEvent$Application;Lcom/datadog/android/trace/model/SpanEvent$Session;Lcom/datadog/android/trace/model/SpanEvent$View;)Lcom/datadog/android/trace/model/SpanEvent$Dd;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "Lcom/datadog/android/trace/model/SpanEvent$Application;", "getApplication", "Lcom/datadog/android/trace/model/SpanEvent$Session;", "getSession", "Lcom/datadog/android/trace/model/SpanEvent$View;", "getView", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Dd {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Application application;
        private final Session session;
        private final String source;
        private final View view;

        public /* synthetic */ Dd(String str, Application application, Session session, View view, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CoreFeature.DEFAULT_SOURCE_NAME : str, (i & 2) != 0 ? null : application, (i & 4) != 0 ? null : session, (i & 8) != 0 ? null : view);
        }

        public static /* synthetic */ Dd copy$default(Dd dd, String str, Application application, Session session, View view, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dd.source;
            }
            if ((i & 2) != 0) {
                application = dd.application;
            }
            if ((i & 4) != 0) {
                session = dd.session;
            }
            if ((i & 8) != 0) {
                view = dd.view;
            }
            return dd.copy(str, application, session, view);
        }

        public static final Dd fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Dd fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Application getApplication() {
            return this.application;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Session getSession() {
            return this.session;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final View getView() {
            return this.view;
        }

        public final Dd copy(String source, Application application, Session session, View view) {
            return new Dd(source, application, session, view);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dd)) {
                return false;
            }
            Dd dd = (Dd) other;
            return wl7.b(this.source, dd.source) && wl7.b(this.application, dd.application) && wl7.b(this.session, dd.session) && wl7.b(this.view, dd.view);
        }

        public final Application getApplication() {
            return this.application;
        }

        public final Session getSession() {
            return this.session;
        }

        public final String getSource() {
            return this.source;
        }

        public final View getView() {
            return this.view;
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Application application = this.application;
            int iHashCode2 = (iHashCode + (application == null ? 0 : application.hashCode())) * 31;
            Session session = this.session;
            int iHashCode3 = (iHashCode2 + (session == null ? 0 : session.hashCode())) * 31;
            View view = this.view;
            return iHashCode3 + (view != null ? view.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.source;
            if (str != null) {
                ab8Var.l("source", str);
            }
            Application application = this.application;
            if (application != null) {
                ab8Var.i("application", application.toJson());
            }
            Session session = this.session;
            if (session != null) {
                ab8Var.i("session", session.toJson());
            }
            View view = this.view;
            if (view != null) {
                ab8Var.i("view", view.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            return "Dd(source=" + this.source + ", application=" + this.application + ", session=" + this.session + ", view=" + this.view + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Dd$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Dd;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Dd;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/trace/model/SpanEvent$Dd;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Dd fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Dd", e);
                    return null;
                }
            }

            public final Dd fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("source");
                    String strG = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("application");
                    Application applicationFromJsonObject = ka8VarM2 != null ? Application.INSTANCE.fromJsonObject(ka8VarM2.d()) : null;
                    ka8 ka8VarM3 = jsonObject.m("session");
                    Session sessionFromJsonObject = ka8VarM3 != null ? Session.INSTANCE.fromJsonObject(ka8VarM3.d()) : null;
                    ka8 ka8VarM4 = jsonObject.m("view");
                    return new Dd(strG, applicationFromJsonObject, sessionFromJsonObject, ka8VarM4 != null ? View.INSTANCE.fromJsonObject(ka8VarM4.d()) : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Dd", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Dd", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Dd", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Dd(String str, Application application, Session session, View view) {
            this.source = str;
            this.application = application;
            this.session = session;
            this.view = view;
        }

        public Dd() {
            this(null, null, null, null, 15, null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011JJ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b%\u0010\u0011¨\u0006'"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Device;", "", "Lcom/datadog/android/trace/model/SpanEvent$Type;", "type", "", "name", "model", "brand", "architecture", "<init>", "(Lcom/datadog/android/trace/model/SpanEvent$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/trace/model/SpanEvent$Type;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/datadog/android/trace/model/SpanEvent$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Device;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/trace/model/SpanEvent$Type;", "getType", "Ljava/lang/String;", "getName", "getModel", "getBrand", "getArchitecture", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Device {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String architecture;
        private final String brand;
        private final String model;
        private final String name;
        private final Type type;

        public /* synthetic */ Device(Type type, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(type, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public static /* synthetic */ Device copy$default(Device device, Type type, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                type = device.type;
            }
            if ((i & 2) != 0) {
                str = device.name;
            }
            if ((i & 4) != 0) {
                str2 = device.model;
            }
            if ((i & 8) != 0) {
                str3 = device.brand;
            }
            if ((i & 16) != 0) {
                str4 = device.architecture;
            }
            String str5 = str4;
            String str6 = str2;
            return device.copy(type, str, str6, str3, str5);
        }

        public static final Device fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Device fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getModel() {
            return this.model;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getBrand() {
            return this.brand;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getArchitecture() {
            return this.architecture;
        }

        public final Device copy(Type type, String name, String model, String brand, String architecture) {
            type.getClass();
            return new Device(type, name, model, brand, architecture);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Device)) {
                return false;
            }
            Device device = (Device) other;
            return this.type == device.type && wl7.b(this.name, device.name) && wl7.b(this.model, device.model) && wl7.b(this.brand, device.brand) && wl7.b(this.architecture, device.architecture);
        }

        public final String getArchitecture() {
            return this.architecture;
        }

        public final String getBrand() {
            return this.brand;
        }

        public final String getModel() {
            return this.model;
        }

        public final String getName() {
            return this.name;
        }

        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.name;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.model;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.brand;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.architecture;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.i("type", this.type.toJson());
            String str = this.name;
            if (str != null) {
                ab8Var.l("name", str);
            }
            String str2 = this.model;
            if (str2 != null) {
                ab8Var.l("model", str2);
            }
            String str3 = this.brand;
            if (str3 != null) {
                ab8Var.l("brand", str3);
            }
            String str4 = this.architecture;
            if (str4 != null) {
                ab8Var.l("architecture", str4);
            }
            return ab8Var;
        }

        public String toString() {
            Type type = this.type;
            String str = this.name;
            String str2 = this.model;
            String str3 = this.brand;
            String str4 = this.architecture;
            StringBuilder sb = new StringBuilder("Device(type=");
            sb.append(type);
            sb.append(", name=");
            sb.append(str);
            sb.append(", model=");
            ia.r(sb, str2, ", brand=", str3, ", architecture=");
            return l6.i(sb, str4, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Device$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Device;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Device;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/trace/model/SpanEvent$Device;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Device fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Device", e);
                    return null;
                }
            }

            public final Device fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    Type.Companion companion = Type.INSTANCE;
                    String strG = jsonObject.m("type").g();
                    strG.getClass();
                    Type typeFromJson = companion.fromJson(strG);
                    ka8 ka8VarM = jsonObject.m("name");
                    String strG2 = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("model");
                    String strG3 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("brand");
                    String strG4 = ka8VarM3 != null ? ka8VarM3.g() : null;
                    ka8 ka8VarM4 = jsonObject.m("architecture");
                    return new Device(typeFromJson, strG2, strG3, strG4, ka8VarM4 != null ? ka8VarM4.g() : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Device", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Device", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Device", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Device(Type type, String str, String str2, String str3, String str4) {
            type.getClass();
            this.type = type;
            this.name = str;
            this.model = str2;
            this.brand = str3;
            this.architecture = str4;
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u0000 G2\u00020\u0001:\u0001GBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u001c\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*Jx\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0012HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001aJ\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010$R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010&R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010(R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bF\u0010*¨\u0006H"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Meta;", "", "", "version", "Lcom/datadog/android/trace/model/SpanEvent$Dd;", "dd", "Lcom/datadog/android/trace/model/SpanEvent$Span;", "span", "Lcom/datadog/android/trace/model/SpanEvent$Tracer;", "tracer", "Lcom/datadog/android/trace/model/SpanEvent$Usr;", "usr", "Lcom/datadog/android/trace/model/SpanEvent$Network;", "network", "Lcom/datadog/android/trace/model/SpanEvent$Device;", "device", "Lcom/datadog/android/trace/model/SpanEvent$Os;", "os", "", "additionalProperties", "<init>", "(Ljava/lang/String;Lcom/datadog/android/trace/model/SpanEvent$Dd;Lcom/datadog/android/trace/model/SpanEvent$Span;Lcom/datadog/android/trace/model/SpanEvent$Tracer;Lcom/datadog/android/trace/model/SpanEvent$Usr;Lcom/datadog/android/trace/model/SpanEvent$Network;Lcom/datadog/android/trace/model/SpanEvent$Device;Lcom/datadog/android/trace/model/SpanEvent$Os;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/datadog/android/trace/model/SpanEvent$Dd;", "component3", "()Lcom/datadog/android/trace/model/SpanEvent$Span;", "component4", "()Lcom/datadog/android/trace/model/SpanEvent$Tracer;", "component5", "()Lcom/datadog/android/trace/model/SpanEvent$Usr;", "component6", "()Lcom/datadog/android/trace/model/SpanEvent$Network;", "component7", "()Lcom/datadog/android/trace/model/SpanEvent$Device;", "component8", "()Lcom/datadog/android/trace/model/SpanEvent$Os;", "component9", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Lcom/datadog/android/trace/model/SpanEvent$Dd;Lcom/datadog/android/trace/model/SpanEvent$Span;Lcom/datadog/android/trace/model/SpanEvent$Tracer;Lcom/datadog/android/trace/model/SpanEvent$Usr;Lcom/datadog/android/trace/model/SpanEvent$Network;Lcom/datadog/android/trace/model/SpanEvent$Device;Lcom/datadog/android/trace/model/SpanEvent$Os;Ljava/util/Map;)Lcom/datadog/android/trace/model/SpanEvent$Meta;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVersion", "Lcom/datadog/android/trace/model/SpanEvent$Dd;", "getDd", "Lcom/datadog/android/trace/model/SpanEvent$Span;", "getSpan", "Lcom/datadog/android/trace/model/SpanEvent$Tracer;", "getTracer", "Lcom/datadog/android/trace/model/SpanEvent$Usr;", "getUsr", "Lcom/datadog/android/trace/model/SpanEvent$Network;", "getNetwork", "Lcom/datadog/android/trace/model/SpanEvent$Device;", "getDevice", "Lcom/datadog/android/trace/model/SpanEvent$Os;", "getOs", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Meta {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String[] RESERVED_PROPERTIES = {"version", "_dd", "span", "tracer", "usr", "network", "device", "os"};
        private final Map<String, String> additionalProperties;
        private final Dd dd;
        private final Device device;
        private final Network network;
        private final Os os;
        private final Span span;
        private final Tracer tracer;
        private final Usr usr;
        private final String version;

        public Meta(String str, Dd dd, Span span, Tracer tracer, Usr usr, Network network, Device device, Os os, Map<String, String> map) {
            str.getClass();
            dd.getClass();
            span.getClass();
            tracer.getClass();
            usr.getClass();
            device.getClass();
            os.getClass();
            map.getClass();
            this.version = str;
            this.dd = dd;
            this.span = span;
            this.tracer = tracer;
            this.usr = usr;
            this.network = network;
            this.device = device;
            this.os = os;
            this.additionalProperties = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Meta copy$default(Meta meta, String str, Dd dd, Span span, Tracer tracer, Usr usr, Network network, Device device, Os os, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = meta.version;
            }
            if ((i & 2) != 0) {
                dd = meta.dd;
            }
            if ((i & 4) != 0) {
                span = meta.span;
            }
            if ((i & 8) != 0) {
                tracer = meta.tracer;
            }
            if ((i & 16) != 0) {
                usr = meta.usr;
            }
            if ((i & 32) != 0) {
                network = meta.network;
            }
            if ((i & 64) != 0) {
                device = meta.device;
            }
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                os = meta.os;
            }
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                map = meta.additionalProperties;
            }
            Os os2 = os;
            Map map2 = map;
            Network network2 = network;
            Device device2 = device;
            Usr usr2 = usr;
            Span span2 = span;
            return meta.copy(str, dd, span2, tracer, usr2, network2, device2, os2, map2);
        }

        public static final Meta fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Meta fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Dd getDd() {
            return this.dd;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Span getSpan() {
            return this.span;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Tracer getTracer() {
            return this.tracer;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Usr getUsr() {
            return this.usr;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Network getNetwork() {
            return this.network;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Device getDevice() {
            return this.device;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Os getOs() {
            return this.os;
        }

        public final Map<String, String> component9() {
            return this.additionalProperties;
        }

        public final Meta copy(String version, Dd dd, Span span, Tracer tracer, Usr usr, Network network, Device device, Os os, Map<String, String> additionalProperties) {
            version.getClass();
            dd.getClass();
            span.getClass();
            tracer.getClass();
            usr.getClass();
            device.getClass();
            os.getClass();
            additionalProperties.getClass();
            return new Meta(version, dd, span, tracer, usr, network, device, os, additionalProperties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Meta)) {
                return false;
            }
            Meta meta = (Meta) other;
            return wl7.b(this.version, meta.version) && wl7.b(this.dd, meta.dd) && wl7.b(this.span, meta.span) && wl7.b(this.tracer, meta.tracer) && wl7.b(this.usr, meta.usr) && wl7.b(this.network, meta.network) && wl7.b(this.device, meta.device) && wl7.b(this.os, meta.os) && wl7.b(this.additionalProperties, meta.additionalProperties);
        }

        public final Map<String, String> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final Dd getDd() {
            return this.dd;
        }

        public final Device getDevice() {
            return this.device;
        }

        public final Network getNetwork() {
            return this.network;
        }

        public final Os getOs() {
            return this.os;
        }

        public final Span getSpan() {
            return this.span;
        }

        public final Tracer getTracer() {
            return this.tracer;
        }

        public final Usr getUsr() {
            return this.usr;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iHashCode = (this.usr.hashCode() + ((this.tracer.hashCode() + ((this.span.hashCode() + ((this.dd.hashCode() + (this.version.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
            Network network = this.network;
            return this.additionalProperties.hashCode() + ((this.os.hashCode() + ((this.device.hashCode() + ((iHashCode + (network == null ? 0 : network.hashCode())) * 31)) * 31)) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("version", this.version);
            ab8Var.i("_dd", this.dd.toJson());
            ab8Var.i("span", this.span.toJson());
            ab8Var.i("tracer", this.tracer.toJson());
            ab8Var.i("usr", this.usr.toJson());
            Network network = this.network;
            if (network != null) {
                ab8Var.i("network", network.toJson());
            }
            ab8Var.i("device", this.device.toJson());
            ab8Var.i("os", this.os.toJson());
            for (Map.Entry<String, String> entry : this.additionalProperties.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!ut0.f0(key, RESERVED_PROPERTIES)) {
                    ab8Var.l(key, value);
                }
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.version;
            Dd dd = this.dd;
            Span span = this.span;
            Tracer tracer = this.tracer;
            Usr usr = this.usr;
            Network network = this.network;
            Device device = this.device;
            Os os = this.os;
            Map<String, String> map = this.additionalProperties;
            StringBuilder sb = new StringBuilder("Meta(version=");
            sb.append(str);
            sb.append(", dd=");
            sb.append(dd);
            sb.append(", span=");
            sb.append(span);
            sb.append(", tracer=");
            sb.append(tracer);
            sb.append(", usr=");
            sb.append(usr);
            sb.append(", network=");
            sb.append(network);
            sb.append(", device=");
            sb.append(device);
            sb.append(", os=");
            sb.append(os);
            sb.append(", additionalProperties=");
            return b0.k(sb, map, ")");
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Meta$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Meta;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Meta;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/trace/model/SpanEvent$Meta;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_trace_release", "()[Ljava/lang/String;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Meta fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Meta", e);
                    return null;
                }
            }

            public final Meta fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("version").g();
                    Dd ddFromJsonObject = Dd.INSTANCE.fromJsonObject(jsonObject.m("_dd").d());
                    Span spanFromJsonObject = Span.INSTANCE.fromJsonObject(jsonObject.m("span").d());
                    Tracer tracerFromJsonObject = Tracer.INSTANCE.fromJsonObject(jsonObject.m("tracer").d());
                    Usr usrFromJsonObject = Usr.INSTANCE.fromJsonObject(jsonObject.m("usr").d());
                    ka8 ka8VarM = jsonObject.m("network");
                    Network networkFromJsonObject = ka8VarM != null ? Network.INSTANCE.fromJsonObject(ka8VarM.d()) : null;
                    Device deviceFromJsonObject = Device.INSTANCE.fromJsonObject(jsonObject.m("device").d());
                    Os osFromJsonObject = Os.INSTANCE.fromJsonObject(jsonObject.m("os").d());
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : (ey8.b) jsonObject.a.entrySet()) {
                        if (!ut0.f0(entry.getKey(), getRESERVED_PROPERTIES$dd_sdk_android_trace_release())) {
                            Object key = entry.getKey();
                            key.getClass();
                            String strG2 = ((ka8) entry.getValue()).g();
                            strG2.getClass();
                            linkedHashMap.put(key, strG2);
                        }
                    }
                    strG.getClass();
                    return new Meta(strG, ddFromJsonObject, spanFromJsonObject, tracerFromJsonObject, usrFromJsonObject, networkFromJsonObject, deviceFromJsonObject, osFromJsonObject, linkedHashMap);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Meta", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Meta", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Meta", e3);
                    return null;
                }
            }

            public final String[] getRESERVED_PROPERTIES$dd_sdk_android_trace_release() {
                return Meta.RESERVED_PROPERTIES;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Meta(String str, Dd dd, Span span, Tracer tracer, Usr usr, Network network, Device device, Os os, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, dd, span, tracer, usr, (i & 32) != 0 ? null : network, device, os, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bs4.a : map);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "", "", "topLevel", "", "", "", "additionalProperties", "<init>", "(Ljava/lang/Long;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/Long;Ljava/util/Map;)Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getTopLevel", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Metrics {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String[] RESERVED_PROPERTIES = {"_top_level"};
        private final Map<String, Number> additionalProperties;
        private final Long topLevel;

        public /* synthetic */ Metrics(Long l, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? bs4.a : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Metrics copy$default(Metrics metrics, Long l, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                l = metrics.topLevel;
            }
            if ((i & 2) != 0) {
                map = metrics.additionalProperties;
            }
            return metrics.copy(l, map);
        }

        public static final Metrics fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Metrics fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getTopLevel() {
            return this.topLevel;
        }

        public final Map<String, Number> component2() {
            return this.additionalProperties;
        }

        public final Metrics copy(Long topLevel, Map<String, ? extends Number> additionalProperties) {
            additionalProperties.getClass();
            return new Metrics(topLevel, additionalProperties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metrics)) {
                return false;
            }
            Metrics metrics = (Metrics) other;
            return wl7.b(this.topLevel, metrics.topLevel) && wl7.b(this.additionalProperties, metrics.additionalProperties);
        }

        public final Map<String, Number> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final Long getTopLevel() {
            return this.topLevel;
        }

        public int hashCode() {
            Long l = this.topLevel;
            return this.additionalProperties.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            Long l = this.topLevel;
            if (l != null) {
                ia.o(l, ab8Var, "_top_level");
            }
            for (Map.Entry<String, Number> entry : this.additionalProperties.entrySet()) {
                String key = entry.getKey();
                Number value = entry.getValue();
                if (!ut0.f0(key, RESERVED_PROPERTIES)) {
                    ab8Var.j(value, key);
                }
            }
            return ab8Var;
        }

        public String toString() {
            return "Metrics(topLevel=" + this.topLevel + ", additionalProperties=" + this.additionalProperties + ")";
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Metrics$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_trace_release", "()[Ljava/lang/String;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Metrics fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Metrics", e);
                    return null;
                }
            }

            public final Metrics fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("_top_level");
                    Long lValueOf = ka8VarM != null ? Long.valueOf(ka8VarM.e()) : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = ((ey8.b) jsonObject.a.entrySet()).iterator();
                    while (((ey8.d) it).hasNext()) {
                        Map.Entry entryA = ((ey8.b.a) it).a();
                        if (!ut0.f0(entryA.getKey(), getRESERVED_PROPERTIES$dd_sdk_android_trace_release())) {
                            Object key = entryA.getKey();
                            key.getClass();
                            Number numberF = ((ka8) entryA.getValue()).f();
                            numberF.getClass();
                            linkedHashMap.put(key, numberF);
                        }
                    }
                    return new Metrics(lValueOf, linkedHashMap);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Metrics", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Metrics", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Metrics", e3);
                    return null;
                }
            }

            public final String[] getRESERVED_PROPERTIES$dd_sdk_android_trace_release() {
                return Metrics.RESERVED_PROPERTIES;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Metrics(Long l, Map<String, ? extends Number> map) {
            map.getClass();
            this.topLevel = l;
            this.additionalProperties = map;
        }

        public Metrics() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Network;", "", "Lcom/datadog/android/trace/model/SpanEvent$Client;", "client", "<init>", "(Lcom/datadog/android/trace/model/SpanEvent$Client;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/trace/model/SpanEvent$Client;", "copy", "(Lcom/datadog/android/trace/model/SpanEvent$Client;)Lcom/datadog/android/trace/model/SpanEvent$Network;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/trace/model/SpanEvent$Client;", "getClient", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Network {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Client client;

        public /* synthetic */ Network(Client client, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : client);
        }

        public static /* synthetic */ Network copy$default(Network network, Client client, int i, Object obj) {
            if ((i & 1) != 0) {
                client = network.client;
            }
            return network.copy(client);
        }

        public static final Network fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Network fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Client getClient() {
            return this.client;
        }

        public final Network copy(Client client) {
            return new Network(client);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Network) && wl7.b(this.client, ((Network) other).client);
        }

        public final Client getClient() {
            return this.client;
        }

        public int hashCode() {
            Client client = this.client;
            if (client == null) {
                return 0;
            }
            return client.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            Client client = this.client;
            if (client != null) {
                ab8Var.i("client", client.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            return "Network(client=" + this.client + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Network$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Network;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Network;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/trace/model/SpanEvent$Network;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Network fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Network", e);
                    return null;
                }
            }

            public final Network fromJsonObject(ab8 jsonObject) {
                Client clientFromJsonObject;
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("client");
                    if (ka8VarM != null) {
                        clientFromJsonObject = Client.INSTANCE.fromJsonObject(ka8VarM.d());
                    } else {
                        clientFromJsonObject = null;
                    }
                    return new Network(clientFromJsonObject);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Network", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Network", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Network", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Network(Client client) {
            this.client = client;
        }

        public Network() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ:\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\r¨\u0006!"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Os;", "", "", "name", "version", "build", "versionMajor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Os;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getVersion", "getBuild", "getVersionMajor", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Os {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String build;
        private final String name;
        private final String version;
        private final String versionMajor;

        public Os(String str, String str2, String str3, String str4) {
            q6.m(str, str2, str4);
            this.name = str;
            this.version = str2;
            this.build = str3;
            this.versionMajor = str4;
        }

        public static /* synthetic */ Os copy$default(Os os, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = os.name;
            }
            if ((i & 2) != 0) {
                str2 = os.version;
            }
            if ((i & 4) != 0) {
                str3 = os.build;
            }
            if ((i & 8) != 0) {
                str4 = os.versionMajor;
            }
            return os.copy(str, str2, str3, str4);
        }

        public static final Os fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Os fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getBuild() {
            return this.build;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getVersionMajor() {
            return this.versionMajor;
        }

        public final Os copy(String name, String version, String build, String versionMajor) {
            name.getClass();
            version.getClass();
            versionMajor.getClass();
            return new Os(name, version, build, versionMajor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Os)) {
                return false;
            }
            Os os = (Os) other;
            return wl7.b(this.name, os.name) && wl7.b(this.version, os.version) && wl7.b(this.build, os.build) && wl7.b(this.versionMajor, os.versionMajor);
        }

        public final String getBuild() {
            return this.build;
        }

        public final String getName() {
            return this.name;
        }

        public final String getVersion() {
            return this.version;
        }

        public final String getVersionMajor() {
            return this.versionMajor;
        }

        public int hashCode() {
            int iD = akb.d(this.name.hashCode() * 31, 31, this.version);
            String str = this.build;
            return this.versionMajor.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("name", this.name);
            ab8Var.l("version", this.version);
            String str = this.build;
            if (str != null) {
                ab8Var.l("build", str);
            }
            ab8Var.l("version_major", this.versionMajor);
            return ab8Var;
        }

        public String toString() {
            String str = this.name;
            String str2 = this.version;
            return z3.n(u40.f("Os(name=", str, ", version=", str2, ", build="), this.build, ", versionMajor=", this.versionMajor, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Os$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Os;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Os;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/trace/model/SpanEvent$Os;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Os fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Os", e);
                    return null;
                }
            }

            public final Os fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("name").g();
                    String strG2 = jsonObject.m("version").g();
                    ka8 ka8VarM = jsonObject.m("build");
                    String strG3 = ka8VarM != null ? ka8VarM.g() : null;
                    String strG4 = jsonObject.m("version_major").g();
                    strG.getClass();
                    strG2.getClass();
                    strG4.getClass();
                    return new Os(strG, strG2, strG3, strG4);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Os", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Os", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Os", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ Os(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, str4);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Session;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Session;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Session {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;

        public /* synthetic */ Session(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ Session copy$default(Session session, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = session.id;
            }
            return session.copy(str);
        }

        public static final Session fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Session fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Session copy(String id) {
            return new Session(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Session) && wl7.b(this.id, ((Session) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.id;
            if (str != null) {
                ab8Var.l("id", str);
            }
            return ab8Var;
        }

        public String toString() {
            return l5.m("Session(id=", this.id, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Session$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Session;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Session;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/trace/model/SpanEvent$Session;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Session fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Session", e);
                    return null;
                }
            }

            public final Session fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("id");
                    return new Session(ka8VarM != null ? ka8VarM.g() : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Session", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Session", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Session", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Session(String str) {
            this.id = str;
        }

        public Session() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "", "", "id", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class SimCarrier {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;
        private final String name;

        public /* synthetic */ SimCarrier(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ SimCarrier copy$default(SimCarrier simCarrier, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = simCarrier.id;
            }
            if ((i & 2) != 0) {
                str2 = simCarrier.name;
            }
            return simCarrier.copy(str, str2);
        }

        public static final SimCarrier fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final SimCarrier fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final SimCarrier copy(String id, String name) {
            return new SimCarrier(id, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SimCarrier)) {
                return false;
            }
            SimCarrier simCarrier = (SimCarrier) other;
            return wl7.b(this.id, simCarrier.id) && wl7.b(this.name, simCarrier.name);
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.id;
            if (str != null) {
                ab8Var.l("id", str);
            }
            String str2 = this.name;
            if (str2 != null) {
                ab8Var.l("name", str2);
            }
            return ab8Var;
        }

        public String toString() {
            return akb.k("SimCarrier(id=", this.id, ", name=", this.name, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$SimCarrier$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/trace/model/SpanEvent$SimCarrier;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SimCarrier fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type SimCarrier", e);
                    return null;
                }
            }

            public final SimCarrier fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("id");
                    String strG = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("name");
                    return new SimCarrier(strG, ka8VarM2 != null ? ka8VarM2.g() : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type SimCarrier", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type SimCarrier", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type SimCarrier", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public SimCarrier(String str, String str2) {
            this.id = str;
            this.name = str2;
        }

        public SimCarrier() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Span;", "", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "", "kind", "Ljava/lang/String;", "getKind", "()Ljava/lang/String;", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Span {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String kind = "client";

        public static final Span fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Span fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        public final String getKind() {
            return this.kind;
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("kind", this.kind);
            return ab8Var;
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Span$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Span;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Span;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/trace/model/SpanEvent$Span;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Span fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Span", e);
                    return null;
                }
            }

            public final Span fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("kind");
                    String strG = ka8VarM != null ? ka8VarM.g() : null;
                    if (strG != null && !strG.equals("client")) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return new Span();
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Span", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Span", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Span", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Tracer;", "", "", "version", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Tracer;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVersion", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Tracer {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String version;

        public Tracer(String str) {
            str.getClass();
            this.version = str;
        }

        public static /* synthetic */ Tracer copy$default(Tracer tracer, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tracer.version;
            }
            return tracer.copy(str);
        }

        public static final Tracer fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Tracer fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final Tracer copy(String version) {
            version.getClass();
            return new Tracer(version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Tracer) && wl7.b(this.version, ((Tracer) other).version);
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("version", this.version);
            return ab8Var;
        }

        public String toString() {
            return l5.m("Tracer(version=", this.version, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Tracer$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Tracer;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Tracer;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/trace/model/SpanEvent$Tracer;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Tracer fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Tracer", e);
                    return null;
                }
            }

            public final Tracer fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("version").g();
                    strG.getClass();
                    return new Tracer(strG);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Tracer", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Tracer", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Tracer", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Type;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "MOBILE", "DESKTOP", "TABLET", "TV", "GAMING_CONSOLE", "BOT", "OTHER", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Type {
        MOBILE("mobile"),
        DESKTOP("desktop"),
        TABLET("tablet"),
        TV("tv"),
        GAMING_CONSOLE("gaming_console"),
        BOT("bot"),
        OTHER("other");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        Type(String str) {
            this.jsonValue = str;
        }

        public static final Type fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Type$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/trace/model/SpanEvent$Type;", "jsonString", "", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Type fromJson(String jsonString) {
                jsonString.getClass();
                for (Type type : Type.values()) {
                    if (wl7.b(type.jsonValue, jsonString)) {
                        return type;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u001e\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JL\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u000eR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006$"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Usr;", "", "", "id", "name", "email", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/trace/model/SpanEvent$Usr;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getEmail", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Usr {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String[] RESERVED_PROPERTIES = {"id", "name", "email"};
        private final Map<String, Object> additionalProperties;
        private final String email;
        private final String id;
        private final String name;

        public /* synthetic */ Usr(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new LinkedHashMap() : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Usr copy$default(Usr usr, String str, String str2, String str3, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = usr.id;
            }
            if ((i & 2) != 0) {
                str2 = usr.name;
            }
            if ((i & 4) != 0) {
                str3 = usr.email;
            }
            if ((i & 8) != 0) {
                map = usr.additionalProperties;
            }
            return usr.copy(str, str2, str3, map);
        }

        public static final Usr fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Usr fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final Map<String, Object> component4() {
            return this.additionalProperties;
        }

        public final Usr copy(String id, String name, String email, Map<String, Object> additionalProperties) {
            additionalProperties.getClass();
            return new Usr(id, name, email, additionalProperties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Usr)) {
                return false;
            }
            Usr usr = (Usr) other;
            return wl7.b(this.id, usr.id) && wl7.b(this.name, usr.name) && wl7.b(this.email, usr.email) && wl7.b(this.additionalProperties, usr.additionalProperties);
        }

        public final Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.email;
            return this.additionalProperties.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.id;
            if (str != null) {
                ab8Var.l("id", str);
            }
            String str2 = this.name;
            if (str2 != null) {
                ab8Var.l("name", str2);
            }
            String str3 = this.email;
            if (str3 != null) {
                ab8Var.l("email", str3);
            }
            for (Map.Entry<String, Object> entry : this.additionalProperties.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!ut0.f0(key, RESERVED_PROPERTIES)) {
                    ab8Var.i(key, JsonSerializer.INSTANCE.toJsonElement(value));
                }
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.id;
            String str2 = this.name;
            String str3 = this.email;
            Map<String, Object> map = this.additionalProperties;
            StringBuilder sbF = u40.f("Usr(id=", str, ", name=", str2, ", email=");
            sbF.append(str3);
            sbF.append(", additionalProperties=");
            sbF.append(map);
            sbF.append(")");
            return sbF.toString();
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Usr$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$Usr;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$Usr;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/trace/model/SpanEvent$Usr;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_trace_release", "()[Ljava/lang/String;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Usr fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Usr", e);
                    return null;
                }
            }

            public final Usr fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("id");
                    String strG = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("name");
                    String strG2 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("email");
                    String strG3 = ka8VarM3 != null ? ka8VarM3.g() : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : (ey8.b) jsonObject.a.entrySet()) {
                        if (!ut0.f0(entry.getKey(), getRESERVED_PROPERTIES$dd_sdk_android_trace_release())) {
                            Object key = entry.getKey();
                            key.getClass();
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new Usr(strG, strG2, strG3, linkedHashMap);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Usr", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Usr", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Usr", e3);
                    return null;
                }
            }

            public final String[] getRESERVED_PROPERTIES$dd_sdk_android_trace_release() {
                return Usr.RESERVED_PROPERTIES;
            }

            private Companion() {
            }
        }

        public Usr(String str, String str2, String str3, Map<String, Object> map) {
            map.getClass();
            this.id = str;
            this.name = str2;
            this.email = str3;
            this.additionalProperties = map;
        }

        public Usr() {
            this(null, null, null, null, 15, null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$View;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$View;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class View {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;

        public /* synthetic */ View(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ View copy$default(View view, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = view.id;
            }
            return view.copy(str);
        }

        public static final View fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final View fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final View copy(String id) {
            return new View(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof View) && wl7.b(this.id, ((View) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.id;
            if (str != null) {
                ab8Var.l("id", str);
            }
            return ab8Var;
        }

        public String toString() {
            return l5.m("View(id=", this.id, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$View$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent$View;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent$View;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/trace/model/SpanEvent$View;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final View fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type View", e);
                    return null;
                }
            }

            public final View fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("id");
                    return new View(ka8VarM != null ? ka8VarM.g() : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type View", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type View", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type View", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public View(String str) {
            this.id = str;
        }

        public View() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/trace/model/SpanEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/trace/model/SpanEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/trace/model/SpanEvent;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/trace/model/SpanEvent;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SpanEvent fromJson(String jsonString) {
            jsonString.getClass();
            try {
                return fromJsonObject(hh2.A(jsonString).d());
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type SpanEvent", e);
                return null;
            }
        }

        public final SpanEvent fromJsonObject(ab8 jsonObject) {
            SpanEvent spanEvent;
            String strG;
            String strG2;
            String strG3;
            String strG4;
            String strG5;
            String strG6;
            long jE;
            long jE2;
            long jE3;
            String strG7;
            jsonObject.getClass();
            try {
                strG = jsonObject.m("trace_id").g();
                strG2 = jsonObject.m("span_id").g();
                strG3 = jsonObject.m("parent_id").g();
                strG4 = jsonObject.m(RumEventDeserializer.EVENT_TYPE_RESOURCE).g();
                strG5 = jsonObject.m("name").g();
                strG6 = jsonObject.m("service").g();
                jE = jsonObject.m("duration").e();
                jE2 = jsonObject.m("start").e();
                jE3 = jsonObject.m("error").e();
                strG7 = jsonObject.m("type").g();
                spanEvent = null;
            } catch (IllegalStateException e) {
                e = e;
                spanEvent = null;
            } catch (NullPointerException e2) {
                e = e2;
                spanEvent = null;
            } catch (NumberFormatException e3) {
                e = e3;
                spanEvent = null;
            }
            try {
                Metrics metricsFromJsonObject = Metrics.INSTANCE.fromJsonObject(jsonObject.m(SpanEventSerializer.METRICS_KEY_PREFIX).d());
                Meta metaFromJsonObject = Meta.INSTANCE.fromJsonObject(jsonObject.m("meta").d());
                if (!wl7.b(strG7, "custom")) {
                    throw new IllegalStateException("Check failed.");
                }
                strG.getClass();
                strG2.getClass();
                strG3.getClass();
                strG4.getClass();
                strG5.getClass();
                strG6.getClass();
                return new SpanEvent(strG, strG2, strG3, strG4, strG5, strG6, jE, jE2, jE3, metricsFromJsonObject, metaFromJsonObject);
            } catch (IllegalStateException e4) {
                e = e4;
                g7.n("Unable to parse json into type SpanEvent", e);
                return spanEvent;
            } catch (NullPointerException e5) {
                e = e5;
                g7.n("Unable to parse json into type SpanEvent", e);
                return spanEvent;
            } catch (NumberFormatException e6) {
                e = e6;
                g7.n("Unable to parse json into type SpanEvent", e);
                return spanEvent;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ SpanEvent(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3, Metrics metrics, Meta meta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, j, j2, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0L : j3, metrics, meta);
    }
}
