package defpackage;

import androidx.compose.runtime.b;
import defpackage.a5a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d76 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d76(a5a a5aVar, a5a.a aVar) {
        this.a = 1;
        this.b = a5aVar;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                vnd vndVar = (vnd) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ny7.a(vndVar, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                a5a a5aVar = (a5a) obj4;
                a5a.W.set(a5aVar, null);
                a5aVar.p(null);
                break;
            default:
                gu5 gu5Var = (gu5) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    q9f.e(6, gu5Var, bVar2, "IndeedNumberOneJobSearchSiteClaims");
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ d76(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
