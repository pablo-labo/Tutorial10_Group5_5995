package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class brf implements Executor {
    public final Executor a;
    public final ArrayDeque<Runnable> b;
    public Runnable c;
    public final Object d;

    public brf(Executor executor) {
        executor.getClass();
        this.a = executor;
        this.b = new ArrayDeque<>();
        this.d = new Object();
    }

    public final void a() {
        synchronized (this.d) {
            try {
                Runnable runnablePoll = this.b.poll();
                Runnable runnable = runnablePoll;
                this.c = runnable;
                if (runnablePoll != null) {
                    this.a.execute(runnable);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.d) {
            try {
                this.b.offer(new kl3(3, runnable, this));
                if (this.c == null) {
                    a();
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
