package defpackage;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class us3 {
    public static final void a(j4a j4aVar, e.c cVar) {
        j4a<pm8> j4aVarN = f(cVar).N();
        int i = j4aVarN.c - 1;
        pm8[] pm8VarArr = j4aVarN.a;
        if (i < pm8VarArr.length) {
            while (i >= 0) {
                j4aVar.b(pm8VarArr[i].t0.f);
                i--;
            }
        }
    }

    public static final e.c b(j4a j4aVar) {
        int i;
        if (j4aVar == null || (i = j4aVar.c) == 0) {
            return null;
        }
        return (e.c) j4aVar.k(i - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final lm8 c(e.c cVar) {
        if ((cVar.c & 2) != 0) {
            if (cVar instanceof lm8) {
                return (lm8) cVar;
            }
            if (cVar instanceof zs3) {
                e.c cVar2 = ((zs3) cVar).e0;
                while (cVar2 != 0) {
                    if (cVar2 instanceof lm8) {
                        return (lm8) cVar2;
                    }
                    cVar2 = (!(cVar2 instanceof zs3) || (cVar2.c & 2) == 0) ? cVar2.f : ((zs3) cVar2).e0;
                }
            }
        }
        return null;
    }

    public static final tia d(ts3 ts3Var, int i) {
        tia tiaVar = ts3Var.k().W;
        tiaVar.getClass();
        if (tiaVar.f1() != ts3Var || !yia.g(i)) {
            return tiaVar;
        }
        tia tiaVar2 = tiaVar.h0;
        tiaVar2.getClass();
        return tiaVar2;
    }

    public static final tia e(ts3 ts3Var) {
        if (!ts3Var.k().c0) {
            ae7.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        tia tiaVarD = d(ts3Var, 2);
        if (!tiaVarD.f1().c0) {
            ae7.b("LayoutCoordinates is not attached.");
        }
        return tiaVarD;
    }

    public static final pm8 f(ts3 ts3Var) {
        tia tiaVar = ts3Var.k().W;
        if (tiaVar != null) {
            return tiaVar.e0;
        }
        throw l6.k("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final rxa g(ts3 ts3Var) {
        rxa rxaVar = f(ts3Var).b0;
        if (rxaVar != null) {
            return rxaVar;
        }
        throw l6.k("This node does not have an owner.");
    }
}
