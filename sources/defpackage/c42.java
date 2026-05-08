package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class c42 extends bz7 {
    public final qw1<?> e;

    public c42(qw1<?> qw1Var) {
        this.e = qw1Var;
    }

    @Override // defpackage.bz7
    public final boolean i() {
        return true;
    }

    @Override // defpackage.bz7
    public final void j(Throwable th) {
        d78 d78VarH = h();
        qw1<?> qw1Var = this.e;
        Throwable thO = qw1Var.o(d78VarH);
        if (qw1Var.y()) {
            lu2<?> lu2Var = qw1Var.d;
            lu2Var.getClass();
            v64 v64Var = (v64) lu2Var;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v64.W;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(v64Var);
                ux0 ux0Var = mh2.W;
                if (!wl7.b(obj, ux0Var)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(v64Var, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(v64Var) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(v64Var, ux0Var, thO)) {
                    if (atomicReferenceFieldUpdater.get(v64Var) != ux0Var) {
                        break;
                    }
                }
                return;
            }
        }
        qw1Var.g(thO);
        if (qw1Var.y()) {
            return;
        }
        qw1Var.m();
    }
}
