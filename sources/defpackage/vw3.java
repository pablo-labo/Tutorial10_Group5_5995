package defpackage;

import defpackage.ha;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vw3 implements ga {
    public static final vw3 b = new vw3(0);
    public static final vw3 c = new vw3(1);
    public static final vw3 d = new vw3(2);
    public final /* synthetic */ int a;

    public /* synthetic */ vw3(int i) {
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
                uw3 uw3Var = (uw3) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                uw3Var.getClass();
                hc8Var.u0("resumeId");
                ha.g gVar = ha.a;
                gVar.b(hc8Var, lb3Var, uw3Var.a);
                hc8Var.u0("skillIds");
                List<String> list = uw3Var.b;
                list.getClass();
                hc8Var.m();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    gVar.b(hc8Var, lb3Var, it.next());
                }
                hc8Var.l();
                break;
            case 1:
                hc8Var.getClass();
                lb3Var.getClass();
                ((gy7) obj).getClass();
                hc8Var.u0("key");
                ha.g gVar2 = ha.a;
                gVar2.b(hc8Var, lb3Var, null);
                hc8Var.u0("trackingKey");
                gVar2.b(hc8Var, lb3Var, null);
                break;
            default:
                kdg kdgVar = (kdg) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                kdgVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, kdgVar.a);
                hc8Var.u0("patents");
                List<rag> list2 = kdgVar.b;
                list2.getClass();
                hc8Var.m();
                for (Object obj2 : list2) {
                    hc8Var.j();
                    sag.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                break;
        }
    }
}
