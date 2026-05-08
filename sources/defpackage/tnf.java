package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes.dex */
public final class tnf {
    public static snf a(long j, long j2, long j3, long j4, long j5, b bVar, int i) {
        long j6 = (i & 2) != 0 ? da2.i : j2;
        long j7 = (i & 4) != 0 ? da2.i : j3;
        long j8 = (i & 16) != 0 ? da2.i : j5;
        qa2 qa2Var = (qa2) bVar.M(sa2.a);
        snf snfVar = qa2Var.P;
        if (snfVar == null) {
            long jC = sa2.c(qa2Var, ra2.Y);
            long jC2 = sa2.c(qa2Var, ra2.Z);
            ra2 ra2Var = ra2.c;
            snf snfVar2 = new snf(jC, jC2, sa2.c(qa2Var, ra2Var), sa2.c(qa2Var, ra2Var), sa2.c(qa2Var, ra2.d));
            qa2Var.P = snfVar2;
            snfVar = snfVar2;
        }
        long j9 = j != 16 ? j : snfVar.a;
        if (j6 == 16) {
            j6 = snfVar.b;
        }
        if (j7 == 16) {
            j7 = snfVar.c;
        }
        long j10 = j4 != 16 ? j4 : snfVar.d;
        if (j8 == 16) {
            j8 = snfVar.e;
        }
        return new snf(j9, j6, j7, j10, j8);
    }
}
