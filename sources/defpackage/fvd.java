package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class fvd extends ue4.b {
    public static final BigInteger h = new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));
    public final hvd g;

    public fvd() {
        super(h);
        this.g = new hvd(this, null, null, false);
        this.b = g(new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.c = g(new BigInteger(1, sh6.a("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.d = new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new fvd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new hvd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        gvd gvdVar = new gvd();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(gvd.e) >= 0) {
            l5.q("x value invalid for SecP192R1FieldElement");
            return null;
        }
        int[] iArrT = v1.T(bigInteger);
        if (iArrT[5] == -1) {
            int[] iArr = pg8.v0;
            if (v1.c0(iArrT, iArr)) {
                v1.s0(iArr, iArrT);
            }
        }
        gvdVar.d = iArrT;
        return gvdVar;
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
