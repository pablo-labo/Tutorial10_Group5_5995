package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dy6 {
    public final String a;
    public final fv6 b;
    public final fv6 c;
    public final ar6 d;
    public final ar6 e;

    public dy6(String str, fv6 fv6Var, fv6 fv6Var2, ar6 ar6Var, ar6 ar6Var2) {
        str.getClass();
        fv6Var.getClass();
        fv6Var2.getClass();
        this.a = str;
        this.b = fv6Var;
        this.c = fv6Var2;
        this.d = ar6Var;
        this.e = ar6Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy6)) {
            return false;
        }
        dy6 dy6Var = (dy6) obj;
        return wl7.b(this.a, dy6Var.a) && this.b == dy6Var.b && this.c == dy6Var.c && this.d == dy6Var.d && this.e == dy6Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "IdlTabData(label=" + this.a + ", unselectedIconName=" + this.b + ", selectedIconName=" + this.c + ", unselectedIconVariant=" + this.d + ", selectedIconVariant=" + this.e + ")";
    }
}
