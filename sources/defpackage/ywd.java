package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class ywd extends ue4.a {
    public final zwd g;

    public ywd() {
        super(233, 74, 0, 0);
        this.g = new zwd(this, null, null, false);
        this.b = new xwd(BigInteger.valueOf(0L));
        this.c = new xwd(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, sh6.a("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new ywd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new zwd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        return new xwd(bigInteger);
    }

    @Override // defpackage.ue4
    public final int h() {
        return 233;
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
