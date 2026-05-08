package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z3a<K, V> extends knd<K, V> {
    public int f;

    public z3a(int i) {
        this.a = lnd.a;
        Object[] objArr = pyd.f;
        this.b = objArr;
        this.c = objArr;
        if (i >= 0) {
            j(lnd.e(i));
        } else {
            l5.q("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void g() {
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
        pyd.q(null, 0, this.b, this.d);
        this.f = lnd.a(this.d) - this.e;
    }

    public final int h(int i) {
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

    public final int i(K k) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2 = -862048943;
        int iHashCode = (k != null ? k.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (wl7.b(this.b[iNumberOfTrailingZeros], k)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iH = h(i4);
                long j8 = 255;
                if (this.f != 0 || ((this.a[iH >> 3] >> ((iH & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.d;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compareUnsigned(((long) this.e) * 32, ((long) i14) * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i16 = this.d;
                            Object[] objArr2 = this.b;
                            Object[] objArr3 = this.c;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j9 = j8;
                                long j10 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int iM0 = ut0.m0(jArr4);
                            int i20 = iM0 - 1;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM0] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j11 = (jArr4[i22] >> i23) & j;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj = objArr2[i21];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i13;
                                    int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i25 = i24 >>> 7;
                                    int iH2 = h(i25);
                                    int i26 = i25 & i16;
                                    if (((iH2 - i26) & i16) / i19 == ((i21 - i26) & i16) / i19) {
                                        jArr4[i22] = (((long) (i24 & 127)) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i19;
                                    } else {
                                        int i27 = i19;
                                        int i28 = iH2 >> 3;
                                        long j12 = jArr4[i28];
                                        int i29 = (iH2 & 7) << 3;
                                        if (((j12 >> i29) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i28] = ((~(j << i29)) & j12) | (((long) (i24 & 127)) << i29);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iH2] = objArr[i21];
                                            objArr[i21] = null;
                                            objArr3[iH2] = objArr3[i21];
                                            objArr3[i21] = null;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i28] = (((long) (i24 & 127)) << i29) | ((~(j << i29)) & j12);
                                            Object obj2 = objArr[iH2];
                                            objArr[iH2] = objArr[i21];
                                            objArr[i21] = obj2;
                                            Object obj3 = objArr3[iH2];
                                            objArr3[iH2] = objArr3[i21];
                                            objArr3[i21] = obj3;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i27;
                                        i16 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f = lnd.a(this.d) - this.e;
                        }
                        iH = h(i4);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iC = lnd.c(this.d);
                    long[] jArr5 = this.a;
                    Object[] objArr4 = this.b;
                    Object[] objArr5 = this.c;
                    int i30 = this.d;
                    j(iC);
                    long[] jArr6 = this.a;
                    Object[] objArr6 = this.b;
                    Object[] objArr7 = this.c;
                    int i31 = this.d;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr4[i32];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i33 = iHashCode3 ^ (iHashCode3 << 16);
                            int iH3 = h(i33 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j13 = i33 & 127;
                            int i34 = iH3 >> 3;
                            int i35 = (iH3 & 7) << 3;
                            long j14 = (jArr[i34] & (~(255 << i35))) | (j13 << i35);
                            jArr[i34] = j14;
                            jArr[(((iH3 - 7) & i31) + (i31 & 7)) >> 3] = j14;
                            objArr6[iH3] = obj4;
                            objArr7[iH3] = objArr5[i32];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iH = h(i4);
                }
                this.e++;
                int i36 = this.f;
                long[] jArr7 = this.a;
                int i37 = iH >> 3;
                long j15 = jArr7[i37];
                int i38 = (iH & 7) << 3;
                this.f = i36 - (((j15 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.d;
                long j16 = (j15 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j16;
                jArr7[(((iH - 7) & i39) + (i39 & 7)) >> 3] = j16;
                return ~iH;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final void j(int i) {
        long[] jArr;
        Object[] objArr = pyd.f;
        int iMax = i > 0 ? Math.max(7, lnd.d(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = lnd.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            int i3 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j)) | j;
            jArr = jArr2;
        }
        this.a = jArr;
        this.f = lnd.a(this.d) - this.e;
        this.b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V k(K r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.b
            r11 = r11[r10]
            boolean r11 = defpackage.wl7.b(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r13 = r13.l(r10)
            return r13
        L73:
            r13 = 0
            return r13
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3a.k(java.lang.Object):java.lang.Object");
    }

    public final V l(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        Object[] objArr = this.c;
        V v = (V) objArr[i];
        objArr[i] = null;
        return v;
    }

    public final void m(K k, V v) {
        int i = i(k);
        if (i < 0) {
            i = ~i;
        }
        this.b[i] = k;
        this.c[i] = v;
    }

    public z3a() {
        this((Object) null);
    }

    public /* synthetic */ z3a(Object obj) {
        this(6);
    }
}
