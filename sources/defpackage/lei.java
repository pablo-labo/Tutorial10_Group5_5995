package defpackage;

import com.google.android.gms.internal.firebase_remote_config.zzhq;

/* JADX INFO: loaded from: classes2.dex */
public final class lei extends ka6 {
    public static int J1(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            ka6 ka6Var = cei.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            byte bA = rdi.a(j, bArr);
            ka6 ka6Var2 = cei.a;
            if (i > -12 || bA > -65) {
                return -1;
            }
            return (bA << 8) ^ i;
        }
        if (i2 != 2) {
            b0.t();
            return 0;
        }
        byte bA2 = rdi.a(j, bArr);
        byte bA3 = rdi.a(j + 1, bArr);
        ka6 ka6Var3 = cei.a;
        if (i > -12 || bA2 > -65 || bA3 > -65) {
            return -1;
        }
        return (bA3 << 16) ^ ((bA2 << 8) ^ i);
    }

    @Override // defpackage.ka6
    public final int E1(int i, byte[] bArr, int i2) {
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
                if (rdi.a(j2, bArr) < 0) {
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
            byte bA = 0;
            while (true) {
                if (i5 <= 0) {
                    break;
                }
                long j5 = j4 + 1;
                bA = rdi.a(j4, bArr);
                if (bA < 0) {
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
            if (bA < -32) {
                if (i6 == 0) {
                    return bA;
                }
                i5 -= 2;
                if (bA < -62) {
                    return -1;
                }
                long j6 = j4 + 1;
                if (rdi.a(j4, bArr) > -65) {
                    return -1;
                }
                j4 = j6;
            } else if (bA < -16) {
                if (i6 < 2) {
                    return J1(j4, bArr, bA, i6);
                }
                i5 -= 3;
                long j7 = j4 + 1;
                byte bA2 = rdi.a(j4, bArr);
                if (bA2 > -65) {
                    return -1;
                }
                if (bA == -32 && bA2 < -96) {
                    return -1;
                }
                if (bA == -19 && bA2 >= -96) {
                    return -1;
                }
                j4 += 2;
                if (rdi.a(j7, bArr) > -65) {
                    return -1;
                }
            } else {
                if (i6 < 3) {
                    return J1(j4, bArr, bA, i6);
                }
                i5 -= 4;
                long j8 = j4 + 1;
                byte bA3 = rdi.a(j4, bArr);
                if (bA3 > -65) {
                    return -1;
                }
                if ((((bA3 + 112) + (bA << 28)) >> 30) != 0) {
                    return -1;
                }
                long j9 = 2 + j4;
                if (rdi.a(j8, bArr) > -65) {
                    return -1;
                }
                j4 += 3;
                if (rdi.a(j9, bArr) > -65) {
                    return -1;
                }
            }
        }
    }

    @Override // defpackage.ka6
    public final String I1(int i, byte[] bArr, int i2) throws zzhq {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            r6.i("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte bA = rdi.a(i, bArr);
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
            byte bA2 = rdi.a(i, bArr);
            if (bA2 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) bA2;
                while (i6 < i3) {
                    byte bA3 = rdi.a(i6, bArr);
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
                    throw zzhq.h();
                }
                i += 2;
                n7g.f(bA2, rdi.a(i6, bArr), cArr, i5);
                i5++;
            } else if (bA2 < -16) {
                if (i6 >= i3 - 1) {
                    throw zzhq.h();
                }
                int i8 = i + 2;
                i += 3;
                n7g.e(bA2, rdi.a(i6, bArr), rdi.a(i8, bArr), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw zzhq.h();
                }
                byte bA4 = rdi.a(i6, bArr);
                int i9 = i + 3;
                byte bA5 = rdi.a(i + 2, bArr);
                i += 4;
                n7g.d(bA2, bA4, bA5, rdi.a(i9, bArr), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }
}
