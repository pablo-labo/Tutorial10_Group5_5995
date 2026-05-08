package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class sxd extends ue4.a {
    public static final pxd h;
    public static final pxd i;
    public final txd g;

    static {
        pxd pxdVar = new pxd(new BigInteger(1, sh6.a("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        h = pxdVar;
        i = (pxd) pxdVar.m();
    }

    public sxd() {
        super(571, 2, 5, 10);
        this.g = new txd(this, null, null, false);
        this.b = new pxd(BigInteger.valueOf(1L));
        this.c = h;
        this.d = new BigInteger(1, sh6.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new sxd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new txd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        return new pxd(bigInteger);
    }

    @Override // defpackage.ue4
    public final int h() {
        return 571;
    }

    @Override // defpackage.ue4
    public final ye4 i() {
        return this.g;
    }

    @Override // defpackage.ue4
    public final boolean k(int i2) {
        return i2 == 6;
    }
}
