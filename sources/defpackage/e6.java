package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e6 extends a6 {
    public static e6 c;

    @Override // defpackage.a6
    public final int[] a(int i) {
        int length = c().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && c().charAt(i) == '\n' && (c().charAt(i) == '\n' || (i != 0 && c().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !e(i2)) {
            i2++;
        }
        return b(i, i2);
    }

    @Override // defpackage.a6
    public final int[] d(int i) {
        int length = c().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && c().charAt(i - 1) == '\n' && !e(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (c().charAt(i2) == '\n' || (i2 != 0 && c().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return b(i2, i);
    }

    public final boolean e(int i) {
        if (i <= 0 || c().charAt(i - 1) == '\n') {
            return false;
        }
        return i == c().length() || c().charAt(i) == '\n';
    }
}
