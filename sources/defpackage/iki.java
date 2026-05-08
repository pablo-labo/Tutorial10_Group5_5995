package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class iki extends v1 {
    public final jb6 b = new jb6(4);

    @Override // defpackage.v1
    public final void v0(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        jb6 jb6Var = this.b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) jb6Var.a;
        ReferenceQueue referenceQueue = (ReferenceQueue) jb6Var.b;
        for (Reference referencePoll = referenceQueue.poll(); referencePoll != null; referencePoll = referenceQueue.poll()) {
            concurrentHashMap.remove(referencePoll);
        }
        List vector = (List) concurrentHashMap.get(new rki(th, null));
        if (vector == null) {
            vector = new Vector(2);
            List list = (List) concurrentHashMap.putIfAbsent(new rki(th, referenceQueue), vector);
            if (list != null) {
                vector = list;
            }
        }
        vector.add(th2);
    }
}
