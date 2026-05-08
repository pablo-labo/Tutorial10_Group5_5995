package defpackage;

import com.google.android.gms.internal.firebase_remote_config.zzhq;

/* JADX INFO: loaded from: classes2.dex */
public final class h2i extends a2i {
    public final byte[] e;
    public int f;
    public int g;
    public int i;
    public int j = Integer.MAX_VALUE;
    public int h = 0;

    public h2i(byte[] bArr, int i) {
        this.e = bArr;
        this.f = i;
    }

    public final void A(int i) throws zzhq {
        if (i >= 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3) {
                this.h = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zzhq.b();
        }
        throw zzhq.c();
    }

    public final long B() throws zzhq {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.h;
            if (i2 == this.f) {
                throw zzhq.b();
            }
            this.h = i2 + 1;
            byte b = this.e[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw zzhq.d();
    }

    public final int C() {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.h = i5;
                return i;
            }
        }
        return (int) B();
    }

    public final long D() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.h;
        int i2 = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.e;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.h = i4;
                return j;
            }
        }
        return B();
    }

    public final int E() throws zzhq {
        int i = this.h;
        if (this.f - i < 4) {
            throw zzhq.b();
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long F() throws zzhq {
        int i = this.h;
        if (this.f - i < 8) {
            throw zzhq.b();
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final void G() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.j;
        if (i <= i2) {
            this.g = 0;
            return;
        }
        int i3 = i - i2;
        this.g = i3;
        this.f = i - i3;
    }

    @Override // defpackage.a2i
    public final double a() {
        return Double.longBitsToDouble(F());
    }

    @Override // defpackage.a2i
    public final float b() {
        return Float.intBitsToFloat(E());
    }

    @Override // defpackage.a2i
    public final String c() throws zzhq {
        int iC = C();
        if (iC > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iC <= i - i2) {
                String str = new String(this.e, i2, iC, p5i.a);
                this.h += iC;
                return str;
            }
        }
        if (iC == 0) {
            return "";
        }
        if (iC < 0) {
            throw zzhq.c();
        }
        throw zzhq.b();
    }

    @Override // defpackage.a2i
    public final int d(int i) {
        if (i < 0) {
            throw zzhq.c();
        }
        int i2 = this.h + i;
        int i3 = this.j;
        if (i2 > i3) {
            throw zzhq.b();
        }
        this.j = i2;
        G();
        return i3;
    }

    @Override // defpackage.a2i
    public final void e(int i) {
        this.j = i;
        G();
    }

    @Override // defpackage.a2i
    public final int h() throws zzhq {
        if (w()) {
            this.i = 0;
            return 0;
        }
        int iC = C();
        this.i = iC;
        if ((iC >>> 3) != 0) {
            return iC;
        }
        throw zzhq.e();
    }

    @Override // defpackage.a2i
    public final long i() {
        return D();
    }

    @Override // defpackage.a2i
    public final long j() {
        return D();
    }

    @Override // defpackage.a2i
    public final int k() {
        return C();
    }

    @Override // defpackage.a2i
    public final long l() {
        return F();
    }

    @Override // defpackage.a2i
    public final int m() {
        return E();
    }

    @Override // defpackage.a2i
    public final boolean n() {
        return D() != 0;
    }

    @Override // defpackage.a2i
    public final String o() throws zzhq {
        int iC = C();
        if (iC > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iC <= i - i2) {
                String strI1 = cei.a.I1(i2, this.e, iC);
                this.h += iC;
                return strI1;
            }
        }
        if (iC == 0) {
            return "";
        }
        if (iC <= 0) {
            throw zzhq.c();
        }
        throw zzhq.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // defpackage.a2i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.t1i p() throws com.google.android.gms.internal.firebase_remote_config.zzhq {
        /*
            r4 = this;
            int r0 = r4.C()
            byte[] r1 = r4.e
            if (r0 <= 0) goto L19
            int r2 = r4.f
            int r3 = r4.h
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            t1i r1 = defpackage.h0i.b(r3, r1, r0)
            int r2 = r4.h
            int r2 = r2 + r0
            r4.h = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            t1i r4 = defpackage.h0i.a
            return r4
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f
            int r3 = r4.h
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.h = r0
            byte[] r4 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r4 = defpackage.p5i.b
        L35:
            t1i r0 = defpackage.h0i.a
            t1i r0 = new t1i
            r0.<init>(r4)
            return r0
        L3d:
            com.google.android.gms.internal.firebase_remote_config.zzhq r4 = com.google.android.gms.internal.firebase_remote_config.zzhq.c()
            throw r4
        L42:
            com.google.android.gms.internal.firebase_remote_config.zzhq r4 = com.google.android.gms.internal.firebase_remote_config.zzhq.b()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2i.p():t1i");
    }

    @Override // defpackage.a2i
    public final int q() {
        return C();
    }

    @Override // defpackage.a2i
    public final int r() {
        return C();
    }

    @Override // defpackage.a2i
    public final int s() {
        return E();
    }

    @Override // defpackage.a2i
    public final long t() {
        return F();
    }

    @Override // defpackage.a2i
    public final int u() {
        return a2i.f(C());
    }

    @Override // defpackage.a2i
    public final long v() {
        return a2i.g(D());
    }

    @Override // defpackage.a2i
    public final boolean w() {
        return this.h == this.f;
    }

    @Override // defpackage.a2i
    public final int x() {
        return this.h;
    }

    @Override // defpackage.a2i
    public final void y(int i) throws zzhq {
        if (this.i != i) {
            throw new zzhq("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.a2i
    public final boolean z(int i) throws zzhq {
        int iH;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.f - this.h;
            byte[] bArr = this.e;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.h;
                    this.h = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw zzhq.d();
            }
            while (i3 < 10) {
                int i6 = this.h;
                if (i6 == this.f) {
                    throw zzhq.b();
                }
                this.h = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw zzhq.d();
            return true;
        }
        if (i2 == 1) {
            A(8);
            return true;
        }
        if (i2 == 2) {
            A(C());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhq.f();
            }
            A(4);
            return true;
        }
        do {
            iH = h();
            if (iH == 0) {
                break;
            }
        } while (z(iH));
        y(((i >>> 3) << 3) | 4);
        return true;
    }
}
