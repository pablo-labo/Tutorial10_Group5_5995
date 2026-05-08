package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g11 implements kna<sed> {
    public static final g11 a = new g11();
    public static final x85 b = x85.a("rolloutId");
    public static final x85 c = x85.a("parameterKey");
    public static final x85 d = x85.a("parameterValue");
    public static final x85 e = x85.a("variantId");
    public static final x85 f = x85.a("templateVersion");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        sed sedVar = (sed) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, sedVar.d());
        lnaVar2.b(c, sedVar.b());
        lnaVar2.b(d, sedVar.c());
        lnaVar2.b(e, sedVar.f());
        lnaVar2.i(f, sedVar.e());
    }
}
