package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class qf5 implements Callable<Void> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ q33 b;
    public final /* synthetic */ nbe c;

    public qf5(boolean z, q33 q33Var, nbe nbeVar) {
        this.a = z;
        this.b = q33Var;
        this.c = nbeVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        if (!this.a) {
            return null;
        }
        q33 q33Var = this.b;
        final ExecutorService executorService = q33Var.l;
        final m33 m33Var = new m33(0, q33Var, this.c);
        ExecutorService executorService2 = dkg.a;
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new Runnable() { // from class: bkg
            @Override // java.lang.Runnable
            public final void run() {
                m33 m33Var2 = m33Var;
                Executor executor = executorService;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    ((Task) m33Var2.call()).continueWith(executor, new wk3(taskCompletionSource2, 8));
                } catch (Exception e) {
                    taskCompletionSource2.setException(e);
                }
            }
        });
        taskCompletionSource.getTask();
        return null;
    }
}
