package defpackage;

import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes3.dex */
public class wve extends vve {
    public static boolean D(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean E(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean F(int i, int i2, int i3, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String G(int i, String str) {
        if (i < 0) {
            h5.k(bg.c(JwtParser.SEPARATOR_CHAR, i, "Count 'n' must be non-negative, but was "));
            return null;
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(str.length() * i);
            if (1 <= i) {
                while (true) {
                    sb.append((CharSequence) str);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return sb.toString();
        }
        char cCharAt = str.charAt(0);
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = cCharAt;
        }
        return new String(cArr);
    }

    public static String H(String str, char c, char c2) {
        str.getClass();
        String strReplace = str.replace(c, c2);
        strReplace.getClass();
        return strReplace;
    }

    public static String I(String str, String str2, String str3) {
        q6.m(str, str2, str3);
        int iP = zve.P(str, str2, 0, false);
        if (iP < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iP);
            sb.append(str3);
            i2 = iP + length;
            if (iP >= str.length()) {
                break;
            }
            iP = zve.P(str, str2, iP + i, false);
        } while (iP > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean J(int i, String str, String str2, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2, i) : F(i, 0, str2.length(), str, str2, z);
    }

    public static boolean K(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : F(0, 0, str2.length(), str, str2, z);
    }
}
