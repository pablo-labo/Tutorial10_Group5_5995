package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class g3h {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(g3h.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(g3h.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(g3h.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(g3h.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray<naf> a = new AtomicReferenceArray<>(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final naf a(naf nafVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return nafVar;
        }
        if (nafVar.b) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray<naf> atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, nafVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final naf b() {
        naf andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.a.getAndSet(i2, null)) != null) {
                if (andSet.b) {
                    e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final naf c(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray<naf> atomicReferenceArray = this.a;
        naf nafVar = atomicReferenceArray.get(i2);
        if (nafVar != null && nafVar.b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, nafVar, null)) {
                if (atomicReferenceArray.get(i2) != nafVar) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return nafVar;
        }
        return null;
    }
}
