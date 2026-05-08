package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class q5h extends t implements u5h {
    public static final BigInteger V = BigInteger.valueOf(1);
    public final t5h a;
    public final ue4 b;
    public final s5h c;
    public final BigInteger d;
    public final BigInteger e;
    public final byte[] f;

    public q5h(ue4 ue4Var, s5h s5hVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        int[] iArr;
        this.b = ue4Var;
        this.c = s5hVar;
        this.d = bigInteger;
        this.e = bigInteger2;
        this.f = bArr;
        kf5 kf5Var = ue4Var.a;
        if (kf5Var.a() == 1) {
            BigInteger bigIntegerB = kf5Var.b();
            t5h t5hVar = new t5h();
            t5hVar.a = u5h.r;
            t5hVar.b = new s(bigIntegerB);
            this.a = t5hVar;
            return;
        }
        if (kf5Var.a() <= 1 || !kf5Var.b().equals(te4.c) || !(kf5Var instanceof nfb)) {
            l5.q("'curve' is of an unsupported type");
            throw null;
        }
        int[] iArr2 = ((nfb) kf5Var).c().a;
        if (iArr2 == null) {
            iArr = null;
        } else {
            iArr = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        }
        if (iArr.length == 3) {
            this.a = new t5h(iArr[2], iArr[1], 0, 0);
        } else if (iArr.length == 5) {
            this.a = new t5h(iArr[4], iArr[1], iArr[2], iArr[3]);
        } else {
            l5.q("Only trinomial and pentomial curves are supported");
            throw null;
        }
    }

    @Override // defpackage.q
    public final w a() {
        r rVar = new r();
        rVar.a(new s(V));
        rVar.a(this.a);
        p5h p5hVar = new p5h();
        p5hVar.c = null;
        ue4 ue4Var = this.b;
        p5hVar.a = ue4Var;
        p5hVar.b = this.f;
        if (ue4Var.a.a() == 1) {
            p5hVar.c = u5h.r;
        } else {
            kf5 kf5Var = ue4Var.a;
            if (kf5Var.a() <= 1 || !kf5Var.b().equals(te4.c) || !(kf5Var instanceof nfb)) {
                l5.q("This type of ECCurve is not implemented");
                return null;
            }
            p5hVar.c = u5h.s;
        }
        rVar.a(p5hVar);
        rVar.a(this.c);
        rVar.a(new s(this.d));
        BigInteger bigInteger = this.e;
        if (bigInteger != null) {
            rVar.a(new s(bigInteger));
        }
        return new zc3(rVar);
    }
}
