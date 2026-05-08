package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class owd extends ue4.a {
    public final pwd g;

    public owd() {
        super(163, 3, 6, 7);
        this.g = new pwd(this, null, null, false);
        this.b = new lwd(new BigInteger(1, sh6.a("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.c = new lwd(new BigInteger(1, sh6.a("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.d = new BigInteger(1, sh6.a("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new owd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new pwd(this, ve4Var, ve4Var2, z);
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
