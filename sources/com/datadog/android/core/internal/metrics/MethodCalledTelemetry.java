package com.datadog.android.core.internal.metrics;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.metrics.MethodCallSamplingRate;
import com.datadog.android.core.metrics.PerformanceMetric;
import defpackage.gu5;
import defpackage.mj8;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/datadog/android/core/internal/metrics/MethodCalledTelemetry;", "Lcom/datadog/android/core/metrics/PerformanceMetric;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "operationName", "callerClass", "", "creationSampleRate", "", "startTime", "<init>", "(Lcom/datadog/android/api/InternalLogger;Ljava/lang/String;Ljava/lang/String;FJ)V", "", "isSuccessful", "Lj6g;", "stopAndSend", "(Z)V", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/api/InternalLogger;", "Ljava/lang/String;", "getOperationName$dd_sdk_android_core_release", "()Ljava/lang/String;", "getCallerClass$dd_sdk_android_core_release", "F", "getCreationSampleRate$dd_sdk_android_core_release", "()F", "J", "getStartTime$dd_sdk_android_core_release", "()J", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class MethodCalledTelemetry implements PerformanceMetric {
    public static final String CALLER_CLASS = "caller_class";
    public static final String EXECUTION_TIME = "execution_time";
    public static final String IS_SUCCESSFUL = "is_successful";
    public static final String METHOD_CALLED_METRIC_NAME = "[Mobile Metric] Method Called";
    public static final String METRIC_TYPE_VALUE = "method called";
    public static final String OPERATION_NAME = "operation_name";
    private final String callerClass;
    private final float creationSampleRate;
    private final InternalLogger internalLogger;
    private final String operationName;
    private final long startTime;

    public MethodCalledTelemetry(InternalLogger internalLogger, String str, String str2, float f, long j) {
        internalLogger.getClass();
        str.getClass();
        str2.getClass();
        this.internalLogger = internalLogger;
        this.operationName = str;
        this.callerClass = str2;
        this.creationSampleRate = f;
        this.startTime = j;
    }

    /* JADX INFO: renamed from: getCallerClass$dd_sdk_android_core_release, reason: from getter */
    public final String getCallerClass() {
        return this.callerClass;
    }

    /* JADX INFO: renamed from: getCreationSampleRate$dd_sdk_android_core_release, reason: from getter */
    public final float getCreationSampleRate() {
        return this.creationSampleRate;
    }

    /* JADX INFO: renamed from: getInternalLogger$dd_sdk_android_core_release, reason: from getter */
    public final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    /* JADX INFO: renamed from: getOperationName$dd_sdk_android_core_release, reason: from getter */
    public final String getOperationName() {
        return this.operationName;
    }

    /* JADX INFO: renamed from: getStartTime$dd_sdk_android_core_release, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @Override // com.datadog.android.core.metrics.PerformanceMetric
    public void stopAndSend(boolean isSuccessful) {
        long jNanoTime = System.nanoTime() - this.startTime;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EXECUTION_TIME, Long.valueOf(jNanoTime));
        linkedHashMap.put(OPERATION_NAME, this.operationName);
        linkedHashMap.put(CALLER_CLASS, this.callerClass);
        linkedHashMap.put(IS_SUCCESSFUL, Boolean.valueOf(isSuccessful));
        linkedHashMap.put("metric_type", METRIC_TYPE_VALUE);
        this.internalLogger.logMetric(AnonymousClass1.INSTANCE, linkedHashMap, MethodCallSamplingRate.ALL.getRate(), Float.valueOf(this.creationSampleRate));
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.metrics.MethodCalledTelemetry$stopAndSend$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return MethodCalledTelemetry.METHOD_CALLED_METRIC_NAME;
        }
    }

    public /* synthetic */ MethodCalledTelemetry(InternalLogger internalLogger, String str, String str2, float f, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, str, str2, f, (i & 16) != 0 ? System.nanoTime() : j);
    }
}
