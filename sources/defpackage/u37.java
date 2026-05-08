package defpackage;

import defpackage.j2;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class u37<V> implements hz8<V> {
    public static final u37 b = new u37(null);
    public static final vs8 c = new vs8(u37.class);
    public final V a;

    public static final class a<V> extends j2.i<V> {
    }

    public u37(V v) {
        this.a = v;
    }

    @Override // defpackage.hz8
    public final void a(Runnable runnable, Executor executor) {
        pnb.t(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.a + "]]";
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.a;
    }
}
