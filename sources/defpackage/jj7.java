package defpackage;

import com.google.j2objc.annotations.ReflectionSupport;
import defpackage.quf;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
@ReflectionSupport(ReflectionSupport.Level.FULL)
public abstract class jj7<T> extends AtomicReference<Runnable> implements Runnable {
    public static final b a = new b();
    public static final b b = new b();

    public static final class a extends AbstractOwnableSynchronizer implements Runnable {
        private final jj7<?> task;

        public a(quf.a aVar) {
            this.task = aVar;
        }

        public static void a(a aVar, Thread thread) {
            aVar.setExclusiveOwnerThread(thread);
        }

        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return this.task.toString();
        }
    }

    public static final class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public abstract T a();

    public abstract String b();

    public final void c(Thread thread) {
        Runnable runnable = get();
        a aVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof a;
            b bVar = b;
            if (!z2 && runnable != bVar) {
                break;
            }
            if (z2) {
                aVar = (a) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == bVar || compareAndSet(runnable, bVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(aVar);
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        T tA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            quf.a aVar = (quf.a) this;
            boolean zIsDone = quf.this.isDone();
            b bVar = a;
            if (!zIsDone) {
                try {
                    tA = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, bVar)) {
                            c(threadCurrentThread);
                        }
                        if (zIsDone) {
                            return;
                        }
                        quf.this.m(th);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, bVar)) {
                            c(threadCurrentThread);
                        }
                        if (!zIsDone) {
                            quf.this.l(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof a) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbG = h5.g(str, ", ");
        sbG.append(b());
        return sbG.toString();
    }
}
