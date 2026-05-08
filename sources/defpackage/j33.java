package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class j33 implements Callable<Void> {
    public final /* synthetic */ String a;
    public final /* synthetic */ g33 b;

    public j33(g33 g33Var, String str) {
        this.b = g33Var;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        g33.a(this.b, this.a, Boolean.FALSE);
        return null;
    }
}
