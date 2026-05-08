package defpackage;

import defpackage.gq2;
import defpackage.pc1;
import defpackage.wp2;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e54 {
    public static final pc1.a a = new pc1.a();

    public static boolean a(gq2 gq2Var) {
        gq2.a[] aVarArr = gq2Var.T;
        gq2.a aVar = aVarArr[0];
        gq2.a aVar2 = aVarArr[1];
        gq2 gq2Var2 = gq2Var.U;
        hq2 hq2Var = gq2Var2 != null ? (hq2) gq2Var2 : null;
        gq2.a aVar3 = gq2.a.a;
        if (hq2Var != null) {
            gq2.a aVar4 = hq2Var.T[0];
        }
        if (hq2Var != null) {
            gq2.a aVar5 = hq2Var.T[1];
        }
        gq2.a aVar6 = gq2.a.c;
        gq2.a aVar7 = gq2.a.b;
        boolean z = aVar == aVar3 || gq2Var.v() || aVar == aVar7 || (aVar == aVar6 && gq2Var.q == 0 && gq2Var.X == 0.0f && gq2Var.o(0)) || (aVar == aVar6 && gq2Var.q == 1 && gq2Var.p(0, gq2Var.l()));
        boolean z2 = aVar2 == aVar3 || gq2Var.w() || aVar2 == aVar7 || (aVar2 == aVar6 && gq2Var.r == 0 && gq2Var.X == 0.0f && gq2Var.o(1)) || (aVar == aVar6 && gq2Var.r == 1 && gq2Var.p(1, gq2Var.i()));
        return (gq2Var.X > 0.0f && (z || z2)) || (z && z2);
    }

    public static void b(int i, pc1.b bVar, gq2 gq2Var, boolean z) {
        wp2 wp2Var;
        wp2 wp2Var2;
        char c;
        wp2 wp2Var3;
        wp2 wp2Var4;
        wp2 wp2Var5;
        if (gq2Var.l) {
            return;
        }
        if (!(gq2Var instanceof hq2) && gq2Var.u() && a(gq2Var)) {
            hq2.M(gq2Var, bVar, new pc1.a());
        }
        wp2 wp2VarG = gq2Var.g(wp2.a.a);
        wp2 wp2VarG2 = gq2Var.g(wp2.a.c);
        int iC = wp2VarG.c();
        int iC2 = wp2VarG2.c();
        HashSet<wp2> hashSet = wp2VarG.a;
        gq2.a aVar = gq2.a.c;
        if (hashSet != null && wp2VarG.c) {
            for (wp2 wp2Var6 : hashSet) {
                gq2 gq2Var2 = wp2Var6.d;
                int i2 = i + 1;
                boolean zA = a(gq2Var2);
                wp2 wp2Var7 = gq2Var2.I;
                wp2 wp2Var8 = gq2Var2.K;
                if (gq2Var2.u() && zA) {
                    c = 0;
                    hq2.M(gq2Var2, bVar, new pc1.a());
                } else {
                    c = 0;
                }
                gq2.a aVar2 = gq2Var2.T[c];
                if (aVar2 != aVar || zA) {
                    if (!gq2Var2.u()) {
                        if (wp2Var6 == wp2Var7 && wp2Var8.f == null) {
                            int iD = wp2Var7.d() + iC;
                            gq2Var2.A(iD, gq2Var2.l() + iD);
                            b(i2, bVar, gq2Var2, z);
                        } else if (wp2Var6 == wp2Var8 && wp2Var7.f == null) {
                            int iD2 = iC - wp2Var8.d();
                            gq2Var2.A(iD2 - gq2Var2.l(), iD2);
                            b(i2, bVar, gq2Var2, z);
                        } else if (wp2Var6 == wp2Var7 && (wp2Var3 = wp2Var8.f) != null && wp2Var3.c && !gq2Var2.s()) {
                            c(i2, bVar, gq2Var2, z);
                        }
                    }
                } else if (aVar2 == aVar && gq2Var2.u >= 0 && gq2Var2.t >= 0 && (gq2Var2.h0 == 8 || (gq2Var2.q == 0 && gq2Var2.X == 0.0f))) {
                    if (!gq2Var2.s() && !gq2Var2.F && ((wp2Var6 == wp2Var7 && (wp2Var5 = wp2Var8.f) != null && wp2Var5.c) || (wp2Var6 == wp2Var8 && (wp2Var4 = wp2Var7.f) != null && wp2Var4.c))) {
                        if (!gq2Var2.s()) {
                            d(i2, gq2Var, bVar, gq2Var2, z);
                        }
                    }
                }
            }
        }
        if (gq2Var instanceof fe6) {
            return;
        }
        HashSet<wp2> hashSet2 = wp2VarG2.a;
        if (hashSet2 != null && wp2VarG2.c) {
            Iterator<wp2> it = hashSet2.iterator();
            while (it.hasNext()) {
                wp2 next = it.next();
                gq2 gq2Var3 = next.d;
                int i3 = i + 1;
                boolean zA2 = a(gq2Var3);
                wp2 wp2Var9 = gq2Var3.I;
                wp2 wp2Var10 = gq2Var3.K;
                if (gq2Var3.u() && zA2) {
                    hq2.M(gq2Var3, bVar, new pc1.a());
                }
                boolean z2 = (next == wp2Var9 && (wp2Var2 = wp2Var10.f) != null && wp2Var2.c) || (next == wp2Var10 && (wp2Var = wp2Var9.f) != null && wp2Var.c);
                gq2.a aVar3 = gq2Var3.T[0];
                if (aVar3 != aVar || zA2) {
                    if (!gq2Var3.u()) {
                        if (next == wp2Var9 && wp2Var10.f == null) {
                            int iD3 = wp2Var9.d() + iC2;
                            gq2Var3.A(iD3, gq2Var3.l() + iD3);
                            b(i3, bVar, gq2Var3, z);
                        } else if (next == wp2Var10 && wp2Var9.f == null) {
                            int iD4 = iC2 - wp2Var10.d();
                            gq2Var3.A(iD4 - gq2Var3.l(), iD4);
                            b(i3, bVar, gq2Var3, z);
                        } else if (z2 && !gq2Var3.s()) {
                            c(i3, bVar, gq2Var3, z);
                        }
                    }
                } else if (aVar3 == aVar && gq2Var3.u >= 0 && gq2Var3.t >= 0 && (gq2Var3.h0 == 8 || (gq2Var3.q == 0 && gq2Var3.X == 0.0f))) {
                    if (!gq2Var3.s() && !gq2Var3.F && z2 && !gq2Var3.s()) {
                        d(i3, gq2Var, bVar, gq2Var3, z);
                    }
                }
            }
        }
        gq2Var.l = true;
    }

    public static void c(int i, pc1.b bVar, gq2 gq2Var, boolean z) {
        float f = gq2Var.e0;
        wp2 wp2Var = gq2Var.I;
        int iC = wp2Var.f.c();
        wp2 wp2Var2 = gq2Var.K;
        int iC2 = wp2Var2.f.c();
        int iD = wp2Var.d() + iC;
        int iD2 = iC2 - wp2Var2.d();
        if (iC == iC2) {
            f = 0.5f;
        } else {
            iC = iD;
            iC2 = iD2;
        }
        int iL = gq2Var.l();
        int i2 = (iC2 - iC) - iL;
        if (iC > iC2) {
            i2 = (iC - iC2) - iL;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iC;
        int i4 = i3 + iL;
        if (iC > iC2) {
            i4 = i3 - iL;
        }
        gq2Var.A(i3, i4);
        b(i + 1, bVar, gq2Var, z);
    }

    public static void d(int i, gq2 gq2Var, pc1.b bVar, gq2 gq2Var2, boolean z) {
        float f = gq2Var2.e0;
        wp2 wp2Var = gq2Var2.I;
        int iD = wp2Var.d() + wp2Var.f.c();
        wp2 wp2Var2 = gq2Var2.K;
        int iC = wp2Var2.f.c() - wp2Var2.d();
        if (iC >= iD) {
            int iL = gq2Var2.l();
            if (gq2Var2.h0 != 8) {
                int i2 = gq2Var2.q;
                if (i2 == 2) {
                    iL = (int) (gq2Var2.e0 * 0.5f * (gq2Var instanceof hq2 ? gq2Var.l() : gq2Var.U.l()));
                } else if (i2 == 0) {
                    iL = iC - iD;
                }
                iL = Math.max(gq2Var2.t, iL);
                int i3 = gq2Var2.u;
                if (i3 > 0) {
                    iL = Math.min(i3, iL);
                }
            }
            int i4 = iD + ((int) ((f * ((iC - iD) - iL)) + 0.5f));
            gq2Var2.A(i4, iL + i4);
            b(i + 1, bVar, gq2Var2, z);
        }
    }

    public static void e(int i, pc1.b bVar, gq2 gq2Var) {
        float f = gq2Var.f0;
        wp2 wp2Var = gq2Var.J;
        int iC = wp2Var.f.c();
        wp2 wp2Var2 = gq2Var.L;
        int iC2 = wp2Var2.f.c();
        int iD = wp2Var.d() + iC;
        int iD2 = iC2 - wp2Var2.d();
        if (iC == iC2) {
            f = 0.5f;
        } else {
            iC = iD;
            iC2 = iD2;
        }
        int i2 = gq2Var.i();
        int i3 = (iC2 - iC) - i2;
        if (iC > iC2) {
            i3 = (iC - iC2) - i2;
        }
        int i4 = (int) (i3 > 0 ? (f * i3) + 0.5f : f * i3);
        int i5 = iC + i4;
        int i6 = i5 + i2;
        if (iC > iC2) {
            i5 = iC - i4;
            i6 = i5 - i2;
        }
        gq2Var.B(i5, i6);
        g(i + 1, bVar, gq2Var);
    }

    public static void f(int i, gq2 gq2Var, pc1.b bVar, gq2 gq2Var2) {
        float f = gq2Var2.f0;
        wp2 wp2Var = gq2Var2.J;
        int iD = wp2Var.d() + wp2Var.f.c();
        wp2 wp2Var2 = gq2Var2.L;
        int iC = wp2Var2.f.c() - wp2Var2.d();
        if (iC >= iD) {
            int i2 = gq2Var2.i();
            if (gq2Var2.h0 != 8) {
                int i3 = gq2Var2.r;
                if (i3 == 2) {
                    i2 = (int) (f * 0.5f * (gq2Var instanceof hq2 ? gq2Var.i() : gq2Var.U.i()));
                } else if (i3 == 0) {
                    i2 = iC - iD;
                }
                i2 = Math.max(gq2Var2.w, i2);
                int i4 = gq2Var2.x;
                if (i4 > 0) {
                    i2 = Math.min(i4, i2);
                }
            }
            int i5 = iD + ((int) ((f * ((iC - iD) - i2)) + 0.5f));
            gq2Var2.B(i5, i2 + i5);
            g(i + 1, bVar, gq2Var2);
        }
    }

    public static void g(int i, pc1.b bVar, gq2 gq2Var) {
        wp2 wp2Var;
        wp2 wp2Var2;
        float f;
        wp2 wp2Var3;
        wp2 wp2Var4;
        wp2 wp2Var5;
        if (gq2Var.m) {
            return;
        }
        if (!(gq2Var instanceof hq2) && gq2Var.u() && a(gq2Var)) {
            hq2.M(gq2Var, bVar, new pc1.a());
        }
        wp2 wp2VarG = gq2Var.g(wp2.a.b);
        wp2 wp2VarG2 = gq2Var.g(wp2.a.d);
        int iC = wp2VarG.c();
        int iC2 = wp2VarG2.c();
        HashSet<wp2> hashSet = wp2VarG.a;
        gq2.a aVar = gq2.a.c;
        if (hashSet != null && wp2VarG.c) {
            for (wp2 wp2Var6 : hashSet) {
                gq2 gq2Var2 = wp2Var6.d;
                int i2 = i + 1;
                boolean zA = a(gq2Var2);
                wp2 wp2Var7 = gq2Var2.J;
                wp2 wp2Var8 = gq2Var2.L;
                if (gq2Var2.u() && zA) {
                    f = 0.0f;
                    hq2.M(gq2Var2, bVar, new pc1.a());
                } else {
                    f = 0.0f;
                }
                gq2.a aVar2 = gq2Var2.T[1];
                if (aVar2 != aVar || zA) {
                    if (!gq2Var2.u()) {
                        if (wp2Var6 == wp2Var7 && wp2Var8.f == null) {
                            int iD = wp2Var7.d() + iC;
                            gq2Var2.B(iD, gq2Var2.i() + iD);
                            g(i2, bVar, gq2Var2);
                        } else if (wp2Var6 == wp2Var8 && wp2Var8.f == null) {
                            int iD2 = iC - wp2Var8.d();
                            gq2Var2.B(iD2 - gq2Var2.i(), iD2);
                            g(i2, bVar, gq2Var2);
                        } else if (wp2Var6 == wp2Var7 && (wp2Var3 = wp2Var8.f) != null && wp2Var3.c) {
                            e(i2, bVar, gq2Var2);
                        }
                    }
                } else if (aVar2 == aVar && gq2Var2.x >= 0 && gq2Var2.w >= 0 && (gq2Var2.h0 == 8 || (gq2Var2.r == 0 && gq2Var2.X == f))) {
                    if (!gq2Var2.t() && !gq2Var2.F && ((wp2Var6 == wp2Var7 && (wp2Var5 = wp2Var8.f) != null && wp2Var5.c) || (wp2Var6 == wp2Var8 && (wp2Var4 = wp2Var7.f) != null && wp2Var4.c))) {
                        if (!gq2Var2.t()) {
                            f(i2, gq2Var, bVar, gq2Var2);
                        }
                    }
                }
            }
        }
        if (gq2Var instanceof fe6) {
            return;
        }
        HashSet<wp2> hashSet2 = wp2VarG2.a;
        if (hashSet2 != null && wp2VarG2.c) {
            Iterator<wp2> it = hashSet2.iterator();
            while (it.hasNext()) {
                wp2 next = it.next();
                gq2 gq2Var3 = next.d;
                int i3 = i + 1;
                boolean zA2 = a(gq2Var3);
                wp2 wp2Var9 = gq2Var3.J;
                wp2 wp2Var10 = gq2Var3.L;
                if (gq2Var3.u() && zA2) {
                    hq2.M(gq2Var3, bVar, new pc1.a());
                }
                boolean z = (next == wp2Var9 && (wp2Var2 = wp2Var10.f) != null && wp2Var2.c) || (next == wp2Var10 && (wp2Var = wp2Var9.f) != null && wp2Var.c);
                gq2.a aVar3 = gq2Var3.T[1];
                if (aVar3 != aVar || zA2) {
                    if (!gq2Var3.u()) {
                        if (next == wp2Var9 && wp2Var10.f == null) {
                            int iD3 = wp2Var9.d() + iC2;
                            gq2Var3.B(iD3, gq2Var3.i() + iD3);
                            g(i3, bVar, gq2Var3);
                        } else if (next == wp2Var10 && wp2Var9.f == null) {
                            int iD4 = iC2 - wp2Var10.d();
                            gq2Var3.B(iD4 - gq2Var3.i(), iD4);
                            g(i3, bVar, gq2Var3);
                        } else if (z && !gq2Var3.t()) {
                            e(i3, bVar, gq2Var3);
                        }
                    }
                } else if (aVar3 == aVar && gq2Var3.x >= 0 && gq2Var3.w >= 0 && (gq2Var3.h0 == 8 || (gq2Var3.r == 0 && gq2Var3.X == 0.0f))) {
                    if (!gq2Var3.t() && !gq2Var3.F && z && !gq2Var3.t()) {
                        f(i3, gq2Var, bVar, gq2Var3);
                    }
                }
            }
        }
        wp2 wp2VarG3 = gq2Var.g(wp2.a.e);
        if (wp2VarG3.a != null && wp2VarG3.c) {
            int iC3 = wp2VarG3.c();
            for (wp2 wp2Var11 : wp2VarG3.a) {
                gq2 gq2Var4 = wp2Var11.d;
                int i4 = i + 1;
                boolean zA3 = a(gq2Var4);
                wp2 wp2Var12 = gq2Var4.M;
                if (gq2Var4.u() && zA3) {
                    hq2.M(gq2Var4, bVar, new pc1.a());
                }
                if (gq2Var4.T[1] != aVar || zA3) {
                    if (!gq2Var4.u() && wp2Var11 == wp2Var12) {
                        int iD5 = wp2Var11.d() + iC3;
                        if (gq2Var4.D) {
                            int i5 = iD5 - gq2Var4.b0;
                            int i6 = gq2Var4.W + i5;
                            gq2Var4.a0 = i5;
                            gq2Var4.J.i(i5);
                            gq2Var4.L.i(i6);
                            wp2Var12.i(iD5);
                            gq2Var4.k = true;
                        }
                        g(i4, bVar, gq2Var4);
                    }
                }
            }
        }
        gq2Var.m = true;
    }
}
