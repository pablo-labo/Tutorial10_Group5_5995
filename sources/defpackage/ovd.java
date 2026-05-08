package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class ovd extends ue4.b {
    public static final BigInteger h = new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));
    public final qvd g;

    public ovd() {
        super(h);
        this.g = new qvd(this, null, null, false);
        this.b = g(te4.a);
        this.c = g(BigInteger.valueOf(7L));
        this.d = new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new ovd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new qvd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        pvd pvdVar = new pvd();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(pvd.e) >= 0) {
            l5.q("x value invalid for SecP256K1FieldElement");
            return null;
        }
        int[] iArrH0 = ka6.h0(bigInteger);
        if (iArrH0[7] == -1) {
            int[] iArr = ak2.X;
            if (ka6.q0(iArrH0, iArr)) {
                ka6.t1(iArr, iArrH0);
            }
        }
        pvdVar.d = iArrH0;
        return pvdVar;
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
