package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class p01 implements kna<v33.e.d.c> {
    public static final p01 a = new p01();
    public static final x85 b = x85.a("batteryLevel");
    public static final x85 c = x85.a("batteryVelocity");
    public static final x85 d = x85.a("proximityOn");
    public static final x85 e = x85.a("orientation");
    public static final x85 f = x85.a("ramUsed");
    public static final x85 g = x85.a("diskUsed");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.e.d.c cVar = (v33.e.d.c) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, cVar.a());
        lnaVar2.g(c, cVar.b());
        lnaVar2.f(d, cVar.f());
        lnaVar2.g(e, cVar.d());
        lnaVar2.i(f, cVar.e());
        lnaVar2.i(g, cVar.c());
    }
}
