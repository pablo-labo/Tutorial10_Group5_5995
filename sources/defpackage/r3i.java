package defpackage;

import defpackage.a5i;
import defpackage.m3i;

/* JADX INFO: loaded from: classes2.dex */
public final class r3i extends t3i<Object> {
    @Override // defpackage.t3i
    public final Object a() {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.t3i
    public final a5i.c b(m3i m3iVar, x8i x8iVar, int i) {
        return m3iVar.a.get(new m3i.a(x8iVar, i));
    }

    @Override // defpackage.t3i
    public final void c() {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.t3i
    public final void d() {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.t3i
    public final boolean e(x8i x8iVar) {
        return x8iVar instanceof a5i.d;
    }

    @Override // defpackage.t3i
    public final h4i<Object> f(Object obj) {
        return ((a5i.d) obj).zztj;
    }

    @Override // defpackage.t3i
    public final h4i<Object> g(Object obj) {
        return ((a5i.d) obj).i();
    }

    @Override // defpackage.t3i
    public final void h(Object obj) {
        h4i<Object> h4iVar = ((a5i.d) obj).zztj;
        if (h4iVar.b) {
            return;
        }
        h4iVar.a.g();
        h4iVar.b = true;
    }
}
