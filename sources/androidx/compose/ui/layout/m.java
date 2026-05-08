package androidx.compose.ui.layout;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.e0;
import androidx.compose.ui.layout.j;
import defpackage.ae7;
import defpackage.b3a;
import defpackage.itf;
import defpackage.j4a;
import defpackage.j6g;
import defpackage.jtf;
import defpackage.pm8;
import defpackage.ria;
import defpackage.rlb;
import defpackage.sh7;
import defpackage.tm8;
import defpackage.us3;
import defpackage.zs3;

/* JADX INFO: loaded from: classes.dex */
public final class m implements e0.b {
    public final b3a a;
    public final /* synthetic */ j b;
    public final /* synthetic */ Object c;

    public m(j jVar, Object obj) {
        this.b = jVar;
        this.c = obj;
        int[] iArr = sh7.a;
        this.a = new b3a((Object) null);
    }

    @Override // androidx.compose.ui.layout.e0.b
    public final long a(int i) {
        pm8 pm8VarD = this.b.Y.d(this.c);
        if (pm8VarD == null || !pm8VarD.d()) {
            return 0L;
        }
        int i2 = ((j4a.a) pm8VarD.D()).a.c;
        if (i < 0 || i >= i2) {
            ae7.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (!this.a.b(i)) {
            return 0L;
        }
        int i3 = ((pm8) ((j4a.a) pm8VarD.D()).get(i)).u0.p.a;
        return (((long) ((pm8) ((j4a.a) pm8VarD.D()).get(i)).u0.p.b) & 4294967295L) | (((long) i3) << 32);
    }

    @Override // androidx.compose.ui.layout.e0.b
    public final int b() {
        pm8 pm8VarD = this.b.Y.d(this.c);
        if (pm8VarD != null) {
            return ((j4a.a) pm8VarD.D()).a.c;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [rlb] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // androidx.compose.ui.layout.e0.b
    public final void c(rlb rlbVar) {
        ria riaVar;
        e.c cVar;
        itf itfVar;
        pm8 pm8VarD = this.b.Y.d(this.c);
        if (pm8VarD == null || (riaVar = pm8VarD.t0) == null || (cVar = riaVar.f) == null) {
            return;
        }
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
            if ((cVar4.d & 262144) != 0) {
                for (e.c cVar5 = cVar4; cVar5 != null; cVar5 = cVar5.f) {
                    if ((cVar5.c & 262144) != 0) {
                        ?? B = cVar5;
                        ?? j4aVar2 = 0;
                        while (B != 0) {
                            if (B instanceof jtf) {
                                jtf jtfVar = (jtf) B;
                                boolean zEquals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(jtfVar.E());
                                itf itfVar2 = itf.b;
                                if (zEquals) {
                                    rlbVar.invoke(jtfVar);
                                    itfVar = itfVar2;
                                } else {
                                    itfVar = itf.a;
                                }
                                if (itfVar == itf.c) {
                                    return;
                                }
                                if (itfVar == itfVar2) {
                                    break;
                                }
                            } else if ((B.c & 262144) != 0 && (B instanceof zs3)) {
                                e.c cVar6 = ((zs3) B).e0;
                                int i2 = 0;
                                B = B;
                                j4aVar2 = j4aVar2;
                                while (cVar6 != null) {
                                    if ((cVar6.c & 262144) != 0) {
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

    @Override // androidx.compose.ui.layout.e0.b
    public final void d(int i, long j) {
        j jVar = this.b;
        pm8 pm8VarD = jVar.Y.d(this.c);
        if (pm8VarD == null || !pm8VarD.d()) {
            return;
        }
        int i2 = ((j4a.a) pm8VarD.D()).a.c;
        if (i < 0 || i >= i2) {
            ae7.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (pm8VarD.k()) {
            ae7.a("Pre-measure called on node that is not placed");
        }
        pm8 pm8Var = jVar.a;
        pm8Var.e0 = true;
        tm8.a(pm8VarD).s((pm8) ((j4a.a) pm8VarD.D()).get(i), j);
        j6g j6gVar = j6g.a;
        pm8Var.e0 = false;
        this.a.a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.compose.ui.layout.e0.b
    public final void dispose() {
        j jVar = this.b;
        pm8 pm8Var = jVar.a;
        jVar.e();
        pm8 pm8VarK = jVar.Y.k(this.c);
        if (pm8VarK != null) {
            if (jVar.d0 <= 0) {
                ae7.b("No pre-composed items to dispose");
            }
            int i = ((j4a.a) pm8Var.E()).a.i((T) pm8VarK);
            if (i < ((j4a.a) pm8Var.E()).a.c - jVar.d0) {
                ae7.b("Item is not in pre-composed item range");
            }
            jVar.c0++;
            jVar.d0--;
            j.b bVarD = jVar.f.d(pm8VarK);
            if (bVarD != null) {
                j.b(bVarD);
            }
            int i2 = (((j4a.a) pm8Var.E()).a.c - jVar.d0) - jVar.c0;
            jVar.h(i, i2);
            jVar.d(i2);
        }
    }
}
