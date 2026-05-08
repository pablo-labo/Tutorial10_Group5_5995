package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vfi extends tuh {
    public final /* synthetic */ dhi b;

    public vfi(dhi dhiVar) {
        this.b = dhiVar;
    }

    @Override // defpackage.tuh
    public final void b() {
        qji qjiVar = this.b.a;
        qjiVar.b.a("unlinkToDeath", new Object[0]);
        qjiVar.m.asBinder().unlinkToDeath(qjiVar.j, 0);
        qjiVar.m = null;
        qjiVar.g = false;
    }
}
