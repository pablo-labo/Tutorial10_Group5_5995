package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class s93 extends ue4.b {
    public static final BigInteger h = ka6.w1(pyd.V);
    public final u93 g;

    public s93() {
        super(h);
        this.g = new u93(this, null, null, false);
        this.b = g(new BigInteger(1, sh6.a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.c = g(new BigInteger(1, sh6.a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.d = new BigInteger(1, sh6.a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.e = BigInteger.valueOf(8L);
        this.f = 4;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new s93();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new u93(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        t93 t93Var = new t93();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(t93.e) >= 0) {
            l5.q("x value invalid for Curve25519FieldElement");
            return null;
        }
        int[] iArrH0 = ka6.h0(bigInteger);
        while (true) {
            int[] iArr = pyd.V;
            if (!ka6.q0(iArrH0, iArr)) {
                t93Var.d = iArrH0;
                return t93Var;
            }
            ka6.t1(iArr, iArrH0);
        }
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
        return i == 4;
    }
}
