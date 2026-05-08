package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gh2 implements wu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ gh2(int i) {
        this.a = i;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ak7.a("MyJobs/Applied/TopBanner", bVar, 6);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nj6.d(0, bVar2);
                } else {
                    bVar2.D();
                }
                break;
            default:
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ev6.b(fv6.Z, ygg.g(g.n(f.h(e.a.b, 2.0f, 0.0f, 2), 32.0f), 0.4f), null, zq6.Xs, 0L, null, bVar3, 3126, 52);
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }
}
