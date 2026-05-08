package defpackage;

import defpackage.ezg;
import defpackage.gq2;
import defpackage.wp2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bk6 extends ezg {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // defpackage.ezg, defpackage.ny3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.ny3 r24) {
        /*
            Method dump skipped, instruction units count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk6.a(ny3):void");
    }

    @Override // defpackage.ezg
    public final void d() {
        gq2 gq2Var;
        gq2 gq2Var2;
        gq2.a aVar;
        gq2 gq2Var3;
        gq2 gq2Var4;
        gq2.a aVar2;
        gq2 gq2Var5 = this.b;
        boolean z = gq2Var5.a;
        v44 v44Var = this.e;
        if (z) {
            v44Var.d(gq2Var5.l());
        }
        boolean z2 = v44Var.j;
        ArrayList arrayList = v44Var.k;
        ArrayList arrayList2 = v44Var.l;
        gq2.a aVar3 = gq2.a.d;
        gq2.a aVar4 = gq2.a.c;
        gq2.a aVar5 = gq2.a.a;
        ry3 ry3Var = this.i;
        ry3 ry3Var2 = this.h;
        if (!z2) {
            gq2 gq2Var6 = this.b;
            gq2.a aVar6 = gq2Var6.T[0];
            this.d = aVar6;
            if (aVar6 != aVar4) {
                if (aVar6 == aVar3 && (gq2Var4 = gq2Var6.U) != null && ((aVar2 = gq2Var4.T[0]) == aVar5 || aVar2 == aVar3)) {
                    int iL = (gq2Var4.l() - this.b.I.d()) - this.b.K.d();
                    ezg.b(ry3Var2, gq2Var4.d.h, this.b.I.d());
                    ezg.b(ry3Var, gq2Var4.d.i, -this.b.K.d());
                    v44Var.d(iL);
                    return;
                }
                if (aVar6 == aVar5) {
                    v44Var.d(gq2Var6.l());
                }
            }
        } else if (this.d == aVar3 && (gq2Var2 = (gq2Var = this.b).U) != null && ((aVar = gq2Var2.T[0]) == aVar5 || aVar == aVar3)) {
            ezg.b(ry3Var2, gq2Var2.d.h, gq2Var.I.d());
            ezg.b(ry3Var, gq2Var2.d.i, -this.b.K.d());
            return;
        }
        if (v44Var.j) {
            gq2 gq2Var7 = this.b;
            if (gq2Var7.a) {
                wp2[] wp2VarArr = gq2Var7.Q;
                wp2 wp2Var = wp2VarArr[0];
                wp2 wp2Var2 = wp2Var.f;
                if (wp2Var2 != null && wp2VarArr[1].f != null) {
                    boolean zS = gq2Var7.s();
                    gq2 gq2Var8 = this.b;
                    if (zS) {
                        ry3Var2.f = gq2Var8.Q[0].d();
                        ry3Var.f = -this.b.Q[1].d();
                        return;
                    }
                    ry3 ry3VarH = ezg.h(gq2Var8.Q[0]);
                    if (ry3VarH != null) {
                        ezg.b(ry3Var2, ry3VarH, this.b.Q[0].d());
                    }
                    ry3 ry3VarH2 = ezg.h(this.b.Q[1]);
                    if (ry3VarH2 != null) {
                        ezg.b(ry3Var, ry3VarH2, -this.b.Q[1].d());
                    }
                    ry3Var2.b = true;
                    ry3Var.b = true;
                    return;
                }
                if (wp2Var2 != null) {
                    ry3 ry3VarH3 = ezg.h(wp2Var);
                    if (ry3VarH3 != null) {
                        ezg.b(ry3Var2, ry3VarH3, this.b.Q[0].d());
                        ezg.b(ry3Var, ry3Var2, v44Var.g);
                        return;
                    }
                    return;
                }
                wp2 wp2Var3 = wp2VarArr[1];
                if (wp2Var3.f != null) {
                    ry3 ry3VarH4 = ezg.h(wp2Var3);
                    if (ry3VarH4 != null) {
                        ezg.b(ry3Var, ry3VarH4, -this.b.Q[1].d());
                        ezg.b(ry3Var2, ry3Var, -v44Var.g);
                        return;
                    }
                    return;
                }
                if ((gq2Var7 instanceof oh6) || gq2Var7.U == null || gq2Var7.g(wp2.a.f).f != null) {
                    return;
                }
                gq2 gq2Var9 = this.b;
                ezg.b(ry3Var2, gq2Var9.U.d.h, gq2Var9.m());
                ezg.b(ry3Var, ry3Var2, v44Var.g);
                return;
            }
        }
        if (this.d == aVar4) {
            gq2 gq2Var10 = this.b;
            int i = gq2Var10.q;
            if (i == 2) {
                gq2 gq2Var11 = gq2Var10.U;
                if (gq2Var11 != null) {
                    v44 v44Var2 = gq2Var11.e.e;
                    arrayList2.add(v44Var2);
                    v44Var2.k.add(v44Var);
                    v44Var.b = true;
                    arrayList.add(ry3Var2);
                    arrayList.add(ry3Var);
                }
            } else if (i == 3) {
                if (gq2Var10.r == 3) {
                    ry3Var2.a = this;
                    ry3Var.a = this;
                    kng kngVar = gq2Var10.e;
                    kngVar.h.a = this;
                    kngVar.i.a = this;
                    v44Var.a = this;
                    if (gq2Var10.t()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(v44Var);
                        kng kngVar2 = this.b.e;
                        kngVar2.e.a = this;
                        arrayList2.add(kngVar2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(v44Var);
                        this.b.e.i.k.add(v44Var);
                    } else {
                        boolean zS2 = this.b.s();
                        gq2 gq2Var12 = this.b;
                        if (zS2) {
                            gq2Var12.e.e.l.add(v44Var);
                            arrayList.add(this.b.e.e);
                        } else {
                            gq2Var12.e.e.l.add(v44Var);
                        }
                    }
                } else {
                    v44 v44Var3 = gq2Var10.e.e;
                    arrayList2.add(v44Var3);
                    v44Var3.k.add(v44Var);
                    this.b.e.h.k.add(v44Var);
                    this.b.e.i.k.add(v44Var);
                    v44Var.b = true;
                    arrayList.add(ry3Var2);
                    arrayList.add(ry3Var);
                    ry3Var2.l.add(v44Var);
                    ry3Var.l.add(v44Var);
                }
            }
        }
        gq2 gq2Var13 = this.b;
        wp2[] wp2VarArr2 = gq2Var13.Q;
        wp2 wp2Var4 = wp2VarArr2[0];
        wp2 wp2Var5 = wp2Var4.f;
        if (wp2Var5 != null && wp2VarArr2[1].f != null) {
            boolean zS3 = gq2Var13.s();
            gq2 gq2Var14 = this.b;
            if (zS3) {
                ry3Var2.f = gq2Var14.Q[0].d();
                ry3Var.f = -this.b.Q[1].d();
                return;
            }
            ry3 ry3VarH5 = ezg.h(gq2Var14.Q[0]);
            ry3 ry3VarH6 = ezg.h(this.b.Q[1]);
            if (ry3VarH5 != null) {
                ry3VarH5.b(this);
            }
            if (ry3VarH6 != null) {
                ry3VarH6.b(this);
            }
            this.j = ezg.a.b;
            return;
        }
        if (wp2Var5 != null) {
            ry3 ry3VarH7 = ezg.h(wp2Var4);
            if (ry3VarH7 != null) {
                ezg.b(ry3Var2, ry3VarH7, this.b.Q[0].d());
                c(ry3Var, ry3Var2, 1, v44Var);
                return;
            }
            return;
        }
        wp2 wp2Var6 = wp2VarArr2[1];
        if (wp2Var6.f != null) {
            ry3 ry3VarH8 = ezg.h(wp2Var6);
            if (ry3VarH8 != null) {
                ezg.b(ry3Var, ry3VarH8, -this.b.Q[1].d());
                c(ry3Var2, ry3Var, -1, v44Var);
                return;
            }
            return;
        }
        if ((gq2Var13 instanceof oh6) || (gq2Var3 = gq2Var13.U) == null) {
            return;
        }
        ezg.b(ry3Var2, gq2Var3.d.h, gq2Var13.m());
        c(ry3Var, ry3Var2, 1, v44Var);
    }

    @Override // defpackage.ezg
    public final void e() {
        ry3 ry3Var = this.h;
        if (ry3Var.j) {
            this.b.Z = ry3Var.g;
        }
    }

    @Override // defpackage.ezg
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ezg
    public final boolean k() {
        return this.d != gq2.a.c || this.b.q == 0;
    }

    public final void n() {
        this.g = false;
        ry3 ry3Var = this.h;
        ry3Var.c();
        ry3Var.j = false;
        ry3 ry3Var2 = this.i;
        ry3Var2.c();
        ry3Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.i0;
    }
}
