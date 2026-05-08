package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class teb extends fk6 {
    public final String g0;

    public teb(w80 w80Var) {
        super(w80Var, null);
        this.g0 = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // defpackage.jtf
    public final Object E() {
        return this.g0;
    }

    @Override // defpackage.fk6
    public final void d2(ueb uebVar) {
        veb vebVar = (veb) om2.a(this, um2.u);
        if (vebVar != null) {
            vebVar.a(uebVar);
        }
    }

    @Override // defpackage.fk6
    public final boolean f2(int i) {
        return (i == 3 || i == 4) ? false : true;
    }
}
