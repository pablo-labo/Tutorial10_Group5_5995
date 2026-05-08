package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gg8 {
    public static final gg8 c = new gg8(null, null);
    public final ig8 a;
    public final zf8 b;

    public static final class a {
        public static gg8 a(zf8 zf8Var) {
            zf8Var.getClass();
            return new gg8(ig8.a, zf8Var);
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ig8.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public gg8(ig8 ig8Var, zf8 zf8Var) {
        String str;
        this.a = ig8Var;
        this.b = zf8Var;
        if ((ig8Var == null) == (zf8Var == null)) {
            return;
        }
        if (ig8Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + ig8Var + " requires type to be specified.";
        }
        h5.k(str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg8)) {
            return false;
        }
        gg8 gg8Var = (gg8) obj;
        return this.a == gg8Var.a && wl7.b(this.b, gg8Var.b);
    }

    public final int hashCode() {
        ig8 ig8Var = this.a;
        int iHashCode = (ig8Var == null ? 0 : ig8Var.hashCode()) * 31;
        zf8 zf8Var = this.b;
        return iHashCode + (zf8Var != null ? zf8Var.hashCode() : 0);
    }

    public final String toString() {
        ig8 ig8Var = this.a;
        int i = ig8Var == null ? -1 : b.a[ig8Var.ordinal()];
        if (i == -1) {
            return "*";
        }
        zf8 zf8Var = this.b;
        if (i == 1) {
            return String.valueOf(zf8Var);
        }
        if (i == 2) {
            return "in " + zf8Var;
        }
        if (i != 3) {
            l.g();
            return null;
        }
        return "out " + zf8Var;
    }
}
