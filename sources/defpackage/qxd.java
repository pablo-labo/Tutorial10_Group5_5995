package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class qxd extends ue4.a {
    public final rxd g;

    public qxd() {
        super(571, 2, 5, 10);
        this.g = new rxd(this, null, null, false);
        this.b = new pxd(BigInteger.valueOf(0L));
        this.c = new pxd(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, sh6.a("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new qxd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new rxd(this, ve4Var, ve4Var2, z);
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
    public final boolean k(int i) {
        return i == 6;
    }
}
