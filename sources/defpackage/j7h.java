package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j7h {
    public static void a(int i, int i2) {
        String strA;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strA = k7h.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    l5.q(p6.c(i2, "negative size: "));
                    return;
                }
                strA = k7h.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void b(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? c(i, i3, "start index") : (i2 < 0 || i2 > i3) ? c(i2, i3, "end index") : k7h.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String c(int i, int i2, String str) {
        if (i < 0) {
            return k7h.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return k7h.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        l5.q(p6.c(i2, "negative size: "));
        return null;
    }
}
