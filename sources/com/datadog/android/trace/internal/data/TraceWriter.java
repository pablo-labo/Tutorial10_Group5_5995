package com.datadog.android.trace.internal.data;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.event.EventMapper;
import com.datadog.android.trace.internal.domain.event.ContextAwareMapper;
import com.datadog.android.trace.internal.storage.ContextAwareSerializer;
import com.datadog.android.trace.model.SpanEvent;
import defpackage.a32;
import defpackage.gu5;
import defpackage.h5h;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.rc3;
import defpackage.u63;
import defpackage.ut0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0010\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00152\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0019J\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(¨\u0006*"}, d2 = {"Lcom/datadog/android/trace/internal/data/TraceWriter;", "Lh5h;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lcom/datadog/android/trace/internal/domain/event/ContextAwareMapper;", "Lrc3;", "Lcom/datadog/android/trace/model/SpanEvent;", "ddSpanToSpanEventMapper", "Lcom/datadog/android/event/EventMapper;", "eventMapper", "Lcom/datadog/android/trace/internal/storage/ContextAwareSerializer;", "serializer", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/trace/internal/domain/event/ContextAwareMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/trace/internal/storage/ContextAwareSerializer;Lcom/datadog/android/api/InternalLogger;)V", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lcom/datadog/android/api/storage/EventBatchWriter;", "writer", "span", "Lj6g;", "writeSpan", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/storage/EventBatchWriter;Lrc3;)V", "start", "()V", "", "trace", "write", "(Ljava/util/List;)V", "close", "incrementTraceCount", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/trace/internal/domain/event/ContextAwareMapper;", "getDdSpanToSpanEventMapper$dd_sdk_android_trace_release", "()Lcom/datadog/android/trace/internal/domain/event/ContextAwareMapper;", "Lcom/datadog/android/event/EventMapper;", "getEventMapper$dd_sdk_android_trace_release", "()Lcom/datadog/android/event/EventMapper;", "Lcom/datadog/android/trace/internal/storage/ContextAwareSerializer;", "Lcom/datadog/android/api/InternalLogger;", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class TraceWriter implements h5h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<Integer> DROP_SAMPLING_PRIORITIES = ut0.I0(new Integer[]{0, -1});
    public static final String ERROR_SERIALIZING = "Error serializing %s model";
    private final ContextAwareMapper<rc3, SpanEvent> ddSpanToSpanEventMapper;
    private final EventMapper<SpanEvent> eventMapper;
    private final InternalLogger internalLogger;
    private final FeatureSdkCore sdkCore;
    private final ContextAwareSerializer<SpanEvent> serializer;

    /* JADX INFO: renamed from: com.datadog.android.trace.internal.data.TraceWriter$writeSpan$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        final /* synthetic */ SpanEvent $mapped;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SpanEvent spanEvent) {
            super(0);
            this.$mapped = spanEvent;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Error serializing %s model", Arrays.copyOf(new Object[]{this.$mapped.getClass().getSimpleName()}, 1));
        }
    }

    public TraceWriter(FeatureSdkCore featureSdkCore, ContextAwareMapper<rc3, SpanEvent> contextAwareMapper, EventMapper<SpanEvent> eventMapper, ContextAwareSerializer<SpanEvent> contextAwareSerializer, InternalLogger internalLogger) {
        featureSdkCore.getClass();
        contextAwareMapper.getClass();
        eventMapper.getClass();
        contextAwareSerializer.getClass();
        internalLogger.getClass();
        this.sdkCore = featureSdkCore;
        this.ddSpanToSpanEventMapper = contextAwareMapper;
        this.eventMapper = eventMapper;
        this.serializer = contextAwareSerializer;
        this.internalLogger = internalLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeSpan(DatadogContext datadogContext, EventBatchWriter writer, rc3 span) {
        SpanEvent map = this.eventMapper.map(this.ddSpanToSpanEventMapper.map(datadogContext, span));
        if (map == null) {
            return;
        }
        try {
            String strSerialize = this.serializer.serialize(datadogContext, map);
            if (strSerialize != null) {
                byte[] bytes = strSerialize.getBytes(a32.b);
                bytes.getClass();
                synchronized (this) {
                    writer.write(new RawBatchEvent(bytes, null, 2, null), null, EventType.DEFAULT);
                }
            }
        } catch (Throwable th) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass2(map), th, false, (Map) null, 48, (Object) null);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final ContextAwareMapper<rc3, SpanEvent> getDdSpanToSpanEventMapper$dd_sdk_android_trace_release() {
        return this.ddSpanToSpanEventMapper;
    }

    public final EventMapper<SpanEvent> getEventMapper$dd_sdk_android_trace_release() {
        return this.eventMapper;
    }

    @Override // defpackage.h5h
    public void incrementTraceCount() {
    }

    @Override // defpackage.h5h
    public void start() {
    }

    @Override // defpackage.h5h
    public void write(List<rc3> trace) {
        FeatureScope feature;
        if (trace == null || (feature = this.sdkCore.getFeature("tracing")) == null) {
            return;
        }
        FeatureScope.DefaultImpls.withWriteContext$default(feature, false, new AnonymousClass1(trace, this), 1, null);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/datadog/android/trace/internal/data/TraceWriter$Companion;", "", "()V", "DROP_SAMPLING_PRIORITIES", "", "", "getDROP_SAMPLING_PRIORITIES$dd_sdk_android_trace_release", "()Ljava/util/Set;", "ERROR_SERIALIZING", "", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<Integer> getDROP_SAMPLING_PRIORITIES$dd_sdk_android_trace_release() {
            return TraceWriter.DROP_SAMPLING_PRIORITIES;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.trace.internal.data.TraceWriter$write$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lcom/datadog/android/api/storage/EventBatchWriter;", "eventBatchWriter", "Lj6g;", "invoke", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/storage/EventBatchWriter;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass1 extends mj8 implements Function2<DatadogContext, EventBatchWriter, j6g> {
        final /* synthetic */ List<rc3> $trace;
        final /* synthetic */ TraceWriter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<rc3> list, TraceWriter traceWriter) {
            super(2);
            this.$trace = list;
            this.this$0 = traceWriter;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            datadogContext.getClass();
            eventBatchWriter.getClass();
            List<rc3> list = this.$trace;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                rc3 rc3Var = (rc3) obj;
                if (rc3Var.k() == null || !TraceWriter.INSTANCE.getDROP_SAMPLING_PRIORITIES$dd_sdk_android_trace_release().contains(rc3Var.k())) {
                    arrayList.add(obj);
                }
            }
            TraceWriter traceWriter = this.this$0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                traceWriter.writeSpan(datadogContext, eventBatchWriter, (rc3) it.next());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ j6g invoke(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            invoke2(datadogContext, eventBatchWriter);
            return j6g.a;
        }
    }
}
