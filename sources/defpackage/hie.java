package defpackage;

import defpackage.t44;

/* JADX INFO: loaded from: classes.dex */
public final class hie {
    public static final hie c;
    public final t44 a;
    public final t44 b;

    static {
        t44.b bVar = t44.b.a;
        c = new hie(bVar, bVar);
    }

    public hie(t44 t44Var, t44 t44Var2) {
        this.a = t44Var;
        this.b = t44Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hie)) {
            return false;
        }
        hie hieVar = (hie) obj;
        return wl7.b(this.a, hieVar.a) && wl7.b(this.b, hieVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
