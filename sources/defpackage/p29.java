package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class p29<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(p29.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new q29(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            q29 q29Var = (q29) atomicReferenceFieldUpdater.get(this);
            int iA = q29Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                q29<E> q29VarC = q29Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, q29Var, q29VarC) && atomicReferenceFieldUpdater.get(this) == q29Var) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            q29 q29Var = (q29) atomicReferenceFieldUpdater.get(this);
            if (q29Var.b()) {
                return;
            }
            q29<E> q29VarC = q29Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, q29Var, q29VarC) && atomicReferenceFieldUpdater.get(this) == q29Var) {
            }
        }
    }

    public final int c() {
        q29 q29Var = (q29) a.get(this);
        q29Var.getClass();
        long j = q29.f.get(q29Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final E d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            q29 q29Var = (q29) atomicReferenceFieldUpdater.get(this);
            E e = (E) q29Var.d();
            if (e != q29.g) {
                return e;
            }
            q29<E> q29VarC = q29Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, q29Var, q29VarC) && atomicReferenceFieldUpdater.get(this) == q29Var) {
            }
        }
    }
}
