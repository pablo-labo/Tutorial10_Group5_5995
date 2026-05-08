package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class xz0 implements kna<v33.a.AbstractC0440a> {
    public static final xz0 a = new xz0();
    public static final x85 b = x85.a("arch");
    public static final x85 c = x85.a("libraryName");
    public static final x85 d = x85.a("buildId");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.a.AbstractC0440a abstractC0440a = (v33.a.AbstractC0440a) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, abstractC0440a.a());
        lnaVar2.b(c, abstractC0440a.c());
        lnaVar2.b(d, abstractC0440a.b());
    }
}
