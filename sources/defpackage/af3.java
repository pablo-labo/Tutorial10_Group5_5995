package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class af3 implements fze {
    @Override // defpackage.fze
    public final Object get() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return executorServiceNewSingleThreadExecutor instanceof mz8 ? (mz8) executorServiceNewSingleThreadExecutor : executorServiceNewSingleThreadExecutor instanceof ScheduledExecutorService ? new iz9((ScheduledExecutorService) executorServiceNewSingleThreadExecutor) : new hz9(executorServiceNewSingleThreadExecutor);
    }
}
