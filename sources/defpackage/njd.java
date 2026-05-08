package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class njd implements Executor {
    public final Executor a;

    public static class a implements Runnable {
        public final Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.a.run();
            } catch (Exception e) {
                i49.b("Executor", "Background execution failure.", e);
            }
        }
    }

    public njd(ExecutorService executorService) {
        this.a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new a(runnable));
    }
}
