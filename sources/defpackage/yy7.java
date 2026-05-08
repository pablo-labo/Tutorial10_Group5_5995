package defpackage;

import defpackage.f2;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class yy7<R> implements hz8<R> {
    public final fbe<R> a;

    public yy7() {
        throw null;
    }

    public yy7(qy7 qy7Var) {
        this.a = new fbe<>();
        qy7Var.d0(new xy7(this));
    }

    @Override // defpackage.hz8
    public final void a(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.a instanceof f2.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
