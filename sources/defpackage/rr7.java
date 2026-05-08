package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rr7 {
    public final ds7 a;
    public final Integer b;

    public rr7(ds7 ds7Var, Integer num) {
        this.a = ds7Var;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr7)) {
            return false;
        }
        rr7 rr7Var = (rr7) obj;
        return this.a == rr7Var.a && wl7.b(this.b, rr7Var.b);
    }

    public final int hashCode() {
        ds7 ds7Var = this.a;
        int iHashCode = (ds7Var == null ? 0 : ds7Var.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "JSTProfileDate(month=" + this.a + ", year=" + this.b + ")";
    }
}
