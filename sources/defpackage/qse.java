package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qse implements pse {
    public final iw0 a = new iw0(0);

    public final boolean y(int i) {
        return (this.a.get() & i) != 0;
    }

    public final void z(int i) {
        iw0 iw0Var;
        int i2;
        do {
            iw0Var = this.a;
            i2 = iw0Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!iw0Var.compareAndSet(i2, i2 | i));
    }
}
