package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends w {
    public final String a;
    public byte[] b;

    static {
        new ConcurrentHashMap();
    }

    public u(String str) {
        char cCharAt;
        if (str == null) {
            l5.q("'identifier' cannot be null");
            throw null;
        }
        boolean zI = false;
        if (str.length() >= 3 && str.charAt(1) == '.' && (cCharAt = str.charAt(0)) >= '0' && cCharAt <= '2') {
            zI = i(2, str);
        }
        if (zI) {
            this.a = str;
        } else {
            l5.q(l5.m("string ", str, " not an OID"));
            throw null;
        }
    }

    public static boolean i(int i, String str) {
        boolean z;
        char cCharAt;
        int length = str.length();
        do {
            z = false;
            while (true) {
                length--;
                if (length < i) {
                    return z;
                }
                cCharAt = str.charAt(length);
                if ('0' > cCharAt || cCharAt > '9') {
                    break;
                }
                z = true;
            }
            if (cCharAt != '.') {
                break;
            }
        } while (z);
        return false;
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i = iBitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & 127);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    @Override // defpackage.w
    public final boolean b(w wVar) {
        if (wVar == this) {
            return true;
        }
        if (!(wVar instanceof u)) {
            return false;
        }
        return this.a.equals(((u) wVar).a);
    }

    @Override // defpackage.w
    public final void c(v vVar) throws IOException {
        byte[] bArrG = g();
        vVar.g(6);
        vVar.h(bArrG.length);
        ((ByteArrayOutputStream) vVar.a).write(bArrG);
    }

    @Override // defpackage.w
    public final int d() {
        int length = g().length;
        return oue.a(length) + 1 + length;
    }

    public final void f(ByteArrayOutputStream byteArrayOutputStream) {
        String strSubstring;
        int i;
        String strSubstring2;
        int i2;
        String strSubstring3;
        String str = this.a;
        int iIndexOf = str.indexOf(46, 0);
        if (iIndexOf == -1) {
            strSubstring = str.substring(0);
            i = -1;
        } else {
            strSubstring = str.substring(0, iIndexOf);
            i = iIndexOf + 1;
        }
        int i3 = Integer.parseInt(strSubstring) * 40;
        if (i == -1) {
            i2 = i;
            strSubstring2 = null;
        } else {
            int iIndexOf2 = str.indexOf(46, i);
            if (iIndexOf2 == -1) {
                strSubstring2 = str.substring(i);
                i2 = -1;
            } else {
                strSubstring2 = str.substring(i, iIndexOf2);
                i2 = iIndexOf2 + 1;
            }
        }
        if (strSubstring2.length() <= 18) {
            j(byteArrayOutputStream, Long.parseLong(strSubstring2) + ((long) i3));
        } else {
            k(byteArrayOutputStream, new BigInteger(strSubstring2).add(BigInteger.valueOf(i3)));
        }
        while (i2 != -1) {
            if (i2 == -1) {
                strSubstring3 = null;
            } else {
                int iIndexOf3 = str.indexOf(46, i2);
                if (iIndexOf3 == -1) {
                    strSubstring3 = str.substring(i2);
                    i2 = -1;
                } else {
                    String strSubstring4 = str.substring(i2, iIndexOf3);
                    i2 = iIndexOf3 + 1;
                    strSubstring3 = strSubstring4;
                }
            }
            if (strSubstring3.length() <= 18) {
                j(byteArrayOutputStream, Long.parseLong(strSubstring3));
            } else {
                k(byteArrayOutputStream, new BigInteger(strSubstring3));
            }
        }
    }

    public final synchronized byte[] g() {
        try {
            if (this.b == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                f(byteArrayOutputStream);
                this.b = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // defpackage.w, defpackage.t
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public u(u uVar, String str) {
        if (i(0, str)) {
            this.a = m6.h(new StringBuilder(), uVar.a, ".", str);
        } else {
            l5.q(l5.m("string ", str, " not a valid OID branch"));
            throw null;
        }
    }
}
