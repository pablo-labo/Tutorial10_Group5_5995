package defpackage;

import defpackage.bj8;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class b04 {
    public static final /* synthetic */ int a = 0;

    public /* synthetic */ class a extends qv5 implements Function1<rlg, Boolean> {
        public static final a a = new a(1, rlg.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(rlg rlgVar) {
            rlg rlgVar2 = rlgVar;
            rlgVar2.getClass();
            return Boolean.valueOf(rlgVar2.z0());
        }
    }

    static {
        n8a.h("value");
    }

    public static final boolean a(rlg rlgVar) {
        rlgVar.getClass();
        Boolean boolD = ad3.d(u63.Z(rlgVar), jh2.V, a.a);
        boolD.getClass();
        return boolD.booleanValue();
    }

    public static hv1 b(hv1 hv1Var, Function1 function1) {
        hv1Var.getClass();
        return (hv1) ad3.b(u63.Z(hv1Var), new ee3(17), new c04(function1, new luc()));
    }

    public static final mq5 c(cj3 cj3Var) {
        cj3Var.getClass();
        nq5 nq5VarG = yz3.g(cj3Var);
        nq5VarG.getClass();
        if (!nq5VarG.d()) {
            nq5VarG = null;
        }
        if (nq5VarG != null) {
            return nq5VarG.g();
        }
        return null;
    }

    public static final t52 d(af0 af0Var) {
        af0Var.getClass();
        v62 v62VarD = af0Var.getType().M0().d();
        if (v62VarD instanceof t52) {
            return (t52) v62VarD;
        }
        return null;
    }

    public static final ei8 e(aj3 aj3Var) {
        aj3Var.getClass();
        xx9 xx9VarD = yz3.d(aj3Var);
        xx9VarD.getClass();
        return xx9VarD.l();
    }

    public static final a62 f(v62 v62Var) {
        aj3 aj3VarD;
        a62 a62VarF;
        if (v62Var == null || (aj3VarD = v62Var.d()) == null) {
            return null;
        }
        if (aj3VarD instanceof lya) {
            mq5 mq5VarH = ((lya) aj3VarD).h();
            n8a name = v62Var.getName();
            name.getClass();
            return new a62(mq5VarH, name);
        }
        if (!(aj3VarD instanceof w62) || (a62VarF = f((v62) aj3VarD)) == null) {
            return null;
        }
        n8a name2 = v62Var.getName();
        name2.getClass();
        return a62VarF.d(name2);
    }

    public static final mq5 g(aj3 aj3Var) {
        aj3Var.getClass();
        mq5 mq5VarH = yz3.h(aj3Var);
        return mq5VarH != null ? mq5VarH : yz3.g(aj3Var.d()).a(aj3Var.getName()).g();
    }

    public static final bj8.a h(xx9 xx9Var) {
        xx9Var.getClass();
        return bj8.a.b;
    }

    public static final hv1 i(hv1 hv1Var) {
        hv1Var.getClass();
        if (!(hv1Var instanceof w3c)) {
            return hv1Var;
        }
        d4c d4cVarV = ((w3c) hv1Var).V();
        d4cVarV.getClass();
        return d4cVarV;
    }

    public static final hh5 j(hv1 hv1Var) {
        hv1Var.getClass();
        r6e r6eVarE0 = ut0.e0(new hv1[]{hv1Var});
        Collection<? extends hv1> collectionM = hv1Var.m();
        collectionM.getClass();
        return v6e.M(ut0.e0(new r6e[]{r6eVarE0, new hh5(new y92(collectionM), new a04(0), z6e.a)}), new lt(11));
    }
}
