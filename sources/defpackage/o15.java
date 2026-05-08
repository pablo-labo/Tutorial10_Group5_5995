package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class o15 {
    public static ScheduledExecutorService a;
    public static int b;

    static {
        new o15();
        b = kq4.h;
    }

    public static final void a(boolean z, String str, Runnable runnable) {
        n15 n15Var = new n15(str, z);
        ExecutorService executorServiceC = c();
        if (executorServiceC != null) {
            try {
                executorServiceC.execute(new x71(2, runnable, n15Var));
            } catch (Exception e) {
                n15Var.a(e);
            }
        }
    }

    public static final Future<?> b(Callable<?> callable) {
        try {
            ExecutorService executorServiceC = c();
            if (executorServiceC != null) {
                return executorServiceC.submit(callable);
            }
            return null;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to submit task";
            }
            c49.b("Executor", message, new Object[0]);
            return null;
        }
    }

    public static final synchronized ExecutorService c() {
        if (a == null) {
            try {
                a = Executors.newScheduledThreadPool(b);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "Failed to create thread pool";
                }
                c49.b("Executor", message, new Object[0]);
            }
        }
        return a;
    }
}
