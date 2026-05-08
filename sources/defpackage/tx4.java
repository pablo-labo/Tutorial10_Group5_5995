package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class tx4 implements kxe, w6c {
    public final HashMap a;
    public ArrayDeque b;
    public final a5g c;

    public tx4() {
        a5g a5gVar = a5g.a;
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = a5gVar;
    }

    @Override // defpackage.kxe
    public final void a(dki dkiVar) {
        b(this.c, dkiVar);
    }

    @Override // defpackage.kxe
    public final synchronized void b(Executor executor, hy4 hy4Var) {
        try {
            executor.getClass();
            if (!this.a.containsKey(ee3.class)) {
                this.a.put(ee3.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(ee3.class)).put(hy4Var, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
