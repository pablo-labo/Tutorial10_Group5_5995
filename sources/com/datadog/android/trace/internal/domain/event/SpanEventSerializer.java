package com.datadog.android.trace.internal.domain.event;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.core.constraints.DataConstraints;
import com.datadog.android.core.constraints.DatadogDataConstraints;
import com.datadog.android.core.internal.utils.MapUtilsKt;
import com.datadog.android.trace.internal.storage.ContextAwareSerializer;
import com.datadog.android.trace.model.SpanEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ab8;
import defpackage.fb8;
import defpackage.gu5;
import defpackage.ka8;
import defpackage.kc9;
import defpackage.u63;
import defpackage.w98;
import defpackage.wl7;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/trace/internal/domain/event/SpanEventSerializer;", "Lcom/datadog/android/trace/internal/storage/ContextAwareSerializer;", "Lcom/datadog/android/trace/model/SpanEvent;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "dataConstraints", "Lcom/datadog/android/core/constraints/DataConstraints;", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/constraints/DataConstraints;)V", "sanitizeKeys", "model", "sanitizeMetrics", "Lcom/datadog/android/trace/model/SpanEvent$Metrics;", SpanEventSerializer.METRICS_KEY_PREFIX, "sanitizeUserAttributes", "Lcom/datadog/android/trace/model/SpanEvent$Usr;", "usr", "serialize", "", "datadogContext", "Lcom/datadog/android/api/context/DatadogContext;", "toMetaString", "element", "", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class SpanEventSerializer implements ContextAwareSerializer<SpanEvent> {
    public static final String META_USR_KEY_PREFIX = "meta.usr";
    public static final String METRICS_KEY_PREFIX = "metrics";
    public static final String TAG_ENV = "env";
    public static final String TAG_SPANS = "spans";
    private final DataConstraints dataConstraints;
    private final InternalLogger internalLogger;

    public SpanEventSerializer(InternalLogger internalLogger, DataConstraints dataConstraints) {
        internalLogger.getClass();
        dataConstraints.getClass();
        this.internalLogger = internalLogger;
        this.dataConstraints = dataConstraints;
    }

    private final SpanEvent sanitizeKeys(SpanEvent model) {
        return model.copy((511 & 1) != 0 ? model.traceId : null, (511 & 2) != 0 ? model.spanId : null, (511 & 4) != 0 ? model.parentId : null, (511 & 8) != 0 ? model.resource : null, (511 & 16) != 0 ? model.name : null, (511 & 32) != 0 ? model.service : null, (511 & 64) != 0 ? model.duration : 0L, (511 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? model.start : 0L, (511 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? model.error : 0L, (511 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? model.metrics : sanitizeMetrics(model.getMetrics()), (511 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? model.meta : SpanEvent.Meta.copy$default(model.getMeta(), null, null, null, null, sanitizeUserAttributes(model.getMeta().getUsr()), null, null, null, null, 495, null));
    }

    private final SpanEvent.Metrics sanitizeMetrics(SpanEvent.Metrics metrics) {
        return SpanEvent.Metrics.copy$default(metrics, null, DataConstraints.DefaultImpls.validateAttributes$default(this.dataConstraints, metrics.getAdditionalProperties(), METRICS_KEY_PREFIX, null, null, 12, null), 1, null);
    }

    private final SpanEvent.Usr sanitizeUserAttributes(SpanEvent.Usr usr) {
        String metaString;
        Map mapValidateAttributes$default = DataConstraints.DefaultImpls.validateAttributes$default(this.dataConstraints, usr.getAdditionalProperties(), META_USR_KEY_PREFIX, null, null, 12, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(mapValidateAttributes$default.size()));
        for (Map.Entry entry : mapValidateAttributes$default.entrySet()) {
            Object key = entry.getKey();
            try {
                metaString = toMetaString(entry.getValue());
            } catch (Exception e) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), (gu5) new SpanEventSerializer$sanitizeUserAttributes$transformedAttributes$1$1(entry), (Throwable) e, false, (Map) null, 48, (Object) null);
                metaString = null;
            }
            linkedHashMap.put(key, metaString);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((String) entry2.getValue()) != null) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return SpanEvent.Usr.copy$default(usr, null, null, null, new LinkedHashMap(linkedHashMap2), 7, null);
    }

    private final String toMetaString(Object element) {
        if (wl7.b(element, MapUtilsKt.getNULL_MAP_VALUE()) || element == null) {
            return null;
        }
        return element instanceof Date ? String.valueOf(((Date) element).getTime()) : element instanceof fb8 ? ((fb8) element).g() : element.toString();
    }

    @Override // com.datadog.android.trace.internal.storage.ContextAwareSerializer
    public String serialize(DatadogContext datadogContext, SpanEvent model) {
        datadogContext.getClass();
        model.getClass();
        ka8 json = sanitizeKeys(model).toJson();
        w98 w98Var = new w98(1);
        w98Var.i(json);
        ab8 ab8Var = new ab8();
        ab8Var.i(TAG_SPANS, w98Var);
        ab8Var.l("env", datadogContext.getEnv());
        String string = ab8Var.toString();
        string.getClass();
        return string;
    }

    public /* synthetic */ SpanEventSerializer(InternalLogger internalLogger, DataConstraints dataConstraints, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, (i & 2) != 0 ? new DatadogDataConstraints(internalLogger) : dataConstraints);
    }
}
