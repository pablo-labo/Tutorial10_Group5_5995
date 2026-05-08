package defpackage;

import defpackage.pm8;

/* JADX INFO: loaded from: classes.dex */
public final class um8 {
    public final pm8 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public z59 q;
    public pm8.d d = pm8.d.e;
    public final zf9 p = new zf9(this);

    public um8(pm8 pm8Var) {
        this.a = pm8Var;
    }

    public final tia a() {
        return this.a.t0.d;
    }

    public final void b() {
        pm8.d dVar = this.a.u0.d;
        pm8.d dVar2 = pm8.d.c;
        pm8.d dVar3 = pm8.d.d;
        if (dVar == dVar2 || dVar == dVar3) {
            if (this.p.q0) {
                g(true);
            } else {
                f(true);
            }
        }
        if (dVar == dVar3) {
            z59 z59Var = this.q;
            if (z59Var == null || !z59Var.k0) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        z59 z59Var = this.q;
        if (z59Var != null) {
            um8 um8Var = z59Var.f;
            um8Var.d = pm8.d.b;
            pm8 pm8Var = um8Var.a;
            um8Var.e = false;
            vxa snapshotObserver = tm8.a(pm8Var).getSnapshotObserver();
            c69 c69Var = new c69(z59Var, j);
            snapshotObserver.getClass();
            if (pm8Var.V != null) {
                snapshotObserver.a(pm8Var, snapshotObserver.b, c69Var);
            } else {
                snapshotObserver.a(pm8Var, snapshotObserver.c, c69Var);
            }
            um8Var.f = true;
            um8Var.g = true;
            boolean zE = pnb.E(pm8Var);
            zf9 zf9Var = um8Var.p;
            if (zE) {
                zf9Var.l0 = true;
                zf9Var.m0 = true;
            } else {
                zf9Var.k0 = true;
            }
            um8Var.d = pm8.d.e;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            pm8 pm8VarK = this.a.K();
            um8 um8Var = pm8VarK != null ? pm8VarK.u0 : null;
            if (um8Var != null) {
                int i3 = um8Var.l;
                if (i == 0) {
                    um8Var.d(i3 - 1);
                } else {
                    um8Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            pm8 pm8VarK = this.a.K();
            um8 um8Var = pm8VarK != null ? pm8VarK.u0 : null;
            if (um8Var != null) {
                int i3 = um8Var.o;
                if (i == 0) {
                    um8Var.e(i3 - 1);
                } else {
                    um8Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        zf9 zf9Var = this.p;
        um8 um8Var = zf9Var.f;
        Object obj = zf9Var.h0;
        pm8 pm8Var = this.a;
        if ((obj != null || um8Var.a().g() != null) && zf9Var.g0) {
            zf9Var.g0 = false;
            zf9Var.h0 = um8Var.a().g();
            pm8 pm8VarK = pm8Var.K();
            if (pm8VarK != null) {
                pm8.j0(pm8VarK, false, 7);
            }
        }
        z59 z59Var = this.q;
        if (z59Var != null) {
            um8 um8Var2 = z59Var.f;
            if (z59Var.m0 == null) {
                x59 x59VarD1 = um8Var2.a().d1();
                x59VarD1.getClass();
                if (x59VarD1.e0.g() == null) {
                    return;
                }
            }
            if (z59Var.l0) {
                z59Var.l0 = false;
                x59 x59VarD12 = um8Var2.a().d1();
                x59VarD12.getClass();
                z59Var.m0 = x59VarD12.e0.g();
                if (pnb.E(pm8Var)) {
                    pm8 pm8VarK2 = pm8Var.K();
                    if (pm8VarK2 != null) {
                        pm8.j0(pm8VarK2, false, 7);
                        return;
                    }
                    return;
                }
                pm8 pm8VarK3 = pm8Var.K();
                if (pm8VarK3 != null) {
                    pm8.h0(pm8VarK3, false, 7);
                }
            }
        }
    }
}
