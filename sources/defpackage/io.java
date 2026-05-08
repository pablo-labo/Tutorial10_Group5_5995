package defpackage;

import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class io implements ga {
    public static final io b = new io(0);
    public static final io c = new io(1);
    public final /* synthetic */ int a;

    public /* synthetic */ io(int i) {
        this.a = i;
    }

    @Override // defpackage.ga
    public final Object a(mb8 mb8Var, lb3 lb3Var) {
        switch (this.a) {
            case 0:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
            default:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, Object obj) {
        switch (this.a) {
            case 0:
                ho hoVar = (ho) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                hoVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, hoVar.a);
                hc8Var.u0("patents");
                List<xk> list = hoVar.b;
                list.getClass();
                hc8Var.m();
                for (Object obj2 : list) {
                    hc8Var.j();
                    yk.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                break;
            default:
                hmf hmfVar = (hmf) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                hmfVar.getClass();
                hc8Var.u0("atk");
                ha.g gVar = ha.a;
                gVar.b(hc8Var, lb3Var, hmfVar.a);
                hc8Var.u0("telVersionUpperBound");
                gVar.b(hc8Var, lb3Var, "2.3.1");
                break;
        }
    }
}
