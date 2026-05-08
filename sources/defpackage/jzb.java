package defpackage;

import androidx.compose.runtime.b;
import androidx.fragment.app.g;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jzb implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ wu5 c;

    public /* synthetic */ jzb(g gVar, wu5 wu5Var, int i) {
        this.a = i;
        this.b = gVar;
        this.c = wu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wu5 wu5Var = this.c;
        g gVar = this.b;
        pb2 pb2Var = (pb2) obj;
        b bVar = (b) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                pb2Var.getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q1c.d(bh2.c(-1588580552, new h1c(gVar, wu5Var, 0), bVar), bVar, 6);
                    q1c.d(bh2.c(-572001631, new t0c(gVar, wu5Var, 1), bVar), bVar, 6);
                } else {
                    bVar.D();
                }
                break;
            default:
                pb2Var.getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zX = bVar.x(gVar) | bVar.K(wu5Var);
                    Object objV = bVar.v();
                    if (zX || objV == b.a.a) {
                        objV = new jp0(11, gVar, wu5Var);
                        bVar.p(objV);
                    }
                    q1c.c(48, (gu5) objV, bVar, "Add Patent", false);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }
}
