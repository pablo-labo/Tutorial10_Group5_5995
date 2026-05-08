package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a01 implements kna<v33> {
    public static final a01 a = new a01();
    public static final x85 b = x85.a("sdkVersion");
    public static final x85 c = x85.a("gmpAppId");
    public static final x85 d = x85.a("platform");
    public static final x85 e = x85.a("installationUuid");
    public static final x85 f = x85.a("firebaseInstallationId");
    public static final x85 g = x85.a("appQualitySessionId");
    public static final x85 h = x85.a("buildVersion");
    public static final x85 i = x85.a("displayVersion");
    public static final x85 j = x85.a("session");
    public static final x85 k = x85.a("ndkPayload");
    public static final x85 l = x85.a("appExitInfo");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33 v33Var = (v33) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, v33Var.j());
        lnaVar2.b(c, v33Var.f());
        lnaVar2.g(d, v33Var.i());
        lnaVar2.b(e, v33Var.g());
        lnaVar2.b(f, v33Var.e());
        lnaVar2.b(g, v33Var.b());
        lnaVar2.b(h, v33Var.c());
        lnaVar2.b(i, v33Var.d());
        lnaVar2.b(j, v33Var.k());
        lnaVar2.b(k, v33Var.h());
        lnaVar2.b(l, v33Var.a());
    }
}
