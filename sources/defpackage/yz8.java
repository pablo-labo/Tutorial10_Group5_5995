package defpackage;

import defpackage.xz8;

/* JADX INFO: loaded from: classes.dex */
public final class yz8 {
    public static final yz8 d;
    public final xz8 a;
    public final xz8 b;
    public final xz8 c;

    static {
        xz8.c cVar = xz8.c.c;
        d = new yz8(cVar, cVar, cVar);
    }

    public yz8(xz8 xz8Var, xz8 xz8Var2, xz8 xz8Var3) {
        xz8Var.getClass();
        xz8Var2.getClass();
        xz8Var3.getClass();
        this.a = xz8Var;
        this.b = xz8Var2;
        this.c = xz8Var3;
    }

    public static yz8 a(yz8 yz8Var, xz8 xz8Var, xz8 xz8Var2, xz8 xz8Var3, int i) {
        if ((i & 1) != 0) {
            xz8Var = yz8Var.a;
        }
        if ((i & 2) != 0) {
            xz8Var2 = yz8Var.b;
        }
        if ((i & 4) != 0) {
            xz8Var3 = yz8Var.c;
        }
        xz8Var.getClass();
        xz8Var2.getClass();
        xz8Var3.getClass();
        return new yz8(xz8Var, xz8Var2, xz8Var3);
    }

    public final yz8 b(zz8 zz8Var, xz8 xz8Var) {
        zz8Var.getClass();
        xz8Var.getClass();
        int iOrdinal = zz8Var.ordinal();
        if (iOrdinal == 0) {
            return a(this, xz8Var, null, null, 6);
        }
        if (iOrdinal == 1) {
            return a(this, null, xz8Var, null, 5);
        }
        if (iOrdinal == 2) {
            return a(this, null, null, xz8Var, 3);
        }
        l.g();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz8)) {
            return false;
        }
        yz8 yz8Var = (yz8) obj;
        return wl7.b(this.a, yz8Var.a) && wl7.b(this.b, yz8Var.b) && wl7.b(this.c, yz8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ')';
    }
}
