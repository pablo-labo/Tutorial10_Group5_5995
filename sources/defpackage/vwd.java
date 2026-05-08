package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class vwd extends ue4.a {
    public final wwd g;

    public vwd() {
        super(193, 15, 0, 0);
        this.g = new wwd(this, null, null, false);
        this.b = new swd(new BigInteger(1, sh6.a("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.c = new swd(new BigInteger(1, sh6.a("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.d = new BigInteger(1, sh6.a("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new vwd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new wwd(this, ve4Var, ve4Var2, z);
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
