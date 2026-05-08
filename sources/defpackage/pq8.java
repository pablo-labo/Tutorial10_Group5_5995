package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.runtime.b;
import defpackage.qq8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pq8 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ qq8 a;
    public final /* synthetic */ qq8.a b;

    public pq8(qq8 qq8Var, qq8.a aVar) {
        this.a = qq8Var;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            qq8 qq8Var = this.a;
            c cVar = (c) qq8Var.b.invoke();
            qq8.a aVar = this.b;
            int iC = aVar.c;
            Object obj = aVar.a;
            if ((iC >= cVar.a() || !cVar.g(iC).equals(obj)) && (iC = cVar.c(obj)) != -1) {
                aVar.c = iC;
            }
            if (iC != -1) {
                bVar2.L(-1664741271);
                sq8.a(cVar, qq8Var.a, iC, aVar.a, bVar2, 0);
                bVar2.F();
            } else {
                bVar2.L(-1664505826);
                bVar2.F();
            }
            boolean zX = bVar2.x(aVar);
            Object objV = bVar2.v();
            if (zX || objV == b.a.a) {
                objV = new ne(aVar, 9);
                bVar2.p(objV);
            }
            to4.b(obj, (Function1) objV, bVar2);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
