package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class d01 implements kna<v33.e.a> {
    public static final d01 a = new d01();
    public static final x85 b = x85.a("identifier");
    public static final x85 c = x85.a("version");
    public static final x85 d = x85.a("displayVersion");
    public static final x85 e = x85.a("organization");
    public static final x85 f = x85.a("installationUuid");
    public static final x85 g = x85.a("developmentPlatform");
    public static final x85 h = x85.a("developmentPlatformVersion");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.e.a aVar = (v33.e.a) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, aVar.d());
        lnaVar2.b(c, aVar.g());
        lnaVar2.b(d, aVar.c());
        lnaVar2.b(e, aVar.f());
        lnaVar2.b(f, aVar.e());
        lnaVar2.b(g, aVar.a());
        lnaVar2.b(h, aVar.b());
    }
}
