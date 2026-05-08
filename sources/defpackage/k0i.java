package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class k0i extends Thread {
    public final Object a;
    public final BlockingQueue<c0i<?>> b;
    public boolean c = false;
    public final /* synthetic */ a0i d;

    public k0i(a0i a0iVar, String str, BlockingQueue<c0i<?>> blockingQueue) {
        this.d = a0iVar;
        fib.i(blockingQueue);
        this.a = new Object();
        this.b = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.d.X) {
            try {
                if (!this.c) {
                    this.d.Y.release();
                    this.d.X.notifyAll();
                    a0i a0iVar = this.d;
                    if (this == a0iVar.c) {
                        a0iVar.c = null;
                    } else if (this == a0iVar.d) {
                        a0iVar.d = null;
                    } else {
                        a0iVar.zzr().f.b("Current scheduler thread is neither worker nor network");
                    }
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.d.Y.acquire();
                z = true;
            } catch (InterruptedException e) {
                this.d.zzr().X.a(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                c0i<?> c0iVarPoll = this.b.poll();
                if (c0iVarPoll != null) {
                    Process.setThreadPriority(c0iVarPoll.b ? threadPriority : 10);
                    c0iVarPoll.run();
                } else {
                    synchronized (this.a) {
                        if (this.b.peek() == null) {
                            try {
                                this.a.wait(30000L);
                            } catch (InterruptedException e2) {
                                this.d.zzr().X.a(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.d.X) {
                        try {
                            if (this.b.peek() == null) {
                                break;
                            }
                        } finally {
                        }
                    }
                }
            }
            if (this.d.a.V.k(null, djh.x0)) {
                a();
            }
            a();
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
