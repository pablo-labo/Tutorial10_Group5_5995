package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x9i implements Runnable {
    public final TaskCompletionSource a;

    public x9i() {
        this.a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            TaskCompletionSource taskCompletionSource = this.a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e);
            }
        }
    }

    public x9i(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }
}
