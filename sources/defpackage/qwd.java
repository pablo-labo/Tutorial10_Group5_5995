package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class qwd extends ue4.a {
    public final rwd g;

    public qwd() {
        super(163, 3, 6, 7);
        this.g = new rwd(this, null, null, false);
        this.b = new lwd(BigInteger.valueOf(1L));
        this.c = new lwd(new BigInteger(1, sh6.a("020A601907B8C953CA1481EB10512F78744A3205FD")));
        this.d = new BigInteger(1, sh6.a("040000000000000000000292FE77E70C12A4234C33"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new qwd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new rwd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        return new lwd(bigInteger);
    }

    @Override // defpackage.ue4
    public final int h() {
        return 163;
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
