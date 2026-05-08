package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nki extends x9i {
    public final /* synthetic */ eli b;

    public nki(eli eliVar) {
        this.b = eliVar;
    }

    @Override // defpackage.x9i
    public final void a() {
        mli mliVar = this.b.a;
        mliVar.b.a("unlinkToDeath", new Object[0]);
        mliVar.m.asBinder().unlinkToDeath(mliVar.j, 0);
        mliVar.m = null;
        mliVar.g = false;
    }
}
