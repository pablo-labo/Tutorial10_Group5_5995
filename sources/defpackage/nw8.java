package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nw8 implements mzg {
    public final mzg a;
    public final int b;

    public nw8(mzg mzgVar, int i) {
        this.a = mzgVar;
        this.b = i;
    }

    @Override // defpackage.mzg
    public final int a(iy3 iy3Var) {
        if ((this.b & 16) != 0) {
            return this.a.a(iy3Var);
        }
        return 0;
    }

    @Override // defpackage.mzg
    public final int b(iy3 iy3Var, vl8 vl8Var) {
        if (((vl8Var == vl8.a ? 4 : 1) & this.b) != 0) {
            return this.a.b(iy3Var, vl8Var);
        }
        return 0;
    }

    @Override // defpackage.mzg
    public final int c(iy3 iy3Var) {
        if ((this.b & 32) != 0) {
            return this.a.c(iy3Var);
        }
        return 0;
    }

    @Override // defpackage.mzg
    public final int d(iy3 iy3Var, vl8 vl8Var) {
        if (((vl8Var == vl8.a ? 8 : 2) & this.b) != 0) {
            return this.a.d(iy3Var, vl8Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw8)) {
            return false;
        }
        nw8 nw8Var = (nw8) obj;
        return wl7.b(this.a, nw8Var.a) && this.b == nw8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = c0h.b;
        int i2 = this.b;
        if ((i2 & i) == i) {
            c0h.X(sb3, "Start");
        }
        int i3 = c0h.d;
        if ((i2 & i3) == i3) {
            c0h.X(sb3, "Left");
        }
        if ((i2 & 16) == 16) {
            c0h.X(sb3, "Top");
        }
        int i4 = c0h.c;
        if ((i2 & i4) == i4) {
            c0h.X(sb3, "End");
        }
        int i5 = c0h.e;
        if ((i2 & i5) == i5) {
            c0h.X(sb3, "Right");
        }
        if ((i2 & 32) == 32) {
            c0h.X(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
