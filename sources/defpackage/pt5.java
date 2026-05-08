package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pt5 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pt5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ut5 ut5Var = (ut5) obj4;
                b bVar = (b) obj2;
                ((Integer) obj3).getClass();
                ((qd0) obj).getClass();
                nhb nhbVarG = ut5Var.N().g();
                boolean zX = bVar.x(ut5Var);
                Object objV = bVar.v();
                b.a.C0020a c0020a = b.a.a;
                if (zX || objV == c0020a) {
                    objV = new qr(ut5Var, 4);
                    bVar.p(objV);
                }
                gu5 gu5Var = (gu5) objV;
                boolean zX2 = bVar.x(ut5Var);
                Object objV2 = bVar.v();
                if (zX2 || objV2 == c0020a) {
                    objV2 = new xh(ut5Var, 5);
                    bVar.p(objV2);
                }
                gu5 gu5Var2 = (gu5) objV2;
                boolean zX3 = bVar.x(ut5Var);
                Object objV3 = bVar.v();
                if (zX3 || objV3 == c0020a) {
                    objV3 = new zh(ut5Var, 8);
                    bVar.p(objV3);
                }
                gu5 gu5Var3 = (gu5) objV3;
                boolean zX4 = bVar.x(ut5Var);
                Object objV4 = bVar.v();
                if (zX4 || objV4 == c0020a) {
                    objV4 = new nj(ut5Var, 12);
                    bVar.p(objV4);
                }
                ihb.a(nhbVarG, gu5Var, gu5Var2, gu5Var3, null, (gu5) objV4, bVar, 24576);
                break;
            default:
                gu5 gu5Var4 = (gu5) obj4;
                b bVar2 = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q9f.e(6, gu5Var4, bVar2, "SERP");
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
