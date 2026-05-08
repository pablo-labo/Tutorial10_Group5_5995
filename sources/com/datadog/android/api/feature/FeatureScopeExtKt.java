package com.datadog.android.api.feature;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.metrics.PerformanceMetric;
import com.datadog.android.core.metrics.TelemetryMetricType;
import com.datadog.android.lint.InternalApi;
import defpackage.gu5;
import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"R", "Lcom/datadog/android/api/InternalLogger;", "Ljava/lang/Class;", "callerClass", "", "operationName", "", "samplingRate", "Lkotlin/Function0;", "operation", "measureMethodCallPerf", "(Lcom/datadog/android/api/InternalLogger;Ljava/lang/Class;Ljava/lang/String;FLgu5;)Ljava/lang/Object;", "dd-sdk-android-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class FeatureScopeExtKt {
    @InternalApi
    public static final <R> R measureMethodCallPerf(InternalLogger internalLogger, Class<?> cls, String str, float f, gu5<? extends R> gu5Var) {
        internalLogger.getClass();
        cls.getClass();
        str.getClass();
        gu5Var.getClass();
        PerformanceMetric performanceMetricStartPerformanceMeasure = internalLogger.startPerformanceMeasure(cls.getName(), TelemetryMetricType.MethodCalled, f, str);
        R rInvoke = gu5Var.invoke();
        boolean z = (rInvoke == null || ((rInvoke instanceof Collection) && ((Collection) rInvoke).isEmpty())) ? false : true;
        if (performanceMetricStartPerformanceMeasure != null) {
            performanceMetricStartPerformanceMeasure.stopAndSend(z);
        }
        return rInvoke;
    }

    public static /* synthetic */ Object measureMethodCallPerf$default(InternalLogger internalLogger, Class cls, String str, float f, gu5 gu5Var, int i, Object obj) {
        if ((i & 4) != 0) {
            f = 100.0f;
        }
        return measureMethodCallPerf(internalLogger, cls, str, f, gu5Var);
    }
}
