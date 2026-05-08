package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class ixd extends ue4.a {
    public final jxd g;

    public ixd() {
        super(283, 5, 7, 12);
        this.g = new jxd(this, null, null, false);
        this.b = new fxd(BigInteger.valueOf(1L));
        this.c = new fxd(new BigInteger(1, sh6.a("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5")));
        this.d = new BigInteger(1, sh6.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new ixd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new jxd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        return new fxd(bigInteger);
    }

    @Override // defpackage.ue4
    public final int h() {
        return 283;
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
