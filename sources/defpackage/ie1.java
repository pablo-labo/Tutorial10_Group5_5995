package defpackage;

import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class ie1 implements fe1 {
    public final y4a a;
    public final g4a b;
    public qw1 c;

    public ie1(boolean z, y4a y4aVar) {
        this.a = y4aVar;
        this.b = r.f(Boolean.valueOf(z));
    }

    @Override // defpackage.fe1
    public final void a() {
        qw1 qw1Var = this.c;
        if (qw1Var != null) {
            qw1Var.g(null);
        }
    }

    @Override // defpackage.fe1
    public final Object b(n4a n4aVar, c1f c1fVar) {
        ge1 ge1Var = new ge1(this, new he1(this, null), null);
        y4a y4aVar = this.a;
        y4aVar.getClass();
        Object objD = f13.d(new v4a(n4aVar, y4aVar, ge1Var, null), c1fVar);
        return objD == g13.a ? objD : j6g.a;
    }

    @Override // defpackage.fe1
    public final void dismiss() {
        ((gme) this.b).setValue(Boolean.FALSE);
    }

    @Override // defpackage.fe1
    public final boolean isVisible() {
        return ((Boolean) ((gme) this.b).getValue()).booleanValue();
    }
}
