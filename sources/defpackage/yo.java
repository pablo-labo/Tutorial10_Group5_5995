package defpackage;

import defpackage.ha;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yo implements ga {
    public static final yo b = new yo(0);
    public static final yo c = new yo(1);
    public static final yo d = new yo(2);
    public static final yo e = new yo(3);
    public final /* synthetic */ int a;

    public /* synthetic */ yo(int i) {
        this.a = i;
    }

    @Override // defpackage.ga
    public final Object a(mb8 mb8Var, lb3 lb3Var) {
        switch (this.a) {
            case 0:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
            case 1:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
            case 2:
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
                xo xoVar = (xo) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                xoVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, xoVar.a);
                hc8Var.u0("skills");
                List<pp> list = xoVar.b;
                list.getClass();
                hc8Var.m();
                for (Object obj2 : list) {
                    hc8Var.j();
                    qp.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                return;
            case 1:
                oy1 oy1Var = (oy1) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                oy1Var.getClass();
                hc8Var.u0("attributeIds");
                ha.g gVar = ha.a;
                List<String> list2 = oy1Var.a;
                hc8Var.m();
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    gVar.b(hc8Var, lb3Var, it.next());
                }
                hc8Var.l();
                return;
            case 2:
                hc8Var.getClass();
                lb3Var.getClass();
                ((k18) obj).getClass();
                hc8Var.u0("id");
                ha.a.b(hc8Var, lb3Var, null);
                hc8Var.u0("values");
                throw null;
            default:
                hc8Var.getClass();
                lb3Var.getClass();
                ((fja) obj).getClass();
                hc8Var.u0("email");
                ha.a.b(hc8Var, lb3Var, null);
                hc8Var.u0("source");
                throw null;
        }
    }
}
