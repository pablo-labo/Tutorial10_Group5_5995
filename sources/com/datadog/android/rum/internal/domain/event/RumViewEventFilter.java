package com.datadog.android.rum.internal.domain.event;

import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.internal.persistence.Deserializer;
import com.datadog.android.rum.internal.domain.event.RumEventMeta;
import defpackage.lc9;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumViewEventFilter;", "", "eventMetaDeserializer", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "", "Lcom/datadog/android/rum/internal/domain/event/RumEventMeta;", "(Lcom/datadog/android/core/internal/persistence/Deserializer;)V", "filterOutRedundantViewEvents", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batch", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RumViewEventFilter {
    private final Deserializer<byte[], RumEventMeta> eventMetaDeserializer;

    public RumViewEventFilter(Deserializer<byte[], RumEventMeta> deserializer) {
        deserializer.getClass();
        this.eventMetaDeserializer = deserializer;
    }

    public final List<RawBatchEvent> filterOutRedundantViewEvents(List<RawBatchEvent> batch) {
        batch.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List<RawBatchEvent> list = batch;
        for (RawBatchEvent rawBatchEvent : list) {
            RumEventMeta rumEventMetaDeserialize = this.eventMetaDeserializer.deserialize(rawBatchEvent.getMetadata());
            if (rumEventMetaDeserialize instanceof RumEventMeta.View) {
                Pair pair = new Pair(rawBatchEvent, rumEventMetaDeserialize);
                linkedHashMap2.put(pair.d(), pair.e());
                RumEventMeta.View view = (RumEventMeta.View) rumEventMetaDeserialize;
                String viewId = view.getViewId();
                long documentVersion = view.getDocumentVersion();
                Long l = (Long) linkedHashMap.get(viewId);
                if (l == null) {
                    linkedHashMap.put(viewId, Long.valueOf(documentVersion));
                } else {
                    linkedHashMap.put(viewId, Long.valueOf(Math.max(documentVersion, l.longValue())));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            RawBatchEvent rawBatchEvent2 = (RawBatchEvent) obj;
            if (linkedHashMap2.containsKey(rawBatchEvent2)) {
                RumEventMeta.View view2 = (RumEventMeta.View) lc9.Y(rawBatchEvent2, linkedHashMap2);
                if (view2.getDocumentVersion() == ((Number) lc9.Y(view2.getViewId(), linkedHashMap)).longValue()) {
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
