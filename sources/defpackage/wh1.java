package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class wh1<T> extends p1<T> {
    public final Thread d;
    public final d05 e;

    public wh1(v03 v03Var, Thread thread, d05 d05Var) {
        super(v03Var, true);
        this.d = thread;
        this.e = d05Var;
    }

    @Override // defpackage.d78
    public final void m(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.d;
        if (wl7.b(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
