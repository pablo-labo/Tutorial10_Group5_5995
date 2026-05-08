package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class kug<T> extends WeakReference<T> {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kug(T t, ReferenceQueue<T> referenceQueue) {
        super(t, referenceQueue);
        referenceQueue.getClass();
        this.a = t != null ? t.hashCode() : 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kug) {
            return this == obj || wl7.b(get(), ((kug) obj).get());
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public kug(T t) {
        super(t);
        this.a = t != null ? t.hashCode() : 0;
    }
}
