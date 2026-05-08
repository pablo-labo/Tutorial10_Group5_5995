package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class m01 implements kna<v33.e.d.a.b.AbstractC0445d> {
    public static final m01 a = new m01();
    public static final x85 b = x85.a("name");
    public static final x85 c = x85.a("importance");
    public static final x85 d = x85.a("frames");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.e.d.a.b.AbstractC0445d abstractC0445d = (v33.e.d.a.b.AbstractC0445d) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, abstractC0445d.c());
        lnaVar2.g(c, abstractC0445d.b());
        lnaVar2.b(d, abstractC0445d.a());
    }
}
