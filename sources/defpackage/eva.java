package defpackage;

import defpackage.gq2;

/* JADX INFO: loaded from: classes.dex */
public final class eva {
    public static final boolean[] a = new boolean[3];

    public static void a(hq2 hq2Var, ox8 ox8Var, gq2 gq2Var) {
        gq2Var.n = -1;
        wp2 wp2Var = gq2Var.M;
        gq2.a[] aVarArr = gq2Var.T;
        wp2 wp2Var2 = gq2Var.L;
        wp2 wp2Var3 = gq2Var.J;
        wp2 wp2Var4 = gq2Var.K;
        wp2 wp2Var5 = gq2Var.I;
        gq2Var.o = -1;
        gq2.a[] aVarArr2 = hq2Var.T;
        gq2.a aVar = aVarArr2[0];
        gq2.a aVar2 = gq2.a.d;
        gq2.a aVar3 = gq2.a.b;
        if (aVar != aVar3 && aVarArr[0] == aVar2) {
            int i = wp2Var5.g;
            int iL = hq2Var.l() - wp2Var4.g;
            wp2Var5.i = ox8Var.k(wp2Var5);
            wp2Var4.i = ox8Var.k(wp2Var4);
            ox8Var.d(wp2Var5.i, i);
            ox8Var.d(wp2Var4.i, iL);
            gq2Var.n = 2;
            gq2Var.Z = i;
            int i2 = iL - i;
            gq2Var.V = i2;
            int i3 = gq2Var.c0;
            if (i2 < i3) {
                gq2Var.V = i3;
            }
        }
        if (aVarArr2[1] == aVar3 || aVarArr[1] != aVar2) {
            return;
        }
        int i4 = wp2Var3.g;
        int i5 = hq2Var.i() - wp2Var2.g;
        wp2Var3.i = ox8Var.k(wp2Var3);
        wp2Var2.i = ox8Var.k(wp2Var2);
        ox8Var.d(wp2Var3.i, i4);
        ox8Var.d(wp2Var2.i, i5);
        if (gq2Var.b0 > 0 || gq2Var.h0 == 8) {
            mne mneVarK = ox8Var.k(wp2Var);
            wp2Var.i = mneVarK;
            ox8Var.d(mneVarK, gq2Var.b0 + i4);
        }
        gq2Var.o = 2;
        gq2Var.a0 = i4;
        int i6 = i5 - i4;
        gq2Var.W = i6;
        int i7 = gq2Var.d0;
        if (i6 < i7) {
            gq2Var.W = i7;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
