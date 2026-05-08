package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class ivd extends ue4.b {
    public static final BigInteger h = new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));
    public final kvd g;

    public ivd() {
        super(h);
        this.g = new kvd(this, null, null, false);
        this.b = g(te4.a);
        this.c = g(BigInteger.valueOf(5L));
        this.d = new BigInteger(1, sh6.a("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new ivd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new kvd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        jvd jvdVar = new jvd();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(jvd.e) >= 0) {
            l5.q("x value invalid for SecP224K1FieldElement");
            return null;
        }
        int[] iArrV = h91.v(bigInteger);
        if (iArrV[6] == -1 && h91.z(iArrV, c0h.j0)) {
            ka6.I(7, 6803, iArrV);
        }
        jvdVar.d = iArrV;
        return jvdVar;
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
