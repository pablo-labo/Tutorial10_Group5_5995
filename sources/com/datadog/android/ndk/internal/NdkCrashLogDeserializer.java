package com.datadog.android.ndk.internal;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.Deserializer;
import com.google.gson.JsonParseException;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.u63;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/datadog/android/ndk/internal/NdkCrashLogDeserializer;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "", "Lcom/datadog/android/ndk/internal/NdkCrashLog;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Lcom/datadog/android/api/InternalLogger;)V", "deserialize", "model", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NdkCrashLogDeserializer implements Deserializer<String, NdkCrashLog> {
    public static final String DESERIALIZE_ERROR_MESSAGE_FORMAT = "Error while trying to deserialize the NDK Crash info: %s";
    private final InternalLogger internalLogger;

    /* JADX INFO: renamed from: com.datadog.android.ndk.internal.NdkCrashLogDeserializer$deserialize$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ String $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$model = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, NdkCrashLogDeserializer.DESERIALIZE_ERROR_MESSAGE_FORMAT, Arrays.copyOf(new Object[]{this.$model}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.ndk.internal.NdkCrashLogDeserializer$deserialize$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        final /* synthetic */ String $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$model = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, NdkCrashLogDeserializer.DESERIALIZE_ERROR_MESSAGE_FORMAT, Arrays.copyOf(new Object[]{this.$model}, 1));
        }
    }

    public NdkCrashLogDeserializer(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }

    @Override // com.datadog.android.core.internal.persistence.Deserializer
    public NdkCrashLog deserialize(String model) {
        model.getClass();
        try {
            return NdkCrashLog.INSTANCE.fromJson$dd_sdk_android_core_release(model);
        } catch (JsonParseException e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass1(model), (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        } catch (IllegalStateException e2) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass2(model), (Throwable) e2, false, (Map) null, 48, (Object) null);
            return null;
        }
    }
}
