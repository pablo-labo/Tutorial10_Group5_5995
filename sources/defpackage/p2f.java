package defpackage;

import defpackage.f2;

/* JADX INFO: loaded from: classes.dex */
public final class p2f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p2f(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3h r3hVar;
        switch (this.a) {
            case 0:
                kob kobVar = ((q2f) this.c).a.f;
                String str = (String) this.b;
                synchronized (kobVar.a0) {
                    try {
                        t4h t4hVar = (t4h) kobVar.f.get(str);
                        if (t4hVar == null) {
                            t4hVar = (t4h) kobVar.V.get(str);
                        }
                        r3hVar = t4hVar != null ? t4hVar.e : null;
                    } finally {
                    }
                }
                if (r3hVar == null || !r3hVar.b()) {
                    return;
                }
                synchronized (((q2f) this.c).c) {
                    ((q2f) this.c).f.put(yid.d(r3hVar), r3hVar);
                    ((q2f) this.c).V.add(r3hVar);
                    q2f q2fVar = (q2f) this.c;
                    q2fVar.W.d(q2fVar.V);
                    break;
                }
                return;
            default:
                if (((t4h) this.c).f0.a instanceof f2.b) {
                    return;
                }
                try {
                    ((hz8) this.b).get();
                    z39.d().a(t4h.h0, "Starting work for " + ((t4h) this.c).e.c);
                    t4h t4hVar2 = (t4h) this.c;
                    t4hVar2.f0.k(t4hVar2.f.startWork());
                    return;
                } catch (Throwable th) {
                    ((t4h) this.c).f0.j(th);
                    return;
                }
        }
    }
}
