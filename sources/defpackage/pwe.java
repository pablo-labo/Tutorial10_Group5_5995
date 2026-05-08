package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pwe extends fk6 {
    public final String g0;

    public pwe(w80 w80Var, n94 n94Var) {
        super(w80Var, n94Var);
        this.g0 = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }

    @Override // defpackage.jtf
    public final Object E() {
        return this.g0;
    }

    @Override // defpackage.fk6
    public final void d2(ueb uebVar) {
        veb vebVar = (veb) om2.a(this, um2.u);
        if (vebVar != null) {
            vebVar.b(uebVar);
        }
    }

    @Override // defpackage.fk6
    public final boolean f2(int i) {
        return i == 3 || i == 4;
    }
}
