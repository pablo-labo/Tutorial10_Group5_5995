package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class uvd extends ue4.b {
    public static final BigInteger h = new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));
    public final wvd g;

    public uvd() {
        super(h);
        this.g = new wvd(this, null, null, false);
        this.b = g(new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.c = g(new BigInteger(1, sh6.a("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.d = new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new uvd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new wvd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        vvd vvdVar = new vvd();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(vvd.e) >= 0) {
            l5.q("x value invalid for SecP384R1FieldElement");
            return null;
        }
        int[] iArrG0 = ka6.g0(bigInteger, 384);
        if (iArrG0[11] == -1) {
            int[] iArr = mh2.c0;
            if (ka6.o0(12, iArrG0, iArr)) {
                ka6.r1(12, iArr, iArrG0);
            }
        }
        vvdVar.d = iArrG0;
        return vvdVar;
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
