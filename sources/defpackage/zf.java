package defpackage;

import defpackage.ha;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zf implements ga {
    public static final zf b = new zf(0);
    public static final zf c = new zf(1);
    public final /* synthetic */ int a;

    public /* synthetic */ zf(int i) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, Object obj) {
        switch (this.a) {
            case 0:
                yf yfVar = (yf) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                yfVar.getClass();
                hc8Var.u0("conversationId");
                ha.g gVar = ha.a;
                gVar.b(hc8Var, lb3Var, yfVar.a);
                hc8Var.u0("labels");
                List<String> list = yfVar.b;
                hc8Var.m();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    gVar.b(hc8Var, lb3Var, it.next());
                }
                hc8Var.l();
                break;
            default:
                lk lkVar = (lk) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                lkVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, lkVar.a);
                hc8Var.u0("educations");
                List<jk> list2 = lkVar.b;
                list2.getClass();
                hc8Var.m();
                for (Object obj2 : list2) {
                    hc8Var.j();
                    kk.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                break;
        }
    }
}
