package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u74 implements gw1 {
    public final o74 a;

    public u74(o74 o74Var) {
        this.a = o74Var;
    }

    @Override // defpackage.gw1
    public final void b(Throwable th) {
        this.a.dispose();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.a + ']';
    }
}
