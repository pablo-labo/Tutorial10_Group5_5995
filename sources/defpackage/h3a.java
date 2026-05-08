package defpackage;

import defpackage.xz8;

/* JADX INFO: loaded from: classes.dex */
public final class h3a {
    public xz8 a;
    public xz8 b;
    public xz8 c;

    public h3a() {
        xz8.c cVar = xz8.c.c;
        this.a = cVar;
        this.b = cVar;
        this.c = cVar;
    }

    public final xz8 a(zz8 zz8Var) {
        zz8Var.getClass();
        int iOrdinal = zz8Var.ordinal();
        if (iOrdinal == 0) {
            return this.a;
        }
        if (iOrdinal == 1) {
            return this.b;
        }
        if (iOrdinal == 2) {
            return this.c;
        }
        l.g();
        return null;
    }

    public final void b(yz8 yz8Var) {
        yz8Var.getClass();
        this.a = yz8Var.a;
        this.c = yz8Var.c;
        this.b = yz8Var.b;
    }

    public final void c(zz8 zz8Var, xz8 xz8Var) {
        zz8Var.getClass();
        xz8Var.getClass();
        int iOrdinal = zz8Var.ordinal();
        if (iOrdinal == 0) {
            this.a = xz8Var;
            return;
        }
        if (iOrdinal == 1) {
            this.b = xz8Var;
        } else if (iOrdinal == 2) {
            this.c = xz8Var;
        } else {
            l.g();
        }
    }

    public final yz8 d() {
        return new yz8(this.a, this.b, this.c);
    }
}
