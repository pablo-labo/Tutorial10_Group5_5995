package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class dlf {
    public static final ExecutorService a = Executors.newSingleThreadExecutor();

    public static void a(Runnable runnable) {
        a.execute(runnable);
    }
}
