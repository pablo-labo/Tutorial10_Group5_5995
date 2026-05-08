package com.datadog.android.log.internal.domain;

import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.core.feature.event.ThreadDump;
import com.datadog.android.log.model.LogEvent;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.RumFeature;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.b0;
import defpackage.zr4;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J°\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J¬\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H&¨\u0006\""}, d2 = {"Lcom/datadog/android/log/internal/domain/LogGenerator;", "", "generateLog", "Lcom/datadog/android/log/model/LogEvent;", "level", "", "message", "", "errorKind", "errorMessage", "errorStack", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "tags", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "", "threadName", "datadogContext", "Lcom/datadog/android/api/context/DatadogContext;", "attachNetworkInfo", "", "loggerName", "bundleWithTraces", "bundleWithRum", "userInfo", "Lcom/datadog/android/api/context/UserInfo;", "networkInfo", "Lcom/datadog/android/api/context/NetworkInfo;", RumFeature.EVENT_THROWABLE_PROPERTY, "", "threads", "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface LogGenerator {
    LogEvent generateLog(int level, String message, String errorKind, String errorMessage, String errorStack, Map<String, ? extends Object> attributes, Set<String> tags, long timestamp, String threadName, DatadogContext datadogContext, boolean attachNetworkInfo, String loggerName, boolean bundleWithTraces, boolean bundleWithRum, UserInfo userInfo, NetworkInfo networkInfo);

    LogEvent generateLog(int level, String message, Throwable throwable, Map<String, ? extends Object> attributes, Set<String> tags, long timestamp, String threadName, DatadogContext datadogContext, boolean attachNetworkInfo, String loggerName, boolean bundleWithTraces, boolean bundleWithRum, UserInfo userInfo, NetworkInfo networkInfo, List<ThreadDump> threads);

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LogEvent generateLog$default(LogGenerator logGenerator, int i, String str, Throwable th, Map map, Set set, long j, String str2, DatadogContext datadogContext, boolean z, String str3, boolean z2, boolean z3, UserInfo userInfo, NetworkInfo networkInfo, List list, int i2, Object obj) {
            if (obj == null) {
                return logGenerator.generateLog(i, str, th, map, set, j, str2, datadogContext, z, str3, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? true : z2, (i2 & 2048) != 0 ? true : z3, (i2 & 4096) != 0 ? null : userInfo, (i2 & 8192) != 0 ? null : networkInfo, (i2 & 16384) != 0 ? zr4.a : list);
            }
            b0.u("Super calls with default arguments not supported in this target, function: generateLog");
            return null;
        }

        public static /* synthetic */ LogEvent generateLog$default(LogGenerator logGenerator, int i, String str, String str2, String str3, String str4, Map map, Set set, long j, String str5, DatadogContext datadogContext, boolean z, String str6, boolean z2, boolean z3, UserInfo userInfo, NetworkInfo networkInfo, int i2, Object obj) {
            if (obj == null) {
                return logGenerator.generateLog(i, str, str2, str3, str4, map, set, j, str5, datadogContext, z, str6, (i2 & 4096) != 0 ? true : z2, (i2 & 8192) != 0 ? true : z3, (i2 & 16384) != 0 ? null : userInfo, (i2 & 32768) != 0 ? null : networkInfo);
            }
            b0.u("Super calls with default arguments not supported in this target, function: generateLog");
            return null;
        }
    }
}
