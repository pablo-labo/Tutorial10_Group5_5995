package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ox1 extends byf {
    public final byf b;

    public ox1(byf byfVar) {
        this.b = byfVar;
    }

    @Override // defpackage.byf
    public final boolean a() {
        return this.b.a();
    }

    @Override // defpackage.byf
    public final boolean b() {
        return true;
    }

    @Override // defpackage.byf
    public final lf0 c(lf0 lf0Var) {
        lf0Var.getClass();
        return this.b.c(lf0Var);
    }

    @Override // defpackage.byf
    public final wxf d(ui8 ui8Var) {
        wxf wxfVarD = this.b.d(ui8Var);
        if (wxfVarD == null) {
            return null;
        }
        v62 v62VarD = ui8Var.M0().d();
        return pnb.y(wxfVarD, v62VarD instanceof rxf ? (rxf) v62VarD : null);
    }

    @Override // defpackage.byf
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.byf
    public final ui8 f(ui8 ui8Var, ylg ylgVar) {
        ui8Var.getClass();
        ylgVar.getClass();
        return this.b.f(ui8Var, ylgVar);
    }
}
