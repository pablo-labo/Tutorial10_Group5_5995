package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hn implements ga {
    public static final hn b = new hn(0);
    public static final hn c = new hn(1);
    public static final hn d = new hn(2);
    public static final hn e = new hn(3);
    public final /* synthetic */ int a;

    public /* synthetic */ hn(int i) {
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

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, Object obj) {
        switch (this.a) {
            case 0:
                gn gnVar = (gn) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                gnVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, gnVar.a);
                hc8Var.u0("licenses");
                List<uk> list = gnVar.b;
                list.getClass();
                hc8Var.m();
                for (Object obj2 : list) {
                    hc8Var.j();
                    vk.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                return;
            case 1:
                hc8Var.getClass();
                lb3Var.getClass();
                ((ey2) obj).getClass();
                hc8Var.u0("key");
                throw null;
            case 2:
                m9c m9cVar = (m9c) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                m9cVar.getClass();
                hc8Var.u0("start");
                mb3 mb3Var = pg3.a;
                lb3Var.e(mb3Var).b(hc8Var, lb3Var, m9cVar.a);
                hc8Var.u0("end");
                lb3Var.e(mb3Var).b(hc8Var, lb3Var, m9cVar.b);
                return;
            default:
                wye wyeVar = (wye) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                wyeVar.getClass();
                hc8Var.u0("messageDraft");
                ha.a.b(hc8Var, lb3Var, wyeVar.a);
                return;
        }
    }
}
