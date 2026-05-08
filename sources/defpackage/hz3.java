package defpackage;

import defpackage.vi8;

/* JADX INFO: loaded from: classes3.dex */
public final class hz3 implements vi8.a {
    public final boolean a;
    public final fv1 b;
    public final fv1 c;

    public hz3(fv1 fv1Var, fv1 fv1Var2, boolean z) {
        this.a = z;
        this.b = fv1Var;
        this.c = fv1Var2;
    }

    @Override // vi8.a
    public final boolean a(kwf kwfVar, kwf kwfVar2) {
        kwfVar.getClass();
        kwfVar2.getClass();
        if (kwfVar.equals(kwfVar2)) {
            return true;
        }
        v62 v62VarD = kwfVar.d();
        v62 v62VarD2 = kwfVar2.d();
        if (!(v62VarD instanceof rxf) || !(v62VarD2 instanceof rxf)) {
            return false;
        }
        ql1 ql1Var = new ql1(1, this.b, this.c);
        return iz3.a.b((rxf) v62VarD, (rxf) v62VarD2, this.a, ql1Var);
    }
}
