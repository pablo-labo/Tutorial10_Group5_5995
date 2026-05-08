package com.datadog.android.rum.internal.thread;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ!\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a\"\u0004\b\u0000\u0010\u00172\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a\"\u0004\b\u0000\u0010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001eJ\u001f\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001fJ;\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0018\u00010\n\"\u0004\b\u0000\u0010\u00172\u0016\u0010!\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#JM\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0018\u00010\n\"\u0004\b\u0000\u0010\u00172\u0016\u0010!\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0018\u00010 2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\"\u0010$J/\u0010%\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\u0016\u0010!\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0018\u00010 H\u0016¢\u0006\u0004\b%\u0010&JA\u0010%\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\u0016\u0010!\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0018\u00010 2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b%\u0010'J1\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010)2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b*\u0010+J?\u0010*\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010)\"\u0004\b\u0000\u0010,2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00182\u0006\u0010(\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b*\u0010.J9\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u00010)2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b1\u00102J9\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010)2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010/\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b3\u00102¨\u00064"}, d2 = {"Lcom/datadog/android/rum/internal/thread/NoOpScheduledExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "Lj6g;", "execute", "(Ljava/lang/Runnable;)V", "shutdown", "", "shutdownNow", "()Ljava/util/List;", "", "isShutdown", "()Z", "isTerminated", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)Z", "T", "Ljava/util/concurrent/Callable;", "task", "Ljava/util/concurrent/Future;", "submit", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "result", "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "", "tasks", "invokeAll", "(Ljava/util/Collection;)Ljava/util/List;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;", "invokeAny", "(Ljava/util/Collection;)Ljava/lang/Object;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "delay", "Ljava/util/concurrent/ScheduledFuture;", "schedule", "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "V", "callable", "(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "initialDelay", "period", "scheduleAtFixedRate", "(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "scheduleWithFixedDelay", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpScheduledExecutorService implements ScheduledExecutorService, AutoCloseable {
    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long timeout, TimeUnit unit) {
        return false;
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
    public void execute(Runnable command) {
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        return null;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
        return null;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable task) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) {
        return null;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable task, T result) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> task) {
        return null;
    }
}
