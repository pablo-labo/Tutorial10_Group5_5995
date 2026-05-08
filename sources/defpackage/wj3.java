package defpackage;

import defpackage.u44;

/* JADX INFO: loaded from: classes.dex */
public final class wj3 {
    public static final long a(int i, int i2, iie iieVar, umd umdVar, iie iieVar2) {
        int i3;
        int i4;
        if (!wl7.b(iieVar, iie.c)) {
            i = c(iieVar.a, umdVar);
            i2 = c(iieVar.b, umdVar);
        }
        u44 u44Var = iieVar2.a;
        u44 u44Var2 = iieVar2.b;
        if ((u44Var instanceof u44.a) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i4 = ((u44.a) u44Var).a)) {
            i = i4;
        }
        if ((u44Var2 instanceof u44.a) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i3 = ((u44.a) u44Var2).a)) {
            i2 = i3;
        }
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final double b(int i, int i2, int i3, int i4, umd umdVar) {
        double d = ((double) i3) / ((double) i);
        double d2 = ((double) i4) / ((double) i2);
        int iOrdinal = umdVar.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d, d2);
        }
        if (iOrdinal == 1) {
            return Math.min(d, d2);
        }
        l.g();
        return 0.0d;
    }

    public static int c(u44 u44Var, umd umdVar) {
        if (u44Var instanceof u44.a) {
            return ((u44.a) u44Var).a;
        }
        int iOrdinal = umdVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        l.g();
        return 0;
    }
}
