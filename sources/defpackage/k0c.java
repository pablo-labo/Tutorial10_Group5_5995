package defpackage;

import androidx.compose.runtime.b;
import androidx.fragment.app.g;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k0c implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k0c(int i, Object obj, Object obj2, Object obj3) {
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
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 0:
                g gVar = (g) obj6;
                wu5 wu5Var = (wu5) obj5;
                vsb vsbVar = (vsb) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q1c.d(bh2.c(-230377983, new w0c(i2, gVar, wu5Var), bVar), bVar, 6);
                    q1c.d(bh2.c(1218797496, new k1c(i3, wu5Var, gVar, vsbVar), bVar), bVar, 6);
                } else {
                    bVar.D();
                }
                break;
            default:
                String str = (String) obj6;
                List list = (List) obj5;
                gu5 gu5Var = (gu5) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ml1) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    w78.b(str, list, gu5Var, bVar2, 0);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
