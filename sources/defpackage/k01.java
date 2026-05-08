package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class k01 implements kna<v33.e.d.a.b.AbstractC0444b> {
    public static final k01 a = new k01();
    public static final x85 b = x85.a("type");
    public static final x85 c = x85.a("reason");
    public static final x85 d = x85.a("frames");
    public static final x85 e = x85.a("causedBy");
    public static final x85 f = x85.a("overflowCount");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.e.d.a.b.AbstractC0444b abstractC0444b = (v33.e.d.a.b.AbstractC0444b) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, abstractC0444b.e());
        lnaVar2.b(c, abstractC0444b.d());
        lnaVar2.b(d, abstractC0444b.b());
        lnaVar2.b(e, abstractC0444b.a());
        lnaVar2.g(f, abstractC0444b.c());
    }
}
