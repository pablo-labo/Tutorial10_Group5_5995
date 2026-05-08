package okhttp3.internal;

import defpackage.g7;
import defpackage.ja;
import defpackage.wl7;
import defpackage.wve;
import defpackage.zn1;
import defpackage.zve;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HostnamesKt {
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        if (r7 == 16) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
    
        if (r8 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d1, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress a(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.a(int, int, java.lang.String):java.net.InetAddress");
    }

    public static final String b(String str) {
        int i;
        str.getClass();
        int i2 = 0;
        int i3 = -1;
        if (zve.L(str, ":", false)) {
            InetAddress inetAddressA = (wve.K(str, "[", false) && wve.D(str, "]", false)) ? a(1, str.length() - 1, str) : a(0, str.length(), str);
            if (inetAddressA != null) {
                byte[] address = inetAddressA.getAddress();
                if (address.length != 16) {
                    if (address.length == 4) {
                        return inetAddressA.getHostAddress();
                    }
                    g7.l(ja.f('\'', "Invalid IPv6 address: '", str));
                    return null;
                }
                int i4 = 0;
                int i5 = 0;
                while (i4 < address.length) {
                    int i6 = i4;
                    while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                        i6 += 2;
                    }
                    int i7 = i6 - i4;
                    if (i7 > i5 && i7 >= 4) {
                        i3 = i4;
                        i5 = i7;
                    }
                    i4 = i6 + 2;
                }
                zn1 zn1Var = new zn1();
                while (i2 < address.length) {
                    if (i2 == i3) {
                        zn1Var.r0(58);
                        i2 += i5;
                        if (i2 == 16) {
                            zn1Var.r0(58);
                        }
                    } else {
                        if (i2 > 0) {
                            zn1Var.r0(58);
                        }
                        byte b = address[i2];
                        byte[] bArr = Util.a;
                        zn1Var.K0(((b & 255) << 8) | (address[i2 + 1] & 255));
                        i2 += 2;
                    }
                }
                return zn1Var.z1();
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                ascii.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = ascii.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.length() != 0) {
                    int length = lowerCase.length();
                    for (0; i < length; i + 1) {
                        char cCharAt = lowerCase.charAt(i);
                        i = (wl7.c(cCharAt, 31) > 0 && wl7.c(cCharAt, 127) < 0 && zve.R(" #%/:?@[\\]", cCharAt, 0, false, 6) == -1) ? i + 1 : 0;
                    }
                    return lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
