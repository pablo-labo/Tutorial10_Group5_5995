package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class evh extends WeakReference<Throwable> {
    public final int a;

    public evh(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == evh.class) {
            if (this == obj) {
                return true;
            }
            evh evhVar = (evh) obj;
            if (this.a == evhVar.a && get() == evhVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
