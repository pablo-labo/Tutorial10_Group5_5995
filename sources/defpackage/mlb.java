package defpackage;

import androidx.compose.runtime.b;
import androidx.fragment.app.g;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mlb implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mlb(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj6;
                String str2 = (String) obj5;
                gu5 gu5Var = (gu5) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ml1) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    olb.a(0, gu5Var, bVar, str, str2);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                g gVar = (g) obj6;
                wu5 wu5Var = (wu5) obj5;
                svb svbVar = (svb) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    q1c.d(bh2.c(-1700242780, new ezb(gVar, wu5Var, 2), bVar2), bVar2, 6);
                    q1c.d(bh2.c(-251067301, new z00(2, gVar, wu5Var, svbVar), bVar2), bVar2, 6);
                    q1c.d(bh2.c(812121308, new dl6(2, gVar, wu5Var), bVar2), bVar2, 6);
                } else {
                    bVar2.D();
                }
                break;
            default:
                b bVar3 = (b) obj2;
                ((Integer) obj3).getClass();
                ((qd0) obj).getClass();
                bVar3.L(1024732638);
                bVar3.F();
                i9d.a((String) obj6, (Long) obj5, null, bVar3, 0);
                break;
        }
        return j6g.a;
    }
}
