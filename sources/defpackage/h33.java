package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class h33 implements Callable<Void> {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ g33 c;

    public h33(g33 g33Var, long j, String str) {
        this.c = g33Var;
        this.a = j;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        g33 g33Var = this.c;
        e43 e43Var = g33Var.n;
        if (e43Var != null && e43Var.e.get()) {
            return null;
        }
        e39 e39Var = g33Var.i;
        e39Var.b.c(this.a, this.b);
        return null;
    }
}
