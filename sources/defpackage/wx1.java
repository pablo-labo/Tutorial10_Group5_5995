package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes.dex */
public final class wx1 {
    public static ux1 a(long j, long j2, long j3, long j4, b bVar, int i) {
        if ((i & 2) != 0) {
            j2 = sa2.b(j, bVar);
        }
        long j5 = j2;
        return b((qa2) bVar.M(sa2.a)).a(j, j5, (i & 4) != 0 ? da2.i : j3, (i & 8) != 0 ? da2.b(j5, 0.38f) : j4);
    }

    public static ux1 b(qa2 qa2Var) {
        ux1 ux1Var = qa2Var.N;
        if (ux1Var != null) {
            return ux1Var;
        }
        ra2 ra2Var = ra2.a0;
        ux1 ux1Var2 = new ux1(sa2.c(qa2Var, ra2Var), sa2.a(qa2Var, sa2.c(qa2Var, ra2Var)), pnb.x(da2.b(sa2.c(qa2Var, ra2.c0), 0.38f), sa2.c(qa2Var, ra2Var)), da2.b(sa2.a(qa2Var, sa2.c(qa2Var, ra2Var)), 0.38f));
        qa2Var.N = ux1Var2;
        return ux1Var2;
    }

    public static bj1 c(boolean z, b bVar, int i) {
        long jX;
        if ((i & 1) != 0) {
            z = true;
        }
        if (z) {
            bVar.L(-134409770);
            jX = sa2.d(ra2.f, bVar);
            bVar.F();
        } else {
            bVar.L(-134330379);
            jX = pnb.x(da2.b(sa2.d(ra2.e, bVar), 0.12f), sa2.d(ra2.b0, bVar));
            bVar.F();
        }
        boolean zE = bVar.e(jX);
        Object objV = bVar.v();
        if (zE || objV == b.a.a) {
            objV = ee3.f(jX, 1.0f);
            bVar.p(objV);
        }
        return (bj1) objV;
    }

    public static ux1 d(long j, b bVar) {
        ux1 ux1Var;
        long jB = sa2.b(j, bVar);
        long j2 = da2.i;
        long jB2 = da2.b(sa2.b(j, bVar), 0.38f);
        qa2 qa2Var = (qa2) bVar.M(sa2.a);
        ux1 ux1Var2 = qa2Var.O;
        if (ux1Var2 == null) {
            ra2 ra2Var = ra2.Y;
            ux1 ux1Var3 = new ux1(sa2.c(qa2Var, ra2Var), sa2.a(qa2Var, sa2.c(qa2Var, ra2Var)), sa2.c(qa2Var, ra2Var), da2.b(sa2.a(qa2Var, sa2.c(qa2Var, ra2Var)), 0.38f));
            qa2Var.O = ux1Var3;
            ux1Var = ux1Var3;
            jB = jB;
        } else {
            ux1Var = ux1Var2;
        }
        return ux1Var.a(j, jB, j2, jB2);
    }
}
