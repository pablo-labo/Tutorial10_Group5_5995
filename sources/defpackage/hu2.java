package defpackage;

import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hu2 implements xpd {
    public final ThreadLocal<oc3> a = new ThreadLocal<>();
    public final LinkedList b = new LinkedList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final int d;
    public final pc3 e;

    public hu2(int i, pc3 pc3Var) {
        this.d = i;
        this.e = pc3Var;
    }

    @Override // defpackage.xpd
    public final doe activeSpan() {
        synchronized (this.b) {
            try {
                for (upd updVar : this.b) {
                    if (updVar.a()) {
                        return updVar.activeSpan();
                    }
                }
                oc3 oc3Var = this.a.get();
                if (oc3Var == null) {
                    return null;
                }
                return oc3Var.u1();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xpd
    public final spd b(doe doeVar) {
        return c(doeVar);
    }

    @Override // defpackage.xpd
    public final spd c(doe doeVar) {
        spd spdVarD = d();
        if (spdVarD instanceof oc3) {
            if (this.d <= ((oc3) spdVarD).g0()) {
                return pka.a;
            }
        }
        synchronized (this.b) {
            try {
                for (upd updVar : this.b) {
                    if (updVar.a()) {
                        return updVar.c(doeVar);
                    }
                }
                return doeVar instanceof rc3 ? new ju2(this, (rc3) doeVar, this.e) : new ige(this, doeVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xpd
    public final spd d() {
        synchronized (this.b) {
            try {
                for (upd updVar : this.b) {
                    if (updVar.a()) {
                        return updVar.d();
                    }
                }
                return this.a.get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
