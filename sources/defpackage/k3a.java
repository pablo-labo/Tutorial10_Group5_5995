package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k3a<V> extends i59<V> {
    public int f;

    public k3a(int i) {
        if (i >= 0) {
            f(lnd.e(i));
        } else {
            l5.q("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != lnd.a) {
            pyd.r(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        pyd.q(null, 0, this.c, this.d);
        this.f = lnd.a(this.d) - this.e;
    }

    public final int d(long j) {
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        long[] jArr;
        long[] jArr2;
        long j5;
        Object[] objArr;
        int i3;
        long[] jArr3;
        int i4 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.d;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr4 = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j6 = ((jArr4[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr4[i11] >>> i12);
            long j7 = i7;
            int i14 = i10;
            int i15 = 0;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j9) >> 3)) & i8;
                int i16 = i4;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i4 = i16;
            }
            int i17 = i4;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iE = e(i6);
                if (this.f != 0 || ((this.a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j3 = j7;
                    i = 0;
                    i2 = 1;
                    j4 = 128;
                } else {
                    int i18 = this.d;
                    if (i18 > 8) {
                        j4 = 128;
                        if (Long.compareUnsigned(((long) this.e) * 32, ((long) i18) * 25) <= 0) {
                            long[] jArr5 = this.a;
                            int i19 = this.d;
                            long[] jArr6 = this.b;
                            Object[] objArr2 = this.c;
                            int i20 = (i19 + 7) >> 3;
                            j2 = 255;
                            int i21 = 0;
                            while (i21 < i20) {
                                long j10 = jArr5[i21] & (-9187201950435737472L);
                                jArr5[i21] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i21++;
                                i13 = i13;
                                i15 = i15;
                                j7 = j7;
                            }
                            j3 = j7;
                            i = i15;
                            int i22 = i13;
                            char c = 7;
                            int iM0 = ut0.m0(jArr5);
                            int i23 = iM0 - 1;
                            long j11 = 72057594037927935L;
                            jArr5[i23] = (jArr5[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[iM0] = jArr5[i];
                            int i24 = i;
                            while (i24 != i19) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j12 = (jArr5[i25] >> i26) & 255;
                                if (j12 != 128 && j12 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr6[i24]) * i17;
                                    int i27 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i28 = i27 >>> 7;
                                    int iE2 = e(i28);
                                    int i29 = i28 & i19;
                                    char c2 = c;
                                    if (((iE2 - i29) & i19) / 8 == ((i24 - i29) & i19) / 8) {
                                        int i30 = i22;
                                        j5 = j11;
                                        jArr5[i25] = (((long) (i27 & 127)) << i26) | (jArr5[i25] & (~(255 << i26)));
                                        jArr5[jArr5.length - i30] = (jArr5[i] & j5) | Long.MIN_VALUE;
                                        i24++;
                                        i22 = i30;
                                        c = c2;
                                    } else {
                                        int i31 = i22;
                                        j5 = j11;
                                        int i32 = iE2 >> 3;
                                        long j13 = jArr5[i32];
                                        int i33 = (iE2 & 7) << 3;
                                        if (((j13 >> i33) & 255) == 128) {
                                            i3 = i31;
                                            jArr3 = jArr6;
                                            objArr = objArr2;
                                            jArr5[i32] = (j13 & (~(255 << i33))) | (((long) (i27 & 127)) << i33);
                                            jArr5[i25] = (jArr5[i25] & (~(255 << i26))) | (128 << i26);
                                            jArr3[iE2] = jArr3[i24];
                                            jArr3[i24] = 0;
                                            objArr[iE2] = objArr[i24];
                                            objArr[i24] = null;
                                        } else {
                                            objArr = objArr2;
                                            i3 = i31;
                                            jArr3 = jArr6;
                                            jArr5[i32] = (((long) (i27 & 127)) << i33) | (j13 & (~(255 << i33)));
                                            long j14 = jArr3[iE2];
                                            jArr3[iE2] = jArr3[i24];
                                            jArr3[i24] = j14;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i24];
                                            objArr[i24] = obj;
                                            i24--;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[i] & j5) | Long.MIN_VALUE;
                                        i24++;
                                        jArr6 = jArr3;
                                        i22 = i3;
                                        c = c2;
                                        objArr2 = objArr;
                                    }
                                    j11 = j5;
                                } else {
                                    i24++;
                                }
                            }
                            i2 = i22;
                            this.f = lnd.a(this.d) - this.e;
                        }
                        iE = e(i6);
                    } else {
                        j4 = 128;
                    }
                    j2 = 255;
                    j3 = j7;
                    i = 0;
                    i2 = 1;
                    int iC = lnd.c(this.d);
                    long[] jArr7 = this.a;
                    long[] jArr8 = this.b;
                    Object[] objArr3 = this.c;
                    int i34 = this.d;
                    f(iC);
                    long[] jArr9 = this.a;
                    long[] jArr10 = this.b;
                    Object[] objArr4 = this.c;
                    int i35 = this.d;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr7[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j4) {
                            long j15 = jArr8[i36];
                            int iHashCode3 = Long.hashCode(j15) * i17;
                            int i37 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i37 >>> 7);
                            jArr = jArr9;
                            jArr2 = jArr7;
                            long j16 = i37 & 127;
                            int i38 = iE3 >> 3;
                            int i39 = (iE3 & 7) << 3;
                            long j17 = (jArr[i38] & (~(255 << i39))) | (j16 << i39);
                            jArr[i38] = j17;
                            jArr[(((iE3 - 7) & i35) + (i35 & 7)) >> 3] = j17;
                            jArr10[iE3] = j15;
                            objArr4[iE3] = objArr3[i36];
                        } else {
                            jArr = jArr9;
                            jArr2 = jArr7;
                        }
                        i36++;
                        jArr7 = jArr2;
                        jArr9 = jArr;
                    }
                    iE = e(i6);
                }
                this.e++;
                int i40 = this.f;
                long[] jArr11 = this.a;
                int i41 = iE >> 3;
                long j18 = jArr11[i41];
                int i42 = (iE & 7) << 3;
                if (((j18 >> i42) & j2) != j4) {
                    i2 = i;
                }
                this.f = i40 - i2;
                int i43 = this.d;
                long j19 = (j18 & (~(j2 << i42))) | (j3 << i42);
                jArr11[i41] = j19;
                jArr11[(((iE - 7) & i43) + (i43 & 7)) >> 3] = j19;
                return iE;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i17;
        }
    }

    public final int e(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, lnd.d(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = lnd.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = lnd.a(this.d) - this.e;
        this.b = new long[iMax];
        this.c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V g(long r15) {
        /*
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L99
            r10 = -1
        L66:
            r0 = 0
            if (r10 < 0) goto L98
            int r1 = r14.e
            int r1 = r1 + (-1)
            r14.e = r1
            long[] r1 = r14.a
            int r2 = r14.d
            int r3 = r10 >> 3
            r4 = r10 & 7
            int r4 = r4 << 3
            r5 = r1[r3]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r4
            long r7 = ~r7
            long r5 = r5 & r7
            r7 = 254(0xfe, double:1.255E-321)
            long r7 = r7 << r4
            long r4 = r5 | r7
            r1[r3] = r4
            int r3 = r10 + (-7)
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r1[r2] = r4
            java.lang.Object[] r14 = r14.c
            r1 = r14[r10]
            r14[r10] = r0
            return r1
        L98:
            return r0
        L99:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k3a.g(long):java.lang.Object");
    }

    public final void h(Object obj, long j) {
        int iD = d(j);
        this.b[iD] = j;
        this.c[iD] = obj;
    }

    public /* synthetic */ k3a() {
        this(6);
    }
}
