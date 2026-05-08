package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class rki extends WeakReference<Throwable> {
    public final int a;

    public rki(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == rki.class) {
            if (this == obj) {
                return true;
            }
            rki rkiVar = (rki) obj;
            if (this.a == rkiVar.a && get() == rkiVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
