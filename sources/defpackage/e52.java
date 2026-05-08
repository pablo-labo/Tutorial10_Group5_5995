package defpackage;

import defpackage.ha;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e52 implements ga {
    public static final e52 b = new e52(0);
    public static final e52 c = new e52(1);
    public static final e52 d = new e52(2);
    public final /* synthetic */ int a;

    public /* synthetic */ e52(int i) {
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
                d52 d52Var = (d52) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                d52Var.getClass();
                hc8Var.u0("firstName");
                ha.g gVar = ha.a;
                gVar.b(hc8Var, lb3Var, d52Var.a);
                hc8Var.u0("lastName");
                gVar.b(hc8Var, lb3Var, d52Var.b);
                break;
            case 1:
                vv3 vv3Var = (vv3) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                vv3Var.getClass();
                hc8Var.u0("resumeId");
                ha.g gVar2 = ha.a;
                gVar2.b(hc8Var, lb3Var, vv3Var.a);
                hc8Var.u0("linkIds");
                List<String> list = vv3Var.b;
                list.getClass();
                hc8Var.m();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    gVar2.b(hc8Var, lb3Var, it.next());
                }
                hc8Var.l();
                break;
            default:
                lcg lcgVar = (lcg) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                lcgVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, lcgVar.a);
                hc8Var.u0("languages");
                List<fag> list2 = lcgVar.b;
                list2.getClass();
                hc8Var.m();
                for (Object obj2 : list2) {
                    hc8Var.j();
                    gag.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                break;
        }
    }
}
