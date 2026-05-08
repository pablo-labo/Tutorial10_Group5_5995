package defpackage;

import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zu2 implements ga {
    public static final zu2 b = new zu2(0);
    public static final zu2 c = new zu2(1);
    public static final zu2 d = new zu2(2);
    public final /* synthetic */ int a;

    public /* synthetic */ zu2(int i) {
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

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, Object obj) {
        switch (this.a) {
            case 0:
                yu2 yu2Var = (yu2) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                yu2Var.getClass();
                hc8Var.u0("contentHash");
                ha.g gVar = ha.a;
                gVar.b(hc8Var, lb3Var, yu2Var.a);
                hc8Var.u0("fileName");
                gVar.b(hc8Var, lb3Var, yu2Var.b);
                break;
            case 1:
                ota otaVar = (ota) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                otaVar.getClass();
                hc8Var.u0("accounts");
                ha.g gVar2 = ha.a;
                List<xsa> list = otaVar.a;
                hc8Var.m();
                for (Object obj2 : list) {
                    hc8Var.j();
                    ysa.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                break;
            default:
                leg legVar = (leg) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                legVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, legVar.a);
                hc8Var.u0("workExperiences");
                List<bfg> list2 = legVar.b;
                list2.getClass();
                hc8Var.m();
                for (Object obj3 : list2) {
                    hc8Var.j();
                    cfg.a.b(hc8Var, lb3Var, obj3);
                    hc8Var.t();
                }
                hc8Var.l();
                break;
        }
    }
}
