package defpackage;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class kf7 {
    public static final kf7 e = new kf7(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public static class a {
        public static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public kf7(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static kf7 a(kf7 kf7Var, kf7 kf7Var2) {
        return b(Math.max(kf7Var.a, kf7Var2.a), Math.max(kf7Var.b, kf7Var2.b), Math.max(kf7Var.c, kf7Var2.c), Math.max(kf7Var.d, kf7Var2.d));
    }

    public static kf7 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new kf7(i, i2, i3, i4);
    }

    public static kf7 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return a.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kf7.class != obj.getClass()) {
            return false;
        }
        kf7 kf7Var = (kf7) obj;
        return this.d == kf7Var.d && this.a == kf7Var.a && this.c == kf7Var.c && this.b == kf7Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return k6.h(sb, this.d, '}');
    }
}
