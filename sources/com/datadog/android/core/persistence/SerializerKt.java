package com.datadog.android.core.persistence;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.lint.InternalApi;
import defpackage.a32;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.u63;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"serializeToByteArray", "", "T", "", "Lcom/datadog/android/core/persistence/Serializer;", "model", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Lcom/datadog/android/core/persistence/Serializer;Ljava/lang/Object;Lcom/datadog/android/api/InternalLogger;)[B", "dd-sdk-android-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class SerializerKt {

    /* JADX INFO: renamed from: com.datadog.android.core.persistence.SerializerKt$serializeToByteArray$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ T $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(T t) {
            super(0);
            this.$model = t;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Error serializing %s model", Arrays.copyOf(new Object[]{this.$model.getClass().getSimpleName()}, 1));
        }
    }

    @InternalApi
    public static final <T> byte[] serializeToByteArray(Serializer<T> serializer, T t, InternalLogger internalLogger) {
        serializer.getClass();
        t.getClass();
        internalLogger.getClass();
        try {
            String strSerialize = serializer.serialize(t);
            if (strSerialize == null) {
                return null;
            }
            byte[] bytes = strSerialize.getBytes(a32.b);
            bytes.getClass();
            return bytes;
        } catch (Throwable th) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass1(t), th, false, (Map) null, 48, (Object) null);
            return null;
        }
    }
}
