package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cn2 {
    public final q03 a;
    public final q03 b;
    public final q03 c;
    public final q03 d;

    public cn2(q03 q03Var, q03 q03Var2, q03 q03Var3, q03 q03Var4) {
        this.a = q03Var;
        this.b = q03Var2;
        this.c = q03Var3;
        this.d = q03Var4;
    }

    public final boolean a() {
        q03 q03Var = this.a;
        if (q03Var.a > 0.0f || q03Var.b > 0.0f) {
            return true;
        }
        q03 q03Var2 = this.b;
        if (q03Var2.a > 0.0f || q03Var2.b > 0.0f) {
            return true;
        }
        q03 q03Var3 = this.c;
        return q03Var3.a > 0.0f || q03Var3.b > 0.0f || this.d.a > 0.0f;
    }

    public final boolean b() {
        q03 q03Var = this.b;
        q03 q03Var2 = this.a;
        return wl7.b(q03Var2, q03Var) && wl7.b(q03Var2, this.c) && wl7.b(q03Var2, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn2)) {
            return false;
        }
        cn2 cn2Var = (cn2) obj;
        return wl7.b(this.a, cn2Var.a) && wl7.b(this.b, cn2Var.b) && wl7.b(this.c, cn2Var.c) && wl7.b(this.d, cn2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ComputedBorderRadius(topLeft=" + this.a + ", topRight=" + this.b + ", bottomLeft=" + this.c + ", bottomRight=" + this.d + ")";
    }
}
