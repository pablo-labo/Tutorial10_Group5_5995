package defpackage;

import defpackage.u12;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nk5 {
    public static final xde a(vi5 vi5Var) {
        u12.i.getClass();
        int i = u12.a.b;
        if (1 >= i) {
            i = 1;
        }
        int i2 = i - 1;
        boolean z = vi5Var instanceof z12;
        eo1 eo1Var = eo1.a;
        if (z) {
            z12 z12Var = (z12) vi5Var;
            eo1 eo1Var2 = z12Var.c;
            vi5 vi5VarL = z12Var.l();
            if (vi5VarL != null) {
                int i3 = z12Var.b;
                if (i3 != -3 && i3 != -2 && i3 != 0) {
                    i2 = i3;
                } else if (eo1Var2 != eo1Var || i3 == 0) {
                    i2 = 0;
                }
                return new xde(i2, eo1Var2, z12Var.a, vi5VarL);
            }
        }
        return new xde(i2, eo1Var, vr4.a, vi5Var);
    }
}
