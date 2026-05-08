package com.datadog.android.log.internal.logger;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.core.sampling.RateBasedSampler;
import com.datadog.android.core.sampling.Sampler;
import com.datadog.android.log.internal.LogsFeature;
import com.datadog.android.log.internal.domain.LogGenerator;
import com.datadog.android.log.model.LogEvent;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.RumFeature;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.lc9;
import defpackage.mj8;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b$\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jg\u0010$\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J{\u0010$\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u00022\b\u0010'\u001a\u0004\u0018\u00010\u00022\b\u0010(\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010)JW\u0010*\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b*\u0010+Jk\u0010*\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u00022\b\u0010'\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b*\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u00106R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u00109R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\r\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b=\u0010<R\u001a\u0010\u000e\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b>\u0010<R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/datadog/android/log/internal/logger/DatadogLogHandler;", "Lcom/datadog/android/log/internal/logger/LogHandler;", "", "loggerName", "Lcom/datadog/android/log/internal/domain/LogGenerator;", "logGenerator", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lcom/datadog/android/api/storage/DataWriter;", "Lcom/datadog/android/log/model/LogEvent;", "writer", "", "attachNetworkInfo", "bundleWithTraces", "bundleWithRum", "Lcom/datadog/android/core/sampling/Sampler;", "Lj6g;", "sampler", "", "minLogPriority", "<init>", "(Ljava/lang/String;Lcom/datadog/android/log/internal/domain/LogGenerator;Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/api/storage/DataWriter;ZZZLcom/datadog/android/core/sampling/Sampler;I)V", "level", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "message", "", RumFeature.EVENT_THROWABLE_PROPERTY, "", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "tags", "threadName", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "createLog", "(ILcom/datadog/android/api/context/DatadogContext;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;Ljava/util/Set;Ljava/lang/String;J)Lcom/datadog/android/log/model/LogEvent;", "errorKind", "errorMessage", "errorStack", "(ILcom/datadog/android/api/context/DatadogContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/lang/String;J)Lcom/datadog/android/log/model/LogEvent;", "handleLog", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;Ljava/util/Set;Ljava/lang/Long;)V", "errorStacktrace", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/lang/Long;)V", "Ljava/lang/String;", "getLoggerName$dd_sdk_android_logs_release", "()Ljava/lang/String;", "Lcom/datadog/android/log/internal/domain/LogGenerator;", "getLogGenerator$dd_sdk_android_logs_release", "()Lcom/datadog/android/log/internal/domain/LogGenerator;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getSdkCore$dd_sdk_android_logs_release", "()Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/api/storage/DataWriter;", "getWriter$dd_sdk_android_logs_release", "()Lcom/datadog/android/api/storage/DataWriter;", "Z", "getAttachNetworkInfo$dd_sdk_android_logs_release", "()Z", "getBundleWithTraces$dd_sdk_android_logs_release", "getBundleWithRum$dd_sdk_android_logs_release", "Lcom/datadog/android/core/sampling/Sampler;", "getSampler$dd_sdk_android_logs_release", "()Lcom/datadog/android/core/sampling/Sampler;", "I", "getMinLogPriority$dd_sdk_android_logs_release", "()I", "Companion", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DatadogLogHandler implements LogHandler {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final float DEFAULT_SAMPLE_RATE = 100.0f;

    @Deprecated
    public static final String LOGS_FEATURE_NOT_REGISTERED = "Requested to write log, but Logs feature is not registered.";

    @Deprecated
    public static final String RUM_FEATURE_NOT_REGISTERED = "Requested to forward error log to RUM, but RUM feature is not registered.";
    private final boolean attachNetworkInfo;
    private final boolean bundleWithRum;
    private final boolean bundleWithTraces;
    private final LogGenerator logGenerator;
    private final String loggerName;
    private final int minLogPriority;
    private final Sampler<j6g> sampler;
    private final FeatureSdkCore sdkCore;
    private final DataWriter<LogEvent> writer;

    public DatadogLogHandler(String str, LogGenerator logGenerator, FeatureSdkCore featureSdkCore, DataWriter<LogEvent> dataWriter, boolean z, boolean z2, boolean z3, Sampler<j6g> sampler, int i) {
        str.getClass();
        logGenerator.getClass();
        featureSdkCore.getClass();
        dataWriter.getClass();
        sampler.getClass();
        this.loggerName = str;
        this.logGenerator = logGenerator;
        this.sdkCore = featureSdkCore;
        this.writer = dataWriter;
        this.attachNetworkInfo = z;
        this.bundleWithTraces = z2;
        this.bundleWithRum = z3;
        this.sampler = sampler;
        this.minLogPriority = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogEvent createLog(int level, DatadogContext datadogContext, String message, String errorKind, String errorMessage, String errorStack, Map<String, ? extends Object> attributes, Set<String> tags, String threadName, long timestamp) {
        return LogGenerator.DefaultImpls.generateLog$default(this.logGenerator, level, message, errorKind, errorMessage, errorStack, attributes, tags, timestamp, threadName, datadogContext, this.attachNetworkInfo, this.loggerName, this.bundleWithTraces, this.bundleWithRum, null, null, 49152, null);
    }

    /* JADX INFO: renamed from: getAttachNetworkInfo$dd_sdk_android_logs_release, reason: from getter */
    public final boolean getAttachNetworkInfo() {
        return this.attachNetworkInfo;
    }

    /* JADX INFO: renamed from: getBundleWithRum$dd_sdk_android_logs_release, reason: from getter */
    public final boolean getBundleWithRum() {
        return this.bundleWithRum;
    }

    /* JADX INFO: renamed from: getBundleWithTraces$dd_sdk_android_logs_release, reason: from getter */
    public final boolean getBundleWithTraces() {
        return this.bundleWithTraces;
    }

    /* JADX INFO: renamed from: getLogGenerator$dd_sdk_android_logs_release, reason: from getter */
    public final LogGenerator getLogGenerator() {
        return this.logGenerator;
    }

    /* JADX INFO: renamed from: getLoggerName$dd_sdk_android_logs_release, reason: from getter */
    public final String getLoggerName() {
        return this.loggerName;
    }

    /* JADX INFO: renamed from: getMinLogPriority$dd_sdk_android_logs_release, reason: from getter */
    public final int getMinLogPriority() {
        return this.minLogPriority;
    }

    public final Sampler<j6g> getSampler$dd_sdk_android_logs_release() {
        return this.sampler;
    }

    /* JADX INFO: renamed from: getSdkCore$dd_sdk_android_logs_release, reason: from getter */
    public final FeatureSdkCore getSdkCore() {
        return this.sdkCore;
    }

    public final DataWriter<LogEvent> getWriter$dd_sdk_android_logs_release() {
        return this.writer;
    }

    @Override // com.datadog.android.log.internal.logger.LogHandler
    public void handleLog(int level, String message, String errorKind, String errorMessage, String errorStacktrace, Map<String, ? extends Object> attributes, Set<String> tags, Long timestamp) {
        message.getClass();
        attributes.getClass();
        tags.getClass();
        if (level < this.minLogPriority) {
            return;
        }
        long jLongValue = timestamp != null ? timestamp.longValue() : System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FeatureScope feature = this.sdkCore.getFeature("logs");
        if (feature != null) {
            linkedHashMap.putAll(lc9.i0(((LogsFeature) feature.unwrap()).getAttributes$dd_sdk_android_logs_release()));
        }
        linkedHashMap.putAll(attributes);
        if (this.sampler.sample(j6g.a)) {
            if (feature != null) {
                FeatureScope.DefaultImpls.withWriteContext$default(feature, false, new AnonymousClass4(level, message, errorKind, errorMessage, errorStacktrace, linkedHashMap, tags, Thread.currentThread().getName(), jLongValue), 1, null);
            } else {
                InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) AnonymousClass5.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            }
        }
        if (level >= 6) {
            FeatureScope feature2 = this.sdkCore.getFeature("rum");
            if (feature2 != null) {
                feature2.sendEvent(lc9.a0(new Pair("type", RumFeature.LOGGER_ERROR_WITH_STACK_TRACE_MESSAGE_TYPE), new Pair("message", message), new Pair("stacktrace", errorStacktrace), new Pair(RumFeature.EVENT_ATTRIBUTES_PROPERTY, linkedHashMap)));
            } else {
                InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) AnonymousClass6.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/datadog/android/log/internal/logger/DatadogLogHandler$Companion;", "", "()V", "DEFAULT_SAMPLE_RATE", "", "LOGS_FEATURE_NOT_REGISTERED", "", "RUM_FEATURE_NOT_REGISTERED", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.log.internal.logger.DatadogLogHandler$handleLog$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatadogLogHandler.LOGS_FEATURE_NOT_REGISTERED;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.log.internal.logger.DatadogLogHandler$handleLog$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<String> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatadogLogHandler.RUM_FEATURE_NOT_REGISTERED;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.log.internal.logger.DatadogLogHandler$handleLog$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass5 extends mj8 implements gu5<String> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatadogLogHandler.LOGS_FEATURE_NOT_REGISTERED;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.log.internal.logger.DatadogLogHandler$handleLog$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass6 extends mj8 implements gu5<String> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatadogLogHandler.RUM_FEATURE_NOT_REGISTERED;
        }
    }

    public /* synthetic */ DatadogLogHandler(String str, LogGenerator logGenerator, FeatureSdkCore featureSdkCore, DataWriter dataWriter, boolean z, boolean z2, boolean z3, Sampler sampler, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, logGenerator, featureSdkCore, dataWriter, z, (i2 & 32) != 0 ? true : z2, (i2 & 64) != 0 ? true : z3, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new RateBasedSampler(100.0f) : sampler, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? -1 : i);
    }

    /* JADX INFO: renamed from: com.datadog.android.log.internal.logger.DatadogLogHandler$handleLog$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lcom/datadog/android/api/storage/EventBatchWriter;", "eventBatchWriter", "Lj6g;", "invoke", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/storage/EventBatchWriter;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass1 extends mj8 implements Function2<DatadogContext, EventBatchWriter, j6g> {
        final /* synthetic */ Map<String, Object> $combinedAttributes;
        final /* synthetic */ int $level;
        final /* synthetic */ String $message;
        final /* synthetic */ long $resolvedTimeStamp;
        final /* synthetic */ Set<String> $tags;
        final /* synthetic */ String $threadName;
        final /* synthetic */ Throwable $throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, String str, Throwable th, Map<String, Object> map, Set<String> set, String str2, long j) {
            super(2);
            this.$level = i;
            this.$message = str;
            this.$throwable = th;
            this.$combinedAttributes = map;
            this.$tags = set;
            this.$threadName = str2;
            this.$resolvedTimeStamp = j;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            datadogContext.getClass();
            eventBatchWriter.getClass();
            DatadogLogHandler datadogLogHandler = DatadogLogHandler.this;
            int i = this.$level;
            String str = this.$message;
            Throwable th = this.$throwable;
            Map<String, Object> map = this.$combinedAttributes;
            Set<String> set = this.$tags;
            String str2 = this.$threadName;
            str2.getClass();
            LogEvent logEventCreateLog = datadogLogHandler.createLog(i, datadogContext, str, th, map, set, str2, this.$resolvedTimeStamp);
            if (logEventCreateLog != null) {
                DatadogLogHandler.this.getWriter$dd_sdk_android_logs_release().write(eventBatchWriter, logEventCreateLog, EventType.DEFAULT);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ j6g invoke(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            invoke2(datadogContext, eventBatchWriter);
            return j6g.a;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.log.internal.logger.DatadogLogHandler$handleLog$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lcom/datadog/android/api/storage/EventBatchWriter;", "eventBatchWriter", "Lj6g;", "invoke", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/storage/EventBatchWriter;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass4 extends mj8 implements Function2<DatadogContext, EventBatchWriter, j6g> {
        final /* synthetic */ Map<String, Object> $combinedAttributes;
        final /* synthetic */ String $errorKind;
        final /* synthetic */ String $errorMessage;
        final /* synthetic */ String $errorStacktrace;
        final /* synthetic */ int $level;
        final /* synthetic */ String $message;
        final /* synthetic */ long $resolvedTimeStamp;
        final /* synthetic */ Set<String> $tags;
        final /* synthetic */ String $threadName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(int i, String str, String str2, String str3, String str4, Map<String, Object> map, Set<String> set, String str5, long j) {
            super(2);
            this.$level = i;
            this.$message = str;
            this.$errorKind = str2;
            this.$errorMessage = str3;
            this.$errorStacktrace = str4;
            this.$combinedAttributes = map;
            this.$tags = set;
            this.$threadName = str5;
            this.$resolvedTimeStamp = j;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            datadogContext.getClass();
            eventBatchWriter.getClass();
            DatadogLogHandler datadogLogHandler = DatadogLogHandler.this;
            int i = this.$level;
            String str = this.$message;
            String str2 = this.$errorKind;
            String str3 = this.$errorMessage;
            String str4 = this.$errorStacktrace;
            Map<String, Object> map = this.$combinedAttributes;
            Set<String> set = this.$tags;
            String str5 = this.$threadName;
            str5.getClass();
            LogEvent logEventCreateLog = datadogLogHandler.createLog(i, datadogContext, str, str2, str3, str4, map, set, str5, this.$resolvedTimeStamp);
            if (logEventCreateLog != null) {
                DatadogLogHandler.this.getWriter$dd_sdk_android_logs_release().write(eventBatchWriter, logEventCreateLog, EventType.DEFAULT);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ j6g invoke(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            invoke2(datadogContext, eventBatchWriter);
            return j6g.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogEvent createLog(int level, DatadogContext datadogContext, String message, Throwable throwable, Map<String, ? extends Object> attributes, Set<String> tags, String threadName, long timestamp) {
        return LogGenerator.DefaultImpls.generateLog$default(this.logGenerator, level, message, throwable, attributes, tags, timestamp, threadName, datadogContext, this.attachNetworkInfo, this.loggerName, this.bundleWithTraces, this.bundleWithRum, null, null, null, 28672, null);
    }

    @Override // com.datadog.android.log.internal.logger.LogHandler
    public void handleLog(int level, String message, Throwable throwable, Map<String, ? extends Object> attributes, Set<String> tags, Long timestamp) {
        message.getClass();
        attributes.getClass();
        tags.getClass();
        if (level < this.minLogPriority) {
            return;
        }
        long jLongValue = timestamp != null ? timestamp.longValue() : System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FeatureScope feature = this.sdkCore.getFeature("logs");
        if (feature != null) {
            linkedHashMap.putAll(lc9.i0(((LogsFeature) feature.unwrap()).getAttributes$dd_sdk_android_logs_release()));
        }
        linkedHashMap.putAll(attributes);
        if (this.sampler.sample(j6g.a)) {
            if (feature != null) {
                FeatureScope.DefaultImpls.withWriteContext$default(feature, false, new AnonymousClass1(level, message, throwable, linkedHashMap, tags, Thread.currentThread().getName(), jLongValue), 1, null);
            } else {
                InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) AnonymousClass2.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            }
        }
        if (level >= 6) {
            FeatureScope feature2 = this.sdkCore.getFeature("rum");
            if (feature2 != null) {
                feature2.sendEvent(lc9.a0(new Pair("type", RumFeature.LOGGER_ERROR_BUS_MESSAGE_TYPE), new Pair("message", message), new Pair(RumFeature.EVENT_THROWABLE_PROPERTY, throwable), new Pair(RumFeature.EVENT_ATTRIBUTES_PROPERTY, linkedHashMap)));
            } else {
                InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) AnonymousClass3.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            }
        }
    }
}
