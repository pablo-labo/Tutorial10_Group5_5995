package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ph7 {
    public static final ph7 e = new ph7(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ph7(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph7)) {
            return false;
        }
        ph7 ph7Var = (ph7) obj;
        return this.a == ph7Var.a && this.b == ph7Var.b && this.c == ph7Var.c && this.d == ph7Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + w40.c(this.c, w40.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return k6.h(sb, this.d, ')');
    }
}
