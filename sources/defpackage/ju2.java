package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ju2 implements oc3, Closeable {
    public final int V;
    public final hu2 a;
    public final rc3 b;
    public final pc3 c;
    public final c0h d;
    public final AtomicInteger e;
    public final oc3 f;

    public ju2(hu2 hu2Var, rc3 rc3Var, pc3 pc3Var) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        new AtomicBoolean(false);
        this.a = hu2Var;
        this.e = atomicInteger;
        this.b = rc3Var;
        this.c = pc3Var;
        sc3 sc3Var = rc3Var.b;
        pc3Var.getClass();
        this.d = c0h.a0;
        ThreadLocal<oc3> threadLocal = hu2Var.a;
        oc3 oc3Var = threadLocal.get();
        this.f = oc3Var;
        threadLocal.set(this);
        this.V = oc3Var != null ? oc3Var.g0() + 1 : 0;
        Iterator it = hu2Var.c.iterator();
        while (it.hasNext()) {
            ((wpd) it.next()).afterScopeActivated();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.getClass();
        this.e.decrementAndGet();
        hu2 hu2Var = this.a;
        CopyOnWriteArrayList copyOnWriteArrayList = hu2Var.c;
        ThreadLocal<oc3> threadLocal = hu2Var.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((wpd) it.next()).afterScopeClosed();
        }
        if (threadLocal.get() == this) {
            oc3 oc3Var = this.f;
            threadLocal.set(oc3Var);
            if (oc3Var != null) {
                Iterator it2 = hu2Var.c.iterator();
                while (it2.hasNext()) {
                    ((wpd) it2.next()).afterScopeActivated();
                }
            }
        }
    }

    @Override // defpackage.oc3
    public final int g0() {
        return this.V;
    }

    public final String toString() {
        return super.toString() + "->" + this.b;
    }

    @Override // defpackage.oc3
    public final doe u1() {
        return this.b;
    }
}
