package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class mx9 {
    public final AndroidComposeView a;
    public final j4a<f81> b = new j4a<>(new f81[16]);
    public final j4a<kx9<?>> c = new j4a<>(new kx9[16]);
    public final j4a<pm8> d = new j4a<>(new pm8[16]);
    public final j4a<kx9<?>> e = new j4a<>(new kx9[16]);
    public boolean f;

    public static final class a extends mj8 implements gu5<j6g> {
        public a() {
            super(0);
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            mx9 mx9Var = mx9.this;
            j4a<kx9<?>> j4aVar = mx9Var.c;
            j4a<f81> j4aVar2 = mx9Var.b;
            j4a<kx9<?>> j4aVar3 = mx9Var.e;
            mx9Var.f = false;
            HashSet hashSet = new HashSet();
            j4a<pm8> j4aVar4 = mx9Var.d;
            pm8[] pm8VarArr = j4aVar4.a;
            int i = j4aVar4.c;
            for (int i2 = 0; i2 < i; i2++) {
                pm8 pm8Var = pm8VarArr[i2];
                kx9<?> kx9Var = j4aVar3.a[i2];
                e.c cVar = pm8Var.t0.f;
                if (cVar.c0) {
                    mx9.b(cVar, kx9Var, hashSet);
                }
            }
            j4aVar4.g();
            j4aVar3.g();
            f81[] f81VarArr = j4aVar2.a;
            int i3 = j4aVar2.c;
            for (int i4 = 0; i4 < i3; i4++) {
                f81 f81Var = f81VarArr[i4];
                kx9<?> kx9Var2 = j4aVar.a[i4];
                if (f81Var.c0) {
                    mx9.b(f81Var, kx9Var2, hashSet);
                }
            }
            j4aVar2.g();
            j4aVar.g();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((f81) it.next()).e2();
            }
            return j6g.a;
        }
    }

    public mx9(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(e.c cVar, kx9 kx9Var, HashSet hashSet) {
        if (!cVar.a.c0) {
            ae7.b("visitSubtreeIf called on an unattached node");
        }
        j4a j4aVar = new j4a(new e.c[16]);
        e.c cVar2 = cVar.a;
        e.c cVar3 = cVar2.f;
        if (cVar3 == null) {
            us3.a(j4aVar, cVar2);
        } else {
            j4aVar.b(cVar3);
        }
        while (true) {
            int i = j4aVar.c;
            if (i == 0) {
                return;
            }
            e.c cVar4 = (e.c) j4aVar.k(i - 1);
            if ((cVar4.d & 32) != 0) {
                for (e.c cVar5 = cVar4; cVar5 != null; cVar5 = cVar5.f) {
                    if ((cVar5.c & 32) != 0) {
                        ?? B = cVar5;
                        ?? j4aVar2 = 0;
                        while (B != 0) {
                            if (B instanceof nx9) {
                                nx9 nx9Var = (nx9) B;
                                if (nx9Var instanceof f81) {
                                    f81 f81Var = (f81) nx9Var;
                                    if ((f81Var.d0 instanceof lx9) && f81Var.g0.contains(kx9Var)) {
                                        hashSet.add(nx9Var);
                                    }
                                }
                                if (nx9Var.j0().O(kx9Var)) {
                                    break;
                                }
                            } else if ((B.c & 32) != 0 && (B instanceof zs3)) {
                                e.c cVar6 = ((zs3) B).e0;
                                int i2 = 0;
                                B = B;
                                j4aVar2 = j4aVar2;
                                while (cVar6 != null) {
                                    if ((cVar6.c & 32) != 0) {
                                        i2++;
                                        j4aVar2 = j4aVar2;
                                        if (i2 == 1) {
                                            B = cVar6;
                                        } else {
                                            if (j4aVar2 == 0) {
                                                j4aVar2 = new j4a(new e.c[16]);
                                            }
                                            if (B != 0) {
                                                j4aVar2.b(B);
                                                B = 0;
                                            }
                                            j4aVar2.b(cVar6);
                                        }
                                    }
                                    cVar6 = cVar6.f;
                                    B = B;
                                    j4aVar2 = j4aVar2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            B = us3.b(j4aVar2);
                        }
                    }
                }
            }
            us3.a(j4aVar, cVar4);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.a.w(new a());
    }
}
