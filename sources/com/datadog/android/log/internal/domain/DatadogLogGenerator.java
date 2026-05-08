package com.datadog.android.log.internal.domain;

import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.core.feature.event.ThreadDump;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.log.internal.utils.LogUtilsKt;
import com.datadog.android.log.model.LogEvent;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.RumContext;
import defpackage.boa;
import defpackage.l5;
import defpackage.lc9;
import defpackage.t92;
import defpackage.z92;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002J¦\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J \u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010'2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016J\u0092\u0001\u0010+\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010-2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002JL\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00170/2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u001eH\u0002J\u0010\u00100\u001a\u0002012\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u00102\u001a\u0002032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u0012\u00104\u001a\u0004\u0018\u0001052\u0006\u0010$\u001a\u00020%H\u0002J$\u00106\u001a\b\u0012\u0004\u0012\u00020\u0003072\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019H\u0002J\u001a\u00108\u001a\u0002092\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u0012\u0010:\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/datadog/android/log/internal/domain/DatadogLogGenerator;", "Lcom/datadog/android/log/internal/domain/LogGenerator;", "serviceName", "", "(Ljava/lang/String;)V", "getServiceName$dd_sdk_android_logs_release", "()Ljava/lang/String;", "simpleDateFormat", "Ljava/text/SimpleDateFormat;", "appVersionTag", "datadogContext", "Lcom/datadog/android/api/context/DatadogContext;", "envTag", "generateLog", "Lcom/datadog/android/log/model/LogEvent;", "level", "", "message", "errorKind", "errorMessage", "errorStack", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "", "tags", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "", "threadName", "attachNetworkInfo", "", "loggerName", "bundleWithTraces", "bundleWithRum", "userInfo", "Lcom/datadog/android/api/context/UserInfo;", "networkInfo", "Lcom/datadog/android/api/context/NetworkInfo;", RumFeature.EVENT_THROWABLE_PROPERTY, "", "threads", "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "internalGenerateLog", "error", "Lcom/datadog/android/log/model/LogEvent$Error;", "resolveAttributes", "", "resolveLogLevelStatus", "Lcom/datadog/android/log/model/LogEvent$Status;", "resolveNetworkInfo", "Lcom/datadog/android/log/model/LogEvent$Network;", "resolveSimCarrier", "Lcom/datadog/android/log/model/LogEvent$SimCarrier;", "resolveTags", "", "resolveUserInfo", "Lcom/datadog/android/log/model/LogEvent$Usr;", "variantTag", "Companion", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DatadogLogGenerator implements LogGenerator {
    public static final int CRASH = 9;
    public static final String ISO_8601 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private final String serviceName;
    private final SimpleDateFormat simpleDateFormat;

    public DatadogLogGenerator(String str) {
        this.serviceName = str;
        this.simpleDateFormat = LogUtilsKt.buildLogDateFormat();
    }

    private final String appVersionTag(DatadogContext datadogContext) {
        String version = datadogContext.getVersion();
        if (version.length() > 0) {
            return l5.l("version:", version);
        }
        return null;
    }

    private final String envTag(DatadogContext datadogContext) {
        String env = datadogContext.getEnv();
        if (env.length() > 0) {
            return l5.l("env:", env);
        }
        return null;
    }

    private final LogEvent internalGenerateLog(int level, String message, LogEvent.Error error, Map<String, ? extends Object> attributes, Set<String> tags, long timestamp, String threadName, DatadogContext datadogContext, boolean attachNetworkInfo, String loggerName, boolean bundleWithTraces, boolean bundleWithRum, UserInfo userInfo, NetworkInfo networkInfo) throws IOException {
        String str;
        long serverTimeOffsetMs = datadogContext.getTime().getServerTimeOffsetMs() + timestamp;
        Map<String, Object> mapResolveAttributes = resolveAttributes(datadogContext, attributes, bundleWithTraces, threadName, bundleWithRum);
        synchronized (this.simpleDateFormat) {
            str = this.simpleDateFormat.format(new Date(serverTimeOffsetMs));
        }
        Set<String> setResolveTags = resolveTags(datadogContext, tags);
        LogEvent.Usr usrResolveUserInfo = resolveUserInfo(datadogContext, userInfo);
        LogEvent.Network networkResolveNetworkInfo = (networkInfo != null || attachNetworkInfo) ? resolveNetworkInfo(datadogContext, networkInfo) : null;
        LogEvent.Logger logger = new LogEvent.Logger(loggerName, threadName, datadogContext.getSdkVersion());
        String service = this.serviceName;
        if (service == null) {
            service = datadogContext.getService();
        }
        LogEvent.Status statusResolveLogLevelStatus = resolveLogLevelStatus(level);
        String appBuildId = datadogContext.getAppBuildId();
        LogEvent.Dd dd = new LogEvent.Dd(new LogEvent.Device(datadogContext.getDeviceInfo().getArchitecture()));
        String strW0 = z92.W0(setResolveTags, ",", null, null, null, 62);
        str.getClass();
        return new LogEvent(statusResolveLogLevelStatus, service, message, str, logger, dd, usrResolveUserInfo, networkResolveNetworkInfo, error, appBuildId, strW0, mapResolveAttributes);
    }

    private final Map<String, Object> resolveAttributes(DatadogContext datadogContext, Map<String, ? extends Object> attributes, boolean bundleWithTraces, String threadName, boolean bundleWithRum) {
        Map<String, Object> map;
        Map<String, Object> map2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(attributes);
        if (bundleWithTraces && (map2 = datadogContext.getFeaturesContext().get("tracing")) != null) {
            Object obj = map2.get("context@" + threadName);
            Map map3 = obj instanceof Map ? (Map) obj : null;
            if (map3 != null) {
                linkedHashMap.put(LogAttributes.DD_TRACE_ID, map3.get("trace_id"));
                linkedHashMap.put(LogAttributes.DD_SPAN_ID, map3.get("span_id"));
            }
        }
        if (bundleWithRum && (map = datadogContext.getFeaturesContext().get("rum")) != null) {
            linkedHashMap.put("application_id", map.get("application_id"));
            linkedHashMap.put("session_id", map.get("session_id"));
            linkedHashMap.put(LogAttributes.RUM_VIEW_ID, map.get(RumContext.VIEW_ID));
            linkedHashMap.put(LogAttributes.RUM_ACTION_ID, map.get(RumContext.ACTION_ID));
        }
        return linkedHashMap;
    }

    private final LogEvent.Status resolveLogLevelStatus(int level) {
        switch (level) {
            case 2:
                return LogEvent.Status.TRACE;
            case 3:
                return LogEvent.Status.DEBUG;
            case 4:
                return LogEvent.Status.INFO;
            case 5:
                return LogEvent.Status.WARN;
            case 6:
                return LogEvent.Status.ERROR;
            case 7:
                return LogEvent.Status.CRITICAL;
            case 8:
            default:
                return LogEvent.Status.DEBUG;
            case CRASH /* 9 */:
                return LogEvent.Status.EMERGENCY;
        }
    }

    private final LogEvent.Network resolveNetworkInfo(DatadogContext datadogContext, NetworkInfo networkInfo) {
        if (networkInfo == null) {
            networkInfo = datadogContext.getNetworkInfo();
        }
        LogEvent.SimCarrier simCarrierResolveSimCarrier = resolveSimCarrier(networkInfo);
        Long strength = networkInfo.getStrength();
        String string = strength != null ? strength.toString() : null;
        Long downKbps = networkInfo.getDownKbps();
        String string2 = downKbps != null ? downKbps.toString() : null;
        Long upKbps = networkInfo.getUpKbps();
        return new LogEvent.Network(new LogEvent.Client(simCarrierResolveSimCarrier, string, string2, upKbps != null ? upKbps.toString() : null, networkInfo.getConnectivity().toString()));
    }

    private final LogEvent.SimCarrier resolveSimCarrier(NetworkInfo networkInfo) {
        if (networkInfo.getCarrierId() == null && networkInfo.getCarrierName() == null) {
            return null;
        }
        Long carrierId = networkInfo.getCarrierId();
        return new LogEvent.SimCarrier(carrierId != null ? carrierId.toString() : null, networkInfo.getCarrierName());
    }

    private final Set<String> resolveTags(DatadogContext datadogContext, Set<String> tags) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(tags);
        String strEnvTag = envTag(datadogContext);
        if (strEnvTag != null) {
            linkedHashSet.add(strEnvTag);
        }
        String strAppVersionTag = appVersionTag(datadogContext);
        if (strAppVersionTag != null) {
            linkedHashSet.add(strAppVersionTag);
        }
        String strVariantTag = variantTag(datadogContext);
        if (strVariantTag != null) {
            linkedHashSet.add(strVariantTag);
        }
        return linkedHashSet;
    }

    private final LogEvent.Usr resolveUserInfo(DatadogContext datadogContext, UserInfo userInfo) {
        if (userInfo == null) {
            userInfo = datadogContext.getUserInfo();
        }
        return new LogEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), lc9.i0(userInfo.getAdditionalProperties()));
    }

    private final String variantTag(DatadogContext datadogContext) {
        String variant = datadogContext.getVariant();
        if (variant.length() > 0) {
            return l5.l("variant:", variant);
        }
        return null;
    }

    @Override // com.datadog.android.log.internal.domain.LogGenerator
    public LogEvent generateLog(int level, String message, Throwable throwable, Map<String, ? extends Object> attributes, Set<String> tags, long timestamp, String threadName, DatadogContext datadogContext, boolean attachNetworkInfo, String loggerName, boolean bundleWithTraces, boolean bundleWithRum, UserInfo userInfo, NetworkInfo networkInfo, List<ThreadDump> threads) {
        LogEvent.Error error;
        DatadogLogGenerator datadogLogGenerator;
        int i;
        String str;
        Set<String> set;
        long j;
        String str2;
        DatadogContext datadogContext2;
        boolean z;
        String str3;
        boolean z2;
        boolean z3;
        UserInfo userInfo2;
        NetworkInfo networkInfo2;
        message.getClass();
        attributes.getClass();
        tags.getClass();
        threadName.getClass();
        datadogContext.getClass();
        loggerName.getClass();
        threads.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(attributes);
        if (throwable != null) {
            Object objRemove = linkedHashMap.remove("_dd.error.fingerprint");
            String str4 = objRemove instanceof String ? (String) objRemove : null;
            String canonicalName = throwable.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = throwable.getClass().getSimpleName();
            }
            String str5 = canonicalName;
            String strO = boa.O(throwable);
            String message2 = throwable.getMessage();
            List<ThreadDump> list = threads;
            ArrayList arrayList = new ArrayList(t92.r0(list, 10));
            for (ThreadDump threadDump : list) {
                arrayList.add(new LogEvent.Thread(threadDump.getName(), threadDump.getCrashed(), threadDump.getStack(), threadDump.getState()));
            }
            error = new LogEvent.Error(str5, message2, strO, null, str4, arrayList.isEmpty() ? null : arrayList, 8, null);
            datadogLogGenerator = this;
            i = level;
            str = message;
            j = timestamp;
            str2 = threadName;
            datadogContext2 = datadogContext;
            z = attachNetworkInfo;
            str3 = loggerName;
            z2 = bundleWithTraces;
            z3 = bundleWithRum;
            userInfo2 = userInfo;
            networkInfo2 = networkInfo;
            set = tags;
        } else {
            error = null;
            datadogLogGenerator = this;
            i = level;
            str = message;
            set = tags;
            j = timestamp;
            str2 = threadName;
            datadogContext2 = datadogContext;
            z = attachNetworkInfo;
            str3 = loggerName;
            z2 = bundleWithTraces;
            z3 = bundleWithRum;
            userInfo2 = userInfo;
            networkInfo2 = networkInfo;
        }
        return datadogLogGenerator.internalGenerateLog(i, str, error, linkedHashMap, set, j, str2, datadogContext2, z, str3, z2, z3, userInfo2, networkInfo2);
    }

    /* JADX INFO: renamed from: getServiceName$dd_sdk_android_logs_release, reason: from getter */
    public final String getServiceName() {
        return this.serviceName;
    }

    public DatadogLogGenerator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DatadogLogGenerator(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    @Override // com.datadog.android.log.internal.domain.LogGenerator
    public LogEvent generateLog(int level, String message, String errorKind, String errorMessage, String errorStack, Map<String, ? extends Object> attributes, Set<String> tags, long timestamp, String threadName, DatadogContext datadogContext, boolean attachNetworkInfo, String loggerName, boolean bundleWithTraces, boolean bundleWithRum, UserInfo userInfo, NetworkInfo networkInfo) {
        LogEvent.Error error;
        DatadogLogGenerator datadogLogGenerator;
        int i;
        String str;
        long j;
        String str2;
        DatadogContext datadogContext2;
        boolean z;
        String str3;
        boolean z2;
        boolean z3;
        UserInfo userInfo2;
        NetworkInfo networkInfo2;
        Set<String> set;
        message.getClass();
        attributes.getClass();
        tags.getClass();
        threadName.getClass();
        datadogContext.getClass();
        loggerName.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(attributes);
        if (errorKind == null && errorMessage == null && errorStack == null) {
            error = null;
            datadogLogGenerator = this;
            i = level;
            str = message;
            set = tags;
            j = timestamp;
            str2 = threadName;
            datadogContext2 = datadogContext;
            z = attachNetworkInfo;
            str3 = loggerName;
            z2 = bundleWithTraces;
            z3 = bundleWithRum;
            userInfo2 = userInfo;
            networkInfo2 = networkInfo;
        } else {
            Object objRemove = linkedHashMap.remove("_dd.error.source_type");
            String str4 = objRemove instanceof String ? (String) objRemove : null;
            Object objRemove2 = linkedHashMap.remove("_dd.error.fingerprint");
            error = new LogEvent.Error(errorKind, errorMessage, errorStack, str4, objRemove2 instanceof String ? (String) objRemove2 : null, null, 32, null);
            datadogLogGenerator = this;
            i = level;
            str = message;
            j = timestamp;
            str2 = threadName;
            datadogContext2 = datadogContext;
            z = attachNetworkInfo;
            str3 = loggerName;
            z2 = bundleWithTraces;
            z3 = bundleWithRum;
            userInfo2 = userInfo;
            networkInfo2 = networkInfo;
            set = tags;
        }
        return datadogLogGenerator.internalGenerateLog(i, str, error, linkedHashMap, set, j, str2, datadogContext2, z, str3, z2, z3, userInfo2, networkInfo2);
    }
}
