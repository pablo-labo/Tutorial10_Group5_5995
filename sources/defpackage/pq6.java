package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes.dex */
public final class pq6 {
    public static nq6 a(long j, long j2, long j3, long j4, b bVar, int i) {
        nq6 nq6Var;
        long j5 = (i & 1) != 0 ? da2.i : j;
        long j6 = (i & 4) != 0 ? da2.i : j3;
        long jB = (i & 8) != 0 ? da2.b(j2, 0.38f) : j4;
        qa2 qa2Var = (qa2) bVar.M(sa2.a);
        long j7 = ((da2) bVar.M(qs2.a)).a;
        nq6 nq6Var2 = qa2Var.S;
        if (nq6Var2 == null) {
            long j8 = da2.h;
            nq6 nq6Var3 = new nq6(j8, j7, j8, da2.b(j7, 0.38f));
            qa2Var.S = nq6Var3;
            nq6Var = nq6Var3;
        } else {
            nq6Var = nq6Var2;
        }
        return nq6Var.a(j5, j2, j6, jB);
    }
}
