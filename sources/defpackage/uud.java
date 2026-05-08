package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class uud extends ue4.b {
    public static final BigInteger h = zud.h;
    public final vud g;

    public uud() {
        super(h);
        this.g = new vud(this, null, null, false);
        this.b = new avd(te4.a);
        this.c = new avd(BigInteger.valueOf(7L));
        this.d = new BigInteger(1, sh6.a("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new uud();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new vud(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        return new avd(bigInteger);
    }

    @Override // defpackage.ue4
    public final int h() {
        return h.bitLength();
    }

    @Override // defpackage.ue4
    public final ye4 i() {
        return this.g;
    }

    @Override // defpackage.ue4
    public final boolean k(int i) {
        return i == 2;
    }
}
