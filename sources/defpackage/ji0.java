package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ji0 implements Function2<b, Integer, j6g> {
    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            ne4 ne4Var = ls2.a;
            long j = ((da2) bVar2.M(ps2.a)).a;
            rm2.a(ne4Var.a(Float.valueOf((!((kb2) bVar2.M(lb2.a)).g() ? ((double) pnb.J(j)) < 0.5d : ((double) pnb.J(j)) > 0.5d) ? 0.87f : 1.0f)), yid.a, bVar2, 8);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
