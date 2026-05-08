package com.datadog.android.internal.profiler;

import defpackage.b0;
import defpackage.bs4;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\bg\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H&¨\u0006\b"}, d2 = {"Lcom/datadog/android/internal/profiler/BenchmarkTracer;", "", "spanBuilder", "Lcom/datadog/android/internal/profiler/BenchmarkSpanBuilder;", "spanName", "", "additionalProperties", "", "dd-sdk-android-internal_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface BenchmarkTracer {

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BenchmarkSpanBuilder spanBuilder$default(BenchmarkTracer benchmarkTracer, String str, Map map, int i, Object obj) {
            if (obj != null) {
                b0.u("Super calls with default arguments not supported in this target, function: spanBuilder");
                return null;
            }
            if ((i & 2) != 0) {
                map = bs4.a;
            }
            return benchmarkTracer.spanBuilder(str, map);
        }
    }

    BenchmarkSpanBuilder spanBuilder(String spanName, Map<String, String> additionalProperties);
}
