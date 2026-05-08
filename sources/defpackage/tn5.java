package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tn5 {
    public final pn5 a;
    public final to5 b;

    public tn5(pn5 pn5Var, to5 to5Var) {
        pn5Var.getClass();
        to5Var.getClass();
        this.a = pn5Var;
        this.b = to5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn5)) {
            return false;
        }
        tn5 tn5Var = (tn5) obj;
        return wl7.b(this.a, tn5Var.a) && wl7.b(this.b, tn5Var.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.a;
    }

    public final String toString() {
        return "FontFamilyWithWeight(fontFamily=" + this.a + ", weight=" + this.b + ')';
    }

    public tn5(pn5 pn5Var) {
        this(pn5Var, to5.b0);
    }
}
