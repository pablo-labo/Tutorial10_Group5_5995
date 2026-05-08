package com.datadog.android.log.internal.logger;

import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.RumFeature;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013Jk\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/log/internal/logger/NoOpLogHandler;", "Lcom/datadog/android/log/internal/logger/LogHandler;", "<init>", "()V", "", "level", "", "message", "", RumFeature.EVENT_THROWABLE_PROPERTY, "", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "tags", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "Lj6g;", "handleLog", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;Ljava/util/Set;Ljava/lang/Long;)V", "errorKind", "errorMessage", "errorStacktrace", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/lang/Long;)V", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpLogHandler implements LogHandler {
    @Override // com.datadog.android.log.internal.logger.LogHandler
    public void handleLog(int level, String message, String errorKind, String errorMessage, String errorStacktrace, Map<String, ? extends Object> attributes, Set<String> tags, Long timestamp) {
        message.getClass();
        attributes.getClass();
        tags.getClass();
    }

    @Override // com.datadog.android.log.internal.logger.LogHandler
    public void handleLog(int level, String message, Throwable throwable, Map<String, ? extends Object> attributes, Set<String> tags, Long timestamp) {
        message.getClass();
        attributes.getClass();
        tags.getClass();
    }
}
