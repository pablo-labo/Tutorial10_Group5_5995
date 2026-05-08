package com.datadog.android.rum.internal.domain.event;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.Deserializer;
import com.google.gson.JsonParseException;
import defpackage.a32;
import defpackage.gu5;
import defpackage.mj8;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventMetaDeserializer;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "", "Lcom/datadog/android/rum/internal/domain/event/RumEventMeta;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Lcom/datadog/android/api/InternalLogger;)V", "deserialize", "model", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RumEventMetaDeserializer implements Deserializer<byte[], RumEventMeta> {
    public static final String DESERIALIZATION_ERROR = "Failed to deserialize RUM event meta";
    private final InternalLogger internalLogger;

    public RumEventMetaDeserializer(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }

    @Override // com.datadog.android.core.internal.persistence.Deserializer
    public RumEventMeta deserialize(byte[] model) {
        model.getClass();
        if (model.length == 0) {
            return null;
        }
        try {
            return RumEventMeta.INSTANCE.fromJson(new String(model, a32.b), this.internalLogger);
        } catch (JsonParseException e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) AnonymousClass1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.event.RumEventMetaDeserializer$deserialize$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return RumEventMetaDeserializer.DESERIALIZATION_ERROR;
        }
    }
}
