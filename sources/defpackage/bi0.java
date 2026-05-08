package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class bi0 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ mzg a;
    public final /* synthetic */ gza b;
    public final /* synthetic */ ah2 c;

    public bi0(mzg mzgVar, gza gzaVar, ah2 ah2Var) {
        this.a = mzgVar;
        this.b = gzaVar;
        this.c = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            ne4 ne4Var = ls2.a;
            long j = ((da2) bVar2.M(ps2.a)).a;
            rm2.a(ne4Var.a(Float.valueOf((!((kb2) bVar2.M(lb2.a)).g() ? ((double) pnb.J(j)) < 0.5d : ((double) pnb.J(j)) > 0.5d) ? 0.6f : 0.74f)), bh2.c(597057613, new ai0(this.a, this.b, this.c), bVar2), bVar2, 56);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
