package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class zz0 implements kna<v33.c> {
    public static final zz0 a = new zz0();
    public static final x85 b = x85.a("key");
    public static final x85 c = x85.a("value");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        v33.c cVar = (v33.c) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, cVar.a());
        lnaVar2.b(c, cVar.b());
    }
}
