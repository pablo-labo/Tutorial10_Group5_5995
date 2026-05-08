package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mi2 implements wu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ mi2(int i) {
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
                    az4.b(true, true, bVar, 54);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    cif.b("Your content here", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 6, 0, 131070);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
