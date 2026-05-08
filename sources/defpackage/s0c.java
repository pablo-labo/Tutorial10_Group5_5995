package defpackage;

import androidx.compose.runtime.b;
import androidx.fragment.app.g;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s0c implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ wu5 d;

    public /* synthetic */ s0c(g gVar, svb svbVar, wu5 wu5Var) {
        this.a = 1;
        this.b = gVar;
        this.c = svbVar;
        this.d = wu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.c;
        wu5 wu5Var = this.d;
        g gVar = this.b;
        switch (i) {
            case 0:
                svb svbVar = (svb) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q1c.d(bh2.c(-1233785601, new jzb(gVar, wu5Var, 1), bVar), bVar, 6);
                    q1c.d(bh2.c(-217206680, new u78(1, gVar, wu5Var, svbVar), bVar), bVar, 6);
                    q1c.d(bh2.c(94184391, new ox2(3, gVar, wu5Var), bVar), bVar, 6);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                svb svbVar2 = (svb) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zX = bVar2.x(gVar) | bVar2.x(svbVar2) | bVar2.K(wu5Var);
                    Object objV = bVar2.v();
                    if (zX || objV == b.a.a) {
                        objV = new yv2(2, gVar, svbVar2, wu5Var);
                        bVar2.p(objV);
                    }
                    q1c.c(48, (gu5) objV, bVar2, "Edit Work Experience", true);
                } else {
                    bVar2.D();
                }
                break;
            default:
                vsb vsbVar = (vsb) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    q1c.d(bh2.c(-1598872794, new e0c(gVar, wu5Var, 1), bVar3), bVar3, 6);
                    q1c.d(bh2.c(-149697315, new ol4(1, gVar, vsbVar, wu5Var), bVar3), bVar3, 6);
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ s0c(g gVar, wu5 wu5Var, Object obj, int i) {
        this.a = i;
        this.b = gVar;
        this.d = wu5Var;
        this.c = obj;
    }
}
