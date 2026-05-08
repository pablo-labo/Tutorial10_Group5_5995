package com.datadog.android.log.internal.logger;

import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.RumFeature;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.b0;
import defpackage.bs4;
import defpackage.is4;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001J_\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010Jq\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/datadog/android/log/internal/logger/LogHandler;", "", "", "level", "", "message", "", RumFeature.EVENT_THROWABLE_PROPERTY, "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "tags", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "Lj6g;", "handleLog", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;Ljava/util/Set;Ljava/lang/Long;)V", "errorKind", "errorMessage", "errorStacktrace", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/lang/Long;)V", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface LogHandler {
    void handleLog(int level, String message, String errorKind, String errorMessage, String errorStacktrace, Map<String, ? extends Object> attributes, Set<String> tags, Long timestamp);

    void handleLog(int level, String message, Throwable throwable, Map<String, ? extends Object> attributes, Set<String> tags, Long timestamp);

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void handleLog$default(LogHandler logHandler, int i, String str, String str2, String str3, String str4, Map map, Set set, Long l, int i2, Object obj) {
            if (obj == null) {
                logHandler.handleLog(i, str, str2, str3, str4, (i2 & 32) != 0 ? bs4.a : map, (i2 & 64) != 0 ? is4.a : set, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : l);
            } else {
                b0.u("Super calls with default arguments not supported in this target, function: handleLog");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void handleLog$default(LogHandler logHandler, int i, String str, Throwable th, Map map, Set set, Long l, int i2, Object obj) {
            if (obj != null) {
                b0.u("Super calls with default arguments not supported in this target, function: handleLog");
                return;
            }
            if ((i2 & 4) != 0) {
                th = null;
            }
            if ((i2 & 8) != 0) {
                map = bs4.a;
            }
            if ((i2 & 16) != 0) {
                set = is4.a;
            }
            if ((i2 & 32) != 0) {
                l = null;
            }
            logHandler.handleLog(i, str, th, map, set, l);
        }
    }
}
