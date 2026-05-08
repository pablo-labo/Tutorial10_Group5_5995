package com.datadog.android.trace.internal.handlers;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.internal.utils.ThrowableExtKt;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.g39;
import defpackage.gu5;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.rc3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ9\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0014\u001a\u00020\u00102\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0019J)\u0010\u0017\u001a\u00020\u00102\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u00030\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0015J1\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u00030\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/datadog/android/trace/internal/handlers/AndroidSpanLogsHandler;", "Lg39;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "", "timestampMicroseconds", "toMilliseconds", "(Ljava/lang/Long;)Ljava/lang/Long;", "Lrc3;", "span", "", "", "", "fields", "Lj6g;", "logFields", "(Lrc3;Ljava/util/Map;Ljava/lang/Long;)V", "map", "extractError", "(Ljava/util/Map;Lrc3;)V", "event", "log", "(Ljava/lang/String;Lrc3;)V", "(JLjava/lang/String;Lrc3;)V", "", "(JLjava/util/Map;Lrc3;)V", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Companion", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class AndroidSpanLogsHandler implements g39 {
    public static final String DEFAULT_EVENT_MESSAGE = "Span event";
    public static final String MISSING_LOG_FEATURE_INFO = "Requested to write span log, but Logs feature is not registered.";
    public static final String TRACE_LOGGER_NAME = "trace";
    private final FeatureSdkCore sdkCore;

    public AndroidSpanLogsHandler(FeatureSdkCore featureSdkCore) {
        featureSdkCore.getClass();
        this.sdkCore = featureSdkCore;
    }

    private final void extractError(Map<String, ?> map, rc3 span) {
        String name;
        String strLoggableStackTrace;
        String string;
        Object objRemove = map.remove("error.object");
        String message = null;
        Throwable th = objRemove instanceof Throwable ? (Throwable) objRemove : null;
        Object objRemove2 = map.remove(LogAttributes.ERROR_KIND);
        if (objRemove2 == null || (name = objRemove2.toString()) == null) {
            name = th != null ? th.getClass().getName() : null;
        }
        if (name != null) {
            Object objRemove3 = map.remove("stack");
            Object obj = map.get("message");
            if (objRemove3 == null || (strLoggableStackTrace = objRemove3.toString()) == null) {
                strLoggableStackTrace = th != null ? ThrowableExtKt.loggableStackTrace(th) : null;
            }
            if (obj != null && (string = obj.toString()) != null) {
                message = string;
            } else if (th != null) {
                message = th.getMessage();
            }
            span.b.k = true;
            span.m("error.type", name);
            span.m("error.msg", message);
            span.m(LogAttributes.ERROR_STACK, strLoggableStackTrace);
        }
    }

    private final void logFields(rc3 span, Map<String, Object> fields, Long timestampMicroseconds) {
        String string;
        FeatureScope feature = this.sdkCore.getFeature("logs");
        if (feature == null || fields.isEmpty()) {
            if (feature == null) {
                InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
                return;
            }
            return;
        }
        Object objRemove = fields.remove("message");
        if (objRemove == null || (string = objRemove.toString()) == null) {
            string = DEFAULT_EVENT_MESSAGE;
        }
        fields.put(LogAttributes.DD_TRACE_ID, span.b.d.toString());
        fields.put(LogAttributes.DD_SPAN_ID, span.b.e.toString());
        Long milliseconds = toMilliseconds(timestampMicroseconds);
        feature.sendEvent(lc9.a0(new Pair("type", "span_log"), new Pair("loggerName", "trace"), new Pair("message", string), new Pair(RumFeature.EVENT_ATTRIBUTES_PROPERTY, fields), new Pair(NdkCrashLog.TIMESTAMP_KEY_NAME, Long.valueOf(milliseconds != null ? milliseconds.longValue() : System.currentTimeMillis()))));
    }

    public static /* synthetic */ void logFields$default(AndroidSpanLogsHandler androidSpanLogsHandler, rc3 rc3Var, Map map, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        androidSpanLogsHandler.logFields(rc3Var, map, l);
    }

    private final Long toMilliseconds(Long timestampMicroseconds) {
        if (timestampMicroseconds != null) {
            return Long.valueOf(timestampMicroseconds.longValue() / 1000);
        }
        return null;
    }

    public void log(long timestampMicroseconds, String event, rc3 span) {
        event.getClass();
        span.getClass();
        logFields(span, lc9.b0(new Pair("event", event)), Long.valueOf(timestampMicroseconds));
    }

    /* JADX INFO: renamed from: com.datadog.android.trace.internal.handlers.AndroidSpanLogsHandler$logFields$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return AndroidSpanLogsHandler.MISSING_LOG_FEATURE_INFO;
        }
    }

    public void log(String event, rc3 span) {
        event.getClass();
        span.getClass();
        logFields(span, lc9.b0(new Pair("event", event)), null);
    }

    public void log(long timestampMicroseconds, Map<String, ?> fields, rc3 span) {
        fields.getClass();
        span.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fields);
        extractError(linkedHashMap, span);
        logFields(span, linkedHashMap, Long.valueOf(timestampMicroseconds));
    }

    @Override // defpackage.g39
    public void log(Map<String, ?> fields, rc3 span) {
        fields.getClass();
        span.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fields);
        extractError(linkedHashMap, span);
        logFields$default(this, span, linkedHashMap, null, 4, null);
    }
}
