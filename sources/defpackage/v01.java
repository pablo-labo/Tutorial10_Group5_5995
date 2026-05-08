package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class v01 implements kna<v33.e.AbstractC0449e> {
    public static final v01 a = new v01();
    public static final x85 b = x85.a("platform");
    public static final x85 c = x85.a("version");
    public static final x85 d = x85.a("buildVersion");
    public static final x85 e = x85.a("jailbroken");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.e.AbstractC0449e abstractC0449e = (v33.e.AbstractC0449e) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.g(b, abstractC0449e.b());
        lnaVar2.b(c, abstractC0449e.c());
        lnaVar2.b(d, abstractC0449e.a());
        lnaVar2.f(e, abstractC0449e.d());
    }
}
