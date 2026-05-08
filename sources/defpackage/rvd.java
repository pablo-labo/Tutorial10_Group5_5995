package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class rvd extends ue4.b {
    public static final BigInteger h = new BigInteger(1, sh6.a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));
    public final tvd g;

    public rvd() {
        super(h);
        this.g = new tvd(this, null, null, false);
        this.b = g(new BigInteger(1, sh6.a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = g(new BigInteger(1, sh6.a("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.d = new BigInteger(1, sh6.a("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new rvd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new tvd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        svd svdVar = new svd();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(svd.e) >= 0) {
            l5.q("x value invalid for SecP256R1FieldElement");
            return null;
        }
        int[] iArrH0 = ka6.h0(bigInteger);
        if (iArrH0[7] == -1) {
            int[] iArr = ee3.f;
            if (ka6.q0(iArrH0, iArr)) {
                ka6.t1(iArr, iArrH0);
            }
        }
        svdVar.d = iArrH0;
        return svdVar;
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
