package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class ewd extends ue4.a {
    public final fwd g;

    public ewd() {
        super(113, 9, 0, 0);
        this.g = new fwd(this, null, null, false);
        this.b = new bwd(new BigInteger(1, sh6.a("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.c = new bwd(new BigInteger(1, sh6.a("0095E9A9EC9B297BD4BF36E059184F")));
        this.d = new BigInteger(1, sh6.a("010000000000000108789B2496AF93"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new ewd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new fwd(this, ve4Var, ve4Var2, z);
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
