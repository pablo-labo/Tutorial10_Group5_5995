package defpackage;

import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class n05 extends xt8 {
    private static final long serialVersionUID = -176083308134819629L;
    Queue<txe> eventQueue;
    rxe logger;
    String name;

    @Override // defpackage.e49
    public final boolean a() {
        return true;
    }

    @Override // defpackage.e49
    public final boolean c() {
        return true;
    }

    @Override // defpackage.e49
    public final boolean d() {
        return true;
    }

    @Override // defpackage.e49
    public final boolean e() {
        return true;
    }

    @Override // defpackage.e49
    public final boolean g() {
        return true;
    }

    @Override // defpackage.z2, defpackage.e49
    public final String getName() {
        return this.name;
    }

    @Override // defpackage.z2
    public final void k(su8 su8Var, Object[] objArr) {
        txe txeVar = new txe();
        System.currentTimeMillis();
        txeVar.a = su8Var;
        txeVar.b = this.logger;
        Thread.currentThread().getName();
        txeVar.c = objArr;
        this.eventQueue.add(txeVar);
    }
}
