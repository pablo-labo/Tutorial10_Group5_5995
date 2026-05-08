package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class li2 implements wu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ li2(int i) {
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
                    az4.b(false, true, bVar, 54);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ak7.a("MyJobs/Interviews/TopBanner", bVar2, 6);
                } else {
                    bVar2.D();
                }
                break;
            default:
                caa caaVar = (caa) obj;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                caaVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? bVar3.K(caaVar) : bVar3.x(caaVar) ? 4 : 2;
                }
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    caaVar.a(((iIntValue3 << 3) & 112) | 6, bVar3);
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }
}
