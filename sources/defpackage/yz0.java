package defpackage;

import com.datadog.android.ndk.internal.NdkCrashLog;
import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class yz0 implements kna<v33.a> {
    public static final yz0 a = new yz0();
    public static final x85 b = x85.a("pid");
    public static final x85 c = x85.a("processName");
    public static final x85 d = x85.a("reasonCode");
    public static final x85 e = x85.a("importance");
    public static final x85 f = x85.a("pss");
    public static final x85 g = x85.a("rss");
    public static final x85 h = x85.a(NdkCrashLog.TIMESTAMP_KEY_NAME);
    public static final x85 i = x85.a("traceFile");
    public static final x85 j = x85.a("buildIdMappingForArch");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.a aVar = (v33.a) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.g(b, aVar.c());
        lnaVar2.b(c, aVar.d());
        lnaVar2.g(d, aVar.f());
        lnaVar2.g(e, aVar.b());
        lnaVar2.i(f, aVar.e());
        lnaVar2.i(g, aVar.g());
        lnaVar2.i(h, aVar.h());
        lnaVar2.b(i, aVar.i());
        lnaVar2.b(j, aVar.a());
    }
}
