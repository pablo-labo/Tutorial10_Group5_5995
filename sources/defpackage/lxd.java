package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class lxd extends ue4.a {
    public final mxd g;

    public lxd() {
        super(409, 87, 0, 0);
        this.g = new mxd(this, null, null, false);
        this.b = new kxd(BigInteger.valueOf(0L));
        this.c = new kxd(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, sh6.a("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new lxd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new mxd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        return new kxd(bigInteger);
    }

    @Override // defpackage.ue4
    public final int h() {
        return 409;
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
