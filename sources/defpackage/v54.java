package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v54 extends byf {
    public static final /* synthetic */ int d = 0;
    public final byf b;
    public final byf c;

    public v54(byf byfVar, byf byfVar2) {
        this.b = byfVar;
        this.c = byfVar2;
    }

    @Override // defpackage.byf
    public final boolean a() {
        return this.b.a() || this.c.a();
    }

    @Override // defpackage.byf
    public final boolean b() {
        return this.b.b() || this.c.b();
    }

    @Override // defpackage.byf
    public final lf0 c(lf0 lf0Var) {
        lf0Var.getClass();
        return this.c.c(this.b.c(lf0Var));
    }

    @Override // defpackage.byf
    public final wxf d(ui8 ui8Var) {
        wxf wxfVarD = this.b.d(ui8Var);
        return wxfVarD == null ? this.c.d(ui8Var) : wxfVarD;
    }

    @Override // defpackage.byf
    public final ui8 f(ui8 ui8Var, ylg ylgVar) {
        ui8Var.getClass();
        ylgVar.getClass();
        return this.c.f(this.b.f(ui8Var, ylgVar), ylgVar);
    }
}
