package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class twd extends ue4.a {
    public final uwd g;

    public twd() {
        super(193, 15, 0, 0);
        this.g = new uwd(this, null, null, false);
        this.b = new swd(new BigInteger(1, sh6.a("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.c = new swd(new BigInteger(1, sh6.a("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.d = new BigInteger(1, sh6.a("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new twd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new uwd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        return new swd(bigInteger);
    }

    @Override // defpackage.ue4
    public final int h() {
        return 193;
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
