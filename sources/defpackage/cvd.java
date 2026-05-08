package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class cvd extends ue4.b {
    public static final BigInteger h = new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));
    public final evd g;

    public cvd() {
        super(h);
        this.g = new evd(this, null, null, false);
        this.b = g(te4.a);
        this.c = g(BigInteger.valueOf(3L));
        this.d = new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new cvd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new evd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        dvd dvdVar = new dvd();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(dvd.e) >= 0) {
            l5.q("x value invalid for SecP192K1FieldElement");
            return null;
        }
        int[] iArrT = v1.T(bigInteger);
        if (iArrT[5] == -1) {
            int[] iArr = ygg.X;
            if (v1.c0(iArrT, iArr)) {
                v1.s0(iArr, iArrT);
            }
        }
        dvdVar.d = iArrT;
        return dvdVar;
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
