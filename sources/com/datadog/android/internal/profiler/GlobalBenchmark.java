package com.datadog.android.internal.profiler;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/datadog/android/internal/profiler/GlobalBenchmark;", "", "<init>", "()V", "Lcom/datadog/android/internal/profiler/BenchmarkProfiler;", "benchmarkProfiler", "Lj6g;", "register", "(Lcom/datadog/android/internal/profiler/BenchmarkProfiler;)V", "get", "()Lcom/datadog/android/internal/profiler/BenchmarkProfiler;", "Lcom/datadog/android/internal/profiler/BenchmarkProfiler;", "dd-sdk-android-internal_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class GlobalBenchmark {
    public static final GlobalBenchmark INSTANCE = new GlobalBenchmark();
    private static BenchmarkProfiler benchmarkProfiler = new NoOpBenchmarkProfiler();

    private GlobalBenchmark() {
    }

    public final BenchmarkProfiler get() {
        return benchmarkProfiler;
    }

    public final void register(BenchmarkProfiler benchmarkProfiler2) {
        benchmarkProfiler2.getClass();
        benchmarkProfiler = benchmarkProfiler2;
    }
}
