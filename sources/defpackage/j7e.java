package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class j7e implements Executor {
    public final ArrayDeque<Runnable> a = new ArrayDeque<>();
    public Runnable b;
    public final Executor c;

    public class a implements Runnable {
        public final /* synthetic */ Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            j7e j7eVar = j7e.this;
            try {
                this.a.run();
            } finally {
                j7eVar.a();
            }
        }
    }

    public j7e(Executor executor) {
        this.c = executor;
    }

    public final synchronized void a() {
        Runnable runnablePoll = this.a.poll();
        this.b = runnablePoll;
        if (runnablePoll != null) {
            this.c.execute(runnablePoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.a.offer(new a(runnable));
        if (this.b == null) {
            a();
        }
    }
}
