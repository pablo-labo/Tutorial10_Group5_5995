package com.datadog.android.rum.internal.domain.event;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.Deserializer;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.google.gson.JsonParseException;
import defpackage.ab8;
import defpackage.fb8;
import defpackage.gu5;
import defpackage.l5;
import defpackage.mj8;
import defpackage.u63;
import defpackage.wl7;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventDeserializer;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "Lab8;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "", "eventType", "model", "parseEvent", "(Ljava/lang/String;Lab8;)Ljava/lang/Object;", "deserialize", "(Lab8;)Ljava/lang/Object;", "Lcom/datadog/android/api/InternalLogger;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RumEventDeserializer implements Deserializer<ab8, Object> {
    public static final String DESERIALIZE_ERROR_MESSAGE_FORMAT = "Error while trying to deserialize the RumEvent: %s";
    public static final String EVENT_TELEMETRY_KEY_NAME = "telemetry";
    public static final String EVENT_TELEMETRY_STATUS_KEY_NAME = "status";
    public static final String EVENT_TYPE_ACTION = "action";
    public static final String EVENT_TYPE_ERROR = "error";
    public static final String EVENT_TYPE_KEY_NAME = "type";
    public static final String EVENT_TYPE_LONG_TASK = "long_task";
    public static final String EVENT_TYPE_RESOURCE = "resource";
    public static final String EVENT_TYPE_TELEMETRY = "telemetry";
    public static final String EVENT_TYPE_VIEW = "view";
    public static final String TELEMETRY_TYPE_DEBUG = "debug";
    public static final String TELEMETRY_TYPE_ERROR = "error";
    private final InternalLogger internalLogger;

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.event.RumEventDeserializer$deserialize$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ ab8 $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ab8 ab8Var) {
            super(0);
            this.$model = ab8Var;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{this.$model}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.event.RumEventDeserializer$deserialize$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        final /* synthetic */ ab8 $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ab8 ab8Var) {
            super(0);
            this.$model = ab8Var;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{this.$model}, 1));
        }
    }

    public RumEventDeserializer(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object parseEvent(String eventType, ab8 model) {
        if (eventType != null) {
            switch (eventType.hashCode()) {
                case -1422950858:
                    if (eventType.equals(EVENT_TYPE_ACTION)) {
                        return ActionEvent.INSTANCE.fromJsonObject(model);
                    }
                    break;
                case -341064690:
                    if (eventType.equals(EVENT_TYPE_RESOURCE)) {
                        return ResourceEvent.INSTANCE.fromJsonObject(model);
                    }
                    break;
                case 3619493:
                    if (eventType.equals("view")) {
                        return ViewEvent.INSTANCE.fromJsonObject(model);
                    }
                    break;
                case 96784904:
                    if (eventType.equals("error")) {
                        return ErrorEvent.INSTANCE.fromJsonObject(model);
                    }
                    break;
                case 128111976:
                    if (eventType.equals(EVENT_TYPE_LONG_TASK)) {
                        return LongTaskEvent.INSTANCE.fromJsonObject(model);
                    }
                    break;
                case 780346297:
                    if (eventType.equals("telemetry")) {
                        String strG = ((fb8) ((ab8) model.a.get("telemetry")).a.get("status")).g();
                        if (wl7.b(strG, TELEMETRY_TYPE_DEBUG)) {
                            return TelemetryDebugEvent.INSTANCE.fromJsonObject(model);
                        }
                        if (wl7.b(strG, "error")) {
                            return TelemetryErrorEvent.INSTANCE.fromJsonObject(model);
                        }
                        throw new JsonParseException(l5.l("We could not deserialize the telemetry event with status: ", strG));
                    }
                    break;
            }
        }
        throw new JsonParseException(l5.l("We could not deserialize the event with type: ", eventType));
    }

    @Override // com.datadog.android.core.internal.persistence.Deserializer
    public Object deserialize(ab8 model) {
        model.getClass();
        try {
            fb8 fb8Var = (fb8) model.a.get("type");
            return parseEvent(fb8Var != null ? fb8Var.g() : null, model);
        } catch (JsonParseException e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass1(model), (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        } catch (IllegalStateException e2) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass2(model), (Throwable) e2, false, (Map) null, 48, (Object) null);
            return null;
        }
    }
}
