package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x1b implements pr8, xrd {
    public final /* synthetic */ xrd a;
    public final /* synthetic */ e2b b;

    public x1b(xrd xrdVar, e2b e2bVar) {
        this.b = e2bVar;
        this.a = xrdVar;
    }

    @Override // defpackage.pr8
    public final int a() {
        return this.b.o();
    }

    @Override // defpackage.pr8
    public final int b() {
        return ((k0b) z92.Y0(this.b.n().g())).getIndex();
    }

    @Override // defpackage.pr8
    public final void c(int i, int i2) {
        this.b.w(i2 / r1.q(), i, true);
    }

    @Override // defpackage.pr8
    public final int d(int i) {
        e2b e2bVar = this.b;
        return (int) (nic.E(c0h.s(e2bVar) + ((long) gf9.b(((e2bVar.q() * (i - e2bVar.k())) - (e2bVar.l() * e2bVar.q())) + 0.0f)), e2bVar.h, e2bVar.g) - c0h.s(e2bVar));
    }

    @Override // defpackage.xrd
    public final float e(float f) {
        return this.a.e(f);
    }

    @Override // defpackage.pr8
    public final int f() {
        return this.b.f;
    }

    @Override // defpackage.pr8
    public final int g() {
        return this.b.e;
    }
}
