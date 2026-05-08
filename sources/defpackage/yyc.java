package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class yyc implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ h5 b;

    public yyc(ExecutorService executorService, h5 h5Var) {
        this.a = executorService;
        this.b = h5Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
