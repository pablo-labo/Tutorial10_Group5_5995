package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ige implements oc3 {
    public final hu2 a;
    public final doe b;
    public final oc3 c;
    public final int d;

    public ige(hu2 hu2Var, doe doeVar) {
        this.a = hu2Var;
        this.b = doeVar;
        ThreadLocal<oc3> threadLocal = hu2Var.a;
        oc3 oc3Var = threadLocal.get();
        this.c = oc3Var;
        threadLocal.set(this);
        this.d = oc3Var == null ? 0 : oc3Var.g0() + 1;
        Iterator it = hu2Var.c.iterator();
        while (it.hasNext()) {
            ((wpd) it.next()).afterScopeActivated();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        hu2 hu2Var = this.a;
        ThreadLocal<oc3> threadLocal = hu2Var.a;
        CopyOnWriteArrayList copyOnWriteArrayList = hu2Var.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((wpd) it.next()).afterScopeClosed();
        }
        if (threadLocal.get() == this) {
            oc3 oc3Var = this.c;
            threadLocal.set(oc3Var);
            if (oc3Var != null) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((wpd) it2.next()).afterScopeActivated();
                }
            }
        }
    }

    @Override // defpackage.oc3
    public final int g0() {
        return this.d;
    }

    @Override // defpackage.oc3
    public final doe u1() {
        return this.b;
    }
}
