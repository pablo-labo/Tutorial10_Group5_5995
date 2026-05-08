package defpackage;

import defpackage.ue4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class rud extends ue4.b {
    public static final BigInteger h = new BigInteger(1, sh6.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));
    public final tud g;

    public rud() {
        super(h);
        this.g = new tud(this, null, null, false);
        this.b = g(new BigInteger(1, sh6.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = g(new BigInteger(1, sh6.a("E87579C11079F43DD824993C2CEE5ED3")));
        this.d = new BigInteger(1, sh6.a("FFFFFFFE0000000075A30D1B9038A115"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ue4
    public final ue4 a() {
        return new rud();
    }

    @Override // defpackage.ue4
    public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
        return new tud(this, ve4Var, ve4Var2, z);
    }

    @Override // defpackage.ue4
    public final ve4 g(BigInteger bigInteger) {
        sud sudVar = new sud();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(sud.e) >= 0) {
            l5.q("x value invalid for SecP128R1FieldElement");
            return null;
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            o6.h();
            return null;
        }
        int[] iArr = new int[4];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        if ((iArr[3] >>> 1) >= 2147483646) {
            int[] iArr2 = zkd.X;
            if (h91.y(iArr, iArr2)) {
                long j = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
                iArr[0] = (int) j;
                long j2 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j >> 32);
                iArr[1] = (int) j2;
                long j3 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j2 >> 32);
                iArr[2] = (int) j3;
                iArr[3] = (int) (((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32));
            }
        }
        sudVar.d = iArr;
        return sudVar;
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
