package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class i01 implements kna<v33.e.d.a.b.AbstractC0443a> {
    public static final i01 a = new i01();
    public static final x85 b = x85.a("baseAddress");
    public static final x85 c = x85.a("size");
    public static final x85 d = x85.a("name");
    public static final x85 e = x85.a("uuid");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.e.d.a.b.AbstractC0443a abstractC0443a = (v33.e.d.a.b.AbstractC0443a) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.i(b, abstractC0443a.a());
        lnaVar2.i(c, abstractC0443a.c());
        lnaVar2.b(d, abstractC0443a.b());
        String strD = abstractC0443a.d();
        lnaVar2.b(e, strD != null ? strD.getBytes(v33.a) : null);
    }
}
