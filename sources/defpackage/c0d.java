package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c0d<T> implements o79 {
    public final /* synthetic */ qw1 a;

    public c0d(qw1 qw1Var) {
        this.a = qw1Var;
    }

    @Override // defpackage.o79
    public final void onResult(T t) {
        qw1 qw1Var = this.a;
        if (qw1Var.x()) {
            return;
        }
        qw1Var.resumeWith(t);
    }
}
