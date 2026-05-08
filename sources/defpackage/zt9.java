package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zt9 {
    public final Double a;
    public final f68 b;
    public final Boolean c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ zt9(Double d, f68 f68Var, int i) {
        Boolean bool = Boolean.TRUE;
        this((i & 2) != 0 ? f68.W : f68Var, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 1) != 0 ? null : d, null);
    }

    public static zt9 a(zt9 zt9Var, Double d, f68 f68Var, String str, int i) {
        if ((i & 1) != 0) {
            d = zt9Var.a;
        }
        if ((i & 2) != 0) {
            f68Var = zt9Var.b;
        }
        Boolean bool = zt9Var.c;
        if ((i & 8) != 0) {
            str = zt9Var.d;
        }
        return new zt9(f68Var, bool, d, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt9)) {
            return false;
        }
        zt9 zt9Var = (zt9) obj;
        return wl7.b(this.a, zt9Var.a) && this.b == zt9Var.b && wl7.b(this.c, zt9Var.c) && wl7.b(this.d, zt9Var.d);
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        f68 f68Var = this.b;
        int iHashCode2 = (iHashCode + (f68Var == null ? 0 : f68Var.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MinimumPay(amount=" + this.a + ", salaryType=" + this.b + ", amountExists=" + this.c + ", currency=" + this.d + ")";
    }

    public zt9(f68 f68Var, Boolean bool, Double d, String str) {
        this.a = d;
        this.b = f68Var;
        this.c = bool;
        this.d = str;
    }

    public zt9() {
        this(null, 0 == true ? 1 : 0, 15);
    }
}
