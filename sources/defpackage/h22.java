package defpackage;

import defpackage.u12;

/* JADX INFO: loaded from: classes3.dex */
public final class h22 {
    public static go1 a(int i, int i2, eo1 eo1Var) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        int i3 = i2 & 2;
        eo1 eo1Var2 = eo1.a;
        if (i3 != 0) {
            eo1Var = eo1Var2;
        }
        if (i == -2) {
            if (eo1Var != eo1Var2) {
                return new io2(1, eo1Var);
            }
            u12.i.getClass();
            return new go1(u12.a.b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? eo1Var == eo1Var2 ? new go1(i) : new io2(i, eo1Var) : new go1(Integer.MAX_VALUE) : eo1Var == eo1Var2 ? new go1(0) : new io2(1, eo1Var);
        }
        if (eo1Var == eo1Var2) {
            return new io2(1, eo1.b);
        }
        l5.q("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }
}
