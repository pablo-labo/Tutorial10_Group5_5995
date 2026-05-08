package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class q71 {
    public static ExecutorService a;

    public static synchronized Executor a() {
        try {
            if (a == null) {
                String str = vjg.a;
                a = Executors.newSingleThreadExecutor(new sjg("ExoPlayer:BackgroundExecutor"));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }
}
