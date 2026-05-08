package com.google.android.gms.internal.measurement;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.b0;
import defpackage.ka6;
import defpackage.oie;
import defpackage.r6;
import defpackage.r8i;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends ka6 {
    public static int J1(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            ka6 ka6Var = a.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            byte bA = r8i.a(j, bArr);
            ka6 ka6Var2 = a.a;
            if (i > -12 || bA > -65) {
                return -1;
            }
            return (bA << 8) ^ i;
        }
        if (i2 != 2) {
            b0.t();
            return 0;
        }
        byte bA2 = r8i.a(j, bArr);
        byte bA3 = r8i.a(j + 1, bArr);
        ka6 ka6Var3 = a.a;
        if (i > -12 || bA2 > -65 || bA3 > -65) {
            return -1;
        }
        return (bA3 << 16) ^ ((bA2 << 8) ^ i);
    }

    @Override // defpackage.ka6
    public final int A1(String str, byte[] bArr, int i, int i2) {
        long j;
        long j2;
        long j3;
        int i3;
        char cCharAt;
        long j4 = i;
        long j5 = ((long) i2) + j4;
        int length = str.length();
        if (length > i2 || bArr.length - i2 < i) {
            char cCharAt2 = str.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(cCharAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            j = 1;
            if (i4 >= length || (cCharAt = str.charAt(i4)) >= 128) {
                break;
            }
            r8i.e(bArr, j4, (byte) cCharAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char cCharAt3 = str.charAt(i4);
            if (cCharAt3 < 128 && j4 < j5) {
                r8i.e(bArr, j4, (byte) cCharAt3);
                j3 = j5;
                j2 = j;
                j4 += j;
            } else if (cCharAt3 >= 2048 || j4 > j5 - 2) {
                j2 = j;
                if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j4 > j5 - 3) {
                    j3 = j5;
                    if (j4 > j3 - 4) {
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt3, str.charAt(i3)))) {
                            throw new zzit(i4, length);
                        }
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(cCharAt3);
                        sb2.append(" at index ");
                        sb2.append(j4);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    int i5 = i4 + 1;
                    if (i5 != length) {
                        char cCharAt4 = str.charAt(i5);
                        if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                            int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                            r8i.e(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                            r8i.e(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                            long j6 = j4 + 3;
                            r8i.e(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                            j4 += 4;
                            r8i.e(bArr, j6, (byte) ((codePoint & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                            i4 = i5;
                        } else {
                            i4 = i5;
                        }
                    }
                    throw new zzit(i4 - 1, length);
                }
                r8i.e(bArr, j4, (byte) ((cCharAt3 >>> '\f') | 480));
                long j7 = j4 + 2;
                j3 = j5;
                r8i.e(bArr, j4 + j2, (byte) (((cCharAt3 >>> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                j4 += 3;
                r8i.e(bArr, j7, (byte) ((cCharAt3 & TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
            } else {
                j2 = j;
                long j8 = j4 + j2;
                r8i.e(bArr, j4, (byte) ((cCharAt3 >>> 6) | 960));
                j4 += 2;
                r8i.e(bArr, j8, (byte) ((cCharAt3 & TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                j3 = j5;
            }
            i4++;
            j = j2;
            j5 = j3;
        }
        return (int) j4;
    }

    @Override // defpackage.ka6
    public final int B1(byte[] bArr, int i, int i2) {
        int i3;
        if ((i | i2 | (bArr.length - i2)) < 0) {
            r6.i("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            return 0;
        }
        long j = i;
        int i4 = (int) (((long) i2) - j);
        if (i4 >= 16) {
            i3 = 0;
            long j2 = j;
            while (true) {
                if (i3 >= i4) {
                    i3 = i4;
                    break;
                }
                long j3 = j2 + 1;
                if (r8i.a(j2, bArr) < 0) {
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
            byte b = 0;
            while (true) {
                if (i5 <= 0) {
                    break;
                }
                long j5 = j4 + 1;
                byte bA = r8i.a(j4, bArr);
                if (bA < 0) {
                    b = bA;
                    j4 = j5;
                    break;
                }
                i5--;
                b = bA;
                j4 = j5;
            }
            if (i5 == 0) {
                return 0;
            }
            int i6 = i5 - 1;
            if (b < -32) {
                if (i6 == 0) {
                    return b;
                }
                i5 -= 2;
                if (b < -62) {
                    return -1;
                }
                long j6 = j4 + 1;
                if (r8i.a(j4, bArr) > -65) {
                    return -1;
                }
                j4 = j6;
            } else if (b < -16) {
                if (i6 < 2) {
                    return J1(j4, bArr, b, i6);
                }
                i5 -= 3;
                long j7 = j4 + 1;
                byte bA2 = r8i.a(j4, bArr);
                if (bA2 > -65) {
                    return -1;
                }
                if (b == -32 && bA2 < -96) {
                    return -1;
                }
                if (b == -19 && bA2 >= -96) {
                    return -1;
                }
                j4 += 2;
                if (r8i.a(j7, bArr) > -65) {
                    return -1;
                }
            } else {
                if (i6 < 3) {
                    return J1(j4, bArr, b, i6);
                }
                i5 -= 4;
                long j8 = j4 + 1;
                byte bA3 = r8i.a(j4, bArr);
                if (bA3 > -65) {
                    return -1;
                }
                if ((((bA3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                long j9 = 2 + j4;
                if (r8i.a(j8, bArr) > -65) {
                    return -1;
                }
                j4 += 3;
                if (r8i.a(j9, bArr) > -65) {
                    return -1;
                }
            }
        }
    }

    @Override // defpackage.ka6
    public final String D1(int i, byte[] bArr, int i2) throws zzfw {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            r6.i("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte bA = r8i.a(i, bArr);
            if (bA < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) bA;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte bA2 = r8i.a(i, bArr);
            if (bA2 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) bA2;
                while (i6 < i3) {
                    byte bA3 = r8i.a(i6, bArr);
                    if (bA3 < 0) {
                        break;
                    }
                    i6++;
                    cArr[i7] = (char) bA3;
                    i7++;
                }
                i5 = i7;
                i = i6;
            } else if (bA2 < -32) {
                if (i6 >= i3) {
                    throw zzfw.d();
                }
                i += 2;
                oie.p(bA2, r8i.a(i6, bArr), cArr, i5);
                i5++;
            } else if (bA2 < -16) {
                if (i6 >= i3 - 1) {
                    throw zzfw.d();
                }
                int i8 = i + 2;
                i += 3;
                oie.o(bA2, r8i.a(i6, bArr), r8i.a(i8, bArr), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw zzfw.d();
                }
                byte bA4 = r8i.a(i6, bArr);
                int i9 = i + 3;
                byte bA5 = r8i.a(i + 2, bArr);
                i += 4;
                oie.n(bA2, bA4, bA5, r8i.a(i9, bArr), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }
}
