package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k70 {
    public static final k70 b = new k70();
    public static final int c;
    public static final int d;
    public final a a = new a();

    public static class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        c = iAvailableProcessors + 1;
        d = (iAvailableProcessors * 2) + 1;
    }
}
