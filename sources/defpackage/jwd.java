package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class jwd extends ue4.a {
    public final kwd g;

    public jwd() {
        super(131, 2, 3, 8);
        this.g = new kwd(this, null, null, false);
        this.b = new gwd(new BigInteger(1, sh6.a("03E5A88919D7CAFCBF415F07C2176573B2")));
        this.c = new gwd(new BigInteger(1, sh6.a("04B8266A46C55657AC734CE38F018F2192")));
        this.d = new BigInteger(1, sh6.a("0400000000000000016954A233049BA98F"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new jwd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new kwd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        return new gwd(bigInteger);
    }

    @Override // defpackage.ue4
    public final int h() {
        return 131;
    }

    @Override // defpackage.ue4
    public final ye4 i() {
        return this.g;
    }

    @Override // defpackage.ue4
    public final boolean k(int i) {
        return i == 6;
    }
}
