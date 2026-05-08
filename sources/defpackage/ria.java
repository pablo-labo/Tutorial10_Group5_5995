package defpackage;

import androidx.compose.ui.e;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ria {
    public final pm8 a;
    public final b b;
    public final pe7 c;
    public tia d;
    public final f8f e;
    public e.c f;
    public j4a<e.b> g;
    public j4a<e.b> h;
    public final j4a<e> i;
    public a j;

    public final class a {
        public e.c a;
        public int b;
        public j4a<e.b> c;
        public j4a<e.b> d;
        public boolean e;

        public a(e.c cVar, int i, j4a<e.b> j4aVar, j4a<e.b> j4aVar2, boolean z) {
            this.a = cVar;
            this.b = i;
            this.c = j4aVar;
            this.d = j4aVar2;
            this.e = z;
        }

        public final boolean a(int i, int i2) {
            j4a<e.b> j4aVar = this.c;
            int i3 = this.b;
            e.b bVar = j4aVar.a[i + i3];
            e.b bVar2 = this.d.a[i3 + i2];
            return wl7.b(bVar, bVar2) || bVar.getClass() == bVar2.getClass();
        }
    }

    public static final class b extends e.c {
        public final String toString() {
            return "<Head>";
        }
    }

    public ria(pm8 pm8Var) {
        this.a = pm8Var;
        b bVar = new b();
        bVar.d = -1;
        this.b = bVar;
        pe7 pe7Var = new pe7(pm8Var);
        this.c = pe7Var;
        this.d = pe7Var;
        f8f f8fVar = pe7Var.J0;
        this.e = f8fVar;
        this.f = f8fVar;
        this.i = new j4a<>(new e[16]);
    }

    public static final void a(ria riaVar, e.c cVar, tia tiaVar) {
        for (e.c cVar2 = cVar.e; cVar2 != null; cVar2 = cVar2.e) {
            if (cVar2 == riaVar.b) {
                pm8 pm8VarK = riaVar.a.K();
                tiaVar.i0 = pm8VarK != null ? pm8VarK.t0.c : null;
                riaVar.d = tiaVar;
                return;
            } else {
                if ((cVar2.c & 2) != 0) {
                    return;
                }
                cVar2.b2(tiaVar);
            }
        }
    }

    public static e.c b(e.b bVar, e.c cVar) {
        e.c cVarA;
        if (bVar instanceof qx9) {
            cVarA = ((qx9) bVar).a();
            cVarA.c = yia.f(cVarA);
        } else {
            f81 f81Var = new f81();
            f81Var.c = yia.d(bVar);
            f81Var.d0 = bVar;
            f81Var.e0 = true;
            f81Var.g0 = new HashSet<>();
            cVarA = f81Var;
        }
        if (cVarA.c0) {
            ae7.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cVarA.X = true;
        e.c cVar2 = cVar.f;
        if (cVar2 != null) {
            cVar2.e = cVarA;
            cVarA.f = cVar2;
        }
        cVar.f = cVarA;
        cVarA.e = cVar;
        return cVarA;
    }

    public static e.c c(e.c cVar) {
        boolean z = cVar.c0;
        if (z) {
            o3a<Object> o3aVar = yia.a;
            if (!z) {
                ae7.b("autoInvalidateRemovedNode called on unattached node");
            }
            yia.a(cVar, -1, 2);
            cVar.Z1();
            cVar.T1();
        }
        e.c cVar2 = cVar.f;
        e.c cVar3 = cVar.e;
        if (cVar2 != null) {
            cVar2.e = cVar3;
            cVar.f = null;
        }
        if (cVar3 != null) {
            cVar3.f = cVar2;
            cVar.e = null;
        }
        cVar3.getClass();
        return cVar3;
    }

    public static void h(e.b bVar, e.b bVar2, e.c cVar) {
        if ((bVar instanceof qx9) && (bVar2 instanceof qx9)) {
            cVar.getClass();
            ((qx9) bVar2).b(cVar);
            if (cVar.c0) {
                yia.c(cVar);
                return;
            } else {
                cVar.Y = true;
                return;
            }
        }
        if (!(cVar instanceof f81)) {
            ae7.b("Unknown Modifier.Node type");
            return;
        }
        f81 f81Var = (f81) cVar;
        if (f81Var.c0) {
            f81Var.d2();
        }
        f81Var.d0 = bVar2;
        f81Var.c = yia.d(bVar2);
        if (f81Var.c0) {
            f81Var.c2(false);
        }
        if (cVar.c0) {
            yia.c(cVar);
        } else {
            cVar.Y = true;
        }
    }

    public final boolean d(int i) {
        return (this.f.d & i) != 0;
    }

    public final void e() {
        for (e.c cVar = this.f; cVar != null; cVar = cVar.f) {
            cVar.Y1();
            if (cVar.X) {
                o3a<Object> o3aVar = yia.a;
                if (!cVar.c0) {
                    ae7.b("autoInvalidateInsertedNode called on unattached node");
                }
                yia.a(cVar, -1, 1);
            }
            if (cVar.Y) {
                yia.c(cVar);
            }
            cVar.X = false;
            cVar.Y = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0262, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0268, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0150, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0152, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0154, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0155, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0169, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016e, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0177, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0179, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0180, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0186, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018b, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018d, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018f, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0192, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0194, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019e, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a0, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ae, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b0, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bb, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bf, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c1, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c3, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c5, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cb, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cd, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r32, defpackage.j4a<androidx.compose.ui.e.b> r33, defpackage.j4a<androidx.compose.ui.e.b> r34, androidx.compose.ui.e.c r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 921
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ria.f(int, j4a, j4a, androidx.compose.ui.e$c, boolean):void");
    }

    public final void g() {
        pm8 pm8Var;
        mm8 mm8Var;
        qxa qxaVar;
        e.c cVar = this.e.e;
        tia tiaVar = this.c;
        while (true) {
            pm8Var = this.a;
            if (cVar == null) {
                break;
            }
            lm8 lm8VarC = us3.c(cVar);
            if (lm8VarC != null) {
                tia tiaVar2 = cVar.W;
                if (tiaVar2 != null) {
                    mm8Var = (mm8) tiaVar2;
                    lm8 lm8Var = mm8Var.J0;
                    mm8Var.f2(lm8VarC);
                    if (lm8Var != cVar && (qxaVar = mm8Var.A0) != null) {
                        qxaVar.invalidate();
                    }
                } else {
                    mm8Var = new mm8(pm8Var, lm8VarC);
                    cVar.b2(mm8Var);
                }
                tiaVar.i0 = mm8Var;
                mm8Var.h0 = tiaVar;
                tiaVar = mm8Var;
            } else {
                cVar.b2(tiaVar);
            }
            cVar = cVar.e;
        }
        pm8 pm8VarK = pm8Var.K();
        tiaVar.i0 = pm8VarK != null ? pm8VarK.t0.c : null;
        this.d = tiaVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        e.c cVar = this.f;
        f8f f8fVar = this.e;
        if (cVar == f8fVar) {
            sb.append("]");
        } else {
            while (true) {
                if (cVar == null || cVar == f8fVar) {
                    break;
                }
                sb.append(String.valueOf(cVar));
                if (cVar.f == f8fVar) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                cVar = cVar.f;
            }
        }
        return sb.toString();
    }
}
