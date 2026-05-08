package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lm7 extends qv5 implements Function1<Set<? extends Integer>, j6g> {
    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Set<? extends Integer> set) {
        set.getClass();
        km7 km7Var = (km7) this.receiver;
        ReentrantLock reentrantLock = km7Var.d;
        reentrantLock.lock();
        try {
            List listZ1 = z92.z1(km7Var.c.values());
            reentrantLock.unlock();
            Iterator it = listZ1.iterator();
            if (!it.hasNext()) {
                return j6g.a;
            }
            ((moa) it.next()).getClass();
            throw null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
