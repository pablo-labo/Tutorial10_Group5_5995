package defpackage;

import defpackage.hc4;
import defpackage.ic4;
import defpackage.wna;

/* JADX INFO: loaded from: classes2.dex */
public final class jc4<DH extends ic4> implements dtg {
    public DH d;
    public final hc4 f;
    public boolean a = false;
    public boolean b = false;
    public boolean c = true;
    public gc4 e = null;

    public jc4(hx5 hx5Var) {
        this.f = hc4.c ? new hc4() : hc4.b;
        if (hx5Var != null) {
            f(hx5Var);
        }
    }

    @Override // defpackage.dtg
    public final void a(boolean z) {
        if (this.c == z) {
            return;
        }
        this.f.a(z ? hc4.a.f0 : hc4.a.g0);
        this.c = z;
        c();
    }

    public final void b() {
        if (this.a) {
            return;
        }
        this.f.a(hc4.a.V);
        this.a = true;
        gc4 gc4Var = this.e;
        if (gc4Var == null || gc4Var.e() == null) {
            return;
        }
        this.e.c();
    }

    public final void c() {
        if (this.b && this.c) {
            b();
            return;
        }
        if (this.a) {
            this.f.a(hc4.a.W);
            this.a = false;
            if (d()) {
                this.e.d();
            }
        }
    }

    public final boolean d() {
        gc4 gc4Var = this.e;
        return gc4Var != null && gc4Var.e() == this.d;
    }

    public final void e(gc4 gc4Var) {
        boolean z = this.a;
        hc4 hc4Var = this.f;
        if (z && z) {
            hc4Var.a(hc4.a.W);
            this.a = false;
            if (d()) {
                this.e.d();
            }
        }
        if (d()) {
            hc4Var.a(hc4.a.d);
            this.e.b(null);
        }
        this.e = gc4Var;
        if (gc4Var != null) {
            hc4Var.a(hc4.a.c);
            this.e.b(this.d);
        } else {
            hc4Var.a(hc4.a.e);
        }
        if (z) {
            b();
        }
    }

    public final void f(DH dh) {
        this.f.a(hc4.a.a);
        boolean zD = d();
        DH dh2 = this.d;
        nfd nfdVarB = dh2 == null ? null : dh2.b();
        if (nfdVarB != null) {
            nfdVarB.v(null);
        }
        dh.getClass();
        this.d = dh;
        nfd nfdVarB2 = dh.b();
        a(nfdVarB2 == null || nfdVarB2.isVisible());
        DH dh3 = this.d;
        nfd nfdVarB3 = dh3 != null ? dh3.b() : null;
        if (nfdVarB3 != null) {
            nfdVarB3.v(this);
        }
        if (zD) {
            this.e.b(dh);
        }
    }

    @Override // defpackage.dtg
    public final void onDraw() {
        if (this.a) {
            return;
        }
        s55.l(hc4.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.e)), toString());
        this.b = true;
        this.c = true;
        c();
    }

    public final String toString() {
        wna.a aVarB = wna.b(this);
        aVarB.a("controllerAttached", this.a);
        aVarB.a("holderAttached", this.b);
        aVarB.a("drawableVisible", this.c);
        aVarB.b(this.f.a.toString(), "events");
        return aVarB.toString();
    }
}
