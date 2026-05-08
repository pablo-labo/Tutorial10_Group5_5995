package defpackage;

import defpackage.o7d;

/* JADX INFO: loaded from: classes.dex */
public final class d0d<T> implements o79 {
    public final /* synthetic */ qw1 a;

    public d0d(qw1 qw1Var) {
        this.a = qw1Var;
    }

    @Override // defpackage.o79
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        qw1 qw1Var = this.a;
        if (qw1Var.x()) {
            return;
        }
        th.getClass();
        qw1Var.resumeWith(new o7d.a(th));
    }
}
