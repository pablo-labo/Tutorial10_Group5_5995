package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class vp2<T> implements r6e<T> {
    public final AtomicReference<r6e<T>> a;

    public vp2(r6e<? extends T> r6eVar) {
        this.a = new AtomicReference<>(r6eVar);
    }

    @Override // defpackage.r6e
    public final Iterator<T> iterator() {
        r6e<T> andSet = this.a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        r6.g("This sequence can be consumed only once.");
        return null;
    }
}
