package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sdd {
    public static final ne4 a = new ne4(new kr(15));
    public static final vdd b;
    public static final vdd c;
    public static final idd d;
    public static final idd e;
    public static final idd f;

    static {
        long j = da2.i;
        b = new vdd(true, Float.NaN, j);
        c = new vdd(false, Float.NaN, j);
        d = new idd(0.16f, 0.24f, 0.08f, 0.24f);
        e = new idd(0.08f, 0.12f, 0.04f, 0.12f);
        f = new idd(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static vdd a(long j, int i, float f2) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = da2.i;
        }
        return (j94.c(f2, Float.NaN) && da2.c(j, da2.i)) ? z ? b : c : new vdd(z, f2, j);
    }
}
