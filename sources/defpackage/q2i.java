package defpackage;

import com.google.android.gms.internal.firebase_remote_config.zzhq;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class q2i extends a2i {
    public final InputStream e;
    public final byte[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l = Integer.MAX_VALUE;

    public q2i(InputStream inputStream) {
        Charset charset = p5i.a;
        if (inputStream == null) {
            ja.k("input");
            throw null;
        }
        this.e = inputStream;
        this.f = new byte[4096];
        this.g = 0;
        this.i = 0;
        this.k = 0;
    }

    public final void A(int i) throws zzhq {
        InputStream inputStream = this.e;
        int i2 = this.g;
        int i3 = this.i;
        if (i <= i2 - i3 && i >= 0) {
            this.i = i3 + i;
            return;
        }
        if (i < 0) {
            throw zzhq.c();
        }
        int i4 = this.k;
        int i5 = i4 + i3 + i;
        int i6 = this.l;
        if (i5 > i6) {
            A((i6 - i4) - i3);
            throw zzhq.b();
        }
        this.k = i4 + i3;
        int i7 = i2 - i3;
        this.g = 0;
        this.i = 0;
        while (i7 < i) {
            long j = i - i7;
            try {
                long jSkip = inputStream.skip(j);
                if (jSkip >= 0 && jSkip <= j) {
                    if (jSkip == 0) {
                        break;
                    } else {
                        i7 += (int) jSkip;
                    }
                } else {
                    String strValueOf = String.valueOf(inputStream.getClass());
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 92);
                    sb.append(strValueOf);
                    sb.append("#skip returned invalid result: ");
                    sb.append(jSkip);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                }
            } finally {
                this.k += i7;
                L();
            }
        }
        if (i7 >= i) {
            return;
        }
        int i8 = this.g;
        int i9 = i8 - this.i;
        this.i = i8;
        B(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.g;
            if (i10 <= i11) {
                this.i = i10;
                return;
            } else {
                i9 += i11;
                this.i = i11;
                B(1);
            }
        }
    }

    public final void B(int i) throws zzhq {
        if (C(i)) {
            return;
        }
        if (i <= (this.c - this.k) - this.i) {
            throw zzhq.b();
        }
        throw new zzhq("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean C(int i) throws IOException {
        do {
            int i2 = this.i;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 <= i4) {
                w20.n("refillBuffer() called when ", 77, i, " bytes were already available in buffer");
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
                InputStream inputStream = this.e;
                int i8 = inputStream.read(bArr, i7, iMin);
                if (i8 == 0 || i8 < -1 || i8 > bArr.length) {
                    String strValueOf = String.valueOf(inputStream.getClass());
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 91);
                    sb.append(strValueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(i8);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                }
                if (i8 > 0) {
                    this.g += i8;
                    L();
                }
            }
            return false;
        } while (this.g < i);
        return true;
    }

    public final byte[] D(int i) throws IOException {
        if (i == 0) {
            return p5i.b;
        }
        if (i < 0) {
            throw zzhq.c();
        }
        int i2 = this.k;
        int i3 = this.i;
        int i4 = i2 + i3 + i;
        if (i4 - this.c > 0) {
            throw new zzhq("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.l;
        if (i4 > i5) {
            A((i5 - i2) - i3);
            throw zzhq.b();
        }
        int i6 = this.g - i3;
        int i7 = i - i6;
        InputStream inputStream = this.e;
        if (i7 >= 4096 && i7 > inputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, this.i, bArr, 0, i6);
        this.k += this.g;
        this.i = 0;
        this.g = 0;
        while (i6 < i) {
            int i8 = inputStream.read(bArr, i6, i - i6);
            if (i8 == -1) {
                throw zzhq.b();
            }
            this.k += i8;
            i6 += i8;
        }
        return bArr;
    }

    public final ArrayList E(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.e.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw zzhq.b();
                }
                this.k += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final byte[] F(int i) throws IOException {
        byte[] bArrD = D(i);
        if (bArrD != null) {
            return bArrD;
        }
        int i2 = this.i;
        int i3 = this.g;
        int length = i3 - i2;
        this.k += i3;
        this.i = 0;
        this.g = 0;
        ArrayList<byte[]> arrayListE = E(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListE) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final long G() throws zzhq {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.i == this.g) {
                B(1);
            }
            int i2 = this.i;
            this.i = i2 + 1;
            byte b = this.f[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw zzhq.d();
    }

    public final int H() {
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

    public final long I() {
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

    public final int J() throws zzhq {
        int i = this.i;
        if (this.g - i < 4) {
            B(4);
            i = this.i;
        }
        this.i = i + 4;
        byte[] bArr = this.f;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long K() throws zzhq {
        int i = this.i;
        if (this.g - i < 8) {
            B(8);
            i = this.i;
        }
        this.i = i + 8;
        byte[] bArr = this.f;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final void L() {
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

    @Override // defpackage.a2i
    public final double a() {
        return Double.longBitsToDouble(K());
    }

    @Override // defpackage.a2i
    public final float b() {
        return Float.intBitsToFloat(J());
    }

    @Override // defpackage.a2i
    public final String c() throws zzhq {
        int iH = H();
        byte[] bArr = this.f;
        if (iH > 0) {
            int i = this.g;
            int i2 = this.i;
            if (iH <= i - i2) {
                String str = new String(bArr, i2, iH, p5i.a);
                this.i += iH;
                return str;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH > this.g) {
            return new String(F(iH), p5i.a);
        }
        B(iH);
        String str2 = new String(bArr, this.i, iH, p5i.a);
        this.i += iH;
        return str2;
    }

    @Override // defpackage.a2i
    public final int d(int i) throws zzhq {
        if (i < 0) {
            throw zzhq.c();
        }
        int i2 = this.k + this.i + i;
        int i3 = this.l;
        if (i2 > i3) {
            throw zzhq.b();
        }
        this.l = i2;
        L();
        return i3;
    }

    @Override // defpackage.a2i
    public final void e(int i) {
        this.l = i;
        L();
    }

    @Override // defpackage.a2i
    public final int h() throws zzhq {
        if (w()) {
            this.j = 0;
            return 0;
        }
        int iH = H();
        this.j = iH;
        if ((iH >>> 3) != 0) {
            return iH;
        }
        throw zzhq.e();
    }

    @Override // defpackage.a2i
    public final long i() {
        return I();
    }

    @Override // defpackage.a2i
    public final long j() {
        return I();
    }

    @Override // defpackage.a2i
    public final int k() {
        return H();
    }

    @Override // defpackage.a2i
    public final long l() {
        return K();
    }

    @Override // defpackage.a2i
    public final int m() {
        return J();
    }

    @Override // defpackage.a2i
    public final boolean n() {
        return I() != 0;
    }

    @Override // defpackage.a2i
    public final String o() throws IOException {
        int iH = H();
        int i = this.i;
        int i2 = this.g;
        int i3 = i2 - i;
        byte[] bArrF = this.f;
        if (iH <= i3 && iH > 0) {
            this.i = i + iH;
        } else {
            if (iH == 0) {
                return "";
            }
            i = 0;
            if (iH <= i2) {
                B(iH);
                this.i = iH;
            } else {
                bArrF = F(iH);
            }
        }
        return cei.a.I1(i, bArrF, iH);
    }

    @Override // defpackage.a2i
    public final t1i p() throws IOException {
        int iH = H();
        int i = this.g;
        int i2 = this.i;
        int i3 = i - i2;
        byte[] bArr = this.f;
        if (iH <= i3 && iH > 0) {
            t1i t1iVarB = h0i.b(i2, bArr, iH);
            this.i += iH;
            return t1iVarB;
        }
        if (iH == 0) {
            return h0i.a;
        }
        byte[] bArrD = D(iH);
        if (bArrD != null) {
            return h0i.b(0, bArrD, bArrD.length);
        }
        int i4 = this.i;
        int i5 = this.g;
        int length = i5 - i4;
        this.k += i5;
        this.i = 0;
        this.g = 0;
        ArrayList<byte[]> arrayListE = E(iH - length);
        byte[] bArr2 = new byte[iH];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListE) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        t1i t1iVar = h0i.a;
        return new t1i(bArr2);
    }

    @Override // defpackage.a2i
    public final int q() {
        return H();
    }

    @Override // defpackage.a2i
    public final int r() {
        return H();
    }

    @Override // defpackage.a2i
    public final int s() {
        return J();
    }

    @Override // defpackage.a2i
    public final long t() {
        return K();
    }

    @Override // defpackage.a2i
    public final int u() {
        return a2i.f(H());
    }

    @Override // defpackage.a2i
    public final long v() {
        return a2i.g(I());
    }

    @Override // defpackage.a2i
    public final boolean w() {
        return this.i == this.g && !C(1);
    }

    @Override // defpackage.a2i
    public final int x() {
        return this.k + this.i;
    }

    @Override // defpackage.a2i
    public final void y(int i) throws zzhq {
        if (this.j != i) {
            throw new zzhq("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.a2i
    public final boolean z(int i) throws zzhq {
        int iH;
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
                throw zzhq.d();
            }
            while (i3 < 10) {
                if (this.i == this.g) {
                    B(1);
                }
                int i6 = this.i;
                this.i = i6 + 1;
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
            A(H());
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
