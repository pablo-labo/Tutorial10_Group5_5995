package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes.dex */
public final class yhc {
    public static xhc a(long j, long j2, b bVar, int i) {
        long j3 = (i & 2) != 0 ? da2.i : j2;
        long j4 = da2.i;
        qa2 qa2Var = (qa2) bVar.M(sa2.a);
        xhc xhcVar = qa2Var.U;
        if (xhcVar == null) {
            long jC = sa2.c(qa2Var, ra2.V);
            long jC2 = sa2.c(qa2Var, ra2.d);
            ra2 ra2Var = ra2.c;
            xhc xhcVar2 = new xhc(jC, jC2, da2.b(sa2.c(qa2Var, ra2Var), 0.38f), da2.b(sa2.c(qa2Var, ra2Var), 0.38f));
            qa2Var.U = xhcVar2;
            xhcVar = xhcVar2;
        }
        long j5 = j != 16 ? j : xhcVar.a;
        if (j3 == 16) {
            j3 = xhcVar.b;
        }
        long j6 = j3;
        long j7 = j4 != 16 ? j4 : xhcVar.c;
        if (j4 == 16) {
            j4 = xhcVar.d;
        }
        return new xhc(j5, j6, j7, j4);
    }
}
