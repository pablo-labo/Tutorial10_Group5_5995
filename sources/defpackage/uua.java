package defpackage;

import defpackage.oua;

/* JADX INFO: loaded from: classes.dex */
public final class uua implements oua {
    public final g3a<oua.a> c = new g3a<>();
    public final fbe<oua.a.c> d = new fbe<>();

    public uua() {
        a(oua.b);
    }

    public final void a(oua.a aVar) {
        this.c.k(aVar);
        boolean z = aVar instanceof oua.a.c;
        fbe<oua.a.c> fbeVar = this.d;
        if (z) {
            fbeVar.i((oua.a.c) aVar);
        } else if (aVar instanceof oua.a.C0382a) {
            fbeVar.j(((oua.a.C0382a) aVar).a);
        }
    }
}
