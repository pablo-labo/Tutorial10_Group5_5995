package defpackage;

import defpackage.o7d;

/* JADX INFO: loaded from: classes3.dex */
public final class m9 implements rpa {
    public final /* synthetic */ qw1 a;
    public final /* synthetic */ o9 b;
    public final /* synthetic */ o9 c;
    public final /* synthetic */ ik0 d;
    public final /* synthetic */ jk0 e;

    public m9(qw1 qw1Var, o9 o9Var, o9 o9Var2, ik0 ik0Var, jk0 jk0Var) {
        this.a = qw1Var;
        this.b = o9Var;
        this.c = o9Var2;
        this.d = ik0Var;
        this.e = jk0Var;
    }

    @Override // defpackage.rpa
    public final void a(wi0 wi0Var) {
        Object aVar;
        qw1 qw1Var = this.a;
        if (qw1Var.v()) {
            this.b.b(this);
            try {
                o9 o9Var = this.c;
                aVar = o9Var.a.e("AppContext_rq#" + o9Var.b.getAndIncrement(), wi0Var, this.d, this.e);
            } catch (Throwable th) {
                aVar = new o7d.a(th);
            }
            qw1Var.resumeWith(aVar);
        }
    }
}
