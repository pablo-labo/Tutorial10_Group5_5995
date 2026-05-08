package defpackage;

import androidx.compose.runtime.b;
import androidx.fragment.app.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zg4 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zg4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                g4a g4aVar = (g4a) obj5;
                g4a g4aVar2 = (g4a) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tg3 tg3Var = (tg3) g4aVar.getValue();
                    Object objV = bVar.v();
                    if (objV == c0020a) {
                        objV = new v02(g4aVar, i2);
                        bVar.p(objV);
                    }
                    Function2 function2 = (Function2) objV;
                    String strI = ak2.I(w61.b.a(), bVar);
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = new sy(1, g4aVar2);
                        bVar.p(objV2);
                    }
                    gz9.b(tg3Var, function2, strI, false, (Function1) objV2, 0, bVar, 1597488, 168);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                gu5 gu5Var = (gu5) obj5;
                String str = (String) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    if (gu5Var == null) {
                        bVar2.L(-1966070339);
                    } else {
                        bVar2.L(-1966070338);
                        e71.a(0, gu5Var, bVar2, str);
                    }
                    bVar2.F();
                } else {
                    bVar2.D();
                }
                break;
            default:
                g gVar = (g) obj5;
                wu5 wu5Var = (wu5) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zX = bVar3.x(gVar) | bVar3.K(wu5Var);
                    Object objV3 = bVar3.v();
                    if (zX || objV3 == c0020a) {
                        objV3 = new sj4(4, gVar, wu5Var);
                        bVar3.p(objV3);
                    }
                    q1c.c(48, (gu5) objV3, bVar3, "Review Additional Info Suggestion", true);
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }
}
