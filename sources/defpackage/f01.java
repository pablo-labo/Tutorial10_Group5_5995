package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class f01 implements kna<v33.e.c> {
    public static final f01 a = new f01();
    public static final x85 b = x85.a("arch");
    public static final x85 c = x85.a("model");
    public static final x85 d = x85.a("cores");
    public static final x85 e = x85.a("ram");
    public static final x85 f = x85.a("diskSpace");
    public static final x85 g = x85.a("simulator");
    public static final x85 h = x85.a("state");
    public static final x85 i = x85.a("manufacturer");
    public static final x85 j = x85.a("modelClass");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.e.c cVar = (v33.e.c) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.g(b, cVar.a());
        lnaVar2.b(c, cVar.e());
        lnaVar2.g(d, cVar.b());
        lnaVar2.i(e, cVar.g());
        lnaVar2.i(f, cVar.c());
        lnaVar2.f(g, cVar.i());
        lnaVar2.g(h, cVar.h());
        lnaVar2.b(i, cVar.d());
        lnaVar2.b(j, cVar.f());
    }
}
