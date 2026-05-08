package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qo implements ga {
    public static final qo b = new qo(0);
    public static final qo c = new qo(1);
    public final /* synthetic */ int a;

    public /* synthetic */ qo(int i) {
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
                po poVar = (po) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                poVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, poVar.a);
                hc8Var.u0("publications");
                List<zk> list = poVar.b;
                list.getClass();
                hc8Var.m();
                for (Object obj2 : list) {
                    hc8Var.j();
                    al.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                break;
            default:
                hc8Var.getClass();
                lb3Var.getClass();
                ((y08) obj).getClass();
                hc8Var.u0("suid");
                ha.a.b(hc8Var, lb3Var, null);
                break;
        }
    }
}
