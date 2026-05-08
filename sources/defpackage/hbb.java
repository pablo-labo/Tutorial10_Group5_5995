package defpackage;

import android.icu.text.DateFormat;
import com.facebook.hermes.intl.JSRangeErrorException;

/* JADX INFO: loaded from: classes2.dex */
public final class hbb {
    public DateFormat a;

    public static void a(StringBuilder sb, char[] cArr, char c) {
        for (int i = 0; i < sb.length(); i++) {
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (sb.charAt(i) == cArr[i2]) {
                        sb.setCharAt(i, c);
                        break;
                    }
                    i2++;
                }
            }
        }
    }

    public static int b(xn6 xn6Var) throws JSRangeErrorException {
        int iOrdinal = xn6Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                throw new JSRangeErrorException("Invalid DateStyle: ".concat(xn6Var.toString()));
            }
        }
        return i;
    }

    public static int c(go6 go6Var) throws JSRangeErrorException {
        int iOrdinal = go6Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                throw new JSRangeErrorException("Invalid DateStyle: ".concat(go6Var.toString()));
            }
        }
        return i;
    }
}
