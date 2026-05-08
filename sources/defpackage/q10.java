package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class q10 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ne4 ne4Var = ls2.a;
                    long j = ((da2) bVar.M(ps2.a)).a;
                    rm2.a(ne4Var.a(Float.valueOf((!((kb2) bVar.M(lb2.a)).g() ? ((double) pnb.J(j)) < 0.5d : ((double) pnb.J(j)) > 0.5d) ? 0.87f : 1.0f)), bh2.c(-1654653485, new p10((Function2) obj3, 0), bVar), bVar, 56);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && bVar2.i()) {
                    bVar2.D();
                } else {
                    ev6.b(fv6.W1, null, null, null, 0L, ((String) obj3).concat("_ClearButtonIcon"), bVar2, 6, 30);
                }
                break;
        }
        return j6g.a;
    }
}
