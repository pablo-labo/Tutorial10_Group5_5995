package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j3e implements b0a {
    public long a = 0;
    public final /* synthetic */ la b;
    public final /* synthetic */ n4e c;
    public final /* synthetic */ long d;

    public j3e(la laVar, n4e n4eVar, long j) {
        this.b = laVar;
        this.c = n4eVar;
        this.d = j;
    }

    @Override // defpackage.b0a
    public final void a() {
        this.c.h();
    }

    @Override // defpackage.b0a
    public final boolean b(long j, u2e u2eVar) {
        sl8 sl8Var = (sl8) this.b.invoke();
        if (sl8Var == null) {
            return true;
        }
        if (!sl8Var.d()) {
            return false;
        }
        n4e n4eVar = this.c;
        if (!q4e.a(n4eVar, this.d)) {
            return false;
        }
        if (!n4eVar.i(sl8Var, j, this.a, u2eVar, false)) {
            return true;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.b0a
    public final boolean c(long j, u2e u2eVar, int i) {
        sl8 sl8Var = (sl8) this.b.invoke();
        if (sl8Var == null || !sl8Var.d()) {
            return false;
        }
        n4e n4eVar = this.c;
        n4eVar.g(sl8Var, j, u2eVar, false);
        this.a = j;
        return q4e.a(n4eVar, this.d);
    }
}
