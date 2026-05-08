package defpackage;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class cn1 {
    public static final Object a(ts3 ts3Var, gu5 gu5Var, pu2 pu2Var) {
        Object obj;
        tia tiaVarE;
        Object objJ1;
        ria riaVar;
        if (!ts3Var.k().c0) {
            return j6g.a;
        }
        if (!ts3Var.k().c0) {
            ae7.b("visitAncestors called on an unattached node");
        }
        e.c cVar = ts3Var.k().e;
        pm8 pm8VarF = us3.f(ts3Var);
        loop0: while (true) {
            obj = null;
            if (pm8VarF == null) {
                break;
            }
            if ((pm8VarF.t0.f.d & 524288) != 0) {
                while (cVar != null) {
                    if ((cVar.c & 524288) != 0) {
                        e.c cVarB = cVar;
                        j4a j4aVar = null;
                        while (cVarB != null) {
                            if (cVarB instanceof an1) {
                                obj = cVarB;
                                break loop0;
                            }
                            if ((cVarB.c & 524288) != 0 && (cVarB instanceof zs3)) {
                                int i = 0;
                                for (e.c cVar2 = ((zs3) cVarB).e0; cVar2 != null; cVar2 = cVar2.f) {
                                    if ((cVar2.c & 524288) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVarB = cVar2;
                                        } else {
                                            if (j4aVar == null) {
                                                j4aVar = new j4a(new e.c[16]);
                                            }
                                            if (cVarB != null) {
                                                j4aVar.b(cVarB);
                                                cVarB = null;
                                            }
                                            j4aVar.b(cVar2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVarB = us3.b(j4aVar);
                        }
                    }
                    cVar = cVar.e;
                }
            }
            pm8VarF = pm8VarF.K();
            cVar = (pm8VarF == null || (riaVar = pm8VarF.t0) == null) ? null : riaVar.e;
        }
        an1 an1Var = (an1) obj;
        return (an1Var != null && (objJ1 = an1Var.j1((tiaVarE = us3.e(ts3Var)), new bn1(gu5Var, tiaVarE), pu2Var)) == g13.a) ? objJ1 : j6g.a;
    }
}
