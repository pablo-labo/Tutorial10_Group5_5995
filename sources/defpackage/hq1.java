package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes.dex */
public final class hq1 {
    public static final hza a = new hza(24.0f, 8.0f, 24.0f, 8.0f);
    public static final hza b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        if (!((24.0f >= 0.0f) & (16.0f >= 0.0f) & (8.0f >= 0.0f) & (8.0f >= 0.0f))) {
            yd7.a("Padding must be non-negative");
        }
        b = new hza(12.0f, 8.0f, 12.0f, 8.0f);
        if (!((16.0f >= 0.0f) & (12.0f >= 0.0f) & (8.0f >= 0.0f) & (8.0f >= 0.0f))) {
            yd7.a("Padding must be non-negative");
        }
        c = 58.0f;
        d = 40.0f;
        e = 8.0f;
    }

    public static fq1 a(long j, long j2, long j3, long j4, b bVar, int i) {
        if ((i & 2) != 0) {
            j2 = da2.i;
        }
        return c((qa2) bVar.M(sa2.a)).a(j, j2, (i & 4) != 0 ? da2.i : j3, (i & 8) != 0 ? da2.i : j4);
    }

    public static lq1 b(int i) {
        return new lq1(0.0f, (i & 2) != 0 ? 0.0f : 1.0f, 0.0f, 1.0f);
    }

    public static fq1 c(qa2 qa2Var) {
        fq1 fq1Var = qa2Var.K;
        if (fq1Var != null) {
            return fq1Var;
        }
        long jC = sa2.c(qa2Var, ra2.V);
        long jC2 = sa2.c(qa2Var, ra2.b);
        ra2 ra2Var = ra2.c;
        fq1 fq1Var2 = new fq1(jC, jC2, da2.b(sa2.c(qa2Var, ra2Var), 0.12f), da2.b(sa2.c(qa2Var, ra2Var), 0.38f));
        qa2Var.K = fq1Var2;
        return fq1Var2;
    }

    public static fq1 d(qa2 qa2Var) {
        fq1 fq1Var = qa2Var.L;
        if (fq1Var != null) {
            return fq1Var;
        }
        long j = da2.h;
        fq1 fq1Var2 = new fq1(j, sa2.c(qa2Var, ra2.V), j, da2.b(sa2.c(qa2Var, ra2.c), 0.38f));
        qa2Var.L = fq1Var2;
        return fq1Var2;
    }

    public static fq1 e(qa2 qa2Var) {
        fq1 fq1Var = qa2Var.M;
        if (fq1Var != null) {
            return fq1Var;
        }
        long j = da2.h;
        fq1 fq1Var2 = new fq1(j, sa2.c(qa2Var, ra2.V), j, da2.b(sa2.c(qa2Var, ra2.c), 0.38f));
        qa2Var.M = fq1Var2;
        return fq1Var2;
    }

    public static fq1 f(long j, long j2, long j3, long j4, b bVar, int i) {
        if ((i & 1) != 0) {
            j = da2.i;
        }
        return d((qa2) bVar.M(sa2.a)).a(j, j2, (i & 4) != 0 ? da2.i : j3, j4);
    }

    public static fq1 g(long j, long j2, b bVar) {
        long j3 = da2.i;
        return e((qa2) bVar.M(sa2.a)).a(j3, j, j3, j2);
    }
}
