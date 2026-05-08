package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class qc3 {
    public volatile long a;
    public volatile Object b;

    static {
        AtomicLongFieldUpdater.newUpdater(qc3.class, "a");
        AtomicReferenceFieldUpdater.newUpdater(qc3.class, Object.class, "b");
        vn2.y1.o1.k(Arrays.asList("legacy"), "", ".e2e.duration.enabled", false);
    }

    public final String toString() {
        throw null;
    }
}
