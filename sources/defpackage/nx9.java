package defpackage;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public interface nx9 extends px9, ts3 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // defpackage.px9
    default <T> T g(kx9<T> kx9Var) {
        ria riaVar;
        if (!k().c0) {
            ae7.a("ModifierLocal accessed from an unattached node");
        }
        if (!k().c0) {
            ae7.b("visitAncestors called on an unattached node");
        }
        e.c cVar = k().e;
        pm8 pm8VarF = us3.f(this);
        while (pm8VarF != null) {
            if ((pm8VarF.t0.f.d & 32) != 0) {
                while (cVar != null) {
                    if ((cVar.c & 32) != 0) {
                        ?? B = cVar;
                        ?? j4aVar = 0;
                        while (B != 0) {
                            if (B instanceof nx9) {
                                nx9 nx9Var = (nx9) B;
                                if (nx9Var.j0().O(kx9Var)) {
                                    return (T) nx9Var.j0().V(kx9Var);
                                }
                            } else if ((B.c & 32) != 0 && (B instanceof zs3)) {
                                e.c cVar2 = ((zs3) B).e0;
                                int i = 0;
                                B = B;
                                j4aVar = j4aVar;
                                while (cVar2 != null) {
                                    if ((cVar2.c & 32) != 0) {
                                        i++;
                                        j4aVar = j4aVar;
                                        if (i == 1) {
                                            B = cVar2;
                                        } else {
                                            if (j4aVar == 0) {
                                                j4aVar = new j4a(new e.c[16]);
                                            }
                                            if (B != 0) {
                                                j4aVar.b(B);
                                                B = 0;
                                            }
                                            j4aVar.b(cVar2);
                                        }
                                    }
                                    cVar2 = cVar2.f;
                                    B = B;
                                    j4aVar = j4aVar;
                                }
                                if (i == 1) {
                                }
                            }
                            B = us3.b(j4aVar);
                        }
                    }
                    cVar = cVar.e;
                }
            }
            pm8VarF = pm8VarF.K();
            cVar = (pm8VarF == null || (riaVar = pm8VarF.t0) == null) ? null : riaVar.e;
        }
        return kx9Var.a.invoke();
    }

    default v1 j0() {
        return cs4.b;
    }
}
