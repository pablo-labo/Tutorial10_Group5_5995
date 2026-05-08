package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n99 implements zgb {
    public final h00 a;
    public th7 b;
    public vl8 c;
    public th7 d;
    public lh7 e;

    public n99(h00 h00Var) {
        this.a = h00Var;
    }

    @Override // defpackage.zgb
    public final long e(ph7 ph7Var, long j, vl8 vl8Var, long j2) {
        lh7 lh7Var = this.e;
        if (lh7Var != null) {
            th7 th7Var = this.b;
            if ((th7Var == null ? false : th7.b(th7Var.a, j)) && this.c == vl8Var) {
                th7 th7Var2 = this.d;
                if (th7Var2 != null ? th7.b(th7Var2.a, j2) : false) {
                    return lh7Var.a;
                }
            }
        }
        long jE = this.a.e(ph7Var, j, vl8Var, j2);
        this.b = new th7(j);
        this.c = vl8Var;
        this.d = new th7(j2);
        this.e = new lh7(jE);
        return jE;
    }
}
