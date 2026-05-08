package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lk0<I extends Serializable, O> {
    public final Object a(Serializable serializable, c1f c1fVar) {
        qw1 qw1Var = new qw1(1, ewa.v(c1fVar));
        qw1Var.q();
        b(serializable, new kk0(qw1Var));
        return qw1Var.p();
    }

    public abstract void b(Serializable serializable, kk0 kk0Var);
}
