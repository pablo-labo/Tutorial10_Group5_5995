package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cw8 implements x3d, qo3 {
    public final kv8 a;
    public final ex7 b;

    public cw8(kv8 kv8Var, ex7 ex7Var) {
        this.a = kv8Var;
        this.b = ex7Var;
    }

    @Override // defpackage.x3d
    public final Object a(arc arcVar) throws Throwable {
        Object objA = kw8.a(this.a, arcVar);
        return objA == g13.a ? objA : j6g.a;
    }

    @Override // defpackage.x3d
    public final void c() {
        this.a.c(this);
    }

    @Override // defpackage.x3d
    public final void d() {
        this.a.a(this);
    }

    @Override // defpackage.qo3
    public final void onDestroy(zv8 zv8Var) {
        this.b.h(null);
    }
}
