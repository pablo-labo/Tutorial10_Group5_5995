package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fz0 implements kna<a39> {
    public static final fz0 a = new fz0();
    public static final x85 b = x85.a("eventTimeMs");
    public static final x85 c = x85.a("eventCode");
    public static final x85 d = x85.a("eventUptimeMs");
    public static final x85 e = x85.a("sourceExtension");
    public static final x85 f = x85.a("sourceExtensionJsonProto3");
    public static final x85 g = x85.a("timezoneOffsetSeconds");
    public static final x85 h = x85.a("networkConnectionInfo");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        a39 a39Var = (a39) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.i(b, a39Var.b());
        lnaVar2.b(c, a39Var.a());
        lnaVar2.i(d, a39Var.c());
        lnaVar2.b(e, a39Var.e());
        lnaVar2.b(f, a39Var.f());
        lnaVar2.i(g, a39Var.g());
        lnaVar2.b(h, a39Var.d());
    }
}
