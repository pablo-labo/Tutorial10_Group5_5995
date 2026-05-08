package androidx.datastore.preferences.protobuf;

import defpackage.bg;
import defpackage.r6;
import defpackage.tr1;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public int a;
    public final int b = 100;
    public final int c = Integer.MAX_VALUE;
    public f d;

    public static final class a extends e {
        public final byte[] e;
        public int f;
        public int g;
        public int h;
        public final int i;
        public int j;
        public int k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i, int i2, boolean z) {
            this.e = bArr;
            this.f = i2 + i;
            this.h = i;
            this.i = i;
        }

        public final long A() throws InvalidProtocolBufferException {
            int i = this.h;
            if (this.f - i < 8) {
                throw InvalidProtocolBufferException.g();
            }
            this.h = i + 8;
            byte[] bArr = this.e;
            return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
        }

        public final int B() {
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
            return (int) D();
        }

        public final long C() {
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
            return D();
        }

        public final long D() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.h;
                if (i2 == this.f) {
                    throw InvalidProtocolBufferException.g();
                }
                this.h = i2 + 1;
                byte b = this.e[i2];
                j |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        public final void E() {
            int i = this.f + this.g;
            this.f = i;
            int i2 = i - this.i;
            int i3 = this.k;
            if (i2 <= i3) {
                this.g = 0;
                return;
            }
            int i4 = i2 - i3;
            this.g = i4;
            this.f = i - i4;
        }

        public final void F(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = this.f;
                int i3 = this.h;
                if (i <= i2 - i3) {
                    this.h = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.j != i) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int c() {
            return this.h - this.i;
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final boolean d() {
            return this.h == this.f;
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final void e(int i) {
            this.k = i;
            E();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int f(int i) {
            if (i < 0) {
                throw InvalidProtocolBufferException.d();
            }
            int iC = c() + i;
            int i2 = this.k;
            if (iC > i2) {
                throw InvalidProtocolBufferException.g();
            }
            this.k = iC;
            E();
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final boolean g() {
            return C() != 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // androidx.datastore.preferences.protobuf.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final tr1.e h() throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            /*
                r4 = this;
                int r0 = r4.B()
                byte[] r1 = r4.e
                if (r0 <= 0) goto L19
                int r2 = r4.f
                int r3 = r4.h
                int r2 = r2 - r3
                if (r0 > r2) goto L19
                tr1$e r1 = defpackage.tr1.b(r3, r1, r0)
                int r2 = r4.h
                int r2 = r2 + r0
                r4.h = r2
                return r1
            L19:
                if (r0 != 0) goto L1e
                tr1$e r4 = defpackage.tr1.a
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
                byte[] r4 = androidx.datastore.preferences.protobuf.p.b
            L35:
                tr1$e r0 = defpackage.tr1.a
                tr1$e r0 = new tr1$e
                r0.<init>(r4)
                return r0
            L3d:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.d()
                throw r4
            L42:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.g()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e.a.h():tr1$e");
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final double i() {
            return Double.longBitsToDouble(A());
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int j() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int k() {
            return z();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final long l() {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final float m() {
            return Float.intBitsToFloat(z());
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int n() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final long o() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int p() {
            return z();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final long q() {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int r() {
            int iB = B();
            return (-(iB & 1)) ^ (iB >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final long s() {
            return e.b(C());
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final String t() throws InvalidProtocolBufferException {
            int iB = B();
            if (iB > 0) {
                int i = this.f;
                int i2 = this.h;
                if (iB <= i - i2) {
                    String str = new String(this.e, i2, iB, p.a);
                    this.h += iB;
                    return str;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB < 0) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final String u() throws InvalidProtocolBufferException {
            int iB = B();
            if (iB > 0) {
                int i = this.f;
                int i2 = this.h;
                if (iB <= i - i2) {
                    String strA = Utf8.a.a(i2, this.e, iB);
                    this.h += iB;
                    return strA;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB <= 0) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int v() throws InvalidProtocolBufferException {
            if (d()) {
                this.j = 0;
                return 0;
            }
            int iB = B();
            this.j = iB;
            if ((iB >>> 3) != 0) {
                return iB;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int w() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final long x() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final boolean y(int i) throws InvalidProtocolBufferException {
            int iV;
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
                    throw InvalidProtocolBufferException.c();
                }
                while (i3 < 10) {
                    int i6 = this.h;
                    if (i6 == this.f) {
                        throw InvalidProtocolBufferException.g();
                    }
                    this.h = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.c();
                return true;
            }
            if (i2 == 1) {
                F(8);
                return true;
            }
            if (i2 == 2) {
                F(B());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.b();
                }
                F(4);
                return true;
            }
            do {
                iV = v();
                if (iV == 0) {
                    break;
                }
            } while (y(iV));
            a(((i >>> 3) << 3) | 4);
            return true;
        }

        public final int z() throws InvalidProtocolBufferException {
            int i = this.h;
            if (this.f - i < 4) {
                throw InvalidProtocolBufferException.g();
            }
            this.h = i + 4;
            byte[] bArr = this.e;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
    }

    public static final class b extends e {
        public final FileInputStream e;
        public final byte[] f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l = Integer.MAX_VALUE;

        public b(FileInputStream fileInputStream) {
            Charset charset = p.a;
            this.e = fileInputStream;
            this.f = new byte[4096];
            this.g = 0;
            this.i = 0;
            this.k = 0;
        }

        public final byte[] A(int i) throws IOException {
            if (i == 0) {
                return p.b;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.d();
            }
            int i2 = this.k;
            int i3 = this.i;
            int i4 = i2 + i3 + i;
            if (i4 - this.c > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i5 = this.l;
            if (i4 > i5) {
                J((i5 - i2) - i3);
                throw InvalidProtocolBufferException.g();
            }
            int i6 = this.g - i3;
            int i7 = i - i6;
            FileInputStream fileInputStream = this.e;
            if (i7 >= 4096 && i7 > fileInputStream.available()) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.f, this.i, bArr, 0, i6);
            this.k += this.g;
            this.i = 0;
            this.g = 0;
            while (i6 < i) {
                int i8 = fileInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.g();
                }
                this.k += i8;
                i6 += i8;
            }
            return bArr;
        }

        public final ArrayList B(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.e.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw InvalidProtocolBufferException.g();
                    }
                    this.k += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int C() throws InvalidProtocolBufferException {
            int i = this.i;
            if (this.g - i < 4) {
                I(4);
                i = this.i;
            }
            this.i = i + 4;
            byte[] bArr = this.f;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long D() throws InvalidProtocolBufferException {
            int i = this.i;
            if (this.g - i < 8) {
                I(8);
                i = this.i;
            }
            this.i = i + 8;
            byte[] bArr = this.f;
            return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
        }

        public final int E() {
            int i;
            int i2 = this.i;
            int i3 = this.g;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.f;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.i = i4;
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
                    this.i = i5;
                    return i;
                }
            }
            return (int) G();
        }

        public final long F() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.i;
            int i2 = this.g;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.f;
                byte b = bArr[i];
                if (b >= 0) {
                    this.i = i3;
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
                    this.i = i4;
                    return j;
                }
            }
            return G();
        }

        public final long G() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.i == this.g) {
                    I(1);
                }
                int i2 = this.i;
                this.i = i2 + 1;
                byte b = this.f[i2];
                j |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        public final void H() {
            int i = this.g + this.h;
            this.g = i;
            int i2 = this.k + i;
            int i3 = this.l;
            if (i2 <= i3) {
                this.h = 0;
                return;
            }
            int i4 = i2 - i3;
            this.h = i4;
            this.g = i - i4;
        }

        public final void I(int i) throws InvalidProtocolBufferException {
            if (K(i)) {
                return;
            }
            if (i <= (this.c - this.k) - this.i) {
                throw InvalidProtocolBufferException.g();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void J(int i) throws InvalidProtocolBufferException {
            int i2 = this.g;
            int i3 = this.i;
            int i4 = i2 - i3;
            if (i <= i4 && i >= 0) {
                this.i = i3 + i;
                return;
            }
            FileInputStream fileInputStream = this.e;
            if (i < 0) {
                throw InvalidProtocolBufferException.d();
            }
            int i5 = this.k;
            int i6 = i5 + i3;
            int i7 = i6 + i;
            int i8 = this.l;
            if (i7 > i8) {
                J((i8 - i5) - i3);
                throw InvalidProtocolBufferException.g();
            }
            this.k = i6;
            this.g = 0;
            this.i = 0;
            while (i4 < i) {
                long j = i - i4;
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } finally {
                    this.k += i4;
                    H();
                }
            }
            if (i4 >= i) {
                return;
            }
            int i9 = this.g;
            int i10 = i9 - this.i;
            this.i = i9;
            I(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.g;
                if (i11 <= i12) {
                    this.i = i11;
                    return;
                } else {
                    i10 += i12;
                    this.i = i12;
                    I(1);
                }
            }
        }

        public final boolean K(int i) throws IOException {
            int i2 = this.i;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 <= i4) {
                r6.g(bg.d(i, "refillBuffer() called when ", " bytes were already available in buffer"));
                return false;
            }
            int i5 = this.k;
            int i6 = this.c;
            if (i <= (i6 - i5) - i2 && i5 + i2 + i <= this.l) {
                byte[] bArr = this.f;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.k += i2;
                    this.g -= i2;
                    this.i = 0;
                }
                int i7 = this.g;
                int iMin = Math.min(bArr.length - i7, (i6 - this.k) - i7);
                FileInputStream fileInputStream = this.e;
                int i8 = fileInputStream.read(bArr, i7, iMin);
                if (i8 == 0 || i8 < -1 || i8 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
                }
                if (i8 > 0) {
                    this.g += i8;
                    H();
                    if (this.g >= i) {
                        return true;
                    }
                    return K(i);
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.j != i) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int c() {
            return this.k + this.i;
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final boolean d() {
            return this.i == this.g && !K(1);
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final void e(int i) {
            this.l = i;
            H();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int f(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.d();
            }
            int i2 = this.k + this.i + i;
            int i3 = this.l;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.g();
            }
            this.l = i2;
            H();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final boolean g() {
            return F() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final tr1.e h() throws IOException {
            int iE = E();
            int i = this.g;
            int i2 = this.i;
            int i3 = i - i2;
            byte[] bArr = this.f;
            if (iE <= i3 && iE > 0) {
                tr1.e eVarB = tr1.b(i2, bArr, iE);
                this.i += iE;
                return eVarB;
            }
            if (iE == 0) {
                return tr1.a;
            }
            byte[] bArrA = A(iE);
            if (bArrA != null) {
                return tr1.b(0, bArrA, bArrA.length);
            }
            int i4 = this.i;
            int i5 = this.g;
            int length = i5 - i4;
            this.k += i5;
            this.i = 0;
            this.g = 0;
            ArrayList<byte[]> arrayListB = B(iE - length);
            byte[] bArr2 = new byte[iE];
            System.arraycopy(bArr, i4, bArr2, 0, length);
            for (byte[] bArr3 : arrayListB) {
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            tr1.e eVar = tr1.a;
            return new tr1.e(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final double i() {
            return Double.longBitsToDouble(D());
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int j() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int k() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final long l() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final float m() {
            return Float.intBitsToFloat(C());
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int n() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final long o() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int p() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final long q() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int r() {
            int iE = E();
            return (-(iE & 1)) ^ (iE >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final long s() {
            return e.b(F());
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final String t() throws InvalidProtocolBufferException {
            int iE = E();
            byte[] bArr = this.f;
            if (iE > 0) {
                int i = this.g;
                int i2 = this.i;
                if (iE <= i - i2) {
                    String str = new String(bArr, i2, iE, p.a);
                    this.i += iE;
                    return str;
                }
            }
            if (iE == 0) {
                return "";
            }
            if (iE > this.g) {
                return new String(z(iE), p.a);
            }
            I(iE);
            String str2 = new String(bArr, this.i, iE, p.a);
            this.i += iE;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final String u() throws IOException {
            int iE = E();
            int i = this.i;
            int i2 = this.g;
            int i3 = i2 - i;
            byte[] bArrZ = this.f;
            if (iE <= i3 && iE > 0) {
                this.i = i + iE;
            } else {
                if (iE == 0) {
                    return "";
                }
                i = 0;
                if (iE <= i2) {
                    I(iE);
                    this.i = iE;
                } else {
                    bArrZ = z(iE);
                }
            }
            return Utf8.a.a(i, bArrZ, iE);
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int v() throws InvalidProtocolBufferException {
            if (d()) {
                this.j = 0;
                return 0;
            }
            int iE = E();
            this.j = iE;
            if ((iE >>> 3) != 0) {
                return iE;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final int w() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final long x() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.e
        public final boolean y(int i) throws InvalidProtocolBufferException {
            int iV;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.g - this.i;
                byte[] bArr = this.f;
                if (i4 >= 10) {
                    while (i3 < 10) {
                        int i5 = this.i;
                        this.i = i5 + 1;
                        if (bArr[i5] < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.c();
                }
                while (i3 < 10) {
                    if (this.i == this.g) {
                        I(1);
                    }
                    int i6 = this.i;
                    this.i = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.c();
                return true;
            }
            if (i2 == 1) {
                J(8);
                return true;
            }
            if (i2 == 2) {
                J(E());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.b();
                }
                J(4);
                return true;
            }
            do {
                iV = v();
                if (iV == 0) {
                    break;
                }
            } while (y(iV));
            a(((i >>> 3) << 3) | 4);
            return true;
        }

        public final byte[] z(int i) throws IOException {
            byte[] bArrA = A(i);
            if (bArrA != null) {
                return bArrA;
            }
            int i2 = this.i;
            int i3 = this.g;
            int length = i3 - i2;
            this.k += i3;
            this.i = 0;
            this.g = 0;
            ArrayList<byte[]> arrayListB = B(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f, i2, bArr, 0, length);
            for (byte[] bArr2 : arrayListB) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }
    }

    public static long b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract void a(int i);

    public abstract int c();

    public abstract boolean d();

    public abstract void e(int i);

    public abstract int f(int i);

    public abstract boolean g();

    public abstract tr1.e h();

    public abstract double i();

    public abstract int j();

    public abstract int k();

    public abstract long l();

    public abstract float m();

    public abstract int n();

    public abstract long o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract String t();

    public abstract String u();

    public abstract int v();

    public abstract int w();

    public abstract long x();

    public abstract boolean y(int i);
}
