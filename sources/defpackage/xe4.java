package defpackage;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: classes3.dex */
public final class xe4 extends ECParameterSpec {
    public xe4(ue4 ue4Var, ye4 ye4Var, BigInteger bigInteger) {
        int[] iArr;
        ECField eCFieldF2m;
        kf5 kf5Var = ue4Var.a;
        if (kf5Var.a() == 1) {
            eCFieldF2m = new ECFieldFp(kf5Var.b());
        } else {
            cw5 cw5VarC = ((nfb) kf5Var).c();
            int[] iArr2 = cw5VarC.a;
            int i = 0;
            if (iArr2 == null) {
                iArr = null;
            } else {
                iArr = new int[iArr2.length];
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            }
            int length = iArr.length;
            int i2 = length - 1;
            int i3 = length - 2;
            if (i3 < 0) {
                StringBuffer stringBuffer = new StringBuffer(1);
                stringBuffer.append(" > ");
                stringBuffer.append(i2);
                throw new IllegalArgumentException(stringBuffer.toString());
            }
            int[] iArr3 = new int[i3];
            if (iArr.length - 1 < i3) {
                System.arraycopy(iArr, 1, iArr3, 0, iArr.length - 1);
            } else {
                System.arraycopy(iArr, 1, iArr3, 0, i3);
            }
            int[] iArr4 = new int[i3];
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                }
                iArr4[i3] = iArr3[i];
                i++;
            }
            int[] iArr5 = cw5VarC.a;
            eCFieldF2m = new ECFieldF2m(iArr5[iArr5.length - 1], iArr4);
        }
        EllipticCurve ellipticCurve = new EllipticCurve(eCFieldF2m, ue4Var.b.r(), ue4Var.c.r(), null);
        ye4 ye4VarI = ye4Var.i();
        if (!ye4VarI.g()) {
            r6.g("point not in normal form");
            throw null;
        }
        BigInteger bigIntegerR = ye4VarI.b.r();
        if (ye4VarI.g()) {
            super(ellipticCurve, new ECPoint(bigIntegerR, ye4VarI.d().r()), bigInteger, 1);
        } else {
            r6.g("point not in normal form");
            throw null;
        }
    }
}
