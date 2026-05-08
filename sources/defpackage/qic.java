package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class qic {
    public static final String a;

    static {
        String str = vjg.a;
        a = Integer.toString(0, 36);
    }

    public static qic a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = kh6.d;
            ka2.l(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(kh6.d, false) ? new kh6(bundle.getBoolean(kh6.e, false)) : new kh6();
        }
        if (i == 1) {
            String str3 = z7b.c;
            ka2.l(bundle.getInt(str, -1) == 1);
            float f = bundle.getFloat(z7b.c, -1.0f);
            return f == -1.0f ? new z7b() : new z7b(f);
        }
        if (i == 2) {
            String str4 = jre.d;
            ka2.l(bundle.getInt(str, -1) == 2);
            int i2 = bundle.getInt(jre.d, 5);
            float f2 = bundle.getFloat(jre.e, -1.0f);
            return f2 == -1.0f ? new jre(i2) : new jre(f2, i2);
        }
        if (i != 3) {
            l5.q(p6.c(i, "Unknown RatingType: "));
            return null;
        }
        String str5 = mlf.d;
        ka2.l(bundle.getInt(str, -1) == 3);
        return bundle.getBoolean(mlf.d, false) ? new mlf(bundle.getBoolean(mlf.e, false)) : new mlf();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
