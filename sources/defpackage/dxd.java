package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class dxd extends ue4.a {
    public final exd g;

    public dxd() {
        super(239, 158, 0, 0);
        this.g = new exd(this, null, null, false);
        this.b = g(BigInteger.valueOf(0L));
        this.c = g(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, sh6.a("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new dxd();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new exd(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        cxd cxdVar = new cxd();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            l5.q("x value invalid for SecT239FieldElement");
            return null;
        }
        long[] jArrI0 = ka6.i0(bigInteger);
        long j = jArrI0[3];
        long j2 = j >>> 47;
        jArrI0[0] = jArrI0[0] ^ j2;
        jArrI0[2] = (j2 << 30) ^ jArrI0[2];
        jArrI0[3] = j & 140737488355327L;
        cxdVar.d = jArrI0;
        return cxdVar;
    }

    @Override // defpackage.ue4
    public final int h() {
        return 239;
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
