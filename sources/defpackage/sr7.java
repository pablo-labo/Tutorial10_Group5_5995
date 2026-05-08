package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sr7 {
    public final rr7 a;
    public final Boolean b;
    public final rr7 c;

    public sr7(rr7 rr7Var, Boolean bool, rr7 rr7Var2) {
        this.a = rr7Var;
        this.b = bool;
        this.c = rr7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr7)) {
            return false;
        }
        sr7 sr7Var = (sr7) obj;
        return wl7.b(this.a, sr7Var.a) && wl7.b(this.b, sr7Var.b) && wl7.b(this.c, sr7Var.c);
    }

    public final int hashCode() {
        rr7 rr7Var = this.a;
        int iHashCode = (rr7Var == null ? 0 : rr7Var.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        rr7 rr7Var2 = this.c;
        return iHashCode2 + (rr7Var2 != null ? rr7Var2.hashCode() : 0);
    }

    public final String toString() {
        return "JSTProfileDateRange(fromDate=" + this.a + ", isCurrent=" + this.b + ", toDate=" + this.c + ")";
    }
}
