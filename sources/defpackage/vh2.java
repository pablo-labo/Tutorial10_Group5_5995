package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vh2 implements wu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ vh2(int i) {
        this.a = i;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ev6.b(fv6.g8, null, null, zq6.Xs, vg2.a, null, bVar, 27654, 38);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (!bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
