package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class ozd<R> implements gw1, pzd, ttg {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ozd.class, Object.class, "state$volatile");
    private volatile /* synthetic */ Object state$volatile;

    public final class a {
    }

    @Override // defpackage.ttg
    public final void a(myd<?> mydVar, int i) {
    }

    @Override // defpackage.gw1
    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == ypd.a0) {
                return;
            }
            ux0 ux0Var = ypd.b0;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ux0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.pzd
    public final boolean c(Object obj, Object obj2) {
        return d(obj) == 0;
    }

    public final int d(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof pw1)) {
                if (wl7.b(obj2, ypd.a0) || (obj2 instanceof a)) {
                    return 3;
                }
                if (wl7.b(obj2, ypd.b0)) {
                    return 2;
                }
                if (wl7.b(obj2, ypd.Z)) {
                    List listZ = u63.Z(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, listZ)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj2 instanceof List)) {
                    ja.i(obj2, "Unexpected state: ");
                    return 0;
                }
                ArrayList arrayListG1 = z92.g1(obj, (Collection) obj2);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, arrayListG1)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return 1;
            }
        }
    }
}
