package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class p7f {
    public static final boolean a(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return wl7.b(zve.s0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final String b(Collection<?> collection) {
        collection.getClass();
        return !collection.isEmpty() ? sve.v(z92.W0(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }
}
