package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class v3 extends w81<Object> {
    public final /* synthetic */ w3<Object> b;

    public v3(w3<Object> w3Var) {
        this.b = w3Var;
    }

    @Override // defpackage.w81
    public final void c() {
        w3<Object> w3Var = this.b;
        synchronized (w3Var) {
            web.i(w3Var.g());
        }
    }

    @Override // defpackage.w81
    public final void d(Throwable th) {
        th.getClass();
        w3<Object> w3Var = this.b;
        gbe gbeVar = w3Var.h;
        gbeVar.getClass();
        if (w3Var.i(th, gbeVar.getExtras())) {
            w3Var.i.d(gbeVar, th);
        }
    }

    @Override // defpackage.w81
    public final void e(int i, Object obj) {
        w3<Object> w3Var = this.b;
        w3Var.m(obj, i, w3Var.h);
    }

    @Override // defpackage.w81
    public final void f(float f) {
        this.b.j(f);
    }
}
