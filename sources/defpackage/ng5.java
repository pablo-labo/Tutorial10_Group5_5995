package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ng5 extends fq5 {
    public final long b;
    public final boolean c;
    public long d;

    public ng5(pne pneVar, long j, boolean z) {
        super(pneVar);
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.fq5, defpackage.pne
    public final long f1(zn1 zn1Var, long j) throws IOException {
        zn1Var.getClass();
        long j2 = this.d;
        long j3 = this.b;
        if (j2 > j3) {
            j = 0;
        } else if (this.c) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jF1 = this.a.f1(zn1Var, j);
        if (jF1 != -1) {
            this.d += jF1;
        }
        long j5 = this.d;
        if ((j5 >= j3 || jF1 != -1) && j5 <= j3) {
            return jF1;
        }
        if (jF1 > 0 && j5 > j3) {
            long j6 = zn1Var.b - (j5 - j3);
            zn1 zn1Var2 = new zn1();
            zn1Var2.a1(zn1Var);
            zn1Var.I1(zn1Var2, j6);
            zn1Var2.h();
        }
        StringBuilder sbI = w40.i(j3, "expected ", " bytes but got ");
        sbI.append(this.d);
        throw new IOException(sbI.toString());
    }
}
