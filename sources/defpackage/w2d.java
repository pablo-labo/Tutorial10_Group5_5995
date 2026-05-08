package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w2d implements htf {
    public final /* synthetic */ x2d a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ d43 d;

    public /* synthetic */ w2d(x2d x2dVar, TaskCompletionSource taskCompletionSource, boolean z, d43 d43Var) {
        this.a = x2dVar;
        this.b = taskCompletionSource;
        this.c = z;
        this.d = d43Var;
    }

    @Override // defpackage.htf
    public final void b(Exception exc) throws Throwable {
        TaskCompletionSource taskCompletionSource = this.b;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.c) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new dt3(6, this.a, countDownLatch)).start();
            ExecutorService executorService = dkg.a;
            boolean z2 = false;
            try {
                long jNanoTime = 2000000000;
                long jNanoTime2 = System.nanoTime() + 2000000000;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            jNanoTime = jNanoTime2 - System.nanoTime();
                            z2 = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        }
        taskCompletionSource.trySetResult(this.d);
    }
}
