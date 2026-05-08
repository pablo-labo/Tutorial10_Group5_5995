package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class k11 implements kna<sn0> {
    public static final k11 a = new k11();
    public static final x85 b = x85.a("appId");
    public static final x85 c = x85.a("deviceModel");
    public static final x85 d = x85.a("sessionSdkVersion");
    public static final x85 e = x85.a("osVersion");
    public static final x85 f = x85.a("logEnvironment");
    public static final x85 g = x85.a("androidAppInfo");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        sn0 sn0Var = (sn0) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, sn0Var.a);
        lnaVar2.b(c, Build.MODEL);
        lnaVar2.b(d, "1.2.3");
        lnaVar2.b(e, Build.VERSION.RELEASE);
        lnaVar2.b(f, z29.LOG_ENVIRONMENT_PROD);
        lnaVar2.b(g, sn0Var.b);
    }
}
