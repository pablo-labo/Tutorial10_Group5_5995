package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lf5 {
    public static final umb a = new umb(BigInteger.valueOf(2));
    public static final umb b = new umb(BigInteger.valueOf(3));

    public static jz5 a(int[] iArr) {
        if (iArr[0] != 0) {
            l5.q("Irreducible polynomials in GF(2) must have constant term");
            return null;
        }
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i] <= iArr[i - 1]) {
                l5.q("Polynomial exponents must be montonically increasing");
                return null;
            }
        }
        return new jz5(a, new cw5(iArr));
    }
}
