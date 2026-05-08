package com.datadog.android.core.internal.logger;

import com.datadog.android.BuildConfig;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.internal.metrics.MethodCalledTelemetry;
import com.datadog.android.core.metrics.PerformanceMetric;
import com.datadog.android.core.metrics.TelemetryMetricType;
import com.datadog.android.core.sampling.RateBasedSampler;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.l;
import defpackage.mj8;
import defpackage.t40;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 P2\u00020\u0001:\u0001PB3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014JM\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJO\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020 *\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J7\u0010*\u001a\u00020\u00122\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c0%2\u0006\u0010'\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+JW\u0010/\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\u0010.\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001bH\u0016¢\u0006\u0004\b/\u00100J]\u0010/\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\f\u00102\u001a\b\u0012\u0004\u0012\u00020,012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\u0010.\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001bH\u0016¢\u0006\u0004\b/\u00103JE\u00106\u001a\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b2\u0006\u00104\u001a\u00020(2\b\u00105\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b6\u00107J1\u0010=\u001a\u0004\u0018\u00010<2\u0006\u00108\u001a\u00020\f2\u0006\u0010:\u001a\u0002092\u0006\u00104\u001a\u00020(2\u0006\u0010;\u001a\u00020\fH\u0016¢\u0006\u0004\b=\u0010>J%\u0010A\u001a\u00020\u00122\u0006\u00104\u001a\u00020(2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u0004H\u0016¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u00020\u00102\u0006\u00104\u001a\u00020(¢\u0006\u0004\bC\u0010DR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER\u001a\u0010F\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010J\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010MR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010M¨\u0006Q"}, d2 = {"Lcom/datadog/android/core/internal/logger/SdkInternalLogger;", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lkotlin/Function0;", "Lcom/datadog/android/core/internal/logger/LogcatLogHandler;", "userLogHandlerFactory", "maintainerLogHandlerFactory", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lgu5;Lgu5;)V", "Lcom/datadog/android/api/InternalLogger$Level;", "level", "", "messageBuilder", "", "error", "", "onlyOnce", "Lj6g;", "logToUser", "(Lcom/datadog/android/api/InternalLogger$Level;Lgu5;Ljava/lang/Throwable;Z)V", "logToMaintainer", "handler", "", "knownSingleMessages", "sendToLogHandler", "(Lcom/datadog/android/core/internal/logger/LogcatLogHandler;Lcom/datadog/android/api/InternalLogger$Level;Lgu5;Ljava/lang/Throwable;ZLjava/util/Set;)V", "", "", "additionalProperties", "logToTelemetry", "(Lcom/datadog/android/api/InternalLogger$Level;Lgu5;Ljava/lang/Throwable;ZLjava/util/Map;)V", "", "toLogLevel", "(Lcom/datadog/android/api/InternalLogger$Level;)I", "withSdkName", "(Ljava/lang/String;)Ljava/lang/String;", "", "map", "key", "", "value", "enrichWithNonNullValue", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Float;)V", "Lcom/datadog/android/api/InternalLogger$Target;", "target", RumFeature.EVENT_THROWABLE_PROPERTY, "log", "(Lcom/datadog/android/api/InternalLogger$Level;Lcom/datadog/android/api/InternalLogger$Target;Lgu5;Ljava/lang/Throwable;ZLjava/util/Map;)V", "", "targets", "(Lcom/datadog/android/api/InternalLogger$Level;Ljava/util/List;Lgu5;Ljava/lang/Throwable;ZLjava/util/Map;)V", "samplingRate", "creationSampleRate", "logMetric", "(Lgu5;Ljava/util/Map;FLjava/lang/Float;)V", "callerClass", "Lcom/datadog/android/core/metrics/TelemetryMetricType;", "metric", "operationName", "Lcom/datadog/android/core/metrics/PerformanceMetric;", "startPerformanceMeasure", "(Ljava/lang/String;Lcom/datadog/android/core/metrics/TelemetryMetricType;FLjava/lang/String;)Lcom/datadog/android/core/metrics/PerformanceMetric;", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "apiUsageEventBuilder", "logApiUsage", "(FLgu5;)V", "sample", "(F)Z", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "userLogger", "Lcom/datadog/android/core/internal/logger/LogcatLogHandler;", "getUserLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/logger/LogcatLogHandler;", "maintainerLogger", "getMaintainerLogger$dd_sdk_android_core_release", "onlyOnceUserMessages", "Ljava/util/Set;", "onlyOnceMaintainerMessages", "onlyOnceTelemetryMessages", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class SdkInternalLogger implements InternalLogger {
    public static final String DEV_LOG_TAG = "Datadog";
    public static final String SDK_LOG_TAG = "DD_LOG";
    private final LogcatLogHandler maintainerLogger;
    private final Set<String> onlyOnceMaintainerMessages;
    private final Set<String> onlyOnceTelemetryMessages;
    private final Set<String> onlyOnceUserMessages;
    private final FeatureSdkCore sdkCore;
    private final LogcatLogHandler userLogger;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.logger.SdkInternalLogger$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/datadog/android/core/internal/logger/LogcatLogHandler;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<LogcatLogHandler> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // defpackage.gu5
        public final LogcatLogHandler invoke() {
            Boolean bool = BuildConfig.LOGCAT_ENABLED;
            bool.getClass();
            if (bool.booleanValue()) {
                return new LogcatLogHandler(SdkInternalLogger.SDK_LOG_TAG, null, 2, null);
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[InternalLogger.Target.values().length];
            try {
                iArr[InternalLogger.Target.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalLogger.Target.MAINTAINER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InternalLogger.Target.TELEMETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TelemetryMetricType.values().length];
            try {
                iArr2[TelemetryMetricType.MethodCalled.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[InternalLogger.Level.values().length];
            try {
                iArr3[InternalLogger.Level.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[InternalLogger.Level.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[InternalLogger.Level.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[InternalLogger.Level.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[InternalLogger.Level.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public SdkInternalLogger(FeatureSdkCore featureSdkCore, gu5<LogcatLogHandler> gu5Var, gu5<LogcatLogHandler> gu5Var2) {
        gu5Var.getClass();
        gu5Var2.getClass();
        this.sdkCore = featureSdkCore;
        this.userLogger = gu5Var.invoke();
        this.maintainerLogger = gu5Var2.invoke();
        this.onlyOnceUserMessages = new LinkedHashSet();
        this.onlyOnceMaintainerMessages = new LinkedHashSet();
        this.onlyOnceTelemetryMessages = new LinkedHashSet();
    }

    private final void enrichWithNonNullValue(Map<String, Object> map, String key, Float value) {
        if (value == null || map.containsKey(key)) {
            return;
        }
        map.put(key, value);
    }

    private final void logToMaintainer(InternalLogger.Level level, gu5<String> messageBuilder, Throwable error, boolean onlyOnce) {
        LogcatLogHandler logcatLogHandler = this.maintainerLogger;
        if (logcatLogHandler != null) {
            sendToLogHandler(logcatLogHandler, level, messageBuilder, error, onlyOnce, this.onlyOnceMaintainerMessages);
        }
    }

    private final void logToTelemetry(InternalLogger.Level level, gu5<String> messageBuilder, Throwable error, boolean onlyOnce, Map<String, ? extends Object> additionalProperties) {
        FeatureScope feature;
        FeatureSdkCore featureSdkCore = this.sdkCore;
        if (featureSdkCore == null || (feature = featureSdkCore.getFeature("rum")) == null) {
            return;
        }
        String strInvoke = messageBuilder.invoke();
        if (onlyOnce) {
            if (this.onlyOnceTelemetryMessages.contains(strInvoke)) {
                return;
            } else {
                this.onlyOnceTelemetryMessages.add(strInvoke);
            }
        }
        feature.sendEvent((level == InternalLogger.Level.ERROR || level == InternalLogger.Level.WARN || error != null) ? new InternalTelemetryEvent.Log.Error(strInvoke, additionalProperties, error, null, null, 24, null) : new InternalTelemetryEvent.Log.Debug(strInvoke, additionalProperties));
    }

    private final void logToUser(InternalLogger.Level level, gu5<String> messageBuilder, Throwable error, boolean onlyOnce) {
        sendToLogHandler(this.userLogger, level, messageBuilder, error, onlyOnce, this.onlyOnceUserMessages);
    }

    private final void sendToLogHandler(LogcatLogHandler handler, InternalLogger.Level level, gu5<String> messageBuilder, Throwable error, boolean onlyOnce, Set<String> knownSingleMessages) {
        if (handler.canLog(toLogLevel(level))) {
            String strWithSdkName = withSdkName(messageBuilder.invoke());
            if (onlyOnce) {
                if (knownSingleMessages.contains(strWithSdkName)) {
                    return;
                } else {
                    knownSingleMessages.add(strWithSdkName);
                }
            }
            handler.log(toLogLevel(level), strWithSdkName, error);
        }
    }

    private final int toLogLevel(InternalLogger.Level level) {
        int i = WhenMappings.$EnumSwitchMapping$2[level.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        l.g();
        return 0;
    }

    private final String withSdkName(String str) {
        FeatureSdkCore featureSdkCore = this.sdkCore;
        String name = featureSdkCore != null ? featureSdkCore.getName() : null;
        return name != null ? t40.l("[", name, "]: ", str) : str;
    }

    /* JADX INFO: renamed from: getMaintainerLogger$dd_sdk_android_core_release, reason: from getter */
    public final LogcatLogHandler getMaintainerLogger() {
        return this.maintainerLogger;
    }

    /* JADX INFO: renamed from: getUserLogger$dd_sdk_android_core_release, reason: from getter */
    public final LogcatLogHandler getUserLogger() {
        return this.userLogger;
    }

    @Override // com.datadog.android.api.InternalLogger
    public void log(InternalLogger.Level level, InternalLogger.Target target, gu5<String> messageBuilder, Throwable throwable, boolean onlyOnce, Map<String, ? extends Object> additionalProperties) {
        level.getClass();
        target.getClass();
        messageBuilder.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[target.ordinal()];
        if (i == 1) {
            logToUser(level, messageBuilder, throwable, onlyOnce);
        } else if (i == 2) {
            logToMaintainer(level, messageBuilder, throwable, onlyOnce);
        } else {
            if (i != 3) {
                return;
            }
            logToTelemetry(level, messageBuilder, throwable, onlyOnce, additionalProperties);
        }
    }

    @Override // com.datadog.android.api.InternalLogger
    public void logApiUsage(float samplingRate, gu5<? extends InternalTelemetryEvent.ApiUsage> apiUsageEventBuilder) {
        FeatureSdkCore featureSdkCore;
        FeatureScope feature;
        apiUsageEventBuilder.getClass();
        if (!sample(samplingRate) || (featureSdkCore = this.sdkCore) == null || (feature = featureSdkCore.getFeature("rum")) == null) {
            return;
        }
        InternalTelemetryEvent.ApiUsage apiUsageInvoke = apiUsageEventBuilder.invoke();
        enrichWithNonNullValue(apiUsageInvoke.getAdditionalProperties(), InternalTelemetryEvent.REPORTING_SAMPLING_RATE_KEY, Float.valueOf(samplingRate));
        feature.sendEvent(apiUsageInvoke);
    }

    @Override // com.datadog.android.api.InternalLogger
    public void logMetric(gu5<String> messageBuilder, Map<String, ? extends Object> additionalProperties, float samplingRate, Float creationSampleRate) {
        FeatureSdkCore featureSdkCore;
        FeatureScope feature;
        messageBuilder.getClass();
        additionalProperties.getClass();
        if (!sample(samplingRate) || (featureSdkCore = this.sdkCore) == null || (feature = featureSdkCore.getFeature("rum")) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(additionalProperties);
        enrichWithNonNullValue(linkedHashMap, InternalTelemetryEvent.CREATION_SAMPLING_RATE_KEY, creationSampleRate);
        enrichWithNonNullValue(linkedHashMap, InternalTelemetryEvent.REPORTING_SAMPLING_RATE_KEY, Float.valueOf(samplingRate));
        feature.sendEvent(new InternalTelemetryEvent.Metric(messageBuilder.invoke(), linkedHashMap));
    }

    public final boolean sample(float samplingRate) {
        return new RateBasedSampler(samplingRate).sample(j6g.a);
    }

    @Override // com.datadog.android.api.InternalLogger
    public PerformanceMetric startPerformanceMeasure(String callerClass, TelemetryMetricType metric, float samplingRate, String operationName) {
        callerClass.getClass();
        metric.getClass();
        operationName.getClass();
        if (!sample(samplingRate)) {
            return null;
        }
        if (WhenMappings.$EnumSwitchMapping$1[metric.ordinal()] == 1) {
            return new MethodCalledTelemetry(this, operationName, callerClass, samplingRate, 0L, 16, null);
        }
        l.g();
        return null;
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.logger.SdkInternalLogger$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/datadog/android/core/internal/logger/LogcatLogHandler;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<LogcatLogHandler> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // defpackage.gu5
        public final LogcatLogHandler invoke() {
            return new LogcatLogHandler(SdkInternalLogger.DEV_LOG_TAG, C01201.INSTANCE);
        }

        /* JADX INFO: renamed from: com.datadog.android.core.internal.logger.SdkInternalLogger$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "level", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
        public static final class C01201 extends mj8 implements Function1<Integer, Boolean> {
            public static final C01201 INSTANCE = new C01201();

            public C01201() {
                super(1);
            }

            public final Boolean invoke(int i) {
                return Boolean.valueOf(i >= Datadog.getVerbosity());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                return invoke(num.intValue());
            }
        }
    }

    public /* synthetic */ SdkInternalLogger(FeatureSdkCore featureSdkCore, gu5 gu5Var, gu5 gu5Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureSdkCore, (i & 2) != 0 ? AnonymousClass1.INSTANCE : gu5Var, (i & 4) != 0 ? AnonymousClass2.INSTANCE : gu5Var2);
    }

    @Override // com.datadog.android.api.InternalLogger
    public void log(InternalLogger.Level level, List<? extends InternalLogger.Target> targets, gu5<String> messageBuilder, Throwable throwable, boolean onlyOnce, Map<String, ? extends Object> additionalProperties) {
        level.getClass();
        targets.getClass();
        messageBuilder.getClass();
        Iterator<T> it = targets.iterator();
        while (it.hasNext()) {
            log(level, (InternalLogger.Target) it.next(), messageBuilder, throwable, onlyOnce, additionalProperties);
        }
    }
}
