package com.google.android.gms.internal.measurement;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ka6;
import defpackage.oie;
import defpackage.r6;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends ka6 {
    @Override // defpackage.ka6
    public final int A1(String str, byte[] bArr, int i, int i2) {
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
                            throw new zzit(i6, length);
                        }
                        StringBuilder sb = new StringBuilder(37);
                        sb.append("Failed writing ");
                        sb.append(cCharAt2);
                        sb.append(" at index ");
                        sb.append(i7);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
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
                    throw new zzit(i6 - 1, length);
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

    @Override // defpackage.ka6
    public final int B1(byte[] bArr, int i, int i2) {
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
                    return a.b(i3, bArr, i2);
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
                    return a.b(i3, bArr, i2);
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
                    throw zzfw.d();
                }
                i += 2;
                oie.p(b2, bArr[i6], cArr, i5);
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i3 - 1) {
                    throw zzfw.d();
                }
                int i9 = i + 2;
                i += 3;
                oie.o(b2, bArr[i6], bArr[i9], cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw zzfw.d();
                }
                byte b4 = bArr[i6];
                int i10 = i + 3;
                byte b5 = bArr[i + 2];
                i += 4;
                oie.n(b2, b4, b5, bArr[i10], cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }
}
