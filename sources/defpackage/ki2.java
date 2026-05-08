package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ki2 implements wu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ ki2(int i) {
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
                    az4.b(true, false, bVar, 54);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                caa caaVar = (caa) obj;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                caaVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? bVar2.K(caaVar) : bVar2.x(caaVar) ? 4 : 2;
                }
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    caaVar.c(((iIntValue2 << 3) & 112) | 6, bVar2);
                } else {
                    bVar2.D();
                }
                break;
            default:
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (!bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }
}
