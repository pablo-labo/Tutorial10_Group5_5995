package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class h24 implements pic {
    public static final BigInteger c = new BigInteger("1111111111111111111");
    public static final BigDecimal d = new BigDecimal(uc3.TRACE_ID_64_BITS_MAX);
    public static final BigInteger e = new BigInteger("2").pow(64);
    public final BigInteger a;
    public final double b;

    public h24(double d2) {
        this.b = d2;
        this.a = new BigDecimal(d2).multiply(d).toBigInteger();
    }

    @Override // defpackage.sjd
    public final boolean a(rc3 rc3Var) {
        double d2 = this.b;
        if (d2 == 1.0d) {
            return true;
        }
        return d2 != 0.0d && rc3Var.b.e.multiply(c).mod(e).compareTo(this.a) < 0;
    }

    @Override // defpackage.pic
    public final double getSampleRate() {
        return this.b;
    }
}
