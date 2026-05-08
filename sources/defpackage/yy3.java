package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yy3 {
    public final wy3 a = new wy3();
    public final wy3 b = new wy3();
    public final wy3 c = new wy3();

    public final void a(pm8 pm8Var, hm7 hm7Var) {
        int iOrdinal = hm7Var.ordinal();
        wy3 wy3Var = this.a;
        wy3 wy3Var2 = this.c;
        if (iOrdinal == 0) {
            wy3Var.c(pm8Var);
            wy3Var2.c(pm8Var);
            return;
        }
        wy3 wy3Var3 = this.b;
        if (iOrdinal == 1) {
            wy3Var3.c(pm8Var);
            wy3Var2.c(pm8Var);
            return;
        }
        if (iOrdinal == 2) {
            if (pm8Var.V != null) {
                wy3Var2.c(pm8Var);
                return;
            } else {
                wy3Var.c(pm8Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            l.g();
        } else if (pm8Var.V != null) {
            wy3Var2.c(pm8Var);
        } else {
            wy3Var3.c(pm8Var);
        }
    }

    public final boolean b(pm8 pm8Var) {
        return !(pm8Var.V == null) && (((one) this.a.b).contains(pm8Var) || ((one) this.b.b).contains(pm8Var));
    }

    public final boolean c() {
        return !(((one) this.a.b).isEmpty() && ((one) this.c.b).isEmpty() && ((one) this.b.b).isEmpty());
    }
}
