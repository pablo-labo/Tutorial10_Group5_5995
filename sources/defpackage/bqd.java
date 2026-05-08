package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bqd implements wc6 {
    public p3a<xc6> a;
    public wc6 b;

    @Override // defpackage.wc6
    public final void a(xc6 xc6Var) {
        wc6 wc6Var = this.b;
        if (wc6Var != null) {
            wc6Var.a(xc6Var);
        }
    }

    @Override // defpackage.wc6
    public final xc6 b() {
        wc6 wc6Var = this.b;
        if (wc6Var == null) {
            ae7.b("GraphicsContext not provided");
        }
        xc6 xc6VarB = wc6Var.b();
        p3a<xc6> p3aVar = this.a;
        if (p3aVar != null) {
            p3aVar.g(xc6VarB);
            return xc6VarB;
        }
        Object[] objArr = pna.a;
        p3a<xc6> p3aVar2 = new p3a<>(1);
        p3aVar2.g(xc6VarB);
        this.a = p3aVar2;
        return xc6VarB;
    }

    public final void c() {
        p3a<xc6> p3aVar = this.a;
        if (p3aVar != null) {
            Object[] objArr = p3aVar.a;
            int i = p3aVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                a((xc6) objArr[i2]);
            }
            p3aVar.i();
        }
    }
}
