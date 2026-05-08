package defpackage;

import bolts.ExecutorException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class haf implements mu2<Object, Void> {
    public final /* synthetic */ qq2 a;
    public final /* synthetic */ mu2 b;
    public final /* synthetic */ Executor c;

    public haf(qq2 qq2Var, mu2 mu2Var, Executor executor) {
        this.a = qq2Var;
        this.b = mu2Var;
        this.c = executor;
    }

    @Override // defpackage.mu2
    public final void a(oaf oafVar) {
        qq2 qq2Var = this.a;
        mu2 mu2Var = this.b;
        try {
            this.c.execute(new iaf(qq2Var, mu2Var, oafVar));
        } catch (Exception e) {
            qq2Var.e(new ExecutorException(e));
        }
    }
}
