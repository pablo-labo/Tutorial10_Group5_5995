package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ve4 implements te4 {

    public static class a extends ve4 {
        public int d;
        public int e;
        public int[] f;
        public z49 g;

        public a(int i, int[] iArr, z49 z49Var) {
            this.e = i;
            this.d = iArr.length == 1 ? 2 : 3;
            this.f = iArr;
            this.g = z49Var;
        }

        public static void s(ve4 ve4Var, ve4 ve4Var2) {
            if (!(ve4Var instanceof a) || !(ve4Var2 instanceof a)) {
                l5.q("Field elements are not both instances of ECFieldElement.F2m");
                return;
            }
            a aVar = (a) ve4Var;
            a aVar2 = (a) ve4Var2;
            if (aVar.d != aVar2.d) {
                l5.q("One of the F2m field elements has incorrect representation");
            } else {
                if (aVar.e == aVar2.e && st0.b(aVar.f, aVar2.f)) {
                    return;
                }
                l5.q("Field elements are not elements of the same field F2m");
            }
        }

        @Override // defpackage.ve4
        public final ve4 a(ve4 ve4Var) {
            z49 z49Var = (z49) this.g.clone();
            z49Var.e(((a) ve4Var).g);
            return new a(this.e, this.f, z49Var);
        }

        @Override // defpackage.ve4
        public final ve4 b() {
            z49 z49Var;
            int i = this.e;
            int[] iArr = this.f;
            z49 z49Var2 = this.g;
            if (z49Var2.a.length == 0) {
                z49Var = new z49(new long[]{1});
            } else {
                int iMax = Math.max(1, z49Var2.m());
                long[] jArr = new long[iMax];
                long[] jArr2 = z49Var2.a;
                System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, iMax));
                jArr[0] = 1 ^ jArr[0];
                z49Var = new z49(jArr);
            }
            return new a(i, iArr, z49Var);
        }

        @Override // defpackage.ve4
        public final int c() {
            return this.g.h();
        }

        @Override // defpackage.ve4
        public final ve4 d(ve4 ve4Var) {
            return i(ve4Var.f());
        }

        @Override // defpackage.ve4
        public final int e() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.e == aVar.e && this.d == aVar.d && st0.b(this.f, aVar.f) && this.g.equals(aVar.g);
        }

        @Override // defpackage.ve4
        public final ve4 f() {
            int i;
            int i2 = this.e;
            int[] iArr = this.f;
            z49 z49Var = this.g;
            int iH = z49Var.h();
            if (iH == 0) {
                bg.h();
                return null;
            }
            int i3 = 1;
            if (iH != 1) {
                z49 z49Var2 = (z49) z49Var.clone();
                int i4 = (i2 + 63) >>> 6;
                z49 z49Var3 = new z49(i4);
                long[] jArr = z49Var3.a;
                z49.j(jArr, i2);
                int length = iArr.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    z49.j(jArr, iArr[length]);
                }
                int i5 = 0;
                z49.j(jArr, 0);
                z49 z49Var4 = new z49(i4);
                z49Var4.a[0] = 1;
                z49 z49Var5 = new z49(i4);
                int[] iArr2 = new int[2];
                iArr2[0] = iH;
                iArr2[1] = i2 + 1;
                z49[] z49VarArr = {z49Var2, z49Var3};
                int[] iArr3 = new int[2];
                iArr3[0] = 1;
                iArr3[1] = 0;
                z49[] z49VarArr2 = {z49Var4, z49Var5};
                int i6 = iArr2[1];
                int i7 = i6 - iArr2[0];
                while (true) {
                    if (i7 < 0) {
                        i7 = -i7;
                        iArr2[i3] = i6;
                        iArr3[i3] = i5;
                        i3 = 1 - i3;
                        i6 = iArr2[i3];
                        i5 = iArr3[i3];
                    }
                    i = 1 - i3;
                    z49VarArr[i3].d(z49VarArr[i], iArr2[i], i7);
                    int i8 = z49VarArr[i3].i(i6);
                    if (i8 == 0) {
                        break;
                    }
                    int i9 = iArr3[i];
                    z49VarArr2[i3].d(z49VarArr2[i], i9, i7);
                    int i10 = i9 + i7;
                    if (i10 > i5) {
                        i5 = i10;
                    } else if (i10 == i5) {
                        i5 = z49VarArr2[i3].i(i5);
                    }
                    i7 += i8 - i6;
                    i6 = i8;
                }
                z49Var = z49VarArr2[i];
            }
            return new a(i2, iArr, z49Var);
        }

        @Override // defpackage.ve4
        public final boolean g() {
            return this.g.o();
        }

        @Override // defpackage.ve4
        public final boolean h() {
            for (long j : this.g.a) {
                if (j != 0) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            int i;
            int iHashCode = this.g.hashCode() ^ this.e;
            int[] iArr = this.f;
            if (iArr == null) {
                i = 0;
            } else {
                int length = iArr.length;
                int i2 = length + 1;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    i2 = (i2 * 257) ^ iArr[length];
                }
                i = i2;
            }
            return i ^ iHashCode;
        }

        @Override // defpackage.ve4
        public final ve4 i(ve4 ve4Var) {
            int i;
            int i2 = this.e;
            int[] iArr = this.f;
            z49 z49Var = this.g;
            z49 z49Var2 = ((a) ve4Var).g;
            int iH = z49Var.h();
            if (iH != 0) {
                int iH2 = z49Var2.h();
                if (iH2 != 0) {
                    if (iH > iH2) {
                        iH2 = iH;
                        iH = iH2;
                    } else {
                        z49Var2 = z49Var;
                        z49Var = z49Var2;
                    }
                    int i3 = (iH + 63) >>> 6;
                    int i4 = (iH2 + 63) >>> 6;
                    int i5 = ((iH + iH2) + 62) >>> 6;
                    if (i3 == 1) {
                        long j = z49Var2.a[0];
                        if (j != 1) {
                            long[] jArr = new long[i5];
                            z49.q(j, z49Var.a, i4, jArr);
                            z49Var = new z49(jArr, z49.r(jArr, i5, i2, iArr));
                        }
                    } else {
                        int i6 = (iH2 + 70) >>> 6;
                        int[] iArr2 = new int[16];
                        int i7 = i6 << 4;
                        long[] jArr2 = new long[i7];
                        iArr2[1] = i6;
                        System.arraycopy(z49Var.a, 0, jArr2, i6, i4);
                        int i8 = 2;
                        int i9 = i6;
                        while (i8 < 16) {
                            int i10 = i9 + i6;
                            iArr2[i8] = i10;
                            if ((i8 & 1) == 0) {
                                z49.t(jArr2, i10 >>> 1, jArr2, i10, i6, 1);
                            } else {
                                int i11 = i10 - i6;
                                for (int i12 = 0; i12 < i6; i12++) {
                                    jArr2[i10 + i12] = jArr2[i6 + i12] ^ jArr2[i11 + i12];
                                }
                            }
                            i8++;
                            i9 = i10;
                        }
                        long[] jArr3 = new long[i7];
                        z49.t(jArr2, 0, jArr3, 0, i7, 4);
                        long[] jArr4 = z49Var2.a;
                        int i13 = i5 << 3;
                        long[] jArr5 = new long[i13];
                        int i14 = 0;
                        while (i14 < i3) {
                            int i15 = i6;
                            int i16 = i14;
                            long j2 = jArr4[i14];
                            while (true) {
                                i = i13;
                                long j3 = j2;
                                int i17 = iArr2[((int) j2) & 15];
                                int i18 = iArr2[((int) (j3 >>> 4)) & 15];
                                i6 = i15;
                                for (int i19 = 0; i19 < i6; i19++) {
                                    int i20 = i16 + i19;
                                    jArr5[i20] = jArr5[i20] ^ (jArr2[i17 + i19] ^ jArr3[i18 + i19]);
                                }
                                long j4 = j3 >>> 8;
                                if (j4 == 0) {
                                    break;
                                }
                                i16 += i5;
                                i15 = i6;
                                j2 = j4;
                                i13 = i;
                            }
                            i14++;
                            i13 = i;
                        }
                        while (true) {
                            int i21 = i13 - i5;
                            if (i21 == 0) {
                                break;
                            }
                            z49.f(jArr5, i21 - i5, jArr5, i21, i5, 8);
                            i13 = i21;
                        }
                        z49Var2 = new z49(jArr5, z49.r(jArr5, i5, i2, iArr));
                        z49Var = z49Var2;
                    }
                } else {
                    z49Var = z49Var2;
                }
            }
            return new a(i2, iArr, z49Var);
        }

        @Override // defpackage.ve4
        public final ve4 j(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
            return k(ve4Var, ve4Var2, ve4Var3);
        }

        @Override // defpackage.ve4
        public final ve4 k(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
            z49 z49Var = this.g;
            z49 z49Var2 = ((a) ve4Var).g;
            z49 z49Var3 = ((a) ve4Var2).g;
            z49 z49Var4 = ((a) ve4Var3).g;
            int i = this.e;
            int[] iArr = this.f;
            z49 z49VarP = z49Var.p(z49Var2);
            z49 z49VarP2 = z49Var3.p(z49Var4);
            if (z49VarP == z49Var || z49VarP == z49Var2) {
                z49VarP = (z49) z49VarP.clone();
            }
            z49VarP.e(z49VarP2);
            long[] jArr = z49VarP.a;
            int iR = z49.r(jArr, jArr.length, i, iArr);
            if (iR < jArr.length) {
                long[] jArr2 = new long[iR];
                z49VarP.a = jArr2;
                System.arraycopy(jArr, 0, jArr2, 0, iR);
            }
            return new a(i, iArr, z49VarP);
        }

        @Override // defpackage.ve4
        public final ve4 l() {
            return this;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 int, still in use, count: 3, list:
              (r1v2 int) from 0x002b: ARITH (r1v2 int) + (63 int) A[WRAPPED]
              (r1v2 int) from 0x005b: INVOKE (r6v5 int) = (r7v2 long[]), (r4v4 int), (r1v2 int), (r12v1 int[]) STATIC call: z49.r(long[], int, int, int[]):int A[MD:(long[], int, int, int[]):int (m)]
              (r1v2 int) from 0x0065: CONSTRUCTOR (r1v2 int), (r12v1 int[]), (r0v1 z49) A[MD:(int, int[], z49):void (m), WRAPPED] call: ve4.a.<init>(int, int[], z49):void type: CONSTRUCTOR
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
            	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:106)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:90)
            	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
            	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:141)
            	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
            	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
            	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
            	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
            */
        @Override // defpackage.ve4
        public final defpackage.ve4 m() {
            /*
                r12 = this;
                z49 r0 = r12.g
                long[] r1 = r0.a
                r2 = 0
                r3 = r2
            L6:
                int r4 = r1.length
                if (r3 >= r4) goto L6c
                r4 = r1[r3]
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 == 0) goto L69
                boolean r1 = r0.o()
                if (r1 == 0) goto L18
                goto L6c
            L18:
                int r1 = r12.e
                int r3 = r1 + (-1)
                r4 = 1
                if (r3 >= r4) goto L20
                goto L6c
            L20:
                ve4$a r5 = new ve4$a
                int[] r12 = r12.f
                int r6 = r0.m()
                if (r6 != 0) goto L2b
                goto L65
            L2b:
                int r7 = r1 + 63
                int r7 = r7 >>> 6
                int r4 = r7 << 1
                long[] r7 = new long[r4]
                long[] r0 = r0.a
                java.lang.System.arraycopy(r0, r2, r7, r2, r6)
            L38:
                int r3 = r3 + (-1)
                if (r3 < 0) goto L60
                int r0 = r6 << 1
            L3e:
                int r6 = r6 + (-1)
                if (r6 < 0) goto L5b
                r8 = r7[r6]
                int r2 = r0 + (-1)
                r10 = 32
                long r10 = r8 >>> r10
                int r10 = (int) r10
                long r10 = defpackage.z49.n(r10)
                r7[r2] = r10
                int r0 = r0 + (-2)
                int r2 = (int) r8
                long r8 = defpackage.z49.n(r2)
                r7[r0] = r8
                goto L3e
            L5b:
                int r6 = defpackage.z49.r(r7, r4, r1, r12)
                goto L38
            L60:
                z49 r0 = new z49
                r0.<init>(r7, r6)
            L65:
                r5.<init>(r1, r12, r0)
                return r5
            L69:
                int r3 = r3 + 1
                goto L6
            L6c:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ve4.a.m():ve4");
        }

        @Override // defpackage.ve4
        public final ve4 n() {
            int i = this.e;
            int[] iArr = this.f;
            z49 z49Var = this.g;
            int iM = z49Var.m();
            if (iM != 0) {
                int i2 = iM << 1;
                long[] jArr = new long[i2];
                int i3 = 0;
                while (i3 < i2) {
                    long j = z49Var.a[i3 >>> 1];
                    int i4 = i3 + 1;
                    jArr[i3] = z49.n((int) j);
                    i3 += 2;
                    jArr[i4] = z49.n((int) (j >>> 32));
                }
                z49Var = new z49(jArr, z49.r(jArr, i2, i, iArr));
            }
            return new a(i, iArr, z49Var);
        }

        @Override // defpackage.ve4
        public final ve4 o(ve4 ve4Var, ve4 ve4Var2) {
            z49 z49Var;
            int[] iArr = this.f;
            int i = this.e;
            z49 z49Var2 = this.g;
            z49 z49Var3 = ((a) ve4Var).g;
            z49 z49Var4 = ((a) ve4Var2).g;
            int iM = z49Var2.m();
            if (iM == 0) {
                z49Var = z49Var2;
            } else {
                int i2 = iM << 1;
                long[] jArr = new long[i2];
                int i3 = 0;
                while (i3 < i2) {
                    long j = z49Var2.a[i3 >>> 1];
                    int i4 = i3 + 1;
                    jArr[i3] = z49.n((int) j);
                    i3 += 2;
                    jArr[i4] = z49.n((int) (j >>> 32));
                }
                z49Var = new z49(jArr, i2);
            }
            z49 z49VarP = z49Var3.p(z49Var4);
            if (z49Var == z49Var2) {
                z49Var = (z49) z49Var.clone();
            }
            z49Var.e(z49VarP);
            long[] jArr2 = z49Var.a;
            int iR = z49.r(jArr2, jArr2.length, i, iArr);
            if (iR < jArr2.length) {
                long[] jArr3 = new long[iR];
                z49Var.a = jArr3;
                System.arraycopy(jArr2, 0, jArr3, 0, iR);
            }
            return new a(i, iArr, z49Var);
        }

        @Override // defpackage.ve4
        public final ve4 p(ve4 ve4Var) {
            return a(ve4Var);
        }

        @Override // defpackage.ve4
        public final boolean q() {
            long[] jArr = this.g.a;
            return jArr.length > 0 && (jArr[0] & 1) != 0;
        }

        @Override // defpackage.ve4
        public final BigInteger r() {
            z49 z49Var = this.g;
            int iM = z49Var.m();
            if (iM == 0) {
                return te4.a;
            }
            int i = iM - 1;
            long j = z49Var.a[i];
            byte[] bArr = new byte[8];
            int i2 = 0;
            boolean z = false;
            for (int i3 = 7; i3 >= 0; i3--) {
                byte b = (byte) (j >>> (i3 * 8));
                if (z || b != 0) {
                    bArr[i2] = b;
                    i2++;
                    z = true;
                }
            }
            byte[] bArr2 = new byte[(i * 8) + i2];
            for (int i4 = 0; i4 < i2; i4++) {
                bArr2[i4] = bArr[i4];
            }
            for (int i5 = iM - 2; i5 >= 0; i5--) {
                long j2 = z49Var.a[i5];
                int i6 = 7;
                while (i6 >= 0) {
                    bArr2[i2] = (byte) (j2 >>> (i6 * 8));
                    i6--;
                    i2++;
                }
            }
            return new BigInteger(1, bArr2);
        }
    }

    public static class b extends ve4 {
        public final BigInteger d;
        public final BigInteger e;
        public final BigInteger f;

        public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                l5.q("x value invalid in Fp field element");
                throw null;
            }
            this.d = bigInteger;
            this.e = bigInteger2;
            this.f = bigInteger3;
        }

        @Override // defpackage.ve4
        public final ve4 a(ve4 ve4Var) {
            BigInteger bigIntegerAdd = this.f.add(ve4Var.r());
            BigInteger bigInteger = this.d;
            if (bigIntegerAdd.compareTo(bigInteger) >= 0) {
                bigIntegerAdd = bigIntegerAdd.subtract(bigInteger);
            }
            return new b(bigInteger, this.e, bigIntegerAdd);
        }

        @Override // defpackage.ve4
        public final ve4 b() {
            BigInteger bigIntegerAdd = this.f.add(te4.b);
            BigInteger bigInteger = this.d;
            if (bigIntegerAdd.compareTo(bigInteger) == 0) {
                bigIntegerAdd = te4.a;
            }
            return new b(bigInteger, this.e, bigIntegerAdd);
        }

        @Override // defpackage.ve4
        public final ve4 d(ve4 ve4Var) {
            BigInteger bigIntegerR = ve4Var.r();
            BigInteger bigInteger = this.d;
            int iBitLength = bigInteger.bitLength();
            int i = (iBitLength + 31) >> 5;
            int[] iArrG0 = ka6.g0(bigInteger, iBitLength);
            int[] iArrG02 = ka6.g0(bigIntegerR, iBitLength);
            int[] iArr = new int[i];
            ka6.w0(iArrG0, iArrG02, iArr);
            return new b(bigInteger, this.e, s(this.f, ka6.u1(i, iArr)));
        }

        @Override // defpackage.ve4
        public final int e() {
            return this.d.bitLength();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.d.equals(bVar.d) && this.f.equals(bVar.f);
        }

        @Override // defpackage.ve4
        public final ve4 f() {
            BigInteger bigInteger = this.d;
            int iBitLength = bigInteger.bitLength();
            int i = (iBitLength + 31) >> 5;
            int[] iArr = new int[i];
            ka6.w0(ka6.g0(bigInteger, iBitLength), ka6.g0(this.f, iBitLength), iArr);
            return new b(bigInteger, this.e, ka6.u1(i, iArr));
        }

        public final int hashCode() {
            return this.f.hashCode() ^ this.d.hashCode();
        }

        @Override // defpackage.ve4
        public final ve4 i(ve4 ve4Var) {
            return new b(this.d, this.e, s(this.f, ve4Var.r()));
        }

        @Override // defpackage.ve4
        public final ve4 j(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
            return new b(this.d, this.e, t(this.f.multiply(ve4Var.r()).subtract(ve4Var2.r().multiply(ve4Var3.r()))));
        }

        @Override // defpackage.ve4
        public final ve4 k(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
            return new b(this.d, this.e, t(this.f.multiply(ve4Var.r()).add(ve4Var2.r().multiply(ve4Var3.r()))));
        }

        @Override // defpackage.ve4
        public final ve4 l() {
            BigInteger bigInteger = this.f;
            if (bigInteger.signum() == 0) {
                return this;
            }
            BigInteger bigInteger2 = this.e;
            BigInteger bigInteger3 = this.d;
            return new b(bigInteger3, bigInteger2, bigInteger3.subtract(bigInteger));
        }

        @Override // defpackage.ve4
        public final ve4 m() {
            ve4 ve4Var;
            int i;
            BigInteger bigInteger;
            if (h() || g()) {
                return this;
            }
            BigInteger bigInteger2 = this.d;
            int i2 = 0;
            ve4 ve4Var2 = null;
            if (!bigInteger2.testBit(0)) {
                b0.o("not done yet");
                return null;
            }
            int i3 = 1;
            boolean zTestBit = bigInteger2.testBit(1);
            BigInteger bigInteger3 = this.e;
            BigInteger bigInteger4 = this.f;
            BigInteger bigInteger5 = te4.b;
            if (zTestBit) {
                b bVar = new b(bigInteger2, bigInteger3, bigInteger4.modPow(bigInteger2.shiftRight(2).add(bigInteger5), bigInteger2));
                if (bVar.n().equals(this)) {
                    return bVar;
                }
                return null;
            }
            boolean zTestBit2 = bigInteger2.testBit(2);
            BigInteger bigIntegerT = te4.c;
            if (zTestBit2) {
                BigInteger bigIntegerModPow = bigInteger4.modPow(bigInteger2.shiftRight(3), bigInteger2);
                BigInteger bigIntegerS = s(bigIntegerModPow, bigInteger4);
                if (s(bigIntegerS, bigIntegerModPow).equals(bigInteger5)) {
                    b bVar2 = new b(bigInteger2, bigInteger3, bigIntegerS);
                    if (bVar2.n().equals(this)) {
                        return bVar2;
                    }
                    return null;
                }
                b bVar3 = new b(bigInteger2, bigInteger3, t(bigIntegerS.multiply(bigIntegerT.modPow(bigInteger2.shiftRight(2), bigInteger2))));
                if (bVar3.n().equals(this)) {
                    return bVar3;
                }
                return null;
            }
            BigInteger bigIntegerShiftRight = bigInteger2.shiftRight(1);
            if (!bigInteger4.modPow(bigIntegerShiftRight, bigInteger2).equals(bigInteger5)) {
                return null;
            }
            BigInteger bigIntegerShiftLeft = bigInteger4.shiftLeft(1);
            if (bigIntegerShiftLeft.compareTo(bigInteger2) >= 0) {
                bigIntegerShiftLeft = bigIntegerShiftLeft.subtract(bigInteger2);
            }
            BigInteger bigIntegerShiftLeft2 = bigIntegerShiftLeft.shiftLeft(1);
            if (bigIntegerShiftLeft2.compareTo(bigInteger2) >= 0) {
                bigIntegerShiftLeft2 = bigIntegerShiftLeft2.subtract(bigInteger2);
            }
            BigInteger bigIntegerAdd = bigIntegerShiftRight.add(bigInteger5);
            BigInteger bigIntegerSubtract = bigInteger2.subtract(bigInteger5);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger6 = new BigInteger(bigInteger2.bitLength(), random);
                if (bigInteger6.compareTo(bigInteger2) >= 0 || !t(bigInteger6.multiply(bigInteger6).subtract(bigIntegerShiftLeft2)).modPow(bigIntegerShiftRight, bigInteger2).equals(bigIntegerSubtract)) {
                    ve4Var = ve4Var2;
                    i = i2;
                    i2 = i;
                    ve4Var2 = ve4Var;
                } else {
                    int iBitLength = bigIntegerAdd.bitLength();
                    ve4Var = ve4Var2;
                    int lowestSetBit = bigIntegerAdd.getLowestSetBit();
                    int i4 = iBitLength - i3;
                    int i5 = i2;
                    BigInteger bigInteger7 = bigIntegerShiftRight;
                    BigInteger bigIntegerS2 = bigInteger5;
                    BigInteger bigIntegerS3 = bigIntegerS2;
                    BigInteger bigInteger8 = bigIntegerS3;
                    BigInteger bigInteger9 = bigIntegerT;
                    Random random2 = random;
                    BigInteger bigIntegerT2 = bigInteger6;
                    while (true) {
                        bigInteger = bigIntegerSubtract;
                        if (i4 < lowestSetBit + 1) {
                            break;
                        }
                        bigIntegerS2 = s(bigIntegerS2, bigIntegerS3);
                        if (bigIntegerAdd.testBit(i4)) {
                            bigIntegerS3 = s(bigIntegerS2, bigInteger4);
                            BigInteger bigIntegerS4 = s(bigInteger8, bigIntegerT2);
                            bigIntegerT = t(bigIntegerT2.multiply(bigIntegerT).subtract(bigInteger6.multiply(bigIntegerS2)));
                            bigIntegerT2 = t(bigIntegerT2.multiply(bigIntegerT2).subtract(bigIntegerS3.shiftLeft(1)));
                            bigInteger8 = bigIntegerS4;
                        } else {
                            BigInteger bigIntegerT3 = t(bigInteger8.multiply(bigIntegerT).subtract(bigIntegerS2));
                            BigInteger bigIntegerT4 = t(bigIntegerT2.multiply(bigIntegerT).subtract(bigInteger6.multiply(bigIntegerS2)));
                            bigIntegerT = t(bigIntegerT.multiply(bigIntegerT).subtract(bigIntegerS2.shiftLeft(1)));
                            bigIntegerT2 = bigIntegerT4;
                            bigInteger8 = bigIntegerT3;
                            bigIntegerS3 = bigIntegerS2;
                        }
                        i4--;
                        bigIntegerSubtract = bigInteger;
                    }
                    BigInteger bigIntegerS5 = s(bigIntegerS2, bigIntegerS3);
                    BigInteger bigIntegerS6 = s(bigIntegerS5, bigInteger4);
                    BigInteger bigIntegerT5 = t(bigInteger8.multiply(bigIntegerT).subtract(bigIntegerS5));
                    BigInteger bigIntegerT6 = t(bigIntegerT2.multiply(bigIntegerT).subtract(bigInteger6.multiply(bigIntegerS5)));
                    BigInteger bigIntegerT7 = t(bigIntegerS5.multiply(bigIntegerS6));
                    for (int i6 = 1; i6 <= lowestSetBit; i6++) {
                        bigIntegerT5 = s(bigIntegerT5, bigIntegerT6);
                        bigIntegerT6 = t(bigIntegerT6.multiply(bigIntegerT6).subtract(bigIntegerT7.shiftLeft(1)));
                        bigIntegerT7 = t(bigIntegerT7.multiply(bigIntegerT7));
                    }
                    BigInteger[] bigIntegerArr = {bigIntegerT5, bigIntegerT6};
                    BigInteger bigInteger10 = bigIntegerArr[i5];
                    BigInteger bigIntegerSubtract2 = bigIntegerArr[1];
                    if (s(bigIntegerSubtract2, bigIntegerSubtract2).equals(bigIntegerShiftLeft2)) {
                        if (bigIntegerSubtract2.testBit(i5)) {
                            bigIntegerSubtract2 = bigInteger2.subtract(bigIntegerSubtract2);
                        }
                        return new b(bigInteger2, bigInteger3, bigIntegerSubtract2.shiftRight(1));
                    }
                    i = i5;
                    if (bigInteger10.equals(bigInteger5)) {
                        i2 = i;
                        i3 = 1;
                        ve4Var2 = ve4Var;
                        bigIntegerShiftRight = bigInteger7;
                        bigIntegerT = bigInteger9;
                        random = random2;
                        bigIntegerSubtract = bigInteger;
                    } else {
                        if (!bigInteger10.equals(bigInteger)) {
                            return ve4Var;
                        }
                        i3 = 1;
                        bigIntegerShiftRight = bigInteger7;
                        bigIntegerT = bigInteger9;
                        random = random2;
                        bigIntegerSubtract = bigInteger;
                        i2 = i;
                        ve4Var2 = ve4Var;
                    }
                }
            }
        }

        @Override // defpackage.ve4
        public final ve4 n() {
            BigInteger bigInteger = this.f;
            return new b(this.d, this.e, s(bigInteger, bigInteger));
        }

        @Override // defpackage.ve4
        public final ve4 o(ve4 ve4Var, ve4 ve4Var2) {
            BigInteger bigIntegerR = ve4Var.r();
            BigInteger bigIntegerR2 = ve4Var2.r();
            BigInteger bigInteger = this.f;
            return new b(this.d, this.e, t(bigInteger.multiply(bigInteger).add(bigIntegerR.multiply(bigIntegerR2))));
        }

        @Override // defpackage.ve4
        public final ve4 p(ve4 ve4Var) {
            BigInteger bigIntegerSubtract = this.f.subtract(ve4Var.r());
            int iSignum = bigIntegerSubtract.signum();
            BigInteger bigInteger = this.d;
            if (iSignum < 0) {
                bigIntegerSubtract = bigIntegerSubtract.add(bigInteger);
            }
            return new b(bigInteger, this.e, bigIntegerSubtract);
        }

        @Override // defpackage.ve4
        public final BigInteger r() {
            return this.f;
        }

        public final BigInteger s(BigInteger bigInteger, BigInteger bigInteger2) {
            return t(bigInteger.multiply(bigInteger2));
        }

        public final BigInteger t(BigInteger bigInteger) {
            BigInteger bigInteger2 = this.d;
            BigInteger bigInteger3 = this.e;
            if (bigInteger3 == null) {
                return bigInteger.mod(bigInteger2);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int iBitLength = bigInteger2.bitLength();
            boolean zEquals = bigInteger3.equals(te4.b);
            while (bigInteger.bitLength() > iBitLength + 1) {
                BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
                if (!zEquals) {
                    bigIntegerShiftRight = bigIntegerShiftRight.multiply(bigInteger3);
                }
                bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
            }
            while (bigInteger.compareTo(bigInteger2) >= 0) {
                bigInteger = bigInteger.subtract(bigInteger2);
            }
            return (!z || bigInteger.signum() == 0) ? bigInteger : bigInteger2.subtract(bigInteger);
        }
    }

    public abstract ve4 a(ve4 ve4Var);

    public abstract ve4 b();

    public int c() {
        return r().bitLength();
    }

    public abstract ve4 d(ve4 ve4Var);

    public abstract int e();

    public abstract ve4 f();

    public boolean g() {
        return c() == 1;
    }

    public boolean h() {
        return r().signum() == 0;
    }

    public abstract ve4 i(ve4 ve4Var);

    public ve4 j(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        return i(ve4Var).p(ve4Var2.i(ve4Var3));
    }

    public ve4 k(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        return i(ve4Var).a(ve4Var2.i(ve4Var3));
    }

    public abstract ve4 l();

    public abstract ve4 m();

    public abstract ve4 n();

    public ve4 o(ve4 ve4Var, ve4 ve4Var2) {
        return n().a(ve4Var.i(ve4Var2));
    }

    public abstract ve4 p(ve4 ve4Var);

    public boolean q() {
        return r().testBit(0);
    }

    public abstract BigInteger r();

    public final String toString() {
        return r().toString(16);
    }
}
