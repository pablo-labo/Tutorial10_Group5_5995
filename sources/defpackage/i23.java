package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i23 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ i23(int i, gu5 gu5Var) {
        this.a = i;
        this.b = gu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        gu5 gu5Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    fv6 fv6Var = fv6.o0;
                    boolean zK = bVar.K(gu5Var);
                    Object objV = bVar.v();
                    if (zK || objV == b.a.a) {
                        objV = new zv(1, gu5Var);
                        bVar.p(objV);
                    }
                    ev6.b(fv6Var, f.a(androidx.compose.foundation.b.d(e.a.b, false, null, null, (gu5) objV, 15), "BackArrow"), null, null, 0L, null, bVar, 6, 60);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    q9f.e(6, gu5Var, bVar2, "MyJobs");
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
