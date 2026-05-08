package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class a33 {
    public final Executor a;
    public Task<Void> b = Tasks.forResult(null);
    public final Object c = new Object();
    public final ThreadLocal<Boolean> d = new ThreadLocal<>();

    public a33(ExecutorService executorService) {
        this.a = executorService;
        executorService.execute(new y23(this));
    }

    public final <T> Task<T> a(Callable<T> callable) {
        Task<T> task;
        synchronized (this.c) {
            task = (Task<T>) this.b.continueWith(this.a, new i62(callable));
            this.b = task.continueWith(this.a, new wg2(22));
        }
        return task;
    }

    public final <T> Task<T> b(Callable<Task<T>> callable) {
        Task<T> task;
        synchronized (this.c) {
            task = (Task<T>) this.b.continueWithTask(this.a, new i62(callable));
            this.b = task.continueWith(this.a, new wg2(22));
        }
        return task;
    }
}
