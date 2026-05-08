package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class clf extends bz7 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater V = AtomicIntegerFieldUpdater.newUpdater(clf.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread e = Thread.currentThread();
    public o74 f;

    public static void l(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // defpackage.bz7
    public final boolean i() {
        return true;
    }

    @Override // defpackage.bz7
    public final void j(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = V;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                l(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = V;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        l(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                o74 o74Var = this.f;
                if (o74Var != null) {
                    o74Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}
