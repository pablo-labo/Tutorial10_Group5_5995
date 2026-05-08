package defpackage;

import androidx.compose.ui.e;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qia extends eja {
    public final e.c c;
    public final xeb d;
    public final r59<yeb> e;
    public tia f;
    public neb g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, long[]] */
    public qia(e.c cVar) {
        this.c = cVar;
        xeb xebVar = new xeb();
        xebVar.b = new long[2];
        this.d = xebVar;
        this.e = new r59<>(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ea  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [j4a] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [j4a] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    @Override // defpackage.eja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(defpackage.r59<defpackage.yeb> r53, defpackage.sl8 r54, defpackage.aj7 r55, boolean r56) {
        /*
            Method dump skipped, instruction units count: 751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qia.a(r59, sl8, aj7, boolean):boolean");
    }

    @Override // defpackage.eja
    public final void b(aj7 aj7Var) {
        super.b(aj7Var);
        neb nebVar = this.g;
        if (nebVar == null) {
            return;
        }
        this.h = this.i;
        List<yeb> list = nebVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            yeb yebVar = list.get(i);
            boolean z = yebVar.d;
            long j = yebVar.a;
            boolean zA = aj7Var.a(j);
            boolean z2 = this.i;
            if ((!z && !zA) || (!z && !z2)) {
                this.d.c(j);
            }
        }
        this.i = false;
        this.j = nebVar.e == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [j4a] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [j4a] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        j4a<qia> j4aVar = this.a;
        qia[] qiaVarArr = j4aVar.a;
        int i = j4aVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            qiaVarArr[i2].c();
        }
        ?? B = this.c;
        ?? j4aVar2 = 0;
        while (B != 0) {
            if (B instanceof dfb) {
                ((dfb) B).f1();
            } else if ((B.c & 16) != 0 && (B instanceof zs3)) {
                e.c cVar = ((zs3) B).e0;
                int i3 = 0;
                j4aVar2 = j4aVar2;
                B = B;
                while (cVar != null) {
                    if ((cVar.c & 16) != 0) {
                        i3++;
                        j4aVar2 = j4aVar2;
                        if (i3 == 1) {
                            B = cVar;
                        } else {
                            if (j4aVar2 == 0) {
                                j4aVar2 = new j4a(new e.c[16]);
                            }
                            if (B != 0) {
                                j4aVar2.b(B);
                                B = 0;
                            }
                            j4aVar2.b(cVar);
                        }
                    }
                    cVar = cVar.f;
                    j4aVar2 = j4aVar2;
                    B = B;
                }
                if (i3 == 1) {
                }
            }
            B = us3.b(j4aVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(aj7 aj7Var) {
        r59<yeb> r59Var = this.e;
        boolean z = false;
        z = false;
        if (!r59Var.f()) {
            e.c cVar = this.c;
            if (cVar.c0) {
                neb nebVar = this.g;
                nebVar.getClass();
                tia tiaVar = this.f;
                tiaVar.getClass();
                long j = tiaVar.c;
                ?? B = cVar;
                ?? j4aVar = 0;
                while (B != 0) {
                    if (B instanceof dfb) {
                        ((dfb) B).R(nebVar, peb.c, j);
                    } else if ((B.c & 16) != 0 && (B instanceof zs3)) {
                        e.c cVar2 = ((zs3) B).e0;
                        int i = 0;
                        B = B;
                        j4aVar = j4aVar;
                        while (cVar2 != null) {
                            if ((cVar2.c & 16) != 0) {
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
                if (cVar.c0) {
                    j4a<qia> j4aVar2 = this.a;
                    qia[] qiaVarArr = j4aVar2.a;
                    int i2 = j4aVar2.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        qiaVarArr[i3].d(aj7Var);
                    }
                }
                z = true;
            }
        }
        b(aj7Var);
        r59Var.c();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [j4a] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [j4a] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [j4a] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [j4a] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(aj7 aj7Var, boolean z) {
        if (!this.e.f()) {
            ?? B = this.c;
            if (B.c0) {
                neb nebVar = this.g;
                nebVar.getClass();
                tia tiaVar = this.f;
                tiaVar.getClass();
                long j = tiaVar.c;
                ?? B2 = B;
                ?? j4aVar = 0;
                while (B2 != 0) {
                    if (B2 instanceof dfb) {
                        ((dfb) B2).R(nebVar, peb.a, j);
                    } else if ((B2.c & 16) != 0 && (B2 instanceof zs3)) {
                        e.c cVar = ((zs3) B2).e0;
                        int i = 0;
                        B2 = B2;
                        j4aVar = j4aVar;
                        while (cVar != null) {
                            if ((cVar.c & 16) != 0) {
                                i++;
                                j4aVar = j4aVar;
                                if (i == 1) {
                                    B2 = cVar;
                                } else {
                                    if (j4aVar == 0) {
                                        j4aVar = new j4a(new e.c[16]);
                                    }
                                    if (B2 != 0) {
                                        j4aVar.b(B2);
                                        B2 = 0;
                                    }
                                    j4aVar.b(cVar);
                                }
                            }
                            cVar = cVar.f;
                            B2 = B2;
                            j4aVar = j4aVar;
                        }
                        if (i == 1) {
                        }
                    }
                    B2 = us3.b(j4aVar);
                }
                if (B.c0) {
                    j4a<qia> j4aVar2 = this.a;
                    qia[] qiaVarArr = j4aVar2.a;
                    int i2 = j4aVar2.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        qia qiaVar = qiaVarArr[i3];
                        this.f.getClass();
                        qiaVar.e(aj7Var, z);
                    }
                }
                if (B.c0) {
                    ?? j4aVar3 = 0;
                    while (B != 0) {
                        if (B instanceof dfb) {
                            ((dfb) B).R(nebVar, peb.b, j);
                        } else if ((B.c & 16) != 0 && (B instanceof zs3)) {
                            e.c cVar2 = ((zs3) B).e0;
                            int i4 = 0;
                            B = B;
                            j4aVar3 = j4aVar3;
                            while (cVar2 != null) {
                                if ((cVar2.c & 16) != 0) {
                                    i4++;
                                    j4aVar3 = j4aVar3;
                                    if (i4 == 1) {
                                        B = cVar2;
                                    } else {
                                        if (j4aVar3 == 0) {
                                            j4aVar3 = new j4a(new e.c[16]);
                                        }
                                        if (B != 0) {
                                            j4aVar3.b(B);
                                            B = 0;
                                        }
                                        j4aVar3.b(cVar2);
                                    }
                                }
                                cVar2 = cVar2.f;
                                B = B;
                                j4aVar3 = j4aVar3;
                            }
                            if (i4 == 1) {
                            }
                        }
                        B = us3.b(j4aVar3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, p3a<qia> p3aVar) {
        xeb xebVar = this.d;
        if (xebVar.b(j) && p3aVar.c(this) < 0) {
            xebVar.c(j);
            this.e.i(j);
        }
        j4a<qia> j4aVar = this.a;
        qia[] qiaVarArr = j4aVar.a;
        int i = j4aVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            qiaVarArr[i2].f(j, p3aVar);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
