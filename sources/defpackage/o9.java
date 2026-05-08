package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o9 implements hk0, xi0 {
    public final ok0 a;
    public final AtomicInteger b = new AtomicInteger();
    public final zi0 c = new zi0();

    public o9(gk0 gk0Var) {
        this.a = new ok0(gk0Var);
        u63.Y(ba6.a, null, null, new l9(this, null), 3);
    }

    @Override // defpackage.hk0
    public final Object a(ik0 ik0Var, jk0 jk0Var, c1f c1fVar) {
        qw1 qw1Var = new qw1(1, ewa.v(c1fVar));
        qw1Var.q();
        m9 m9Var = new m9(qw1Var, this, this, ik0Var, jk0Var);
        this.c.a(m9Var);
        qw1Var.t(new n9(0, this, m9Var));
        return qw1Var.p();
    }

    @Override // defpackage.xi0
    public final void b(rpa rpaVar) {
        zi0 zi0Var = this.c;
        zi0Var.getClass();
        zi0Var.a.remove(rpaVar);
    }
}
