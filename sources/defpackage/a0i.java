package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class a0i extends j3i {
    public static final AtomicLong Z = new AtomicLong(Long.MIN_VALUE);
    public final g0i V;
    public final g0i W;
    public final Object X;
    public final Semaphore Y;
    public k0i c;
    public k0i d;
    public final PriorityBlockingQueue<c0i<?>> e;
    public final LinkedBlockingQueue f;

    public a0i(i0i i0iVar) {
        super(i0iVar);
        this.X = new Object();
        this.Y = new Semaphore(2);
        this.e = new PriorityBlockingQueue<>();
        this.f = new LinkedBlockingQueue();
        this.V = new g0i(this, "Thread death: Uncaught exception on worker thread");
        this.W = new g0i(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // defpackage.c1i
    public final void b() {
        if (Thread.currentThread() == this.c) {
            return;
        }
        r6.g("Call expected from worker thread");
    }

    @Override // defpackage.j3i
    public final boolean i() {
        return false;
    }

    public final <T> T j(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzq().m(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                zzr().X.b(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            zzr().X.b(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return t;
    }

    public final c0i k(Callable callable) {
        g();
        c0i<?> c0iVar = new c0i<>(this, callable, false);
        if (Thread.currentThread() != this.c) {
            l(c0iVar);
            return c0iVar;
        }
        if (!this.e.isEmpty()) {
            zzr().X.b("Callable skipped the worker queue.");
        }
        c0iVar.run();
        return c0iVar;
    }

    public final void l(c0i<?> c0iVar) {
        synchronized (this.X) {
            try {
                this.e.add(c0iVar);
                k0i k0iVar = this.c;
                if (k0iVar == null) {
                    k0i k0iVar2 = new k0i(this, "Measurement Worker", this.e);
                    this.c = k0iVar2;
                    k0iVar2.setUncaughtExceptionHandler(this.V);
                    this.c.start();
                } else {
                    synchronized (k0iVar.a) {
                        k0iVar.a.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(Runnable runnable) {
        g();
        l(new c0i<>(this, runnable, "Task exception on worker thread"));
    }

    public final void n(Runnable runnable) {
        g();
        c0i c0iVar = new c0i(this, runnable, "Task exception on network thread");
        synchronized (this.X) {
            try {
                this.f.add(c0iVar);
                k0i k0iVar = this.d;
                if (k0iVar == null) {
                    k0i k0iVar2 = new k0i(this, "Measurement Network", this.f);
                    this.d = k0iVar2;
                    k0iVar2.setUncaughtExceptionHandler(this.W);
                    this.d.start();
                } else {
                    synchronized (k0iVar.a) {
                        k0iVar.a.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        r6.g("Call expected from network thread");
    }
}
