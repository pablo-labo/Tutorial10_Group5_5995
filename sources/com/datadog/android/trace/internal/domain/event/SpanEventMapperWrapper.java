package com.datadog.android.trace.internal.domain.event;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.event.EventMapper;
import com.datadog.android.trace.event.SpanEventMapper;
import com.datadog.android.trace.model.SpanEvent;
import defpackage.gu5;
import defpackage.mj8;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/datadog/android/trace/internal/domain/event/SpanEventMapperWrapper;", "Lcom/datadog/android/event/EventMapper;", "Lcom/datadog/android/trace/model/SpanEvent;", "wrappedEventMapper", "Lcom/datadog/android/trace/event/SpanEventMapper;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Lcom/datadog/android/trace/event/SpanEventMapper;Lcom/datadog/android/api/InternalLogger;)V", "getWrappedEventMapper$dd_sdk_android_trace_release", "()Lcom/datadog/android/trace/event/SpanEventMapper;", "map", "event", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class SpanEventMapperWrapper implements EventMapper<SpanEvent> {
    public static final String NOT_SAME_EVENT_INSTANCE_WARNING_MESSAGE = "SpanEventMapper: the returned mapped object was not the same instance as the original object. This event will be dropped: %s";
    private final InternalLogger internalLogger;
    private final SpanEventMapper wrappedEventMapper;

    /* JADX INFO: renamed from: com.datadog.android.trace.internal.domain.event.SpanEventMapperWrapper$map$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ SpanEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SpanEvent spanEvent) {
            super(0);
            this.$event = spanEvent;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, SpanEventMapperWrapper.NOT_SAME_EVENT_INSTANCE_WARNING_MESSAGE, Arrays.copyOf(new Object[]{this.$event}, 1));
        }
    }

    public SpanEventMapperWrapper(SpanEventMapper spanEventMapper, InternalLogger internalLogger) {
        spanEventMapper.getClass();
        internalLogger.getClass();
        this.wrappedEventMapper = spanEventMapper;
        this.internalLogger = internalLogger;
    }

    /* JADX INFO: renamed from: getWrappedEventMapper$dd_sdk_android_trace_release, reason: from getter */
    public final SpanEventMapper getWrappedEventMapper() {
        return this.wrappedEventMapper;
    }

    @Override // com.datadog.android.event.EventMapper
    public SpanEvent map(SpanEvent event) {
        event.getClass();
        SpanEvent map = this.wrappedEventMapper.map(event);
        if (map == event) {
            return map;
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) new AnonymousClass1(event), (Throwable) null, false, (Map) null, 56, (Object) null);
        return null;
    }
}
