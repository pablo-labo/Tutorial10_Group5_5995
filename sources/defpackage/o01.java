package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class o01 implements kna<v33.e.d.a.c> {
    public static final o01 a = new o01();
    public static final x85 b = x85.a("processName");
    public static final x85 c = x85.a("pid");
    public static final x85 d = x85.a("importance");
    public static final x85 e = x85.a("defaultProcess");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.e.d.a.c cVar = (v33.e.d.a.c) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, cVar.c());
        lnaVar2.g(c, cVar.b());
        lnaVar2.g(d, cVar.a());
        lnaVar2.f(e, cVar.d());
    }
}
