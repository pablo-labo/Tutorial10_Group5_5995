package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class lvd extends ue4.b {
    public static final BigInteger h = new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));
    public final nvd g;

    public lvd() {
        super(h);
        this.g = new nvd(this, null, null, false);
        this.b = g(new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.c = g(new BigInteger(1, sh6.a("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.d = new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new lvd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new nvd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        mvd mvdVar = new mvd();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(mvd.e) >= 0) {
            l5.q("x value invalid for SecP224R1FieldElement");
            return null;
        }
        int[] iArrV = h91.v(bigInteger);
        if (iArrV[6] == -1) {
            int[] iArr = jh2.W;
            if (h91.z(iArrV, iArr)) {
                long j = (((long) iArrV[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
                iArrV[0] = (int) j;
                long j2 = ((((long) iArrV[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j >> 32);
                iArrV[1] = (int) j2;
                long j3 = ((((long) iArrV[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j2 >> 32);
                iArrV[2] = (int) j3;
                long j4 = ((((long) iArrV[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j3 >> 32);
                iArrV[3] = (int) j4;
                long j5 = ((((long) iArrV[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j4 >> 32);
                iArrV[4] = (int) j5;
                long j6 = ((((long) iArrV[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j5 >> 32);
                iArrV[5] = (int) j6;
                iArrV[6] = (int) (((((long) iArrV[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j6 >> 32));
            }
        }
        mvdVar.d = iArrV;
        return mvdVar;
    }

    @Override // defpackage.ue4
    public final int h() {
        return h.bitLength();
    }

    @Override // defpackage.ue4
    public final ye4 i() {
        return this.g;
    }

    @Override // defpackage.ue4
    public final boolean k(int i) {
        return i == 2;
    }
}
