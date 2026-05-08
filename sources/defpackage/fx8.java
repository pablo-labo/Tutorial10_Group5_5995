package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fx8 {
    public static final fx8 c = new fx8(a.c, 17);
    public final float a;
    public final int b;

    @fd8
    public static final class a {
        public static final float b;
        public static final float c;
        public static final float d;
        public final float a;

        static {
            a(0.0f);
            a(0.5f);
            b = 0.5f;
            a(-1.0f);
            c = -1.0f;
            a(1.0f);
            d = 1.0f;
        }

        public static void a(float f) {
            if ((0.0f > f || f > 1.0f) && f != -1.0f) {
                be7.c("topRatio should be in [0..1] range or -1");
            }
        }

        public static String b(float f) {
            if (f == 0.0f) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == b) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == c) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f == d) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Float.compare(this.a, ((a) obj).a) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return b(this.a);
        }
    }

    @fd8
    public static final class b {
        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "Mode(value=0)";
        }
    }

    @fd8
    public static final class c {
        public final int a;

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.a == ((c) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            int i = this.a;
            return i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
    }

    public fx8(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx8)) {
            return false;
        }
        fx8 fx8Var = (fx8) obj;
        float f = fx8Var.a;
        float f2 = a.b;
        return Float.compare(this.a, f) == 0 && this.b == fx8Var.b;
    }

    public final int hashCode() {
        float f = a.b;
        return Integer.hashCode(0) + w40.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) a.b(this.a));
        sb.append(", trim=");
        int i = this.b;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
