package defpackage;

import defpackage.mq5;

/* JADX INFO: loaded from: classes3.dex */
public final class fe7 {
    public static final /* synthetic */ int a = 0;

    static {
        mq5 mq5Var = new mq5("kotlin.jvm.JvmInline");
        mq5Var.b();
        n8a n8aVarF = mq5Var.a.f();
        mq5 mq5Var2 = mq5.c;
        mq5.a.a(n8aVarF).a.c();
    }

    public static final boolean a(hv1 hv1Var) {
        hlg<mge> hlgVarU;
        hv1Var.getClass();
        if (!(hv1Var instanceof f4c)) {
            return false;
        }
        d4c d4cVarV = ((f4c) hv1Var).V();
        d4cVarV.getClass();
        if (d4cVarV.O() != null) {
            return false;
        }
        aj3 aj3VarD = d4cVarV.d();
        t52 t52Var = aj3VarD instanceof t52 ? (t52) aj3VarD : null;
        if (t52Var == null || (hlgVarU = t52Var.U()) == null) {
            return false;
        }
        n8a name = d4cVarV.getName();
        name.getClass();
        return hlgVarU.a(name);
    }

    public static final boolean b(aj3 aj3Var) {
        aj3Var.getClass();
        return (aj3Var instanceof t52) && (((t52) aj3Var).U() instanceof ee7);
    }

    public static final boolean c(aj3 aj3Var) {
        aj3Var.getClass();
        return (aj3Var instanceof t52) && (((t52) aj3Var).U() instanceof j1a);
    }

    public static final boolean d(vlg vlgVar) {
        if (vlgVar.O() != null) {
            return false;
        }
        aj3 aj3VarD = vlgVar.d();
        n8a n8aVar = null;
        t52 t52Var = aj3VarD instanceof t52 ? (t52) aj3VarD : null;
        if (t52Var != null) {
            int i = b04.a;
            hlg<mge> hlgVarU = t52Var.U();
            ee7 ee7Var = hlgVarU instanceof ee7 ? (ee7) hlgVarU : null;
            if (ee7Var != null) {
                n8aVar = ee7Var.a;
            }
        }
        return wl7.b(n8aVar, vlgVar.getName());
    }

    public static final boolean e(aj3 aj3Var) {
        aj3Var.getClass();
        return b(aj3Var) || c(aj3Var);
    }

    public static final boolean f(ui8 ui8Var) {
        ui8Var.getClass();
        v62 v62VarD = ui8Var.M0().d();
        return (v62VarD == null || !c(v62VarD) || kyf.e(ui8Var)) ? false : true;
    }

    public static final mge g(ui8 ui8Var) {
        ui8Var.getClass();
        v62 v62VarD = ui8Var.M0().d();
        t52 t52Var = v62VarD instanceof t52 ? (t52) v62VarD : null;
        if (t52Var != null) {
            int i = b04.a;
            hlg<mge> hlgVarU = t52Var.U();
            ee7 ee7Var = hlgVarU instanceof ee7 ? (ee7) hlgVarU : null;
            if (ee7Var != null) {
                return (mge) ee7Var.b;
            }
        }
        return null;
    }
}
