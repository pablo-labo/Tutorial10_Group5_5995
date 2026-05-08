package defpackage;

import com.datadog.android.ndk.internal.NdkCrashLog;
import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class j01 implements kna<v33.e.d.a.b> {
    public static final j01 a = new j01();
    public static final x85 b = x85.a("threads");
    public static final x85 c = x85.a("exception");
    public static final x85 d = x85.a("appExitInfo");
    public static final x85 e = x85.a(NdkCrashLog.SIGNAL_KEY_NAME);
    public static final x85 f = x85.a("binaries");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.e.d.a.b bVar = (v33.e.d.a.b) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, bVar.e());
        lnaVar2.b(c, bVar.c());
        lnaVar2.b(d, bVar.a());
        lnaVar2.b(e, bVar.d());
        lnaVar2.b(f, bVar.b());
    }
}
