package defpackage;

import defpackage.ha;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pv3 implements ga {
    public static final pv3 b = new pv3(0);
    public static final pv3 c = new pv3(1);
    public static final pv3 d = new pv3(2);
    public final /* synthetic */ int a;

    public /* synthetic */ pv3(int i) {
        this.a = i;
    }

    @Override // defpackage.ga
    public final Object a(mb8 mb8Var, lb3 lb3Var) {
        switch (this.a) {
            case 0:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
            case 1:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
            default:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, Object obj) {
        switch (this.a) {
            case 0:
                ov3 ov3Var = (ov3) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                ov3Var.getClass();
                hc8Var.u0("resumeId");
                ha.g gVar = ha.a;
                gVar.b(hc8Var, lb3Var, ov3Var.a);
                hc8Var.u0("licenseIds");
                List<String> list = ov3Var.b;
                list.getClass();
                hc8Var.m();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    gVar.b(hc8Var, lb3Var, it.next());
                }
                hc8Var.l();
                break;
            case 1:
                wb7 wb7Var = (wb7) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                wb7Var.getClass();
                hc8Var.u0("jobKeys");
                ha.g gVar2 = ha.a;
                List<String> list2 = wb7Var.a;
                hc8Var.m();
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    gVar2.b(hc8Var, lb3Var, it2.next());
                }
                hc8Var.l();
                hc8Var.u0("proctorGroups");
                gVar2.b(hc8Var, lb3Var, wb7Var.b);
                break;
            default:
                kcg kcgVar = (kcg) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                kcgVar.getClass();
                hc8Var.u0("resume");
                ha.g gVar3 = ha.a;
                h48 h48Var = kcgVar.a;
                hc8Var.j();
                i48.a.b(hc8Var, lb3Var, h48Var);
                hc8Var.t();
                break;
        }
    }
}
