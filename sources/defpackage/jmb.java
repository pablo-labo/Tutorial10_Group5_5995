package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jmb implements Function2<b, Integer, j6g> {
    public final /* synthetic */ Object[] a;
    public final /* synthetic */ c3a b;

    public jmb(Object[] objArr, c3a c3aVar) {
        this.a = objArr;
        this.b = c3aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            ah2 ah2Var = xj2.a;
            Object[] objArr = this.a;
            boolean zX = bVar2.x(objArr);
            Object objV = bVar2.v();
            if (zX || objV == b.a.a) {
                objV = new sj4(2, this.b, objArr);
                bVar2.p(objV);
            }
            si5.a((gu5) objV, null, null, 0L, 0L, null, bVar2, 6);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
