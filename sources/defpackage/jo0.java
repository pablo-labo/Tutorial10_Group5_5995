package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jo0 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ jo0(int i, gu5 gu5Var) {
        this.a = i;
        this.b = gu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ev6.b(fv6.W1, androidx.compose.foundation.b.d(e.a.b, false, null, null, this.b, 15), null, null, 0L, null, bVar, 6, 60);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    gt6.o(fv6.U5, this.b, null, null, vt6.Sm, null, bVar2, 24582, 236);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
