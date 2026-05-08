package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class zve extends wve {
    public static boolean L(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (S(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (Q(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean M(CharSequence charSequence, char c) {
        charSequence.getClass();
        return R(charSequence, c, 0, false, 2) >= 0;
    }

    public static boolean N(CharSequence charSequence, String str) {
        charSequence.getClass();
        return charSequence instanceof String ? wve.D((String) charSequence, str, false) : a0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean O(String str, char c) {
        str.getClass();
        return str.length() > 0 && ypd.u(str.charAt(str.length() - 1), c, false);
    }

    public static final int P(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? Q(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int Q(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        mh7 mh7Var;
        if (z2) {
            charSequence.getClass();
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            mh7Var = new mh7(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length2 = charSequence.length();
            if (i2 > length2) {
                i2 = length2;
            }
            mh7Var = new oh7(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = mh7Var.c;
        int i4 = mh7Var.b;
        int i5 = mh7Var.a;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (!a0(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        if (i5 == i4) {
                            break;
                        }
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (!wve.F(0, i6, str.length(), str, (String) charSequence, z6)) {
                    if (i6 == i4) {
                        break;
                    }
                    i6 += i3;
                    z = z6;
                } else {
                    return i6;
                }
            }
        }
        return -1;
    }

    public static int R(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        charSequence.getClass();
        return (z || !(charSequence instanceof String)) ? T(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int S(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return P(charSequence, str, i, z);
    }

    public static final int T(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ut0.w0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (ypd.u(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean U(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!ypd.E(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int V(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            charSequence.getClass();
            i = charSequence.length() - 1;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(ut0.w0(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (ypd.u(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int W(String str, int i, int i2, String str2) {
        if ((i2 & 2) != 0) {
            str.getClass();
            i = str.length() - 1;
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, i);
    }

    public static List X(String str) {
        str.getClass();
        px8 px8Var = new px8(str);
        if (!px8Var.hasNext()) {
            return zr4.a;
        }
        Object next = px8Var.next();
        if (!px8Var.hasNext()) {
            return u63.Z(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (px8Var.hasNext()) {
            arrayList.add(px8Var.next());
        }
        return arrayList;
    }

    public static String Y(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            l5.q(bg.d(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String Z(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            l5.q(bg.d(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean a0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!ypd.u(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String b0(String str, String str2) {
        str.getClass();
        return l0(str, str2) ? str.substring(str2.length()) : str;
    }

    public static CharSequence c0(CharSequence charSequence, int i, int i2) {
        charSequence.getClass();
        if (i2 < i) {
            l5.s(w40.e("End index (", i2, ") is less than start index (", i, ")."));
            return null;
        }
        if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
        sb.append(charSequence, 0, i);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static String d0(String str, String str2) {
        str.getClass();
        return N(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String e0(String str) {
        str.getClass();
        return (str.length() >= 2 && l0(str, "\"") && N(str, "\"")) ? akb.j(1, 1, str) : str;
    }

    public static String f0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iV = V(str, JwtParser.SEPARATOR_CHAR, 0, 6);
        return iV == -1 ? str : g0(str, iV + 1, str.length(), str2).toString();
    }

    public static StringBuilder g0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            l5.s(w40.e("End index (", i2, ") is less than start index (", i, ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static final void h0(int i) {
        if (i >= 0) {
            return;
        }
        h5.k(p6.c(i, "Limit must be non-negative, but was "));
    }

    public static final List i0(CharSequence charSequence, String str) {
        h0(0);
        int iP = P(charSequence, str, 0, false);
        if (iP == -1) {
            return u63.Z(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iP).toString());
            length = str.length() + iP;
            iP = P(charSequence, str, length, false);
        } while (iP != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List j0(CharSequence charSequence, char[] cArr) {
        charSequence.getClass();
        if (cArr.length == 1) {
            return i0(charSequence, String.valueOf(cArr[0]));
        }
        h0(0);
        ey3 ey3Var = new ey3(charSequence, new xd(cArr, 19));
        ArrayList arrayList = new ArrayList(t92.r0(new y6e(ey3Var), 10));
        for (oh7 oh7Var : ey3Var) {
            oh7Var.getClass();
            arrayList.add(charSequence.subSequence(oh7Var.a, oh7Var.b + 1).toString());
        }
        return arrayList;
    }

    public static List k0(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return i0(charSequence, str);
            }
        }
        h0(0);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        ey3 ey3Var = new ey3(charSequence, new xve(listAsList));
        ArrayList arrayList = new ArrayList(t92.r0(new y6e(ey3Var), 10));
        for (oh7 oh7Var : ey3Var) {
            oh7Var.getClass();
            arrayList.add(charSequence.subSequence(oh7Var.a, oh7Var.b + 1).toString());
        }
        return arrayList;
    }

    public static boolean l0(CharSequence charSequence, String str) {
        charSequence.getClass();
        return charSequence instanceof String ? wve.K((String) charSequence, str, false) : a0(charSequence, 0, str, 0, str.length(), false);
    }

    public static boolean m0(String str, char c) {
        return str.length() > 0 && ypd.u(str.charAt(0), c, false);
    }

    public static String n0(String str, String str2, String str3) {
        str.getClass();
        int iS = S(str, str2, 0, false, 6);
        return iS == -1 ? str3 : str.substring(str2.length() + iS, str.length());
    }

    public static String o0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iV = V(str, c, 0, 6);
        return iV == -1 ? str2 : str.substring(iV + 1, str.length());
    }

    public static String p0(String str, char c) {
        str.getClass();
        str.getClass();
        int iR = R(str, c, 0, false, 6);
        return iR == -1 ? str : str.substring(0, iR);
    }

    public static String q0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iS = S(str, str2, 0, false, 6);
        return iS == -1 ? str : str.substring(0, iS);
    }

    public static String r0(String str, char c) {
        str.getClass();
        str.getClass();
        int iV = V(str, c, 0, 6);
        return iV == -1 ? str : str.substring(0, iV);
    }

    public static CharSequence s0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zE = ypd.E(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zE) {
                    break;
                }
                length--;
            } else if (zE) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String t0(String str, char... cArr) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zG0 = ut0.g0(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!zG0) {
                    break;
                }
                length--;
            } else if (zG0) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static String u0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!ut0.g0(cArr, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static String v0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!ut0.g0(cArr, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }
}
