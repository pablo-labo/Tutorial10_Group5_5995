package defpackage;

import defpackage.slg;
import defpackage.v04;
import defpackage.xf8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s04 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ s04(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                lz3 lz3Var = lz3.m;
                in9.a.getClass();
                return ((v04.a) obj).i(lz3Var, zz3.c);
            case 1:
                wd8 wd8Var = (wd8) obj;
                List<rxf> typeParameters = wd8Var.z().getTypeParameters();
                typeParameters.getClass();
                List<rxf> list = typeParameters;
                ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                for (rxf rxfVar : list) {
                    rxfVar.getClass();
                    arrayList.add(new eg8(wd8Var, rxfVar));
                }
                return arrayList;
            case 2:
                return yf8.a((xf8.b) obj, true);
            case 3:
                gp8 gp8Var = (gp8) obj;
                return bbe.o(gp8Var.a(), gp8Var.c());
            default:
                return (List) ((slg.a) obj).a0.getValue();
        }
    }
}
