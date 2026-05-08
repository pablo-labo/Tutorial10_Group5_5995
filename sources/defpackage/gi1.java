package defpackage;

import com.datadog.android.core.internal.CoreFeature;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gi1 {
    public static final gi1 d = new gi1();
    public final ExecutorService a;
    public final ScheduledExecutorService b;
    public final a c;

    public static class a implements Executor {
        public ThreadLocal<Integer> a;

        public final void a() {
            ThreadLocal<Integer> threadLocal = this.a;
            Integer num = threadLocal.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Integer.valueOf(iIntValue));
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ThreadLocal<Integer> threadLocal = this.a;
            Integer num = threadLocal.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            threadLocal.set(Integer.valueOf(iIntValue));
            try {
                if (iIntValue <= 15) {
                    runnable.run();
                } else {
                    gi1.d.a.execute(runnable);
                }
                a();
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    public gi1() {
        ExecutorService executorServiceNewCachedThreadPool;
        String property = System.getProperty("java.runtime.name");
        if (property == null ? false : property.toLowerCase(Locale.US).contains(CoreFeature.DEFAULT_SOURCE_NAME)) {
            k70 k70Var = k70.b;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(k70.c, k70.d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            executorServiceNewCachedThreadPool = threadPoolExecutor;
        } else {
            executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        }
        this.a = executorServiceNewCachedThreadPool;
        this.b = Executors.newSingleThreadScheduledExecutor();
        a aVar = new a();
        aVar.a = new ThreadLocal<>();
        this.c = aVar;
    }
}
