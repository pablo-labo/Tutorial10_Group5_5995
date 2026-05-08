package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f7h extends t8h {
    public final /* synthetic */ g7h V;

    public f7h(g7h g7hVar) {
        this.V = g7hVar;
    }

    @Override // defpackage.t8h
    public final void b() {
        h7h h7hVar = this.V.a;
        h7hVar.b.b("unlinkToDeath", new Object[0]);
        h7hVar.n.asBinder().unlinkToDeath(h7hVar.k, 0);
        h7hVar.n = null;
        h7hVar.g = false;
    }
}
