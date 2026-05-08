package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class asg implements x3d, qo3 {
    public final xqc a;
    public final w27 b;
    public final kv8 c;
    public final ex7 d;

    public asg(xqc xqcVar, w27 w27Var, yrg yrgVar, kv8 kv8Var, ex7 ex7Var) {
        this.a = xqcVar;
        this.b = w27Var;
        this.c = kv8Var;
        this.d = ex7Var;
    }

    @Override // defpackage.x3d
    public final Object a(arc arcVar) {
        Object objA;
        kv8 kv8Var = this.c;
        return (kv8Var == null || (objA = kw8.a(kv8Var, arcVar)) != g13.a) ? j6g.a : objA;
    }

    @Override // defpackage.x3d
    public final void b() {
        throw null;
    }

    @Override // defpackage.x3d
    public final void d() {
        kv8 kv8Var = this.c;
        if (kv8Var != null) {
            kv8Var.a(this);
        }
        throw null;
    }

    public final void e() {
        this.d.h(null);
        kv8 kv8Var = this.c;
        if (kv8Var != null) {
            kv8Var.c(this);
        }
    }

    @Override // defpackage.qo3
    public final void onDestroy(zv8 zv8Var) {
        throw null;
    }
}
