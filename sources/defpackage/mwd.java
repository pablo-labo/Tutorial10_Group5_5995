package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class mwd extends ue4.a {
    public final nwd g;

    public mwd() {
        super(163, 3, 6, 7);
        this.g = new nwd(this, null, null, false);
        lwd lwdVar = new lwd(BigInteger.valueOf(1L));
        this.b = lwdVar;
        this.c = lwdVar;
        this.d = new BigInteger(1, sh6.a("04000000000000000000020108A2E0CC0D99F8A5EF"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new mwd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new nwd(this, ve4Var, ve4Var2, z);
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
