package defpackage;

import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class e20 {
    public static final tj6 a = new tj6(a.a);
    public static final tj6 b = new tj6(b.a);

    public /* synthetic */ class a extends qv5 implements Function2<Integer, Integer, Integer> {
        public static final a a = new a(2, gf9.class, BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "min(II)I", 1);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    public /* synthetic */ class b extends qv5 implements Function2<Integer, Integer, Integer> {
        public static final b a = new b(2, gf9.class, BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "max(II)I", 1);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
        }
    }
}
