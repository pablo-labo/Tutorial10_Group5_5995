package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class io3 {
    public static final byte[] b = {-1, -40, -1};
    public static final int c = 3;
    public static final byte[] d = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final int e = 8;
    public static final byte[] f = hh2.h("GIF87a");
    public static final byte[] g = hh2.h("GIF89a");
    public static final byte[] h;
    public static final int i;
    public static final byte[] j;
    public static final int k;
    public static final byte[] l;
    public static final byte[][] m;
    public static final byte[] n;
    public static final byte[] o;
    public static final int p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public final int a;

    static {
        byte[] bArrH = hh2.h("BM");
        h = bArrH;
        i = bArrH.length;
        j = new byte[]{0, 0, 1, 0};
        k = 4;
        l = hh2.h("ftyp");
        m = new byte[][]{hh2.h("heic"), hh2.h("heix"), hh2.h("hevc"), hh2.h("hevx"), hh2.h("mif1"), hh2.h("msf1")};
        n = new byte[]{73, 73, 42, 0};
        o = new byte[]{77, 77, 0, 42};
        p = 4;
        q = new byte[]{3, 0, 8, 0};
        r = hh2.h("ftyp");
        s = hh2.h("avif");
    }

    public io3() {
        Integer num;
        Integer[] numArr = {21, 20, Integer.valueOf(c), Integer.valueOf(e), 6, Integer.valueOf(i), Integer.valueOf(k), 12, 4, 12};
        if (numArr.length == 0) {
            num = null;
        } else {
            num = numArr[0];
            int i2 = 1;
            int length = numArr.length - 1;
            if (1 <= length) {
                while (true) {
                    Integer num2 = numArr[i2];
                    num = num.compareTo(num2) < 0 ? num2 : num;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        if (num != null) {
            this.a = num.intValue();
        } else {
            r6.g("Required value was null.");
            throw null;
        }
    }
}
