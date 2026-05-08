package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class l01 implements kna<v33.e.d.a.b.c> {
    public static final l01 a = new l01();
    public static final x85 b = x85.a("name");
    public static final x85 c = x85.a("code");
    public static final x85 d = x85.a("address");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.e.d.a.b.c cVar = (v33.e.d.a.b.c) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, cVar.c());
        lnaVar2.b(c, cVar.b());
        lnaVar2.i(d, cVar.a());
    }
}
