package defpackage;

import defpackage.mr8;

/* JADX INFO: loaded from: classes.dex */
public final class oo3 {
    public boolean c;
    public float e;
    public int a = -1;
    public final j4a<mr8.b> b = new j4a<>(new mr8.b[16]);
    public int d = -1;

    public static int a(eo8 eo8Var, boolean z) {
        return z ? ((rn8) z92.Y0(eo8Var.i())).getIndex() + 1 : ((rn8) z92.O0(eo8Var.i())).getIndex() - 1;
    }

    public static int b(eo8 eo8Var, boolean z) {
        dwa dwaVar = dwa.a;
        if (z) {
            rn8 rn8Var = (rn8) z92.Y0(eo8Var.i());
            return (eo8Var.a() == dwaVar ? rn8Var.e() : rn8Var.getColumn()) + 1;
        }
        rn8 rn8Var2 = (rn8) z92.O0(eo8Var.i());
        return (eo8Var.a() == dwaVar ? rn8Var2.e() : rn8Var2.getColumn()) - 1;
    }
}
