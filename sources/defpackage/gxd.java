package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class gxd extends ue4.a {
    public final hxd g;

    public gxd() {
        super(283, 5, 7, 12);
        this.g = new hxd(this, null, null, false);
        this.b = new fxd(BigInteger.valueOf(0L));
        this.c = new fxd(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, sh6.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new gxd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new hxd(this, ve4Var, ve4Var2, z);
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
