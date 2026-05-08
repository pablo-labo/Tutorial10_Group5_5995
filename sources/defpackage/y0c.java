package defpackage;

import androidx.compose.runtime.b;
import androidx.fragment.app.g;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y0c implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ wu5 c;
    public final /* synthetic */ svb d;

    public /* synthetic */ y0c(int i, wu5 wu5Var, svb svbVar, g gVar) {
        this.a = i;
        this.b = gVar;
        this.c = wu5Var;
        this.d = svbVar;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        svb svbVar = this.d;
        wu5 wu5Var = this.c;
        g gVar = this.b;
        pb2 pb2Var = (pb2) obj;
        b bVar = (b) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                pb2Var.getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zX = bVar.x(gVar) | bVar.K(wu5Var) | bVar.x(svbVar);
                    Object objV = bVar.v();
                    if (zX || objV == c0020a) {
                        objV = new a67(3, gVar, svbVar, wu5Var);
                        bVar.p(objV);
                    }
                    q1c.c(48, (gu5) objV, bVar, "Edit Award", true);
                } else {
                    bVar.D();
                }
                break;
            default:
                pb2Var.getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zX2 = bVar.x(gVar) | bVar.K(wu5Var) | bVar.x(svbVar);
                    Object objV2 = bVar.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new xv(3, gVar, svbVar, wu5Var);
                        bVar.p(objV2);
                    }
                    q1c.c(48, (gu5) objV2, bVar, "Edit Group", true);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }
}
