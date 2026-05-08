package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class awe extends zve {
    public static String A0(int i, String str) {
        str.getClass();
        if (i < 0) {
            h5.k(bg.d(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static String w0(int i, String str) {
        str.getClass();
        if (i < 0) {
            h5.k(bg.d(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static String x0(int i, String str) {
        if (i < 0) {
            h5.k(bg.d(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return A0(length, str);
    }

    public static Character y0(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    public static char z0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        s6.j("Char sequence is empty.");
        return (char) 0;
    }
}
