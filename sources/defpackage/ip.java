package defpackage;

import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ip implements ga {
    public static final ip b = new ip(0);
    public static final ip c = new ip(1);
    public static final ip d = new ip(2);
    public static final ip e = new ip(3);
    public final /* synthetic */ int a;

    public /* synthetic */ ip(int i) {
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
                hp hpVar = (hp) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                hpVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, hpVar.a);
                hc8Var.u0("workExperiences");
                List<mq> list = hpVar.b;
                list.getClass();
                hc8Var.m();
                for (Object obj2 : list) {
                    hc8Var.j();
                    nq.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                return;
            case 1:
                py1 py1Var = (py1) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                py1Var.getClass();
                hc8Var.u0("filter");
                yo yoVar = yo.c;
                ha.g gVar = ha.a;
                oy1 oy1Var = py1Var.a;
                hc8Var.j();
                yoVar.b(hc8Var, lb3Var, oy1Var);
                hc8Var.t();
                return;
            case 2:
                hc8Var.getClass();
                lb3Var.getClass();
                ((py2) obj).getClass();
                hc8Var.u0("key");
                throw null;
            default:
                hc8Var.getClass();
                lb3Var.getClass();
                ((v38) obj).getClass();
                hc8Var.u0("taxonomyConcept");
                ha.g gVar2 = ha.a;
                hc8Var.j();
                jq.a.b(hc8Var, lb3Var, null);
                hc8Var.t();
                return;
        }
    }
}
