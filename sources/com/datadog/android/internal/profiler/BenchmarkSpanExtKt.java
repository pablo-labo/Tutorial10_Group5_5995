package com.datadog.android.internal.profiler;

import com.datadog.android.telemetry.internal.TelemetryEventHandler;
import defpackage.bs4;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"T", "", "operationName", "", "additionalProperties", "Lkotlin/Function1;", "Lcom/datadog/android/internal/profiler/BenchmarkSpan;", "block", "withinBenchmarkSpan", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "dd-sdk-android-internal_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class BenchmarkSpanExtKt {
    public static final <T> T withinBenchmarkSpan(String str, Map<String, String> map, Function1<? super BenchmarkSpan, ? extends T> function1) {
        str.getClass();
        map.getClass();
        function1.getClass();
        BenchmarkSpan benchmarkSpanStartSpan = GlobalBenchmark.INSTANCE.get().getTracer(TelemetryEventHandler.TELEMETRY_SERVICE_NAME).spanBuilder(str, map).startSpan();
        try {
            return function1.invoke(benchmarkSpanStartSpan);
        } finally {
            benchmarkSpanStartSpan.stop();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object withinBenchmarkSpan$default(String str, Map map, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            map = bs4.a;
        }
        str.getClass();
        map.getClass();
        function1.getClass();
        BenchmarkSpan benchmarkSpanStartSpan = GlobalBenchmark.INSTANCE.get().getTracer(TelemetryEventHandler.TELEMETRY_SERVICE_NAME).spanBuilder(str, map).startSpan();
        try {
            return function1.invoke(benchmarkSpanStartSpan);
        } finally {
            benchmarkSpanStartSpan.stop();
        }
    }
}
