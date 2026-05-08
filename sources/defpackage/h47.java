package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h47 {
    public static final h47 d;
    public int a;
    public boolean b;
    public boolean c;

    static {
        h47 h47Var = new h47();
        h47Var.a = Integer.MAX_VALUE;
        h47Var.b = true;
        h47Var.c = true;
        d = h47Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h47)) {
            return false;
        }
        h47 h47Var = (h47) obj;
        return this.a == h47Var.a && this.b == h47Var.b && this.c == h47Var.c;
    }

    public final int hashCode() {
        return (this.a ^ (this.b ? 4194304 : 0)) ^ (this.c ? 8388608 : 0);
    }
}
