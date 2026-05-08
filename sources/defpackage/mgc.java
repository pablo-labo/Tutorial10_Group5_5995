package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class mgc {
    public static ArrayList<mgc> d;
    public static int e;
    public static ieb f;
    public static ieb g;
    public static ieb h;
    public static ieb i;
    public final ngc a;
    public final ieb b;
    public final double c;

    public mgc(ngc ngcVar, ieb iebVar, double d2) {
        this.a = ngcVar;
        this.b = iebVar;
        this.c = d2;
    }

    public static double a(ngc ngcVar) {
        ieb iebVar = h;
        double dAtan2 = Math.atan2(iebVar.b, iebVar.a) * 57.29577951308232d;
        ieb iebVar2 = i;
        double dAtan22 = Math.atan2(iebVar2.b, iebVar2.a) * 57.29577951308232d;
        int iOrdinal = ngcVar.ordinal();
        if (iOrdinal == 0) {
            return dAtan22;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return 0.0d;
            }
            return dAtan2;
        }
        if (Math.abs(dAtan2 - dAtan22) > 180.0d) {
            dAtan2 += 360.0d;
        }
        return (dAtan2 + dAtan22) / 2.0d;
    }

    public static boolean b(ieb iebVar) {
        return iebVar.a == 0.0d && iebVar.b == 0.0d;
    }

    public static ieb c(ieb iebVar, ieb iebVar2) {
        return new ieb(iebVar2.a - iebVar.a, iebVar2.b - iebVar.b);
    }
}
