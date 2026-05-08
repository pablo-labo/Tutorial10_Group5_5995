package defpackage;

import defpackage.on2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class on2<N extends on2<N>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(on2.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(on2.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public on2(myd mydVar) {
        this._prev$volatile = mydVar;
    }

    public final void a() {
        b.set(this, null);
    }

    public final N c() {
        Object obj = a.get(this);
        if (obj == nn2.b) {
            return null;
        }
        return (N) obj;
    }

    public abstract boolean d();

    public final void e() {
        on2 on2VarC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            on2 on2Var = (on2) atomicReferenceFieldUpdater.get(this);
            while (on2Var != null && on2Var.d()) {
                on2Var = (on2) atomicReferenceFieldUpdater.get(on2Var);
            }
            on2 on2VarC2 = c();
            on2VarC2.getClass();
            while (on2VarC2.d() && (on2VarC = on2VarC2.c()) != null) {
                on2VarC2 = on2VarC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(on2VarC2);
                on2 on2Var2 = ((on2) obj) == null ? null : on2Var;
                while (!atomicReferenceFieldUpdater.compareAndSet(on2VarC2, obj, on2Var2)) {
                    if (atomicReferenceFieldUpdater.get(on2VarC2) != obj) {
                        break;
                    }
                }
            }
            if (on2Var != null) {
                a.set(on2Var, on2VarC2);
            }
            if (!on2VarC2.d() || on2VarC2.c() == null) {
                if (on2Var == null || !on2Var.d()) {
                    return;
                }
            }
        }
    }
}
