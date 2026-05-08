package defpackage;

import defpackage.ezg;
import defpackage.gq2;
import defpackage.wp2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kng extends ezg {
    public ry3 k;
    public kc1 l;

    @Override // defpackage.ezg, defpackage.ny3
    public final void a(ny3 ny3Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (this.j.ordinal() == 3) {
            gq2 gq2Var = this.b;
            l(gq2Var.J, gq2Var.L, 1);
            return;
        }
        v44 v44Var = this.e;
        boolean z = v44Var.c;
        gq2.a aVar = gq2.a.c;
        if (z && !v44Var.j && this.d == aVar) {
            gq2 gq2Var2 = this.b;
            int i2 = gq2Var2.r;
            if (i2 == 2) {
                gq2 gq2Var3 = gq2Var2.U;
                if (gq2Var3 != null) {
                    if (gq2Var3.e.e.j) {
                        v44Var.d((int) ((r1.g * gq2Var2.y) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                v44 v44Var2 = gq2Var2.d.e;
                if (v44Var2.j) {
                    int i3 = gq2Var2.Y;
                    if (i3 == -1) {
                        f = v44Var2.g;
                        f2 = gq2Var2.X;
                    } else if (i3 == 0) {
                        f3 = v44Var2.g * gq2Var2.X;
                        i = (int) (f3 + 0.5f);
                        v44Var.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        v44Var.d(i);
                    } else {
                        f = v44Var2.g;
                        f2 = gq2Var2.X;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    v44Var.d(i);
                }
            }
        }
        ry3 ry3Var = this.h;
        boolean z2 = ry3Var.c;
        ArrayList arrayList = ry3Var.l;
        if (z2) {
            ry3 ry3Var2 = this.i;
            boolean z3 = ry3Var2.c;
            ArrayList arrayList2 = ry3Var2.l;
            if (z3) {
                if (ry3Var.j && ry3Var2.j && v44Var.j) {
                    return;
                }
                if (!v44Var.j && this.d == aVar) {
                    gq2 gq2Var4 = this.b;
                    if (gq2Var4.q == 0 && !gq2Var4.t()) {
                        ry3 ry3Var3 = (ry3) arrayList.get(0);
                        ry3 ry3Var4 = (ry3) arrayList2.get(0);
                        int i4 = ry3Var3.g + ry3Var.f;
                        int i5 = ry3Var4.g + ry3Var2.f;
                        ry3Var.d(i4);
                        ry3Var2.d(i5);
                        v44Var.d(i5 - i4);
                        return;
                    }
                }
                if (!v44Var.j && this.d == aVar && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    ry3 ry3Var5 = (ry3) arrayList.get(0);
                    int i6 = (((ry3) arrayList2.get(0)).g + ry3Var2.f) - (ry3Var5.g + ry3Var.f);
                    int i7 = v44Var.m;
                    if (i6 < i7) {
                        v44Var.d(i6);
                    } else {
                        v44Var.d(i7);
                    }
                }
                if (v44Var.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    ry3 ry3Var6 = (ry3) arrayList.get(0);
                    ry3 ry3Var7 = (ry3) arrayList2.get(0);
                    int i8 = ry3Var6.g;
                    int i9 = ry3Var.f + i8;
                    int i10 = ry3Var7.g;
                    int i11 = ry3Var2.f + i10;
                    float f4 = this.b.f0;
                    if (ry3Var6 == ry3Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    ry3Var.d((int) ((((i10 - i8) - v44Var.g) * f4) + i8 + 0.5f));
                    ry3Var2.d(ry3Var.g + v44Var.g);
                }
            }
        }
    }

    @Override // defpackage.ezg
    public final void d() {
        gq2 gq2Var;
        gq2 gq2Var2;
        gq2 gq2Var3;
        gq2 gq2Var4;
        ry3 ry3Var = this.k;
        gq2 gq2Var5 = this.b;
        boolean z = gq2Var5.a;
        v44 v44Var = this.e;
        if (z) {
            v44Var.d(gq2Var5.i());
        }
        boolean z2 = v44Var.j;
        ArrayList arrayList = v44Var.k;
        ArrayList arrayList2 = v44Var.l;
        gq2.a aVar = gq2.a.d;
        gq2.a aVar2 = gq2.a.a;
        gq2.a aVar3 = gq2.a.c;
        ry3 ry3Var2 = this.i;
        ry3 ry3Var3 = this.h;
        if (!z2) {
            gq2 gq2Var6 = this.b;
            this.d = gq2Var6.T[1];
            if (gq2Var6.D) {
                this.l = new kc1(this);
            }
            gq2.a aVar4 = this.d;
            if (aVar4 != aVar3) {
                if (aVar4 == aVar && (gq2Var4 = this.b.U) != null && gq2Var4.T[1] == aVar2) {
                    int i = (gq2Var4.i() - this.b.J.d()) - this.b.L.d();
                    ezg.b(ry3Var3, gq2Var4.e.h, this.b.J.d());
                    ezg.b(ry3Var2, gq2Var4.e.i, -this.b.L.d());
                    v44Var.d(i);
                    return;
                }
                if (aVar4 == aVar2) {
                    v44Var.d(this.b.i());
                }
            }
        } else if (this.d == aVar && (gq2Var2 = (gq2Var = this.b).U) != null && gq2Var2.T[1] == aVar2) {
            ezg.b(ry3Var3, gq2Var2.e.h, gq2Var.J.d());
            ezg.b(ry3Var2, gq2Var2.e.i, -this.b.L.d());
            return;
        }
        boolean z3 = v44Var.j;
        if (z3) {
            gq2 gq2Var7 = this.b;
            if (gq2Var7.a) {
                wp2[] wp2VarArr = gq2Var7.Q;
                wp2 wp2Var = wp2VarArr[2];
                wp2 wp2Var2 = wp2Var.f;
                if (wp2Var2 != null && wp2VarArr[3].f != null) {
                    boolean zT = gq2Var7.t();
                    gq2 gq2Var8 = this.b;
                    if (zT) {
                        ry3Var3.f = gq2Var8.Q[2].d();
                        ry3Var2.f = -this.b.Q[3].d();
                    } else {
                        ry3 ry3VarH = ezg.h(gq2Var8.Q[2]);
                        if (ry3VarH != null) {
                            ezg.b(ry3Var3, ry3VarH, this.b.Q[2].d());
                        }
                        ry3 ry3VarH2 = ezg.h(this.b.Q[3]);
                        if (ry3VarH2 != null) {
                            ezg.b(ry3Var2, ry3VarH2, -this.b.Q[3].d());
                        }
                        ry3Var3.b = true;
                        ry3Var2.b = true;
                    }
                    gq2 gq2Var9 = this.b;
                    if (gq2Var9.D) {
                        ezg.b(ry3Var, ry3Var3, gq2Var9.b0);
                        return;
                    }
                    return;
                }
                if (wp2Var2 != null) {
                    ry3 ry3VarH3 = ezg.h(wp2Var);
                    if (ry3VarH3 != null) {
                        ezg.b(ry3Var3, ry3VarH3, this.b.Q[2].d());
                        ezg.b(ry3Var2, ry3Var3, v44Var.g);
                        gq2 gq2Var10 = this.b;
                        if (gq2Var10.D) {
                            ezg.b(ry3Var, ry3Var3, gq2Var10.b0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                wp2 wp2Var3 = wp2VarArr[3];
                if (wp2Var3.f != null) {
                    ry3 ry3VarH4 = ezg.h(wp2Var3);
                    if (ry3VarH4 != null) {
                        ezg.b(ry3Var2, ry3VarH4, -this.b.Q[3].d());
                        ezg.b(ry3Var3, ry3Var2, -v44Var.g);
                    }
                    gq2 gq2Var11 = this.b;
                    if (gq2Var11.D) {
                        ezg.b(ry3Var, ry3Var3, gq2Var11.b0);
                        return;
                    }
                    return;
                }
                wp2 wp2Var4 = wp2VarArr[4];
                if (wp2Var4.f != null) {
                    ry3 ry3VarH5 = ezg.h(wp2Var4);
                    if (ry3VarH5 != null) {
                        ezg.b(ry3Var, ry3VarH5, 0);
                        ezg.b(ry3Var3, ry3Var, -this.b.b0);
                        ezg.b(ry3Var2, ry3Var3, v44Var.g);
                        return;
                    }
                    return;
                }
                if ((gq2Var7 instanceof oh6) || gq2Var7.U == null || gq2Var7.g(wp2.a.f).f != null) {
                    return;
                }
                gq2 gq2Var12 = this.b;
                ezg.b(ry3Var3, gq2Var12.U.e.h, gq2Var12.n());
                ezg.b(ry3Var2, ry3Var3, v44Var.g);
                gq2 gq2Var13 = this.b;
                if (gq2Var13.D) {
                    ezg.b(ry3Var, ry3Var3, gq2Var13.b0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != aVar3) {
            v44Var.b(this);
        } else {
            gq2 gq2Var14 = this.b;
            int i2 = gq2Var14.r;
            if (i2 == 2) {
                gq2 gq2Var15 = gq2Var14.U;
                if (gq2Var15 != null) {
                    v44 v44Var2 = gq2Var15.e.e;
                    arrayList2.add(v44Var2);
                    v44Var2.k.add(v44Var);
                    v44Var.b = true;
                    arrayList.add(ry3Var3);
                    arrayList.add(ry3Var2);
                }
            } else if (i2 == 3 && !gq2Var14.t()) {
                gq2 gq2Var16 = this.b;
                if (gq2Var16.q != 3) {
                    v44 v44Var3 = gq2Var16.d.e;
                    arrayList2.add(v44Var3);
                    v44Var3.k.add(v44Var);
                    v44Var.b = true;
                    arrayList.add(ry3Var3);
                    arrayList.add(ry3Var2);
                }
            }
        }
        gq2 gq2Var17 = this.b;
        wp2[] wp2VarArr2 = gq2Var17.Q;
        wp2 wp2Var5 = wp2VarArr2[2];
        wp2 wp2Var6 = wp2Var5.f;
        if (wp2Var6 != null && wp2VarArr2[3].f != null) {
            boolean zT2 = gq2Var17.t();
            gq2 gq2Var18 = this.b;
            if (zT2) {
                ry3Var3.f = gq2Var18.Q[2].d();
                ry3Var2.f = -this.b.Q[3].d();
            } else {
                ry3 ry3VarH6 = ezg.h(gq2Var18.Q[2]);
                ry3 ry3VarH7 = ezg.h(this.b.Q[3]);
                if (ry3VarH6 != null) {
                    ry3VarH6.b(this);
                }
                if (ry3VarH7 != null) {
                    ry3VarH7.b(this);
                }
                this.j = ezg.a.b;
            }
            if (this.b.D) {
                c(ry3Var, ry3Var3, 1, this.l);
            }
        } else if (wp2Var6 != null) {
            ry3 ry3VarH8 = ezg.h(wp2Var5);
            if (ry3VarH8 != null) {
                ezg.b(ry3Var3, ry3VarH8, this.b.Q[2].d());
                c(ry3Var2, ry3Var3, 1, v44Var);
                if (this.b.D) {
                    c(ry3Var, ry3Var3, 1, this.l);
                }
                if (this.d == aVar3) {
                    gq2 gq2Var19 = this.b;
                    if (gq2Var19.X > 0.0f) {
                        bk6 bk6Var = gq2Var19.d;
                        if (bk6Var.d == aVar3) {
                            bk6Var.e.k.add(v44Var);
                            arrayList2.add(this.b.d.e);
                            v44Var.a = this;
                        }
                    }
                }
            }
        } else {
            wp2 wp2Var7 = wp2VarArr2[3];
            if (wp2Var7.f != null) {
                ry3 ry3VarH9 = ezg.h(wp2Var7);
                if (ry3VarH9 != null) {
                    ezg.b(ry3Var2, ry3VarH9, -this.b.Q[3].d());
                    c(ry3Var3, ry3Var2, -1, v44Var);
                    if (this.b.D) {
                        c(ry3Var, ry3Var3, 1, this.l);
                    }
                }
            } else {
                wp2 wp2Var8 = wp2VarArr2[4];
                if (wp2Var8.f != null) {
                    ry3 ry3VarH10 = ezg.h(wp2Var8);
                    if (ry3VarH10 != null) {
                        ezg.b(ry3Var, ry3VarH10, 0);
                        c(ry3Var3, ry3Var, -1, this.l);
                        c(ry3Var2, ry3Var3, 1, v44Var);
                    }
                } else if (!(gq2Var17 instanceof oh6) && (gq2Var3 = gq2Var17.U) != null) {
                    ezg.b(ry3Var3, gq2Var3.e.h, gq2Var17.n());
                    c(ry3Var2, ry3Var3, 1, v44Var);
                    if (this.b.D) {
                        c(ry3Var, ry3Var3, 1, this.l);
                    }
                    if (this.d == aVar3) {
                        gq2 gq2Var20 = this.b;
                        if (gq2Var20.X > 0.0f) {
                            bk6 bk6Var2 = gq2Var20.d;
                            if (bk6Var2.d == aVar3) {
                                bk6Var2.e.k.add(v44Var);
                                arrayList2.add(this.b.d.e);
                                v44Var.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            v44Var.c = true;
        }
    }

    @Override // defpackage.ezg
    public final void e() {
        ry3 ry3Var = this.h;
        if (ry3Var.j) {
            this.b.a0 = ry3Var.g;
        }
    }

    @Override // defpackage.ezg
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ezg
    public final boolean k() {
        return this.d != gq2.a.c || this.b.r == 0;
    }

    public final void m() {
        this.g = false;
        ry3 ry3Var = this.h;
        ry3Var.c();
        ry3Var.j = false;
        ry3 ry3Var2 = this.i;
        ry3Var2.c();
        ry3Var2.j = false;
        ry3 ry3Var3 = this.k;
        ry3Var3.c();
        ry3Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.i0;
    }
}
