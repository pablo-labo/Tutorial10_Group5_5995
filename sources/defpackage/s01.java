package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class s01 implements kna<v33.e.d.AbstractC0448e> {
    public static final s01 a = new s01();
    public static final x85 b = x85.a("rolloutVariant");
    public static final x85 c = x85.a("parameterKey");
    public static final x85 d = x85.a("parameterValue");
    public static final x85 e = x85.a("templateVersion");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.e.d.AbstractC0448e abstractC0448e = (v33.e.d.AbstractC0448e) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, abstractC0448e.c());
        lnaVar2.b(c, abstractC0448e.a());
        lnaVar2.b(d, abstractC0448e.b());
        lnaVar2.i(e, abstractC0448e.d());
    }
}
