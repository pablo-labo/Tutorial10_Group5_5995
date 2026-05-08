package defpackage;

import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class xr1 {
    public static final d2f c = new d2f(new lz(6));
    public final int a;
    public final int b;

    public static final class a {
        public static final String a(int i) {
            d2f d2fVar = xr1.c;
            return i == Integer.MAX_VALUE ? "" : String.valueOf(i);
        }

        public static xr1 b(String str) {
            if (str == null) {
                return null;
            }
            try {
                Object value = xr1.c.getValue();
                value.getClass();
                String[] strArrSplit = ((Pattern) value).split(str);
                web.e(Boolean.valueOf(strArrSplit.length == 4));
                web.e(Boolean.valueOf(wl7.b(strArrSplit[0], "bytes")));
                String str2 = strArrSplit[1];
                str2.getClass();
                int i = Integer.parseInt(str2);
                String str3 = strArrSplit[2];
                str3.getClass();
                int i2 = Integer.parseInt(str3);
                String str4 = strArrSplit[3];
                str4.getClass();
                int i3 = Integer.parseInt(str4);
                web.e(Boolean.valueOf(i2 > i));
                web.e(Boolean.valueOf(i3 > i2));
                return i2 < i3 - 1 ? new xr1(i, i2) : new xr1(i, Integer.MAX_VALUE);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{str}, 1)), e);
            }
        }
    }

    public xr1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xr1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        xr1 xr1Var = (xr1) obj;
        return this.a == xr1Var.a && this.b == xr1Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return String.format(null, "%s-%s", Arrays.copyOf(new Object[]{a.a(this.a), a.a(this.b)}, 2));
    }
}
