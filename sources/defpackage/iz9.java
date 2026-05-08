package defpackage;

import defpackage.j2;
import defpackage.xp5;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class iz9 extends hz9 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public static final class a<V> extends xp5.a<V> implements ScheduledFuture {
        public final ScheduledFuture<?> c;

        public a(j2 j2Var, ScheduledFuture scheduledFuture) {
            super(j2Var);
            this.c = scheduledFuture;
        }

        @Override // defpackage.wp5, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            boolean zCancel = super.cancel(z);
            if (zCancel) {
                this.c.cancel(z);
            }
            return zCancel;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Delayed delayed) {
            return this.c.compareTo(delayed);
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return this.c.getDelay(timeUnit);
        }
    }

    public static final class b extends j2.i<Void> implements Runnable {
        public final Runnable W;

        public b(Runnable runnable) {
            runnable.getClass();
            this.W = runnable;
        }

        @Override // defpackage.j2
        public final String j() {
            return "task=[" + this.W + "]";
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.W.run();
            } catch (Throwable th) {
                m(th);
                throw th;
            }
        }
    }

    public iz9(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        quf qufVar = new quf(Executors.callable(runnable, null));
        return new a(qufVar, this.b.schedule(qufVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        b bVar = new b(runnable);
        return new a(bVar, this.b.scheduleAtFixedRate(bVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        b bVar = new b(runnable);
        return new a(bVar, this.b.scheduleWithFixedDelay(bVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        quf qufVar = new quf(callable);
        return new a(qufVar, this.b.schedule(qufVar, j, timeUnit));
    }
}
