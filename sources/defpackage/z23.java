package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class z23 implements Callable<Void> {
    public final /* synthetic */ i33 a;

    public z23(i33 i33Var) {
        this.a = i33Var;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.a.run();
        return null;
    }
}
