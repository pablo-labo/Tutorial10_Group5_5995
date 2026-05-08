package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fa2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public fa2(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa2)) {
            return false;
        }
        fa2 fa2Var = (fa2) obj;
        return this.a == fa2Var.a && this.b == fa2Var.b && this.c == fa2Var.c && this.d == fa2Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + w40.c(this.c, w40.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbF = uz.f("ColorEdges(left=", this.a, ", top=", this.b, ", right=");
        sbF.append(this.c);
        sbF.append(", bottom=");
        sbF.append(this.d);
        sbF.append(")");
        return sbF.toString();
    }
}
