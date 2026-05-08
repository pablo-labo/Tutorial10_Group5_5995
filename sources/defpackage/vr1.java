package defpackage;

import defpackage.zn1;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class vr1 implements Serializable, Comparable<vr1> {
    public static final vr1 c = new vr1(new byte[0]);
    private static final long serialVersionUID = 1;
    public transient int a;
    public transient String b;
    private final byte[] data;

    public static final class a {
        public static vr1 a(String str) {
            int i;
            char cCharAt;
            str.getClass();
            byte[] bArr = b.a;
            int length = str.length();
            while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                length--;
            }
            int i2 = (int) ((((long) length) * 6) / 8);
            byte[] bArrCopyOf = new byte[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i3 < length) {
                    char cCharAt2 = str.charAt(i3);
                    if ('A' <= cCharAt2 && cCharAt2 < '[') {
                        i = cCharAt2 - 'A';
                    } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                        i = cCharAt2 - 'G';
                    } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                        i = cCharAt2 + 4;
                    } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                        if (cCharAt2 != '/' && cCharAt2 != '_') {
                            if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                                break;
                            }
                            i3++;
                        } else {
                            i = 63;
                        }
                    } else {
                        i = 62;
                    }
                    i5 = (i5 << 6) | i;
                    i4++;
                    if (i4 % 4 == 0) {
                        bArrCopyOf[i6] = (byte) (i5 >> 16);
                        int i7 = i6 + 2;
                        bArrCopyOf[i6 + 1] = (byte) (i5 >> 8);
                        i6 += 3;
                        bArrCopyOf[i7] = (byte) i5;
                    }
                    i3++;
                } else {
                    int i8 = i4 % 4;
                    if (i8 != 1) {
                        if (i8 == 2) {
                            bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                            i6++;
                        } else if (i8 == 3) {
                            int i9 = i5 << 6;
                            int i10 = i6 + 1;
                            bArrCopyOf[i6] = (byte) (i9 >> 16);
                            i6 += 2;
                            bArrCopyOf[i10] = (byte) (i9 >> 8);
                        }
                        if (i6 != i2) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                        }
                    }
                }
            }
            bArrCopyOf = null;
            if (bArrCopyOf != null) {
                return new vr1(bArrCopyOf);
            }
            return null;
        }

        public static vr1 b(String str) {
            if (str.length() % 2 != 0) {
                h5.k("Unexpected hex string: ".concat(str));
                return null;
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (wg2.e(str.charAt(i2 + 1)) + (wg2.e(str.charAt(i2)) << 4));
            }
            return new vr1(bArr);
        }

        public static vr1 c(String str) {
            str.getClass();
            byte[] bytes = str.getBytes(a32.b);
            bytes.getClass();
            vr1 vr1Var = new vr1(bytes);
            vr1Var.b = str;
            return vr1Var;
        }

        public static vr1 d(byte[] bArr) {
            vr1 vr1Var = vr1.c;
            zn1.c cVar = k.a;
            int length = bArr.length;
            k.b(bArr.length, 0L, length);
            return new vr1(pyd.m(0, bArr, length));
        }
    }

    public vr1(byte[] bArr) {
        bArr.getClass();
        this.data = bArr;
    }

    public static int o(vr1 vr1Var, vr1 vr1Var2) {
        vr1Var.getClass();
        vr1Var2.getClass();
        return vr1Var.n(0, vr1Var2.p());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i = objectInputStream.readInt();
        if (i < 0) {
            h5.k(p6.c(i, "byteCount < 0: "));
            return;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                k20.n();
                return;
            }
            i2 += i3;
        }
        vr1 vr1Var = new vr1(bArr);
        Field declaredField = vr1.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, vr1Var.data);
    }

    public static int t(vr1 vr1Var, vr1 vr1Var2) {
        int i = k.b;
        vr1Var.getClass();
        vr1Var2.getClass();
        return vr1Var.s(i, vr1Var2.p());
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public static vr1 x(vr1 vr1Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = k.b;
        }
        return vr1Var.w(i, i2);
    }

    public final String A() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        byte[] bArrP = p();
        bArrP.getClass();
        String str2 = new String(bArrP, a32.b);
        this.b = str2;
        return str2;
    }

    public void B(zn1 zn1Var, int i) {
        zn1Var.write(this.data, 0, i);
    }

    public String a() {
        byte[] bArr = this.data;
        byte[] bArr2 = b.a;
        bArr.getClass();
        bArr2.getClass();
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr3[i2] = bArr2[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr2[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i5];
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr2[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, a32.b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(vr1 vr1Var) {
        vr1Var.getClass();
        int iH = h();
        int iH2 = vr1Var.h();
        int iMin = Math.min(iH, iH2);
        for (int i = 0; i < iMin; i++) {
            int iR = r(i) & 255;
            int iR2 = vr1Var.r(i) & 255;
            if (iR != iR2) {
                return iR < iR2 ? -1 : 1;
            }
        }
        if (iH == iH2) {
            return 0;
        }
        return iH < iH2 ? -1 : 1;
    }

    public vr1 e(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, h());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new vr1(bArrDigest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vr1) {
            vr1 vr1Var = (vr1) obj;
            int iH = vr1Var.h();
            byte[] bArr = this.data;
            if (iH == bArr.length && vr1Var.u(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public final byte[] f() {
        return this.data;
    }

    public int h() {
        return this.data.length;
    }

    public int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.data);
        this.a = iHashCode;
        return iHashCode;
    }

    public String m() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = wg2.b;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public int n(int i, byte[] bArr) {
        bArr.getClass();
        int length = this.data.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!k.a(iMax, 0, bArr.length, this.data, bArr)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] p() {
        return this.data;
    }

    public byte r(int i) {
        return this.data[i];
    }

    public int s(int i, byte[] bArr) {
        bArr.getClass();
        if (i == k.b) {
            i = h();
        }
        for (int iMin = Math.min(i, this.data.length - bArr.length); -1 < iMin; iMin--) {
            if (k.a(iMin, 0, bArr.length, this.data, bArr)) {
                return iMin;
            }
        }
        return -1;
    }

    public String toString() {
        byte b;
        int i;
        vr1 vr1Var = this;
        byte[] bArr = vr1Var.data;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (127 <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            j6g j6gVar = j6g.a;
                            i2 += 2;
                            i4 = i;
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 < 2048) {
                                if (i4 != 64) {
                                    break;
                                }
                            } else if (55296 > i9 || i9 >= 57344) {
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                    break;
                                }
                                i3 += i9 < 65536 ? 1 : 2;
                                j6g j6gVar2 = j6g.a;
                                i2 += 3;
                                i4 = i;
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 > 1114111) {
                                    if (i4 != 64) {
                                        break;
                                    }
                                } else if (55296 > i11 || i11 >= 57344) {
                                    if (i11 >= 65536) {
                                        i = i4 + 1;
                                        if (i4 == 64) {
                                            break;
                                        }
                                        if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                            break;
                                        }
                                        i3 += i11 < 65536 ? 1 : 2;
                                        j6g j6gVar3 = j6g.a;
                                        i2 += 4;
                                        i4 = i;
                                    } else if (i4 != 64) {
                                        break;
                                    }
                                } else if (i4 != 64) {
                                    break;
                                }
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if (i4 != 64) {
                break;
            }
        }
        i3 = -1;
        if (i3 != -1) {
            String strA = vr1Var.A();
            String strI = wve.I(wve.I(wve.I(strA.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strA.length()) {
                return ja.f(']', "[text=", strI);
            }
            return "[size=" + vr1Var.data.length + " text=" + strI + "…]";
        }
        if (vr1Var.data.length <= 64) {
            return "[hex=" + vr1Var.m() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(vr1Var.data.length);
        sb.append(" hex=");
        int iH = 64 == k.b ? vr1Var.h() : 64;
        byte[] bArr2 = vr1Var.data;
        if (iH > bArr2.length) {
            h5.k(k6.h(new StringBuilder("endIndex > length("), vr1Var.data.length, ')'));
            return null;
        }
        if (iH < 0) {
            l5.q("endIndex < beginIndex");
            return null;
        }
        if (iH != bArr2.length) {
            vr1Var = new vr1(pyd.m(0, bArr2, iH));
        }
        sb.append(vr1Var.m());
        sb.append("…]");
        return sb.toString();
    }

    public boolean u(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.data;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && k.a(i, i2, i3, bArr2, bArr);
    }

    public boolean v(int i, vr1 vr1Var, int i2) {
        vr1Var.getClass();
        return vr1Var.u(0, i, i2, this.data);
    }

    public vr1 w(int i, int i2) {
        if (i2 == k.b) {
            i2 = h();
        }
        if (i < 0) {
            l5.q("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.data;
        if (i2 > bArr.length) {
            h5.k(k6.h(new StringBuilder("endIndex > length("), this.data.length, ')'));
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new vr1(pyd.m(i, bArr, i2));
        }
        l5.q("endIndex < beginIndex");
        return null;
    }

    public vr1 y() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new vr1(bArrCopyOf);
            }
            i++;
        }
    }

    public byte[] z() {
        byte[] bArr = this.data;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
