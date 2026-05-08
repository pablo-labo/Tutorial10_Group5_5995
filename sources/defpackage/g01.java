package defpackage;

import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class g01 implements kna<v33.e> {
    public static final g01 a = new g01();
    public static final x85 b = x85.a("generator");
    public static final x85 c = x85.a("identifier");
    public static final x85 d = x85.a("appQualitySessionId");
    public static final x85 e = x85.a("startedAt");
    public static final x85 f = x85.a("endedAt");
    public static final x85 g = x85.a("crashed");
    public static final x85 h = x85.a(SessionEndedMetric.PROCESS_TYPE_VALUE);
    public static final x85 i = x85.a("user");
    public static final x85 j = x85.a("os");
    public static final x85 k = x85.a("device");
    public static final x85 l = x85.a("events");
    public static final x85 m = x85.a("generatorType");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.e eVar = (v33.e) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, eVar.f());
        lnaVar2.b(c, eVar.h().getBytes(v33.a));
        lnaVar2.b(d, eVar.b());
        lnaVar2.i(e, eVar.j());
        lnaVar2.b(f, eVar.d());
        lnaVar2.f(g, eVar.l());
        lnaVar2.b(h, eVar.a());
        lnaVar2.b(i, eVar.k());
        lnaVar2.b(j, eVar.i());
        lnaVar2.b(k, eVar.c());
        lnaVar2.b(l, eVar.e());
        lnaVar2.g(m, eVar.g());
    }
}
