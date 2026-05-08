package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rl implements ga {
    public static final rl b = new rl(0);
    public static final rl c = new rl(1);
    public final /* synthetic */ int a;

    public /* synthetic */ rl(int i) {
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
                ql qlVar = (ql) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                qlVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, qlVar.a);
                hc8Var.u0("awards");
                List<vj> list = qlVar.b;
                list.getClass();
                hc8Var.m();
                for (Object obj2 : list) {
                    hc8Var.j();
                    wj.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                return;
            default:
                hc8Var.getClass();
                lb3Var.getClass();
                ((cf2) obj).getClass();
                hc8Var.u0("nameFormat");
                throw null;
        }
    }
}
