package com.datadog.android.rum.internal.domain;

import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.persistence.Serializer;
import com.datadog.android.core.persistence.SerializerKt;
import com.datadog.android.rum.internal.domain.event.RumEventMeta;
import com.datadog.android.rum.model.ViewEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/RumDataWriter;", "Lcom/datadog/android/api/storage/DataWriter;", "", "Lcom/datadog/android/core/persistence/Serializer;", "eventSerializer", "Lcom/datadog/android/rum/internal/domain/event/RumEventMeta;", "eventMetaSerializer", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "<init>", "(Lcom/datadog/android/core/persistence/Serializer;Lcom/datadog/android/core/persistence/Serializer;Lcom/datadog/android/core/InternalSdkCore;)V", "Lcom/datadog/android/api/storage/EventBatchWriter;", "writer", "element", "Lcom/datadog/android/api/storage/EventType;", "eventType", "", "write", "(Lcom/datadog/android/api/storage/EventBatchWriter;Ljava/lang/Object;Lcom/datadog/android/api/storage/EventType;)Z", "data", "", "rawData", "Lj6g;", "onDataWritten$dd_sdk_android_rum_release", "(Ljava/lang/Object;[B)V", "onDataWritten", "Lcom/datadog/android/core/persistence/Serializer;", "getEventSerializer$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/persistence/Serializer;", "Lcom/datadog/android/core/InternalSdkCore;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RumDataWriter implements DataWriter<Object> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private final Serializer<RumEventMeta> eventMetaSerializer;
    private final Serializer<Object> eventSerializer;
    private final InternalSdkCore sdkCore;

    public RumDataWriter(Serializer<Object> serializer, Serializer<RumEventMeta> serializer2, InternalSdkCore internalSdkCore) {
        serializer.getClass();
        serializer2.getClass();
        internalSdkCore.getClass();
        this.eventSerializer = serializer;
        this.eventMetaSerializer = serializer2;
        this.sdkCore = internalSdkCore;
    }

    public final Serializer<Object> getEventSerializer$dd_sdk_android_rum_release() {
        return this.eventSerializer;
    }

    public final void onDataWritten$dd_sdk_android_rum_release(Object data, byte[] rawData) {
        data.getClass();
        rawData.getClass();
        if (data instanceof ViewEvent) {
            this.sdkCore.writeLastViewEvent(rawData);
        }
    }

    @Override // com.datadog.android.api.storage.DataWriter
    public boolean write(EventBatchWriter writer, Object element, EventType eventType) {
        RawBatchEvent rawBatchEvent;
        boolean zWrite;
        writer.getClass();
        element.getClass();
        eventType.getClass();
        byte[] bArrSerializeToByteArray = SerializerKt.serializeToByteArray(this.eventSerializer, element, this.sdkCore.getInternalLogger());
        if (bArrSerializeToByteArray == null) {
            return false;
        }
        if (element instanceof ViewEvent) {
            ViewEvent viewEvent = (ViewEvent) element;
            byte[] bArrSerializeToByteArray2 = SerializerKt.serializeToByteArray(this.eventMetaSerializer, new RumEventMeta.View(viewEvent.getView().getId(), viewEvent.getDd().getDocumentVersion()), this.sdkCore.getInternalLogger());
            if (bArrSerializeToByteArray2 == null) {
                bArrSerializeToByteArray2 = EMPTY_BYTE_ARRAY;
            }
            rawBatchEvent = new RawBatchEvent(bArrSerializeToByteArray, bArrSerializeToByteArray2);
        } else {
            rawBatchEvent = new RawBatchEvent(bArrSerializeToByteArray, null, 2, null);
        }
        synchronized (this) {
            zWrite = writer.write(rawBatchEvent, null, eventType);
            if (zWrite) {
                onDataWritten$dd_sdk_android_rum_release(element, bArrSerializeToByteArray);
            }
        }
        return zWrite;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/internal/domain/RumDataWriter$Companion;", "", "()V", "EMPTY_BYTE_ARRAY", "", "getEMPTY_BYTE_ARRAY", "()[B", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final byte[] getEMPTY_BYTE_ARRAY() {
            return RumDataWriter.EMPTY_BYTE_ARRAY;
        }

        private Companion() {
        }
    }
}
