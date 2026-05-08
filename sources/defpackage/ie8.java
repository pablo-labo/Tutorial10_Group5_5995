package defpackage;

import defpackage.ke8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ie8 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ie8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ke8 ke8Var = (ke8) obj;
                List<rxf> listP = ((ke8.a) obj2).b().p();
                listP.getClass();
                List<rxf> list = listP;
                ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                for (rxf rxfVar : list) {
                    rxfVar.getClass();
                    arrayList.add(new eg8(ke8Var, rxfVar));
                }
                return arrayList;
            default:
                return ((bj8) obj2).A0(((tt8) obj).c.invoke());
        }
    }
}
