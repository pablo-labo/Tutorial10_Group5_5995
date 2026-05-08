package defpackage;

import defpackage.ha;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mw2 implements ga {
    public static final mw2 b = new mw2(0);
    public static final mw2 c = new mw2(1);
    public static final mw2 d = new mw2(2);
    public final /* synthetic */ int a;

    public /* synthetic */ mw2(int i) {
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
                hc8Var.getClass();
                lb3Var.getClass();
                ((lw2) obj).getClass();
                hc8Var.u0("key");
                throw null;
            case 1:
                bw3 bw3Var = (bw3) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                bw3Var.getClass();
                hc8Var.u0("resumeId");
                ha.g gVar = ha.a;
                gVar.b(hc8Var, lb3Var, bw3Var.a);
                hc8Var.u0("militaryIds");
                List<String> list = bw3Var.b;
                list.getClass();
                hc8Var.m();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    gVar.b(hc8Var, lb3Var, it.next());
                }
                hc8Var.l();
                return;
            default:
                ncg ncgVar = (ncg) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                ncgVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, ncgVar.a);
                hc8Var.u0("licenses");
                List<hag> list2 = ncgVar.b;
                list2.getClass();
                hc8Var.m();
                for (Object obj2 : list2) {
                    hc8Var.j();
                    iag.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                return;
        }
    }
}
