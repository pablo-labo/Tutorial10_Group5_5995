package defpackage;

import com.google.android.gms.internal.firebase_remote_config.zzhq;

/* JADX INFO: loaded from: classes2.dex */
public final class vzh {
    public static int a(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int b(int i, byte[] bArr, int i2, int i3, d0i d0iVar) throws zzhq {
        if ((i >>> 3) == 0) {
            throw zzhq.e();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return j(bArr, i2, d0iVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return i(bArr, i2, d0iVar) + d0iVar.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw zzhq.e();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = i(bArr, i2, d0iVar);
            i6 = d0iVar.a;
            if (i6 == i5) {
                break;
            }
            i2 = b(i6, bArr, i2, i3, d0iVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw zzhq.g();
        }
        return i2;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, s5i<?> s5iVar, d0i d0iVar) {
        k5i k5iVar = (k5i) s5iVar;
        int i4 = i(bArr, i2, d0iVar);
        k5iVar.b(d0iVar.a);
        while (i4 < i3) {
            int i5 = i(bArr, i4, d0iVar);
            if (i != d0iVar.a) {
                break;
            }
            i4 = i(bArr, i5, d0iVar);
            k5iVar.b(d0iVar.a);
        }
        return i4;
    }

    public static int d(int i, byte[] bArr, int i2, int i3, kdi kdiVar, d0i d0iVar) throws zzhq {
        if ((i >>> 3) == 0) {
            throw zzhq.e();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iJ = j(bArr, i2, d0iVar);
            kdiVar.a(i, Long.valueOf(d0iVar.b));
            return iJ;
        }
        if (i4 == 1) {
            kdiVar.a(i, Long.valueOf(k(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int i5 = i(bArr, i2, d0iVar);
            int i6 = d0iVar.a;
            if (i6 < 0) {
                throw zzhq.c();
            }
            if (i6 > bArr.length - i5) {
                throw zzhq.b();
            }
            if (i6 == 0) {
                kdiVar.a(i, h0i.a);
            } else {
                kdiVar.a(i, h0i.b(i5, bArr, i6));
            }
            return i5 + i6;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzhq.e();
            }
            kdiVar.a(i, Integer.valueOf(a(i2, bArr)));
            return i2 + 4;
        }
        kdi kdiVar2 = new kdi();
        int i7 = (i & (-8)) | 4;
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int i9 = i(bArr, i2, d0iVar);
            i8 = d0iVar.a;
            if (i8 == i7) {
                i2 = i9;
                break;
            }
            i2 = d(i8, bArr, i9, i3, kdiVar2, d0iVar);
        }
        if (i2 > i3 || i8 != i7) {
            throw zzhq.g();
        }
        kdiVar.a(i, kdiVar2);
        return i2;
    }

    public static int e(int i, byte[] bArr, int i2, d0i d0iVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            d0iVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            d0iVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            d0iVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            d0iVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                d0iVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int f(cbi<?> cbiVar, int i, byte[] bArr, int i2, int i3, s5i<?> s5iVar, d0i d0iVar) throws zzhq {
        int iH = h(cbiVar, bArr, i2, i3, d0iVar);
        s5iVar.add(d0iVar.c);
        while (iH < i3) {
            int i4 = i(bArr, iH, d0iVar);
            if (i != d0iVar.a) {
                break;
            }
            iH = h(cbiVar, bArr, i4, i3, d0iVar);
            s5iVar.add(d0iVar.c);
        }
        return iH;
    }

    public static int g(cbi cbiVar, byte[] bArr, int i, int i2, int i3, d0i d0iVar) {
        e9i e9iVar = (e9i) cbiVar;
        Object objA = e9iVar.a();
        int iK = e9iVar.k(objA, bArr, i, i2, i3, d0iVar);
        e9iVar.f(objA);
        d0iVar.c = objA;
        return iK;
    }

    public static int h(cbi cbiVar, byte[] bArr, int i, int i2, d0i d0iVar) throws zzhq {
        int iE = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iE = e(i3, bArr, iE, d0iVar);
            i3 = d0iVar.a;
        }
        int i4 = iE;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzhq.b();
        }
        Object objA = cbiVar.a();
        int i5 = i4 + i3;
        cbiVar.e(objA, bArr, i4, i5, d0iVar);
        cbiVar.f(objA);
        d0iVar.c = objA;
        return i5;
    }

    public static int i(byte[] bArr, int i, d0i d0iVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return e(b, bArr, i2, d0iVar);
        }
        d0iVar.a = b;
        return i2;
    }

    public static int j(byte[] bArr, int i, d0i d0iVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            d0iVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        d0iVar.b = j2;
        return i3;
    }

    public static long k(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int l(byte[] bArr, int i, d0i d0iVar) throws zzhq {
        int i2 = i(bArr, i, d0iVar);
        int i3 = d0iVar.a;
        if (i3 < 0) {
            throw zzhq.c();
        }
        if (i3 == 0) {
            d0iVar.c = "";
            return i2;
        }
        d0iVar.c = new String(bArr, i2, i3, p5i.a);
        return i2 + i3;
    }

    public static int m(byte[] bArr, int i, d0i d0iVar) throws zzhq {
        int i2 = i(bArr, i, d0iVar);
        int i3 = d0iVar.a;
        if (i3 < 0) {
            throw zzhq.c();
        }
        if (i3 == 0) {
            d0iVar.c = "";
            return i2;
        }
        d0iVar.c = cei.a.I1(i2, bArr, i3);
        return i2 + i3;
    }

    public static int n(byte[] bArr, int i, d0i d0iVar) throws zzhq {
        int i2 = i(bArr, i, d0iVar);
        int i3 = d0iVar.a;
        if (i3 < 0) {
            throw zzhq.c();
        }
        if (i3 > bArr.length - i2) {
            throw zzhq.b();
        }
        if (i3 == 0) {
            d0iVar.c = h0i.a;
            return i2;
        }
        d0iVar.c = h0i.b(i2, bArr, i3);
        return i2 + i3;
    }
}
