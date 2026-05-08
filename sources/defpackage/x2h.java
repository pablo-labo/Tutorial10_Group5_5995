package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class x2h implements qaf {
    public final k7e a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final a c = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            x2h.this.b.post(runnable);
        }
    }

    public x2h(ExecutorService executorService) {
        this.a = new k7e(executorService);
    }
}
