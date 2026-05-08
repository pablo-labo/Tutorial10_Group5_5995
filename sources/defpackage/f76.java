package defpackage;

import androidx.compose.runtime.b;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f76 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f76(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ljg ljgVar = (ljg) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mjg.b(ljgVar, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            default:
                j3h j3hVar = (j3h) obj4;
                List list = (List) obj;
                List list2 = (List) obj2;
                List list3 = (List) obj3;
                list.getClass();
                list2.getClass();
                list3.getClass();
                aub aubVarQ = j3hVar.Q();
                u63.Y(ee3.p(aubVarQ), null, null, new ytb(aubVarQ, list, list2, list3, new pe0(j3hVar, 17), null), 3);
                break;
        }
        return j6g.a;
    }
}
