package defpackage;

import defpackage.ha;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cx3 implements ga {
    public static final cx3 b = new cx3(0);
    public static final cx3 c = new cx3(1);
    public final /* synthetic */ int a;

    public /* synthetic */ cx3(int i) {
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
                bx3 bx3Var = (bx3) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                bx3Var.getClass();
                hc8Var.u0("resumeId");
                ha.g gVar = ha.a;
                gVar.b(hc8Var, lb3Var, bx3Var.a);
                hc8Var.u0("workExperienceIds");
                List<String> list = bx3Var.b;
                list.getClass();
                hc8Var.m();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    gVar.b(hc8Var, lb3Var, it.next());
                }
                hc8Var.l();
                break;
            default:
                sdg sdgVar = (sdg) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                sdgVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, sdgVar.a);
                hc8Var.u0("publications");
                List<tag> list2 = sdgVar.b;
                list2.getClass();
                hc8Var.m();
                for (Object obj2 : list2) {
                    hc8Var.j();
                    uag.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                break;
        }
    }
}
