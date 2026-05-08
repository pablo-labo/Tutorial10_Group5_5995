package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class hwd extends ue4.a {
    public final iwd g;

    public hwd() {
        super(131, 2, 3, 8);
        this.g = new iwd(this, null, null, false);
        this.b = new gwd(new BigInteger(1, sh6.a("07A11B09A76B562144418FF3FF8C2570B8")));
        this.c = new gwd(new BigInteger(1, sh6.a("0217C05610884B63B9C6C7291678F9D341")));
        this.d = new BigInteger(1, sh6.a("0400000000000000023123953A9464B54D"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new hwd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new iwd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        return new gwd(bigInteger);
    }

    @Override // defpackage.ue4
    public final int h() {
        return 131;
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
