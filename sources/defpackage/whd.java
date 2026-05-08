package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class whd extends ue4.b {
    public static final BigInteger h = new BigInteger(1, sh6.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));
    public final yhd g;

    public whd() {
        super(h);
        this.g = new yhd(this, null, null, false);
        this.b = g(new BigInteger(1, sh6.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        this.c = g(new BigInteger(1, sh6.a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        this.d = new BigInteger(1, sh6.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new whd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new yhd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        xhd xhdVar = new xhd();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(xhd.e) >= 0) {
            l5.q("x value invalid for SM2P256V1FieldElement");
            return null;
        }
        int[] iArrH0 = ka6.h0(bigInteger);
        if ((iArrH0[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = hh2.W;
            if (ka6.q0(iArrH0, iArr)) {
                ka6.t1(iArr, iArrH0);
            }
        }
        xhdVar.d = iArrH0;
        return xhdVar;
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
