package defpackage;

import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class q01 implements kna<v33.e.d> {
    public static final q01 a = new q01();
    public static final x85 b = x85.a(NdkCrashLog.TIMESTAMP_KEY_NAME);
    public static final x85 c = x85.a("type");
    public static final x85 d = x85.a(SessionEndedMetric.PROCESS_TYPE_VALUE);
    public static final x85 e = x85.a("device");
    public static final x85 f = x85.a("log");
    public static final x85 g = x85.a("rollouts");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.e.d dVar = (v33.e.d) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.i(b, dVar.e());
        lnaVar2.b(c, dVar.f());
        lnaVar2.b(d, dVar.a());
        lnaVar2.b(e, dVar.b());
        lnaVar2.b(f, dVar.c());
        lnaVar2.b(g, dVar.d());
    }
}
