package defpackage;

import defpackage.pn5;

/* JADX INFO: loaded from: classes.dex */
public final class ut9 {
    public static ut9 h;
    public final vl8 a;
    public final tjf b;
    public final jy3 c;
    public final pn5.a d;
    public final tjf e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public static final class a {
        public static ut9 a(ut9 ut9Var, vl8 vl8Var, tjf tjfVar, iy3 iy3Var, pn5.a aVar) {
            if (ut9Var != null && vl8Var == ut9Var.a && web.y(tjfVar, vl8Var).equals(ut9Var.b) && iy3Var.getDensity() == ut9Var.c.a && aVar == ut9Var.d) {
                return ut9Var;
            }
            ut9 ut9Var2 = ut9.h;
            if (ut9Var2 != null && vl8Var == ut9Var2.a && web.y(tjfVar, vl8Var).equals(ut9Var2.b) && iy3Var.getDensity() == ut9Var2.c.a && aVar == ut9Var2.d) {
                return ut9Var2;
            }
            ut9 ut9Var3 = new ut9(vl8Var, web.y(tjfVar, vl8Var), new jy3(iy3Var.getDensity(), iy3Var.p1()), aVar);
            ut9.h = ut9Var3;
            return ut9Var3;
        }
    }

    public ut9(vl8 vl8Var, tjf tjfVar, jy3 jy3Var, pn5.a aVar) {
        this.a = vl8Var;
        this.b = tjfVar;
        this.c = jy3Var;
        this.d = aVar;
        this.e = web.y(tjfVar, vl8Var);
    }

    public final long a(int i, long j) {
        int i2;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = vt9.a;
            long jB = mq2.b(0, 0, 15);
            tjf tjfVar = this.e;
            jy3 jy3Var = this.c;
            float fD = i3b.a(str, tjfVar, jB, jy3Var, this.d, 1, 96).d();
            float fD2 = i3b.a(vt9.b, this.e, mq2.b(0, 0, 15), jy3Var, this.d, 2, 96).d() - fD;
            this.g = fD;
            this.f = fD2;
            f2 = fD2;
            f = fD;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            i2 = iRound >= 0 ? iRound : 0;
            int iG = iq2.g(j);
            if (i2 > iG) {
                i2 = iG;
            }
        } else {
            i2 = iq2.i(j);
        }
        return mq2.a(iq2.j(j), iq2.h(j), i2, iq2.g(j));
    }
}
