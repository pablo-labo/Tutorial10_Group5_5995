package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class bo7 extends bz7 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(bo7.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final wy7 e;

    public bo7(wy7 wy7Var) {
        this.e = wy7Var;
    }

    @Override // defpackage.bz7
    public final boolean i() {
        return true;
    }

    @Override // defpackage.bz7
    public final void j(Throwable th) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
