package defpackage;

import defpackage.mt3;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class lt3 implements ScheduledExecutorService, AutoCloseable {
    public final ExecutorService a;
    public final ScheduledExecutorService b;

    public lt3(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.a = executorService;
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new mt3(new mt3.b() { // from class: ct3
            @Override // mt3.b
            public final ScheduledFuture a(final mt3.a aVar) {
                final lt3 lt3Var = this.a;
                ScheduledExecutorService scheduledExecutorService = lt3Var.b;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.schedule(new Runnable() { // from class: it3
                    @Override // java.lang.Runnable
                    public final void run() {
                        lt3Var.a.execute(new zm3(1, runnable2, aVar));
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new mt3(new mt3.b() { // from class: ft3
            @Override // mt3.b
            public final ScheduledFuture a(mt3.a aVar) {
                lt3 lt3Var = this.a;
                return lt3Var.b.scheduleAtFixedRate(new ta0(2, lt3Var, runnable, aVar), j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new mt3(new mt3.b() { // from class: gt3
            @Override // mt3.b
            public final ScheduledFuture a(final mt3.a aVar) {
                final lt3 lt3Var = this.a;
                ScheduledExecutorService scheduledExecutorService = lt3Var.b;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: kt3
                    @Override // java.lang.Runnable
                    public final void run() {
                        lt3Var.a.execute(new et3(0, runnable2, aVar));
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.a.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.a.submit(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new mt3(new mt3.b() { // from class: ht3
            @Override // mt3.b
            public final ScheduledFuture a(mt3.a aVar) {
                lt3 lt3Var = this.a;
                return lt3Var.b.schedule(new jt3(0, lt3Var, callable, aVar), j, timeUnit);
            }
        });
    }
}
