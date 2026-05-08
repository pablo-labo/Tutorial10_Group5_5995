package defpackage;

import defpackage.qu2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d22<S, T> extends z12<T> {
    public final vi5<S> d;

    public d22(int i, eo1 eo1Var, v03 v03Var, vi5 vi5Var) {
        super(v03Var, i, eo1Var);
        this.d = vi5Var;
    }

    @Override // defpackage.z12, defpackage.vi5
    public final Object e(wi5<? super T> wi5Var, lu2<? super j6g> lu2Var) {
        int i = this.b;
        g13 g13Var = g13.a;
        if (i == -3) {
            v03 context = lu2Var.getContext();
            Boolean bool = Boolean.FALSE;
            fj2 fj2Var = new fj2(1, (byte) 0);
            v03 v03Var = this.a;
            v03 v03VarD1 = !((Boolean) v03Var.j1(bool, fj2Var)).booleanValue() ? context.d1(v03Var) : x03.a(context, v03Var, false);
            if (wl7.b(v03VarD1, context)) {
                Object objN = n(wi5Var, lu2Var);
                return objN == g13Var ? objN : j6g.a;
            }
            qu2.a aVar = qu2.a.a;
            if (wl7.b(v03VarD1.h1(aVar), context.h1(aVar))) {
                v03 context2 = lu2Var.getContext();
                if (!(wi5Var instanceof q6e) && !(wi5Var instanceof yka)) {
                    wi5Var = new y5g(wi5Var, context2);
                }
                Object objH = web.H(v03VarD1, wi5Var, rkf.b(v03VarD1), new c22(this, null), lu2Var);
                return objH == g13Var ? objH : j6g.a;
            }
        }
        Object objE = super.e(wi5Var, lu2Var);
        return objE == g13Var ? objE : j6g.a;
    }

    @Override // defpackage.z12
    public final Object j(upb<? super T> upbVar, lu2<? super j6g> lu2Var) {
        Object objN = n(new q6e(upbVar), lu2Var);
        return objN == g13.a ? objN : j6g.a;
    }

    public abstract Object n(wi5<? super T> wi5Var, lu2<? super j6g> lu2Var);

    @Override // defpackage.z12
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
