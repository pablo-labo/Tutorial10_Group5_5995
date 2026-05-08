package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pii extends x9i {
    public final /* synthetic */ mli b;

    public pii(mli mliVar) {
        this.b = mliVar;
    }

    @Override // defpackage.x9i
    public final void a() {
        mli mliVar = this.b;
        if (mliVar.m != null) {
            mliVar.b.a("Unbind from service.", new Object[0]);
            mliVar.a.unbindService(mliVar.l);
            mliVar.g = false;
            mliVar.m = null;
            mliVar.l = null;
        }
        mliVar.b();
    }
}
