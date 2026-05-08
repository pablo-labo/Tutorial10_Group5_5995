package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k9f implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ k9f(int i, gu5 gu5Var) {
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
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q9f.e(6, gu5Var, bVar, "Ace");
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nof.a(gu5Var, bVar2, 48);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
