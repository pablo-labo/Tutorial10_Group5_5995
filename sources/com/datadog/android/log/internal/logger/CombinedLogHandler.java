package com.datadog.android.log.internal.logger;

import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.RumFeature;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015Jk\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0019R\"\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/log/internal/logger/CombinedLogHandler;", "Lcom/datadog/android/log/internal/logger/LogHandler;", "", "handlers", "<init>", "([Lcom/datadog/android/log/internal/logger/LogHandler;)V", "", "level", "", "message", "", RumFeature.EVENT_THROWABLE_PROPERTY, "", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "tags", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "Lj6g;", "handleLog", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;Ljava/util/Set;Ljava/lang/Long;)V", "errorKind", "errorMessage", "errorStacktrace", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/lang/Long;)V", "[Lcom/datadog/android/log/internal/logger/LogHandler;", "getHandlers$dd_sdk_android_logs_release", "()[Lcom/datadog/android/log/internal/logger/LogHandler;", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class CombinedLogHandler implements LogHandler {
    private final LogHandler[] handlers;

    public CombinedLogHandler(LogHandler... logHandlerArr) {
        logHandlerArr.getClass();
        this.handlers = logHandlerArr;
    }

    /* JADX INFO: renamed from: getHandlers$dd_sdk_android_logs_release, reason: from getter */
    public final LogHandler[] getHandlers() {
        return this.handlers;
    }

    @Override // com.datadog.android.log.internal.logger.LogHandler
    public void handleLog(int level, String message, String errorKind, String errorMessage, String errorStacktrace, Map<String, ? extends Object> attributes, Set<String> tags, Long timestamp) {
        message.getClass();
        attributes.getClass();
        tags.getClass();
        for (LogHandler logHandler : this.handlers) {
            logHandler.handleLog(level, message, errorKind, errorMessage, errorStacktrace, attributes, tags, timestamp);
        }
    }

    @Override // com.datadog.android.log.internal.logger.LogHandler
    public void handleLog(int level, String message, Throwable throwable, Map<String, ? extends Object> attributes, Set<String> tags, Long timestamp) {
        message.getClass();
        attributes.getClass();
        tags.getClass();
        for (LogHandler logHandler : this.handlers) {
            logHandler.handleLog(level, message, throwable, attributes, tags, timestamp);
        }
    }
}
