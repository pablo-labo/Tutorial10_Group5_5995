package defpackage;

import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class c01 implements kna<v33.d.a> {
    public static final c01 a = new c01();
    public static final x85 b = x85.a(BatchMetricsDispatcher.FILE_NAME);
    public static final x85 c = x85.a("contents");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.d.a aVar = (v33.d.a) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, aVar.b());
        lnaVar2.b(c, aVar.a());
    }
}
