package defpackage;

import defpackage.aj8;
import defpackage.bj8;

/* JADX INFO: loaded from: classes3.dex */
public final class r62 {
    public static iwf a(boolean z, ofe ofeVar, aj8 aj8Var, bj8 bj8Var, int i) {
        if ((i & 4) != 0) {
            ofeVar = ofe.a;
        }
        ofe ofeVar2 = ofeVar;
        if ((i & 8) != 0) {
            aj8Var = aj8.a.d;
        }
        aj8 aj8Var2 = aj8Var;
        if ((i & 16) != 0) {
            bj8Var = bj8.a.b;
        }
        bj8 bj8Var2 = bj8Var;
        aj8Var2.getClass();
        bj8Var2.getClass();
        return new iwf(z, true, ofeVar2, aj8Var2, bj8Var2);
    }
}
