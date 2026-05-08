package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gz0 implements kna<l39> {
    public static final gz0 a = new gz0();
    public static final x85 b = x85.a("requestTimeMs");
    public static final x85 c = x85.a("requestUptimeMs");
    public static final x85 d = x85.a("clientInfo");
    public static final x85 e = x85.a("logSource");
    public static final x85 f = x85.a("logSourceName");
    public static final x85 g = x85.a("logEvent");
    public static final x85 h = x85.a("qosTier");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        l39 l39Var = (l39) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.i(b, l39Var.f());
        lnaVar2.i(c, l39Var.g());
        lnaVar2.b(d, l39Var.a());
        lnaVar2.b(e, l39Var.c());
        lnaVar2.b(f, l39Var.d());
        lnaVar2.b(g, l39Var.b());
        lnaVar2.b(h, l39Var.e());
    }
}
