package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class va1 extends y3d {
    public final kv8 a;
    public final ex7 b;

    public va1(kv8 kv8Var, ex7 ex7Var) {
        this.a = kv8Var;
        this.b = ex7Var;
    }

    @Override // defpackage.y3d
    public final void a() {
        this.a.c(this);
    }

    @Override // defpackage.y3d
    public final void b() {
        this.a.a(this);
    }

    @Override // defpackage.qo3
    public final void onDestroy(zv8 zv8Var) {
        this.b.h(null);
    }
}
