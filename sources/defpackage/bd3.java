package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class bd3 implements ThreadFactory {
    public static final bd3 a = new bd3();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "dd-task-scheduler");
        thread.setDaemon(true);
        thread.setContextClassLoader(null);
        return thread;
    }
}
