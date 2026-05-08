package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yb2 {
    public final xz8 a;
    public final xz8 b;
    public final xz8 c;
    public final yz8 d;
    public final yz8 e;

    public yb2(xz8 xz8Var, xz8 xz8Var2, xz8 xz8Var3, yz8 yz8Var, yz8 yz8Var2) {
        xz8Var.getClass();
        xz8Var2.getClass();
        xz8Var3.getClass();
        yz8Var.getClass();
        this.a = xz8Var;
        this.b = xz8Var2;
        this.c = xz8Var3;
        this.d = yz8Var;
        this.e = yz8Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yb2.class != obj.getClass()) {
            return false;
        }
        yb2 yb2Var = (yb2) obj;
        return wl7.b(this.a, yb2Var.a) && wl7.b(this.b, yb2Var.b) && wl7.b(this.c, yb2Var.c) && wl7.b(this.d, yb2Var.d) && wl7.b(this.e, yb2Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        yz8 yz8Var = this.e;
        return iHashCode + (yz8Var != null ? yz8Var.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=" + this.e + ')';
    }
}
