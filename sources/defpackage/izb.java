package defpackage;

import androidx.compose.runtime.b;
import androidx.fragment.app.g;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class izb implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ wu5 c;

    public /* synthetic */ izb(g gVar, wu5 wu5Var, int i) {
        this.a = i;
        this.b = gVar;
        this.c = wu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        wu5 wu5Var = this.c;
        g gVar = this.b;
        int i2 = 1;
        pb2 pb2Var = (pb2) obj;
        b bVar = (b) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                pb2Var.getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q1c.d(bh2.c(-1446817815, new t0c(gVar, wu5Var, 0), bVar), bVar, 6);
                    q1c.d(bh2.c(2357664, new izb(gVar, wu5Var, i2), bVar), bVar, 6);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                pb2Var.getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zX = bVar.x(gVar) | bVar.K(wu5Var);
                    Object objV = bVar.v();
                    if (zX || objV == c0020a) {
                        objV = new oyb(gVar, wu5Var, 1);
                        bVar.p(objV);
                    }
                    q1c.c(48, (gu5) objV, bVar, "Review Minimum Base Pay Suggestion", true);
                } else {
                    bVar.D();
                }
                break;
            default:
                pb2Var.getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zX2 = bVar.x(gVar) | bVar.K(wu5Var);
                    Object objV2 = bVar.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new mr(8, gVar, wu5Var);
                        bVar.p(objV2);
                    }
                    q1c.c(48, (gu5) objV2, bVar, "Add Publications", false);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }
}
