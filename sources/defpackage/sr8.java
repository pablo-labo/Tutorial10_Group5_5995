package defpackage;

import defpackage.ur8;

/* JADX INFO: loaded from: classes.dex */
public final class sr8 implements rr8 {
    public final /* synthetic */ e2b a;
    public final /* synthetic */ boolean b;

    public sr8(e2b e2bVar, boolean z) {
        this.a = e2bVar;
        this.b = z;
    }

    @Override // defpackage.rr8
    public final int a() {
        e2b e2bVar = this.a;
        return e2bVar.n().c() + e2bVar.n().d();
    }

    @Override // defpackage.rr8
    public final float b() {
        e2b e2bVar = this.a;
        return h2b.a(e2bVar.n(), e2bVar.o());
    }

    @Override // defpackage.rr8
    public final i92 c() {
        boolean z = this.b;
        e2b e2bVar = this.a;
        return z ? new i92(e2bVar.o(), 1) : new i92(1, e2bVar.o());
    }

    @Override // defpackage.rr8
    public final int d() {
        e2b e2bVar = this.a;
        return (int) (e2bVar.n().a() == dwa.a ? e2bVar.n().b() & 4294967295L : e2bVar.n().b() >> 32);
    }

    @Override // defpackage.rr8
    public final float e() {
        return c0h.s(this.a);
    }

    @Override // defpackage.rr8
    public final Object f(int i, ur8.a aVar) {
        Object objV = e2b.v(this.a, i, aVar);
        return objV == g13.a ? objV : j6g.a;
    }
}
