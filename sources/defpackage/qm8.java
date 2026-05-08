package defpackage;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class qm8 extends mj8 implements gu5<j6g> {
    final /* synthetic */ luc<w4e> $config;
    final /* synthetic */ pm8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm8(pm8 pm8Var, luc<w4e> lucVar) {
        super(0);
        this.this$0 = pm8Var;
        this.$config = lucVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
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
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, w4e] */
    @Override // defpackage.gu5
    public final j6g invoke() {
        ria riaVar = this.this$0.t0;
        luc<w4e> lucVar = this.$config;
        if ((riaVar.f.d & 8) != 0) {
            for (e.c cVar = riaVar.e; cVar != null; cVar = cVar.e) {
                if ((cVar.c & 8) != 0) {
                    ?? B = cVar;
                    ?? j4aVar = 0;
                    while (B != 0) {
                        if (B instanceof c5e) {
                            c5e c5eVar = (c5e) B;
                            if (c5eVar.c0()) {
                                ?? w4eVar = new w4e();
                                lucVar.element = w4eVar;
                                w4eVar.d = true;
                            }
                            if (c5eVar.L1()) {
                                lucVar.element.c = true;
                            }
                            c5eVar.F0(lucVar.element);
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
            }
        }
        return j6g.a;
    }
}
