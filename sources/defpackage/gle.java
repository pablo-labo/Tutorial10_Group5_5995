package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class gle implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public gle(long j, qke qkeVar, String str) {
        this.b = j;
        this.c = qkeVar;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        long j = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Number) obj2).intValue();
                qke qkeVar = (qke) obj3;
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hza hzaVar = iq1.a;
                    wl3 wl3VarC = iq1.c(j, bVar, 5);
                    boolean zX = bVar.x(qkeVar);
                    Object objV = bVar.v();
                    if (zX || objV == b.a.a) {
                        objV = new ye(qkeVar, 24);
                        bVar.p(objV);
                    }
                    sq1.c((gu5) objV, null, wl3VarC, null, bh2.c(-929149933, new fle((String) obj4), bVar), bVar, 805306368, 382);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                Function2 function2 = (Function2) obj4;
                Float f = (Float) obj3;
                if (!bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    bVar2.D();
                } else if (f != null) {
                    bVar2.L(1484860324);
                    rm2.a(ls2.a.a(f), function2, bVar2, 8);
                    bVar2.F();
                } else {
                    bVar2.L(1485059902);
                    rm2.a(ls2.a.a(Float.valueOf(da2.d(j))), function2, bVar2, 8);
                    bVar2.F();
                }
                break;
        }
        return j6g.a;
    }

    public gle(long j, Float f, Function2 function2) {
        this.c = f;
        this.d = function2;
        this.b = j;
    }
}
