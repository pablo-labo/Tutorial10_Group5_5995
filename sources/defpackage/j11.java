package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class j11 implements kna<m40> {
    public static final j11 a = new j11();
    public static final x85 b = x85.a("packageName");
    public static final x85 c = x85.a("versionName");
    public static final x85 d = x85.a("appBuildVersion");
    public static final x85 e = x85.a("deviceManufacturer");
    public static final x85 f = x85.a("currentProcessDetails");
    public static final x85 g = x85.a("appProcessDetails");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        m40 m40Var = (m40) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, m40Var.a);
        lnaVar2.b(c, m40Var.b);
        lnaVar2.b(d, m40Var.c);
        lnaVar2.b(e, Build.MANUFACTURER);
        lnaVar2.b(f, m40Var.d);
        lnaVar2.b(g, m40Var.e);
    }
}
