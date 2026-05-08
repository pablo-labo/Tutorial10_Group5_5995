package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class lw7 {
    public final Set a;
    public final jyf b;
    public final ow7 c;
    public final boolean d;
    public final boolean e;
    public final Set<rxf> f;
    public final mge g;

    public /* synthetic */ lw7(jyf jyfVar, boolean z, boolean z2, Set set, int i) {
        this(jyfVar, ow7.a, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
    }

    public static lw7 a(lw7 lw7Var, ow7 ow7Var, boolean z, Set set, mge mgeVar, int i) {
        jyf jyfVar = lw7Var.b;
        if ((i & 2) != 0) {
            ow7Var = lw7Var.c;
        }
        ow7 ow7Var2 = ow7Var;
        if ((i & 4) != 0) {
            z = lw7Var.d;
        }
        boolean z2 = z;
        boolean z3 = lw7Var.e;
        if ((i & 16) != 0) {
            set = lw7Var.f;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            mgeVar = lw7Var.g;
        }
        lw7Var.getClass();
        jyfVar.getClass();
        ow7Var2.getClass();
        return new lw7(jyfVar, ow7Var2, z2, z3, set2, mgeVar);
    }

    public final Set<rxf> b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lw7)) {
            return false;
        }
        lw7 lw7Var = (lw7) obj;
        return wl7.b(lw7Var.g, this.g) && lw7Var.b == this.b && lw7Var.c == this.c && lw7Var.d == this.d && lw7Var.e == this.e;
    }

    public final int hashCode() {
        mge mgeVar = this.g;
        int iHashCode = mgeVar != null ? mgeVar.hashCode() : 0;
        int iHashCode2 = this.b.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.c.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i = (iHashCode3 * 31) + (this.d ? 1 : 0) + iHashCode3;
        return (i * 31) + (this.e ? 1 : 0) + i;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.b + ", flexibility=" + this.c + ", isRaw=" + this.d + ", isForAnnotationParameter=" + this.e + ", visitedTypeParameters=" + this.f + ", defaultType=" + this.g + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lw7(jyf jyfVar, ow7 ow7Var, boolean z, boolean z2, Set<? extends rxf> set, mge mgeVar) {
        jyfVar.getClass();
        this.a = set;
        this.b = jyfVar;
        this.c = ow7Var;
        this.d = z;
        this.e = z2;
        this.f = set;
        this.g = mgeVar;
    }
}
