package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class v15 {
    public static ExecutorService a(String str) {
        t15 t15Var = new t15(str, new AtomicLong(1L));
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), t15Var, discardPolicy));
        Runtime.getRuntime().addShutdownHook(new Thread(new u15(str, executorServiceUnconfigurableExecutorService), "Crashlytics Shutdown Hook for ".concat(str)));
        return executorServiceUnconfigurableExecutorService;
    }
}
