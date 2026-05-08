package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c9d {
    public final int a;
    public final Integer b;
    public final int c;
    public final Boolean d;
    public final gu5<j6g> e;

    public c9d(int i, Integer num, int i2, Boolean bool, gu5<j6g> gu5Var) {
        gu5Var.getClass();
        this.a = i;
        this.b = num;
        this.c = i2;
        this.d = bool;
        this.e = gu5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9d)) {
            return false;
        }
        c9d c9dVar = (c9d) obj;
        return this.a == c9dVar.a && wl7.b(this.b, c9dVar.b) && this.c == c9dVar.c && wl7.b(this.d, c9dVar.d) && wl7.b(this.e, c9dVar.e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int iC = w40.c(this.c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        Boolean bool = this.d;
        return this.e.hashCode() + ((iC + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ResumeOption(labelStringResourceId=" + this.a + ", explainerStringResourceId=" + this.b + ", iconId=" + this.c + ", isNew=" + this.d + ", onClick=" + this.e + ")";
    }
}
