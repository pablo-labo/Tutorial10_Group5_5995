package defpackage;

import androidx.compose.runtime.b;
import androidx.fragment.app.g;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i1c implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ vu5 d;

    public /* synthetic */ i1c(int i, vu5 vu5Var, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = vu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        vu5 vu5Var = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                g gVar = (g) obj5;
                svb svbVar = (svb) obj4;
                wu5 wu5Var = (wu5) vu5Var;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zX = bVar.x(gVar) | bVar.x(svbVar) | bVar.K(wu5Var);
                    Object objV = bVar.v();
                    if (zX || objV == b.a.a) {
                        objV = new y00(3, gVar, svbVar, wu5Var);
                        bVar.p(objV);
                    }
                    q1c.c(48, (gu5) objV, bVar, "Edit Publications", true);
                } else {
                    bVar.D();
                }
                break;
            default:
                String str = (String) obj5;
                List list = (List) obj4;
                gu5 gu5Var = (gu5) vu5Var;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ml1) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    w78.b(str, list, gu5Var, bVar2, 0);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
