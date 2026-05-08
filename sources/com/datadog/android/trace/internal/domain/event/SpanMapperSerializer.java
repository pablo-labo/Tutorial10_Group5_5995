package com.datadog.android.trace.internal.domain.event;

import com.datadog.android.core.persistence.Serializer;
import com.datadog.android.event.EventMapper;
import com.datadog.android.trace.model.SpanEvent;
import defpackage.rc3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/trace/internal/domain/event/SpanMapperSerializer;", "Lcom/datadog/android/core/persistence/Serializer;", "Lrc3;", "Lcom/datadog/android/trace/internal/domain/event/Mapper;", "Lcom/datadog/android/trace/model/SpanEvent;", "legacyMapper", "Lcom/datadog/android/event/EventMapper;", "spanEventMapper", "spanSerializer", "<init>", "(Lcom/datadog/android/trace/internal/domain/event/Mapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/core/persistence/Serializer;)V", "model", "", "serialize", "(Lrc3;)Ljava/lang/String;", "Lcom/datadog/android/trace/internal/domain/event/Mapper;", "Lcom/datadog/android/event/EventMapper;", "getSpanEventMapper$dd_sdk_android_trace_release", "()Lcom/datadog/android/event/EventMapper;", "Lcom/datadog/android/core/persistence/Serializer;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class SpanMapperSerializer implements Serializer<rc3> {
    private final Mapper<rc3, SpanEvent> legacyMapper;
    private final EventMapper<SpanEvent> spanEventMapper;
    private final Serializer<SpanEvent> spanSerializer;

    public SpanMapperSerializer(Mapper<rc3, SpanEvent> mapper, EventMapper<SpanEvent> eventMapper, Serializer<SpanEvent> serializer) {
        mapper.getClass();
        eventMapper.getClass();
        serializer.getClass();
        this.legacyMapper = mapper;
        this.spanEventMapper = eventMapper;
        this.spanSerializer = serializer;
    }

    public final EventMapper<SpanEvent> getSpanEventMapper$dd_sdk_android_trace_release() {
        return this.spanEventMapper;
    }

    @Override // com.datadog.android.core.persistence.Serializer
    public String serialize(rc3 model) {
        model.getClass();
        SpanEvent map = this.spanEventMapper.map(this.legacyMapper.map(model));
        if (map == null) {
            return null;
        }
        return this.spanSerializer.serialize(map);
    }
}
