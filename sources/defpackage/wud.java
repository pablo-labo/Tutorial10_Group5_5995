package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class wud extends ue4.b {
    public static final BigInteger h = new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));
    public final yud g;

    public wud() {
        super(h);
        this.g = new yud(this, null, null, false);
        this.b = g(new BigInteger(1, sh6.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.c = g(new BigInteger(1, sh6.a("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.d = new BigInteger(1, sh6.a("0100000000000000000001F4C8F927AED3CA752257"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new wud();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new yud(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        xud xudVar = new xud();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(xud.e) >= 0) {
            l5.q("x value invalid for SecP160R1FieldElement");
            return null;
        }
        int[] iArrF0 = ka6.f0(bigInteger);
        if (iArrF0[4] == -1) {
            int[] iArr = ypd.W;
            if (ka6.p0(iArrF0, iArr)) {
                ka6.s1(iArr, iArrF0);
            }
        }
        xudVar.d = iArrF0;
        return xudVar;
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
