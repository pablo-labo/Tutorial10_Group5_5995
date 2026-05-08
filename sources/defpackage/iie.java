package defpackage;

import defpackage.u44;

/* JADX INFO: loaded from: classes.dex */
public final class iie {
    public static final iie c;
    public final u44 a;
    public final u44 b;

    static {
        u44.b bVar = u44.b.a;
        c = new iie(bVar, bVar);
    }

    public iie(u44 u44Var, u44 u44Var2) {
        this.a = u44Var;
        this.b = u44Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iie)) {
            return false;
        }
        iie iieVar = (iie) obj;
        return wl7.b(this.a, iieVar.a) && wl7.b(this.b, iieVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
