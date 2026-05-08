package defpackage;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.measurement.zzfw;

/* JADX INFO: loaded from: classes2.dex */
public final class zuh {
    public static int a(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int b(int i, byte[] bArr, int i2, int i3, yuh yuhVar) throws zzfw {
        if ((i >>> 3) == 0) {
            throw new zzfw("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return j(bArr, i2, yuhVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return i(bArr, i2, yuhVar) + yuhVar.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new zzfw("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = i(bArr, i2, yuhVar);
            i6 = yuhVar.a;
            if (i6 == i5) {
                break;
            }
            i2 = b(i6, bArr, i2, i3, yuhVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw zzfw.c();
        }
        return i2;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, e0i<?> e0iVar, yuh yuhVar) {
        gzh gzhVar = (gzh) e0iVar;
        int i4 = i(bArr, i2, yuhVar);
        gzhVar.b(yuhVar.a);
        while (i4 < i3) {
            int i5 = i(bArr, i4, yuhVar);
            if (i != yuhVar.a) {
                break;
            }
            i4 = i(bArr, i5, yuhVar);
            gzhVar.b(yuhVar.a);
        }
        return i4;
    }

    public static int d(int i, byte[] bArr, int i2, int i3, x7i x7iVar, yuh yuhVar) throws zzfw {
        if ((i >>> 3) == 0) {
            throw new zzfw("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iJ = j(bArr, i2, yuhVar);
            x7iVar.a(i, Long.valueOf(yuhVar.b));
            return iJ;
        }
        if (i4 == 1) {
            x7iVar.a(i, Long.valueOf(k(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int i5 = i(bArr, i2, yuhVar);
            int i6 = yuhVar.a;
            if (i6 < 0) {
                throw zzfw.b();
            }
            if (i6 > bArr.length - i5) {
                throw zzfw.a();
            }
            if (i6 == 0) {
                x7iVar.a(i, fvh.a);
            } else {
                x7iVar.a(i, fvh.f(i5, bArr, i6));
            }
            return i5 + i6;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzfw("Protocol message contained an invalid tag (zero).");
            }
            x7iVar.a(i, Integer.valueOf(a(i2, bArr)));
            return i2 + 4;
        }
        x7i x7iVar2 = new x7i();
        int i7 = (i & (-8)) | 4;
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int i9 = i(bArr, i2, yuhVar);
            int i10 = yuhVar.a;
            if (i10 == i7) {
                i8 = i10;
                i2 = i9;
                break;
            }
            i2 = d(i10, bArr, i9, i3, x7iVar2, yuhVar);
            i8 = i10;
        }
        if (i2 > i3 || i8 != i7) {
            throw zzfw.c();
        }
        x7iVar.a(i, x7iVar2);
        return i2;
    }

    public static int e(int i, byte[] bArr, int i2, yuh yuhVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            yuhVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            yuhVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            yuhVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            yuhVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                yuhVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int f(w5i<?> w5iVar, int i, byte[] bArr, int i2, int i3, e0i<?> e0iVar, yuh yuhVar) throws zzfw {
        int iH = h(w5iVar, bArr, i2, i3, yuhVar);
        e0iVar.add(yuhVar.c);
        while (iH < i3) {
            int i4 = i(bArr, iH, yuhVar);
            if (i != yuhVar.a) {
                break;
            }
            iH = h(w5iVar, bArr, i4, i3, yuhVar);
            e0iVar.add(yuhVar.c);
        }
        return iH;
    }

    public static int g(w5i w5iVar, byte[] bArr, int i, int i2, int i3, yuh yuhVar) {
        e4i e4iVar = (e4i) w5iVar;
        Object objF = e4iVar.f();
        int iL = e4iVar.l(objF, bArr, i, i2, i3, yuhVar);
        e4iVar.b(objF);
        yuhVar.c = objF;
        return iL;
    }

    public static int h(w5i w5iVar, byte[] bArr, int i, int i2, yuh yuhVar) throws zzfw {
        int iE = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iE = e(i3, bArr, iE, yuhVar);
            i3 = yuhVar.a;
        }
        int i4 = iE;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzfw.a();
        }
        Object objF = w5iVar.f();
        int i5 = i4 + i3;
        w5iVar.d(objF, bArr, i4, i5, yuhVar);
        w5iVar.b(objF);
        yuhVar.c = objF;
        return i5;
    }

    public static int i(byte[] bArr, int i, yuh yuhVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return e(b, bArr, i2, yuhVar);
        }
        yuhVar.a = b;
        return i2;
    }

    public static int j(byte[] bArr, int i, yuh yuhVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            yuhVar.b = j;
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
        yuhVar.b = j2;
        return i3;
    }

    public static long k(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int l(byte[] bArr, int i, yuh yuhVar) throws zzfw {
        int i2 = i(bArr, i, yuhVar);
        int i3 = yuhVar.a;
        if (i3 < 0) {
            throw zzfw.b();
        }
        if (i3 == 0) {
            yuhVar.c = "";
            return i2;
        }
        yuhVar.c = new String(bArr, i2, i3, mzh.a);
        return i2 + i3;
    }

    public static int m(byte[] bArr, int i, yuh yuhVar) throws zzfw {
        int i2 = i(bArr, i, yuhVar);
        int i3 = yuhVar.a;
        if (i3 < 0) {
            throw zzfw.b();
        }
        if (i3 == 0) {
            yuhVar.c = "";
            return i2;
        }
        yuhVar.c = a.a.D1(i2, bArr, i3);
        return i2 + i3;
    }

    public static int n(byte[] bArr, int i, yuh yuhVar) throws zzfw {
        int i2 = i(bArr, i, yuhVar);
        int i3 = yuhVar.a;
        if (i3 < 0) {
            throw zzfw.b();
        }
        if (i3 > bArr.length - i2) {
            throw zzfw.a();
        }
        if (i3 == 0) {
            yuhVar.c = fvh.a;
            return i2;
        }
        yuhVar.c = fvh.f(i2, bArr, i3);
        return i2 + i3;
    }
}
