package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class h01 implements kna<v33.e.d.a> {
    public static final h01 a = new h01();
    public static final x85 b = x85.a("execution");
    public static final x85 c = x85.a("customAttributes");
    public static final x85 d = x85.a("internalKeys");
    public static final x85 e = x85.a("background");
    public static final x85 f = x85.a("currentProcessDetails");
    public static final x85 g = x85.a("appProcessDetails");
    public static final x85 h = x85.a("uiOrientation");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.e.d.a aVar = (v33.e.d.a) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, aVar.e());
        lnaVar2.b(c, aVar.d());
        lnaVar2.b(d, aVar.f());
        lnaVar2.b(e, aVar.b());
        lnaVar2.b(f, aVar.c());
        lnaVar2.b(g, aVar.a());
        lnaVar2.g(h, aVar.g());
    }
}
