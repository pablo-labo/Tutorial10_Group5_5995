package com.datadog.android.trace.internal.domain.event;

import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.trace.model.SpanEvent;
import defpackage.ab8;
import defpackage.hh1;
import defpackage.j00;
import defpackage.lc9;
import defpackage.qc3;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u00020\u00182\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0 H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010!\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/datadog/android/trace/internal/domain/event/CoreTracerSpanToSpanEventMapper;", "Lcom/datadog/android/trace/internal/domain/event/BaseSpanEventMapper;", "Lqc3;", "", "networkInfoEnabled", "<init>", "(Z)V", "model", "", "resolveSpanId", "(Lqc3;)Ljava/lang/String;", "resolveParentId", "event", "Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "resolveMetrics", "(Lqc3;)Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lcom/datadog/android/trace/model/SpanEvent$Meta;", "resolveMeta", "(Lcom/datadog/android/api/context/DatadogContext;Lqc3;)Lcom/datadog/android/trace/model/SpanEvent$Meta;", "resolveSpanLinks", "Lj00;", "link", "Lab8;", "resolveSpanLink", "(Lj00;)Lab8;", "span", "", "", "resolveMetricsFromSpanContext", "(Lqc3;)Ljava/util/Map;", "", "map", "toJson", "(Ljava/util/Map;)Lab8;", "Lcom/datadog/android/trace/model/SpanEvent;", "(Lcom/datadog/android/api/context/DatadogContext;Lqc3;)Lcom/datadog/android/trace/model/SpanEvent;", "Z", "getNetworkInfoEnabled$dd_sdk_android_trace_release", "()Z", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class CoreTracerSpanToSpanEventMapper extends BaseSpanEventMapper<qc3> {
    private static final String ATTRIBUTES_KEY = "attributes";
    private static final String FLAGS_KEY = "flags";
    private static final String SPAN_ID_KEY = "span_id";
    public static final String SPAN_LINKS_KEY = "_dd.span_links";
    private static final int TRACE_ID_HEXA_SIZE = 16;
    private static final String TRACE_ID_KEY = "trace_id";
    private static final String TRACE_STATE_KEY = "tracestate";
    private final boolean networkInfoEnabled;

    public CoreTracerSpanToSpanEventMapper(boolean z) {
        this.networkInfoEnabled = z;
    }

    private final SpanEvent.Meta resolveMeta(DatadogContext datadogContext, qc3 event) {
        resolveDeviceInfo(datadogContext.getDeviceInfo());
        resolveOsInfo(datadogContext.getDeviceInfo());
        if (this.networkInfoEnabled) {
            resolveNetworkInfo(datadogContext.getNetworkInfo());
        }
        UserInfo userInfo = datadogContext.getUserInfo();
        new SpanEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), lc9.i0(userInfo.getAdditionalProperties()));
        datadogContext.getSource();
        event.getClass();
        throw null;
    }

    private final SpanEvent.Metrics resolveMetrics(qc3 event) {
        resolveMetricsFromSpanContext(event);
        event.getClass();
        throw null;
    }

    private final Map<String, Number> resolveMetricsFromSpanContext(qc3 span) {
        span.getClass();
        throw null;
    }

    private final String resolveParentId(qc3 model) {
        model.getClass();
        throw null;
    }

    private final String resolveSpanId(qc3 model) {
        model.getClass();
        throw null;
    }

    private final ab8 resolveSpanLink(j00 link) {
        link.c().a();
        hh1.X(16, link.b());
        link.a();
        throw null;
    }

    private final String resolveSpanLinks(qc3 model) {
        model.getClass();
        throw null;
    }

    private final ab8 toJson(Map<String, String> map) {
        ab8 ab8Var = new ab8();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            ab8Var.l(entry.getKey(), entry.getValue());
        }
        return ab8Var;
    }

    /* JADX INFO: renamed from: getNetworkInfoEnabled$dd_sdk_android_trace_release, reason: from getter */
    public final boolean getNetworkInfoEnabled() {
        return this.networkInfoEnabled;
    }

    @Override // com.datadog.android.trace.internal.domain.event.ContextAwareMapper
    public SpanEvent map(DatadogContext datadogContext, qc3 model) {
        datadogContext.getClass();
        model.getClass();
        datadogContext.getTime().getServerTimeOffsetNs();
        resolveMetrics(model);
        resolveMeta(datadogContext, model);
        throw null;
    }
}
