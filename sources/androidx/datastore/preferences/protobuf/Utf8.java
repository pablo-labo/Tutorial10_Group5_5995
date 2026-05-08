package androidx.datastore.preferences.protobuf;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.f40;
import defpackage.f7g;
import defpackage.k20;
import defpackage.r6;
import defpackage.s6;

/* JADX INFO: loaded from: classes.dex */
public final class Utf8 {
    public static final b a;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super(k20.l("Unpaired surrogate at index ", i, i2, " of "));
        }
    }

    public static class a {
        public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (!d(b2)) {
                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !d(b3) && !d(b4)) {
                    int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                    cArr[i] = (char) ((i2 >>> 10) + 55232);
                    cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.a();
        }

        public static void b(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b < -62 || d(b2)) {
                throw InvalidProtocolBufferException.a();
            }
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }

        public static void c(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || d(b3)))) {
                throw InvalidProtocolBufferException.a();
            }
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }

        public static boolean d(byte b) {
            return b > -65;
        }
    }

    public static abstract class b {
        public abstract String a(int i, byte[] bArr, int i2);

        public abstract int b(String str, byte[] bArr, int i, int i2);

        public abstract int c(int i, byte[] bArr, int i2);
    }

    public static final class c extends b {
        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public final String a(int i, byte[] bArr, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                r6.i("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                return null;
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (b < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = bArr[i8];
                        if (b3 < 0) {
                            break;
                        }
                        i8++;
                        cArr[i7] = (char) b3;
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (b2 < -32) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.a();
                    }
                    i += 2;
                    a.b(b2, bArr[i6], cArr, i5);
                    i5++;
                } else if (b2 < -16) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.a();
                    }
                    int i9 = i + 2;
                    i += 3;
                    a.c(b2, bArr[i6], bArr[i9], cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.a();
                    }
                    byte b4 = bArr[i6];
                    int i10 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    a.a(b2, b4, b5, bArr[i10], cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public final int b(String str, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            char cCharAt;
            int length = str.length();
            int i5 = i2 + i;
            int i6 = 0;
            while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
                bArr[i4] = (byte) cCharAt;
                i6++;
            }
            if (i6 == length) {
                return i + length;
            }
            int i7 = i + i6;
            while (i6 < length) {
                char cCharAt2 = str.charAt(i6);
                if (cCharAt2 < 128 && i7 < i5) {
                    bArr[i7] = (byte) cCharAt2;
                    i7++;
                } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                    i7 += 2;
                    bArr[i8] = (byte) ((cCharAt2 & TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                        if (i7 > i5 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i6, length);
                            }
                            s6.f(cCharAt2, i7);
                            return 0;
                        }
                        int i9 = i6 + 1;
                        if (i9 != str.length()) {
                            char cCharAt3 = str.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                                int i10 = i7 + 3;
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                                i7 += 4;
                                bArr[i10] = (byte) ((codePoint & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                                i6 = i9;
                            } else {
                                i6 = i9;
                            }
                        }
                        throw new UnpairedSurrogateException(i6 - 1, length);
                    }
                    bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i11 = i7 + 2;
                    bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    i7 += 3;
                    bArr[i11] = (byte) ((cCharAt2 & TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                }
                i6++;
            }
            return i7;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public final int c(int i, byte[] bArr, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    i = i3;
                } else if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b < -62) {
                        return -1;
                    }
                    i += 2;
                    if (bArr[i3] > -65) {
                        return -1;
                    }
                } else if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return Utf8.a(i3, bArr, i2);
                    }
                    int i4 = i + 2;
                    byte b2 = bArr[i3];
                    if (b2 > -65) {
                        return -1;
                    }
                    if (b == -32 && b2 < -96) {
                        return -1;
                    }
                    if (b == -19 && b2 >= -96) {
                        return -1;
                    }
                    i += 3;
                    if (bArr[i4] > -65) {
                        return -1;
                    }
                } else {
                    if (i3 >= i2 - 2) {
                        return Utf8.a(i3, bArr, i2);
                    }
                    int i5 = i + 2;
                    byte b3 = bArr[i3];
                    if (b3 > -65) {
                        return -1;
                    }
                    if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i6 = i + 3;
                    if (bArr[i5] > -65) {
                        return -1;
                    }
                    i += 4;
                    if (bArr[i6] > -65) {
                        return -1;
                    }
                }
            }
            return 0;
        }
    }

    public static final class d extends b {
        public static int d(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                b bVar = Utf8.a;
                if (i > -12) {
                    return -1;
                }
                return i;
            }
            if (i2 == 1) {
                return Utf8.c(i, f7g.f(j, bArr));
            }
            if (i2 == 2) {
                return Utf8.d(i, f7g.f(j, bArr), f7g.f(j + 1, bArr));
            }
            defpackage.b0.t();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public final String a(int i, byte[] bArr, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                r6.i("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                return null;
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte bF = f7g.f(i, bArr);
                if (bF < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) bF;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte bF2 = f7g.f(i, bArr);
                if (bF2 >= 0) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) bF2;
                    while (i6 < i3) {
                        byte bF3 = f7g.f(i6, bArr);
                        if (bF3 < 0) {
                            break;
                        }
                        i6++;
                        cArr[i7] = (char) bF3;
                        i7++;
                    }
                    i5 = i7;
                    i = i6;
                } else if (bF2 < -32) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.a();
                    }
                    i += 2;
                    a.b(bF2, f7g.f(i6, bArr), cArr, i5);
                    i5++;
                } else if (bF2 < -16) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.a();
                    }
                    int i8 = i + 2;
                    i += 3;
                    a.c(bF2, f7g.f(i6, bArr), f7g.f(i8, bArr), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.a();
                    }
                    byte bF4 = f7g.f(i6, bArr);
                    int i9 = i + 3;
                    byte bF5 = f7g.f(i + 2, bArr);
                    i += 4;
                    a.a(bF2, bF4, bF5, f7g.f(i9, bArr), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public final int b(String str, byte[] bArr, int i, int i2) {
            long j;
            long j2;
            long j3;
            int i3;
            char cCharAt;
            long j4 = i;
            long j5 = ((long) i2) + j4;
            int length = str.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (cCharAt = str.charAt(i4)) >= 128) {
                    break;
                }
                f7g.j(bArr, j4, (byte) cCharAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 < 128 && j4 < j5) {
                    f7g.j(bArr, j4, (byte) cCharAt2);
                    j3 = j5;
                    j2 = j;
                    j4 += j;
                } else if (cCharAt2 >= 2048 || j4 > j5 - 2) {
                    j2 = j;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                        j3 = j5;
                        if (j4 > j3 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i4, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = str.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                f7g.j(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                f7g.j(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                                long j6 = j4 + 3;
                                f7g.j(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                                j4 += 4;
                                f7g.j(bArr, j6, (byte) ((codePoint & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new UnpairedSurrogateException(i4 - 1, length);
                    }
                    f7g.j(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j7 = j4 + 2;
                    j3 = j5;
                    f7g.j(bArr, j4 + j2, (byte) (((cCharAt2 >>> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                    j4 += 3;
                    f7g.j(bArr, j7, (byte) ((cCharAt2 & TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                } else {
                    j2 = j;
                    long j8 = j4 + j2;
                    f7g.j(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                    j4 += 2;
                    f7g.j(bArr, j8, (byte) ((cCharAt2 & TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                    j3 = j5;
                }
                i4++;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public final int c(int i, byte[] bArr, int i2) {
            int i3;
            if ((i | i2 | (bArr.length - i2)) < 0) {
                r6.i("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                return 0;
            }
            long j = i;
            int i4 = (int) (((long) i2) - j);
            if (i4 >= 16) {
                long j2 = j;
                i3 = 0;
                while (true) {
                    if (i3 >= i4) {
                        i3 = i4;
                        break;
                    }
                    long j3 = j2 + 1;
                    if (f7g.f(j2, bArr) < 0) {
                        break;
                    }
                    i3++;
                    j2 = j3;
                }
            } else {
                i3 = 0;
            }
            int i5 = i4 - i3;
            long j4 = j + ((long) i3);
            while (true) {
                byte bF = 0;
                while (true) {
                    if (i5 <= 0) {
                        break;
                    }
                    long j5 = j4 + 1;
                    bF = f7g.f(j4, bArr);
                    if (bF < 0) {
                        j4 = j5;
                        break;
                    }
                    i5--;
                    j4 = j5;
                }
                if (i5 == 0) {
                    return 0;
                }
                int i6 = i5 - 1;
                if (bF < -32) {
                    if (i6 == 0) {
                        return bF;
                    }
                    i5 -= 2;
                    if (bF < -62) {
                        return -1;
                    }
                    long j6 = j4 + 1;
                    if (f7g.f(j4, bArr) > -65) {
                        return -1;
                    }
                    j4 = j6;
                } else if (bF < -16) {
                    if (i6 < 2) {
                        return d(j4, bArr, bF, i6);
                    }
                    i5 -= 3;
                    long j7 = j4 + 1;
                    byte bF2 = f7g.f(j4, bArr);
                    if (bF2 > -65) {
                        return -1;
                    }
                    if (bF == -32 && bF2 < -96) {
                        return -1;
                    }
                    if (bF == -19 && bF2 >= -96) {
                        return -1;
                    }
                    j4 += 2;
                    if (f7g.f(j7, bArr) > -65) {
                        return -1;
                    }
                } else {
                    if (i6 < 3) {
                        return d(j4, bArr, bF, i6);
                    }
                    i5 -= 4;
                    long j8 = j4 + 1;
                    byte bF3 = f7g.f(j4, bArr);
                    if (bF3 > -65) {
                        return -1;
                    }
                    if ((((bF3 + 112) + (bF << 28)) >> 30) != 0) {
                        return -1;
                    }
                    long j9 = 2 + j4;
                    if (f7g.f(j8, bArr) > -65) {
                        return -1;
                    }
                    j4 += 3;
                    if (f7g.f(j9, bArr) > -65) {
                        return -1;
                    }
                }
            }
        }
    }

    static {
        a = (f7g.f && f7g.e && !f40.a()) ? new d() : new c();
    }

    public static int a(int i, byte[] bArr, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i3 == 1) {
            return c(b2, bArr[i]);
        }
        if (i3 == 2) {
            return d(b2, bArr[i], bArr[i + 1]);
        }
        defpackage.b0.t();
        return 0;
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new UnpairedSurrogateException(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public static int c(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int d(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
