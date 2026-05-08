package androidx.work;

import android.content.Context;
import androidx.work.c;
import defpackage.fbe;
import defpackage.hp5;
import defpackage.hz8;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends c {
    fbe<c.a> mFuture;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Worker worker = Worker.this;
            try {
                worker.mFuture.i(worker.doWork());
            } catch (Throwable th) {
                worker.mFuture.j(th);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ fbe a;

        public b(fbe fbeVar) {
            this.a = fbeVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            fbe fbeVar = this.a;
            try {
                fbeVar.i(Worker.this.getForegroundInfo());
            } catch (Throwable th) {
                fbeVar.j(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract c.a doWork();

    public hp5 getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // androidx.work.c
    public hz8<hp5> getForegroundInfoAsync() {
        fbe fbeVar = new fbe();
        getBackgroundExecutor().execute(new b(fbeVar));
        return fbeVar;
    }

    @Override // androidx.work.c
    public final hz8<c.a> startWork() {
        this.mFuture = new fbe<>();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
