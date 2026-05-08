package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ri5 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ long a;
    public final /* synthetic */ ah2 b;

    public ri5(long j, ah2 ah2Var) {
        this.a = j;
        this.b = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            rm2.a(ls2.a.a(Float.valueOf(da2.d(this.a))), bh2.c(-1072292694, new qi5(this.b), bVar2), bVar2, 56);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
