package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class xvd extends ue4.b {
    public static final BigInteger h = new BigInteger(1, sh6.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));
    public final zvd g;

    public xvd() {
        super(h);
        this.g = new zvd(this, null, null, false);
        this.b = g(new BigInteger(1, sh6.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = g(new BigInteger(1, sh6.a("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.d = new BigInteger(1, sh6.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new xvd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new zvd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        yvd yvdVar = new yvd();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(yvd.e) >= 0) {
            l5.q("x value invalid for SecP521R1FieldElement");
            return null;
        }
        int[] iArrG0 = ka6.g0(bigInteger, 521);
        if (ka6.a0(17, iArrG0, hh1.e)) {
            for (int i = 0; i < 17; i++) {
                iArrG0[i] = 0;
            }
        }
        yvdVar.d = iArrG0;
        return yvdVar;
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
