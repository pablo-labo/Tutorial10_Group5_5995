package defpackage;

import androidx.compose.runtime.r;
import defpackage.ok5;

/* JADX INFO: loaded from: classes.dex */
public final class at8<T> {
    public final vi5<l2b<T>> a;
    public final v03 b;
    public final zs8 c;
    public final g4a d;
    public final g4a e;

    public at8(pqc pqcVar) {
        pqcVar.getClass();
        this.a = pqcVar;
        v03 v03Var = (v03) hb0.b0.getValue();
        this.b = v03Var;
        zs8 zs8Var = new zs8(this, v03Var, (l2b) z92.Q0(pqcVar.c()));
        this.c = zs8Var;
        this.d = r.f(zs8Var.c());
        yb2 yb2Var = (yb2) zs8Var.j.a.getValue();
        if (yb2Var == null) {
            yz8 yz8Var = dt8.a;
            yb2Var = new yb2(yz8Var.a, yz8Var.b, yz8Var.c, yz8Var, null);
        }
        this.e = r.f(yb2Var);
    }

    public final Object a(c1f c1fVar) {
        Object objE = this.c.j.a.e(new ok5.a(new xs8(this)), c1fVar);
        g13 g13Var = g13.a;
        if (objE != g13Var) {
            objE = j6g.a;
        }
        return objE == g13Var ? objE : j6g.a;
    }

    public final go7<T> b() {
        return (go7) ((gme) this.d).getValue();
    }

    public final yb2 c() {
        return (yb2) ((gme) this.e).getValue();
    }
}
