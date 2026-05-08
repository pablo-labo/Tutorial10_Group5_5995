package com.datadog.android.log.internal.logger;

import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.RumFeature;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJW\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017Jk\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR.\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/datadog/android/log/internal/logger/ConditionalLogHandler;", "Lcom/datadog/android/log/internal/logger/LogHandler;", "delegateHandler", "Lkotlin/Function2;", "", "", "", "condition", "<init>", "(Lcom/datadog/android/log/internal/logger/LogHandler;Lkotlin/jvm/functions/Function2;)V", "level", "", "message", RumFeature.EVENT_THROWABLE_PROPERTY, "", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "tags", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "Lj6g;", "handleLog", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;Ljava/util/Set;Ljava/lang/Long;)V", "errorKind", "errorMessage", "errorStacktrace", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/lang/Long;)V", "Lcom/datadog/android/log/internal/logger/LogHandler;", "getDelegateHandler$dd_sdk_android_logs_release", "()Lcom/datadog/android/log/internal/logger/LogHandler;", "Lkotlin/jvm/functions/Function2;", "getCondition$dd_sdk_android_logs_release", "()Lkotlin/jvm/functions/Function2;", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ConditionalLogHandler implements LogHandler {
    private final Function2<Integer, Throwable, Boolean> condition;
    private final LogHandler delegateHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public ConditionalLogHandler(LogHandler logHandler, Function2<? super Integer, ? super Throwable, Boolean> function2) {
        logHandler.getClass();
        function2.getClass();
        this.delegateHandler = logHandler;
        this.condition = function2;
    }

    public final Function2<Integer, Throwable, Boolean> getCondition$dd_sdk_android_logs_release() {
        return this.condition;
    }

    /* JADX INFO: renamed from: getDelegateHandler$dd_sdk_android_logs_release, reason: from getter */
    public final LogHandler getDelegateHandler() {
        return this.delegateHandler;
    }

    @Override // com.datadog.android.log.internal.logger.LogHandler
    public void handleLog(int level, String message, String errorKind, String errorMessage, String errorStacktrace, Map<String, ? extends Object> attributes, Set<String> tags, Long timestamp) {
        message.getClass();
        attributes.getClass();
        tags.getClass();
        if (this.condition.invoke(Integer.valueOf(level), null).booleanValue()) {
            this.delegateHandler.handleLog(level, message, errorKind, errorMessage, errorStacktrace, attributes, tags, timestamp);
        }
    }

    @Override // com.datadog.android.log.internal.logger.LogHandler
    public void handleLog(int level, String message, Throwable throwable, Map<String, ? extends Object> attributes, Set<String> tags, Long timestamp) {
        message.getClass();
        attributes.getClass();
        tags.getClass();
        if (this.condition.invoke(Integer.valueOf(level), throwable).booleanValue()) {
            this.delegateHandler.handleLog(level, message, throwable, attributes, tags, timestamp);
        }
    }
}
