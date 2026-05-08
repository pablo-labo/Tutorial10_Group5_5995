package defpackage;

import defpackage.ve4;
import defpackage.ye4;
import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ue4 {
    public final kf5 a;
    public ve4 b;
    public ve4 c;
    public BigInteger d;
    public BigInteger e;
    public int f = 0;

    public static abstract class a extends ue4 {
        /* JADX WARN: Illegal instructions before constructor call */
        public a(int i, int i2, int i3, int i4) {
            jz5 jz5VarA;
            if (i2 == 0) {
                l5.q("k1 must be > 0");
                throw null;
            }
            if (i3 == 0) {
                if (i4 != 0) {
                    l5.q("k3 must be 0 if k2 == 0");
                    throw null;
                }
                jz5VarA = lf5.a(new int[]{0, i2, i});
            } else {
                if (i3 <= i2) {
                    l5.q("k2 must be > k1");
                    throw null;
                }
                if (i4 <= i3) {
                    l5.q("k3 must be > k2");
                    throw null;
                }
                jz5VarA = lf5.a(new int[]{0, i2, i3, i4, i});
            }
            super(jz5VarA);
        }

        @Override // defpackage.ue4
        public final ye4 b(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
            ve4 ve4VarG = g(bigInteger);
            ve4 ve4VarG2 = g(bigInteger2);
            int i = this.f;
            if (i == 5 || i == 6) {
                if (!ve4VarG.h()) {
                    ve4VarG2 = ve4VarG2.d(ve4VarG).a(ve4VarG);
                } else if (!ve4VarG2.n().equals(this.c)) {
                    o6.h();
                    return null;
                }
            }
            return c(ve4VarG, ve4VarG2, z);
        }

        @Override // defpackage.ue4
        public final ye4 e(BigInteger bigInteger, int i) {
            ve4 ve4VarA;
            ve4 ve4VarG = g(bigInteger);
            if (ve4VarG.h()) {
                ve4VarA = this.c.m();
            } else {
                ve4 ve4VarA2 = ve4VarG.n().f().i(this.c).a(this.b).a(ve4VarG);
                if (!ve4VarA2.h()) {
                    ve4 ve4VarG2 = g(te4.a);
                    int iH = h();
                    Random random = new Random();
                    while (true) {
                        ve4 ve4VarG3 = g(new BigInteger(iH, random));
                        ve4 ve4VarA3 = ve4VarA2;
                        ve4 ve4VarA4 = ve4VarG2;
                        for (int i2 = 1; i2 < iH; i2++) {
                            ve4 ve4VarN = ve4VarA3.n();
                            ve4VarA4 = ve4VarA4.n().a(ve4VarN.i(ve4VarG3));
                            ve4VarA3 = ve4VarN.a(ve4VarA2);
                        }
                        if (!ve4VarA3.h()) {
                            ve4VarA2 = null;
                            break;
                        }
                        if (!ve4VarA4.n().a(ve4VarA4).h()) {
                            ve4VarA2 = ve4VarA4;
                            break;
                        }
                    }
                }
                if (ve4VarA2 != null) {
                    if (ve4VarA2.q() != (i == 1)) {
                        ve4VarA2 = ve4VarA2.b();
                    }
                    int i3 = this.f;
                    ve4VarA = (i3 == 5 || i3 == 6) ? ve4VarA2.a(ve4VarG) : ve4VarA2.i(ve4VarG);
                } else {
                    ve4VarA = null;
                }
            }
            if (ve4VarA != null) {
                return c(ve4VarG, ve4VarA, true);
            }
            l5.q("Invalid point compression");
            return null;
        }
    }

    public static abstract class b extends ue4 {
        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(java.math.BigInteger r4) {
            /*
                r3 = this;
                umb r0 = defpackage.lf5.a
                int r0 = r4.bitLength()
                int r1 = r4.signum()
                if (r1 <= 0) goto L2b
                r1 = 2
                if (r0 < r1) goto L2b
                r2 = 3
                if (r0 >= r2) goto L21
                int r0 = r4.intValue()
                if (r0 == r1) goto L1e
                if (r0 == r2) goto L1b
                goto L21
            L1b:
                umb r4 = defpackage.lf5.b
                goto L27
            L1e:
                umb r4 = defpackage.lf5.a
                goto L27
            L21:
                umb r0 = new umb
                r0.<init>(r4)
                r4 = r0
            L27:
                r3.<init>(r4)
                return
            L2b:
                java.lang.String r3 = "'characteristic' must be >= 2"
                defpackage.l5.q(r3)
                r3 = 0
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: ue4.b.<init>(java.math.BigInteger):void");
        }

        @Override // defpackage.ue4
        public final ye4 e(BigInteger bigInteger, int i) {
            ve4 ve4VarG = g(bigInteger);
            ve4 ve4VarM = ve4VarG.n().a(this.b).i(ve4VarG).a(this.c).m();
            if (ve4VarM == null) {
                l5.q("Invalid point compression");
                return null;
            }
            if (ve4VarM.q() != (i == 1)) {
                ve4VarM = ve4VarM.l();
            }
            return c(ve4VarG, ve4VarM, true);
        }
    }

    public static class d extends b {
        public BigInteger g;
        public BigInteger h;
        public ye4.d i;

        public d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.g = bigInteger;
            int iBitLength = bigInteger.bitLength();
            this.h = (iBitLength < 96 || bigInteger.shiftRight(iBitLength + (-64)).longValue() != -1) ? null : te4.b.shiftLeft(iBitLength).subtract(bigInteger);
            this.i = new ye4.d(this, null, null, false);
            this.b = g(bigInteger2);
            this.c = g(bigInteger3);
            this.d = bigInteger4;
            this.e = bigInteger5;
            this.f = 4;
        }

        @Override // defpackage.ue4
        public final ue4 a() {
            BigInteger bigInteger = this.g;
            BigInteger bigInteger2 = this.h;
            ve4 ve4Var = this.b;
            ve4 ve4Var2 = this.c;
            BigInteger bigInteger3 = this.d;
            BigInteger bigInteger4 = this.e;
            d dVar = new d(bigInteger);
            dVar.g = bigInteger;
            dVar.h = bigInteger2;
            dVar.i = new ye4.d(dVar, null, null, false);
            dVar.b = ve4Var;
            dVar.c = ve4Var2;
            dVar.d = bigInteger3;
            dVar.e = bigInteger4;
            dVar.f = 4;
            return dVar;
        }

        @Override // defpackage.ue4
        public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
            return new ye4.d(this, ve4Var, ve4Var2, z);
        }

        @Override // defpackage.ue4
        public final ve4 g(BigInteger bigInteger) {
            return new ve4.b(this.g, this.h, bigInteger);
        }

        @Override // defpackage.ue4
        public final int h() {
            return this.g.bitLength();
        }

        @Override // defpackage.ue4
        public final ye4 i() {
            return this.i;
        }

        @Override // defpackage.ue4
        public final ye4 j(ye4 ye4Var) {
            int i;
            return (this == ye4Var.a || this.f != 2 || ye4Var.f() || !((i = ye4Var.a.f) == 2 || i == 3 || i == 4)) ? super.j(ye4Var) : new ye4.d(this, g(ye4Var.b.r()), g(ye4Var.c.r()), new ve4[]{g(ye4Var.d[0].r())}, ye4Var.e);
        }

        @Override // defpackage.ue4
        public final boolean k(int i) {
            return i == 0 || i == 1 || i == 2 || i == 4;
        }
    }

    public ue4(kf5 kf5Var) {
        this.a = kf5Var;
    }

    public abstract ue4 a();

    public ye4 b(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        return c(g(bigInteger), g(bigInteger2), z);
    }

    public abstract ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z);

    public final ye4 d(byte[] bArr) {
        ye4 ye4VarI;
        int iH = (h() + 7) / 8;
        byte b2 = bArr[0];
        if (b2 != 0) {
            if (b2 == 2 || b2 == 3) {
                if (bArr.length != iH + 1) {
                    l5.q("Incorrect length for compressed encoding");
                    return null;
                }
                ye4VarI = e(gf1.a(1, bArr, iH), b2 & 1);
                if (!ye4VarI.k()) {
                    l5.q("Invalid point");
                    return null;
                }
            } else if (b2 != 4) {
                if (b2 != 6 && b2 != 7) {
                    bg.m(Integer.toString(b2, 16), "Invalid point encoding 0x");
                    return null;
                }
                if (bArr.length != (iH * 2) + 1) {
                    l5.q("Incorrect length for hybrid encoding");
                    return null;
                }
                BigInteger bigIntegerA = gf1.a(1, bArr, iH);
                BigInteger bigIntegerA2 = gf1.a(iH + 1, bArr, iH);
                if (bigIntegerA2.testBit(0) != (b2 == 7)) {
                    l5.q("Inconsistent Y coordinate in hybrid encoding");
                    return null;
                }
                ye4VarI = b(bigIntegerA, bigIntegerA2, false);
                if (!ye4VarI.f() && ye4VarI.a != null && (!ye4VarI.l() || !ye4VarI.k())) {
                    l5.q("Invalid point coordinates");
                    return null;
                }
            } else {
                if (bArr.length != (iH * 2) + 1) {
                    l5.q("Incorrect length for uncompressed encoding");
                    return null;
                }
                ye4VarI = b(gf1.a(1, bArr, iH), gf1.a(iH + 1, bArr, iH), false);
                if (!ye4VarI.f() && ye4VarI.a != null && (!ye4VarI.l() || !ye4VarI.k())) {
                    l5.q("Invalid point coordinates");
                    return null;
                }
            }
        } else {
            if (bArr.length != 1) {
                l5.q("Incorrect length for infinity encoding");
                return null;
            }
            ye4VarI = i();
        }
        if (b2 == 0 || !ye4VarI.f()) {
            return ye4VarI;
        }
        l5.q("Invalid infinity encoding");
        return null;
    }

    public abstract ye4 e(BigInteger bigInteger, int i);

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ue4) && f((ue4) obj);
        }
        return true;
    }

    public final boolean f(ue4 ue4Var) {
        if (this != ue4Var) {
            return ue4Var != null && this.a.equals(ue4Var.a) && this.b.r().equals(ue4Var.b.r()) && this.c.r().equals(ue4Var.c.r());
        }
        return true;
    }

    public abstract ve4 g(BigInteger bigInteger);

    public abstract int h();

    public final int hashCode() {
        return Integer.rotateLeft(this.c.r().hashCode(), 16) ^ (this.a.hashCode() ^ Integer.rotateLeft(this.b.r().hashCode(), 8));
    }

    public abstract ye4 i();

    public ye4 j(ye4 ye4Var) {
        if (this == ye4Var.a) {
            return ye4Var;
        }
        if (ye4Var.f()) {
            return i();
        }
        ye4 ye4VarI = ye4Var.i();
        ye4 ye4VarB = b(ye4VarI.b.r(), ye4VarI.d().r(), ye4VarI.e);
        if (ye4VarB.f() || ye4VarB.a == null) {
            return ye4VarB;
        }
        if (ye4VarB.l() && ye4VarB.k()) {
            return ye4VarB;
        }
        l5.q("Invalid point coordinates");
        return null;
    }

    public abstract boolean k(int i);

    public static class c extends a {
        public int g;
        public int h;
        public int i;
        public int j;
        public ye4.c k;

        public c(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.g = i;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.d = bigInteger3;
            this.e = bigInteger4;
            this.k = new ye4.c(this, null, null, false);
            this.b = g(bigInteger);
            this.c = g(bigInteger2);
            this.f = 6;
        }

        @Override // defpackage.ue4
        public final ue4 a() {
            int i = this.g;
            int i2 = this.h;
            int i3 = this.i;
            int i4 = this.j;
            ve4 ve4Var = this.b;
            ve4 ve4Var2 = this.c;
            BigInteger bigInteger = this.d;
            BigInteger bigInteger2 = this.e;
            c cVar = new c(i, i2, i3, i4);
            cVar.g = i;
            cVar.h = i2;
            cVar.i = i3;
            cVar.j = i4;
            cVar.d = bigInteger;
            cVar.e = bigInteger2;
            cVar.k = new ye4.c(cVar, null, null, false);
            cVar.b = ve4Var;
            cVar.c = ve4Var2;
            cVar.f = 6;
            return cVar;
        }

        @Override // defpackage.ue4
        public final ye4 c(ve4 ve4Var, ve4 ve4Var2, boolean z) {
            return new ye4.c(this, ve4Var, ve4Var2, z);
        }

        @Override // defpackage.ue4
        public final ve4 g(BigInteger bigInteger) {
            int i = this.g;
            int i2 = this.h;
            int i3 = this.i;
            int i4 = this.j;
            ve4.a aVar = new ve4.a();
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                l5.q("x value invalid in F2m field element");
                return null;
            }
            if (i3 == 0 && i4 == 0) {
                aVar.d = 2;
                aVar.f = new int[]{i2};
            } else {
                if (i3 >= i4) {
                    l5.q("k2 must be smaller than k3");
                    return null;
                }
                if (i3 <= 0) {
                    l5.q("k2 must be larger than 0");
                    return null;
                }
                aVar.d = 3;
                aVar.f = new int[]{i2, i3, i4};
            }
            aVar.e = i;
            z49 z49Var = new z49();
            if (bigInteger.signum() < 0) {
                l5.q("invalid F2m field value");
                return null;
            }
            int i5 = 1;
            if (bigInteger.signum() == 0) {
                z49Var.a = new long[]{0};
            } else {
                byte[] byteArray = bigInteger.toByteArray();
                int length = byteArray.length;
                if (byteArray[0] == 0) {
                    length--;
                } else {
                    i5 = 0;
                }
                int i6 = (length + 7) / 8;
                z49Var.a = new long[i6];
                int i7 = i6 - 1;
                int i8 = (length % 8) + i5;
                if (i5 < i8) {
                    long j = 0;
                    while (i5 < i8) {
                        j = (j << 8) | ((long) (byteArray[i5] & 255));
                        i5++;
                    }
                    z49Var.a[i7] = j;
                    i7 = i6 - 2;
                }
                while (i7 >= 0) {
                    int i9 = 0;
                    long j2 = 0;
                    while (i9 < 8) {
                        j2 = (j2 << 8) | ((long) (byteArray[i5] & 255));
                        i9++;
                        i5++;
                    }
                    z49Var.a[i7] = j2;
                    i7--;
                }
            }
            aVar.g = z49Var;
            return aVar;
        }

        @Override // defpackage.ue4
        public final int h() {
            return this.g;
        }

        @Override // defpackage.ue4
        public final ye4 i() {
            return this.k;
        }

        @Override // defpackage.ue4
        public final boolean k(int i) {
            return i == 0 || i == 1 || i == 6;
        }

        public c(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }
    }
}
