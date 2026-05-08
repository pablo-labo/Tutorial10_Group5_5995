package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class cwd extends ue4.a {
    public final dwd g;

    public cwd() {
        super(113, 9, 0, 0);
        this.g = new dwd(this, null, null, false);
        this.b = new bwd(new BigInteger(1, sh6.a("003088250CA6E7C7FE649CE85820F7")));
        this.c = new bwd(new BigInteger(1, sh6.a("00E8BEE4D3E2260744188BE0E9C723")));
        this.d = new BigInteger(1, sh6.a("0100000000000000D9CCEC8A39E56F"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new cwd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new dwd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        return new bwd(bigInteger);
    }

    @Override // defpackage.ue4
    public final int h() {
        return 113;
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
