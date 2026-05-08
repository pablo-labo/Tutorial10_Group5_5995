package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o44 {
    public final boolean a;
    public final boolean b;
    public final yxd c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public o44(boolean z) {
        z = (32 & 8) != 0 ? true : z;
        this.a = true;
        this.b = true;
        this.c = yxd.a;
        this.d = z;
        this.e = true;
        this.f = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o44)) {
            return false;
        }
        o44 o44Var = (o44) obj;
        return this.a == o44Var.a && this.b == o44Var.b && this.c == o44Var.c && this.d == o44Var.d && this.e == o44Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ia.f((this.c.hashCode() + ia.f(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public /* synthetic */ o44(int i) {
        this((i & 4) != 0);
    }
}
