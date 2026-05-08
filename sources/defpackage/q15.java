package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class q15 extends p15 implements js3 {
    public final Executor c;

    public q15(Executor executor) {
        Method method;
        this.c = executor;
        Method method2 = mn2.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = mn2.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.js3
    public final o74 R0(long j, lmf lmfVar, v03 v03Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(lmfVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                u63.o(v03Var, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new n74(scheduledFutureSchedule) : en3.Y.R0(j, lmfVar, v03Var);
    }

    @Override // defpackage.js3
    public final void b0(long j, qw1 qw1Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            t9d t9dVar = new t9d(this, qw1Var);
            v03 v03Var = qw1Var.e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(t9dVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                u63.o(v03Var, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            qw1Var.u(new fw1(scheduledFutureSchedule));
        } else {
            en3.Y.b0(j, qw1Var);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q15) && ((q15) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // defpackage.y03
    public final String toString() {
        return this.c.toString();
    }

    @Override // defpackage.y03
    public final void v1(v03 v03Var, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            u63.o(v03Var, cancellationException);
            eq3 eq3Var = a74.a;
            no3.c.v1(v03Var, runnable);
        }
    }
}
