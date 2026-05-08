package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class sth extends v1 {
    public final t23 b;

    public sth() {
        t23 t23Var = new t23();
        t23Var.a = new ConcurrentHashMap(16, 0.75f, 10);
        t23Var.b = new ReferenceQueue();
        this.b = t23Var;
    }

    @Override // defpackage.v1
    public final void v0(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        t23 t23Var = this.b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) t23Var.a;
        ReferenceQueue referenceQueue = (ReferenceQueue) t23Var.b;
        for (Reference referencePoll = referenceQueue.poll(); referencePoll != null; referencePoll = referenceQueue.poll()) {
            concurrentHashMap.remove(referencePoll);
        }
        List vector = (List) concurrentHashMap.get(new lth(th, null));
        if (vector == null) {
            vector = new Vector(2);
            List list = (List) concurrentHashMap.putIfAbsent(new lth(th, referenceQueue), vector);
            if (list != null) {
                vector = list;
            }
        }
        vector.add(th2);
    }
}
