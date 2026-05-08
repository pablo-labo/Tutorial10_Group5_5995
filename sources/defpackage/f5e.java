package defpackage;

import androidx.compose.ui.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f5e {
    public final e.c a;
    public final boolean b;
    public final pm8 c;
    public final w4e d;
    public boolean e;
    public f5e f;
    public final int g;

    public static final class a extends e.c implements c5e {
        public final /* synthetic */ Function1<s5e, j6g> d0;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super s5e, j6g> function1) {
            this.d0 = function1;
        }

        @Override // defpackage.c5e
        public final void F0(s5e s5eVar) {
            this.d0.invoke(s5eVar);
        }
    }

    public f5e(e.c cVar, boolean z, pm8 pm8Var, w4e w4eVar) {
        this.a = cVar;
        this.b = z;
        this.c = pm8Var;
        this.d = w4eVar;
        this.g = pm8Var.b;
    }

    public static /* synthetic */ List j(int i, f5e f5eVar) {
        return f5eVar.i((i & 1) != 0 ? !f5eVar.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final qtc a(tia tiaVar) {
        ?? B;
        f5e f5eVarL = l();
        if (f5eVarL == null) {
            return qtc.e;
        }
        e.c cVar = f5eVarL.c.t0.f;
        if ((cVar.d & 8) != 0) {
            loop0: while (cVar != null) {
                if ((cVar.c & 8) != 0) {
                    B = cVar;
                    ?? j4aVar = 0;
                    while (B != 0) {
                        if (B instanceof c5e) {
                            if (((c5e) B).B()) {
                                break loop0;
                            }
                        } else if ((B.c & 8) != 0 && (B instanceof zs3)) {
                            e.c cVar2 = ((zs3) B).e0;
                            int i = 0;
                            B = B;
                            j4aVar = j4aVar;
                            while (cVar2 != null) {
                                if ((cVar2.c & 8) != 0) {
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
                if ((cVar.d & 8) == 0) {
                    break;
                }
                cVar = cVar.f;
            }
            B = 0;
        } else {
            B = 0;
        }
        c5e c5eVar = (c5e) B;
        tia tiaVarD = c5eVar != null ? us3.d(c5eVar, 8) : null;
        return tiaVarD == null ? f5eVarL.a(tiaVar) : tiaVarD.J(tiaVar, true);
    }

    public final f5e b(qed qedVar, Function1<? super s5e, j6g> function1) {
        w4e w4eVar = new w4e();
        w4eVar.c = false;
        w4eVar.d = false;
        function1.invoke(w4eVar);
        f5e f5eVar = new f5e(new a(function1), false, new pm8(this.g + (qedVar != null ? 1000000000 : 2000000000), true), w4eVar);
        f5eVar.e = true;
        f5eVar.f = this;
        return f5eVar;
    }

    public final void c(pm8 pm8Var, ArrayList arrayList) {
        j4a<pm8> j4aVarM = pm8Var.M();
        pm8[] pm8VarArr = j4aVarM.a;
        int i = j4aVarM.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8 pm8Var2 = pm8VarArr[i2];
            if (pm8Var2.d() && !pm8Var2.E0) {
                if (pm8Var2.t0.d(8)) {
                    arrayList.add(h5e.a(pm8Var2, this.b));
                } else {
                    c(pm8Var2, arrayList);
                }
            }
        }
    }

    public final tia d() {
        if (!this.e) {
            c5e c5eVarF = f();
            return c5eVarF != null ? us3.d(c5eVarF, 8) : this.c.t0.c;
        }
        f5e f5eVarL = l();
        if (f5eVarL != null) {
            return f5eVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        p(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            f5e f5eVar = (f5e) arrayList.get(size2);
            if (f5eVar.m()) {
                arrayList2.add(f5eVar);
            } else if (!f5eVar.d.d) {
                f5eVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [j4a] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [j4a] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v10 */
    public final c5e f() {
        ?? B;
        boolean z = this.d.c;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        pm8 pm8Var = this.c;
        if (z) {
            e.c cVar = pm8Var.t0.f;
            if ((cVar.d & 8) != 0) {
                B = 0;
                while (cVar != null) {
                    if ((cVar.c & 8) != 0) {
                        ?? B2 = cVar;
                        ?? j4aVar = 0;
                        while (B2 != 0) {
                            if (B2 instanceof c5e) {
                                c5e c5eVar = (c5e) B2;
                                if (c5eVar.B()) {
                                    if (c5eVar.L1()) {
                                        return c5eVar;
                                    }
                                    if (B == 0) {
                                        B = c5eVar;
                                    }
                                }
                            } else if ((B2.c & 8) != 0 && (B2 instanceof zs3)) {
                                e.c cVar2 = ((zs3) B2).e0;
                                int i = 0;
                                B2 = B2;
                                j4aVar = j4aVar;
                                while (cVar2 != null) {
                                    if ((cVar2.c & 8) != 0) {
                                        i++;
                                        j4aVar = j4aVar;
                                        if (i == 1) {
                                            B2 = cVar2;
                                        } else {
                                            if (j4aVar == 0) {
                                                j4aVar = new j4a(new e.c[16]);
                                            }
                                            if (B2 != 0) {
                                                j4aVar.b(B2);
                                                B2 = 0;
                                            }
                                            j4aVar.b(cVar2);
                                        }
                                    }
                                    cVar2 = cVar2.f;
                                    B2 = B2;
                                    j4aVar = j4aVar;
                                }
                                if (i == 1) {
                                }
                            }
                            B2 = us3.b(j4aVar);
                        }
                    }
                    if ((cVar.d & 8) == 0) {
                        break;
                    }
                    cVar = cVar.f;
                    B = B;
                }
                r4 = B;
            }
        } else {
            e.c cVar3 = pm8Var.t0.f;
            if ((cVar3.d & 8) != 0) {
                loop3: while (cVar3 != null) {
                    if ((cVar3.c & 8) != 0) {
                        B = cVar3;
                        ?? j4aVar2 = 0;
                        while (B != 0) {
                            if (B instanceof c5e) {
                                if (((c5e) B).B()) {
                                    r4 = B;
                                }
                            } else if ((B.c & 8) != 0 && (B instanceof zs3)) {
                                e.c cVar4 = ((zs3) B).e0;
                                int i2 = 0;
                                B = B;
                                j4aVar2 = j4aVar2;
                                while (cVar4 != null) {
                                    if ((cVar4.c & 8) != 0) {
                                        i2++;
                                        j4aVar2 = j4aVar2;
                                        if (i2 == 1) {
                                            B = cVar4;
                                        } else {
                                            if (j4aVar2 == 0) {
                                                j4aVar2 = new j4a(new e.c[16]);
                                            }
                                            if (B != 0) {
                                                j4aVar2.b(B);
                                                B = 0;
                                            }
                                            j4aVar2.b(cVar4);
                                        }
                                    }
                                    cVar4 = cVar4.f;
                                    B = B;
                                    j4aVar2 = j4aVar2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            B = us3.b(j4aVar2);
                        }
                    }
                    if ((cVar3.d & 8) == 0) {
                        break;
                    }
                    cVar3 = cVar3.f;
                }
            }
        }
        return (c5e) r4;
    }

    public final qtc g() {
        tia tiaVarD = d();
        if (tiaVarD != null) {
            if (!tiaVarD.f1().c0) {
                tiaVarD = null;
            }
            if (tiaVarD != null) {
                return ojh.m(tiaVarD).J(tiaVarD, true);
            }
        }
        return qtc.e;
    }

    public final qtc h() {
        tia tiaVarD = d();
        if (tiaVarD != null) {
            if (!tiaVarD.f1().c0) {
                tiaVarD = null;
            }
            if (tiaVarD != null) {
                return ojh.h(tiaVarD);
            }
        }
        return qtc.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.d) {
            return zr4.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!m()) {
            return p(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final w4e k() {
        boolean zM = m();
        w4e w4eVar = this.d;
        if (!zM) {
            return w4eVar;
        }
        w4e w4eVarB = w4eVar.b();
        o(new ArrayList(), w4eVarB);
        return w4eVarB;
    }

    public final f5e l() {
        pm8 pm8VarK;
        f5e f5eVar = this.f;
        if (f5eVar != null) {
            return f5eVar;
        }
        pm8 pm8Var = this.c;
        boolean z = this.b;
        if (z) {
            pm8VarK = pm8Var.K();
            while (pm8VarK != null) {
                w4e w4eVarG = pm8VarK.g();
                if (w4eVarG != null && w4eVarG.c) {
                    break;
                }
                pm8VarK = pm8VarK.K();
            }
            pm8VarK = null;
        } else {
            pm8VarK = null;
        }
        if (pm8VarK == null) {
            pm8 pm8VarK2 = pm8Var.K();
            while (true) {
                if (pm8VarK2 == null) {
                    pm8VarK = null;
                    break;
                }
                if (pm8VarK2.t0.d(8)) {
                    pm8VarK = pm8VarK2;
                    break;
                }
                pm8VarK2 = pm8VarK2.K();
            }
        }
        if (pm8VarK == null) {
            return null;
        }
        return h5e.a(pm8VarK, z);
    }

    public final boolean m() {
        return this.b && this.d.c;
    }

    public final boolean n() {
        if (this.e || !j(4, this).isEmpty()) {
            return false;
        }
        pm8 pm8VarK = this.c.K();
        while (true) {
            if (pm8VarK == null) {
                pm8VarK = null;
                break;
            }
            w4e w4eVarG = pm8VarK.g();
            if (w4eVarG != null && w4eVarG.c) {
                break;
            }
            pm8VarK = pm8VarK.K();
        }
        return pm8VarK == null;
    }

    public final void o(ArrayList arrayList, w4e w4eVar) {
        if (this.d.d) {
            return;
        }
        p(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            f5e f5eVar = (f5e) arrayList.get(size2);
            if (!f5eVar.m()) {
                w4eVar.g(f5eVar.d);
                f5eVar.o(arrayList, w4eVar);
            }
        }
    }

    public final List p(ArrayList arrayList, boolean z) {
        if (this.e) {
            return zr4.a;
        }
        c(this.c, arrayList);
        if (z) {
            r5e<qed> r5eVar = k5e.x;
            w4e w4eVar = this.d;
            qed qedVar = (qed) x4e.a(w4eVar, r5eVar);
            if (qedVar != null && w4eVar.c && !arrayList.isEmpty()) {
                arrayList.add(b(qedVar, new d5e(qedVar)));
            }
            r5e<List<String>> r5eVar2 = k5e.a;
            if (w4eVar.a.b(r5eVar2) && !arrayList.isEmpty() && w4eVar.c) {
                List list = (List) x4e.a(w4eVar, r5eVar2);
                String str = list != null ? (String) z92.Q0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new e5e(str)));
                }
            }
        }
        return arrayList;
    }
}
