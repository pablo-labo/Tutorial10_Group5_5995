package defpackage;

import defpackage.x7b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class vc2 extends AbstractExecutorService implements AutoCloseable {
    public static final vc2 b = new vc2();
    public final ScheduledExecutorService a;

    public static class a<T> implements Runnable {
        public final WeakReference<T> a;
        public final x7b.b b = x7b.b.a;

        public a(x7b.a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            T t = this.a.get();
            if (t != null) {
                this.b.getClass();
                ((x7b.a) t).run();
            }
        }
    }

    public static final class b extends Thread {
        public final ScheduledExecutorService a;

        public b(ScheduledExecutorService scheduledExecutorService) {
            super("dd-exec-shutdown-hook");
            this.a = scheduledExecutorService;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ScheduledExecutorService scheduledExecutorService = this.a;
            scheduledExecutorService.shutdown();
            try {
                if (scheduledExecutorService.awaitTermination(5L, TimeUnit.SECONDS)) {
                    return;
                }
                scheduledExecutorService.shutdownNow();
            } catch (InterruptedException unused) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    public vc2() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(bd3.a);
        this.a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        try {
            Runtime.getRuntime().addShutdownHook(new b(scheduledExecutorServiceNewSingleThreadScheduledExecutor));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.a.shutdownNow();
    }
}
