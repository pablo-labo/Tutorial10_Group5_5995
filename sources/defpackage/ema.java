package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ema implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ema(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                fma fmaVar = (fma) obj4;
                b bVar = (b) obj2;
                ((Integer) obj3).getClass();
                int i2 = fma.s0;
                ((qd0) obj).getClass();
                boolean zX = bVar.x(fmaVar);
                Object objV = bVar.v();
                b.a.C0020a c0020a = b.a.a;
                if (zX || objV == c0020a) {
                    objV = new la(fmaVar, 19);
                    bVar.p(objV);
                }
                gu5 gu5Var = (gu5) objV;
                boolean zX2 = bVar.x(fmaVar);
                Object objV2 = bVar.v();
                if (zX2 || objV2 == c0020a) {
                    objV2 = new zh(fmaVar, 15);
                    bVar.p(objV2);
                }
                f8c.a(gu5Var, (gu5) objV2, bVar, 0);
                break;
            default:
                gu5 gu5Var2 = (gu5) obj4;
                b bVar2 = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q9f.e(6, gu5Var2, bVar2, "Check canShowPushPrompt()");
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
