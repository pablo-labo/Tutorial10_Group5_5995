package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rq1 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ ese<da2> a;
    public final /* synthetic */ gza b;
    public final /* synthetic */ ah2 c;

    public rq1(ese eseVar, gza gzaVar, ah2 ah2Var) {
        this.a = eseVar;
        this.b = gzaVar;
        this.c = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            rm2.a(ls2.a.a(Float.valueOf(da2.d(this.a.getValue().a))), bh2.c(-869936862, new qq1(this.b, this.c), bVar2), bVar2, 56);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
