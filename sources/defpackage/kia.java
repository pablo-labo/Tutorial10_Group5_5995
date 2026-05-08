package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes3.dex */
public final class kia implements o37 {
    @Override // defpackage.o37
    public final tab a(iy3 iy3Var, long j, long j2) {
        float fD;
        long jE;
        iy3Var.getClass();
        if (j == 9205357640488583168L) {
            jE = oie.e(180.0f, 180.0f);
        } else if (j2 == 9205357640488583168L) {
            jE = oie.e(bkf.c(iy3Var.d0(kie.d(j))), 180.0f);
        } else {
            float fMin = Math.min(kie.d(j2), kie.d(j));
            if (kie.d(j2) < kie.d(j)) {
                fD = kie.b(j2);
            } else {
                fD = (kie.d(j) * kie.b(j2)) / kie.d(j2);
            }
            jE = oie.e(bkf.c(iy3Var.d0(fMin)), bkf.c(iy3Var.d0(fD)));
        }
        return new tab(jE);
    }

    @Override // defpackage.o37
    public final void b(String str, b bVar) {
        str.getClass();
        bVar.u(1643297092);
        bVar.J();
    }
}
