package defpackage;

import defpackage.nc8;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class op1 implements Function1 {
    public static final op1 b = new op1(0);
    public static final op1 c = new op1(1);
    public static final op1 d = new op1(2);
    public static final op1 e = new op1(3);
    public final /* synthetic */ int a;

    public /* synthetic */ op1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                hv1 hv1Var = (hv1) obj;
                int i = pp1.l;
                hv1Var.getClass();
                return Boolean.valueOf((hv1Var instanceof kv5) && z92.I0(qoe.f, vs9.b(hv1Var)));
            case 1:
                xx9 xx9Var = (xx9) obj;
                nc8.a aVar = nc8.d;
                xx9Var.getClass();
                List<lya> listH0 = xx9Var.S(nc8.f).h0();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listH0) {
                    if (obj2 instanceof ip1) {
                        arrayList.add(obj2);
                    }
                }
                return (ip1) z92.O0(arrayList);
            case 2:
                d4c d4cVar = (d4c) obj;
                pxc pxcVar = te8.a;
                d4cVar.getClass();
                return mz3.c.w(d4cVar) + " | " + rhd.b(d4cVar).a();
            default:
                pz3 pz3Var = lwc.a;
                ui8 type = ((rlg) obj).getType();
                type.getClass();
                return lwc.a.X(type);
        }
    }
}
