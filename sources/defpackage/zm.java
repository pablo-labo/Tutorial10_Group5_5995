package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zm implements ga {
    public static final zm b = new zm(0);
    public static final zm c = new zm(1);
    public final /* synthetic */ int a;

    public /* synthetic */ zm(int i) {
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
                ym ymVar = (ym) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                ymVar.getClass();
                hc8Var.u0("resumeId");
                ha.a.b(hc8Var, lb3Var, ymVar.a);
                hc8Var.u0("languages");
                List<sk> list = ymVar.b;
                list.getClass();
                hc8Var.m();
                for (Object obj2 : list) {
                    hc8Var.j();
                    tk.a.b(hc8Var, lb3Var, obj2);
                    hc8Var.t();
                }
                hc8Var.l();
                break;
            default:
                sye syeVar = (sye) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                syeVar.getClass();
                hc8Var.u0("conversationContextualDataInput");
                ha.g gVar = ha.a;
                pye pyeVar = syeVar.a;
                hc8Var.j();
                hva<String> hvaVar = pyeVar.a;
                if (hvaVar instanceof hva.c) {
                    hc8Var.u0("conversationId");
                    ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
                }
                hc8Var.t();
                hc8Var.u0("generationOptionInput");
                qye qyeVar = syeVar.b;
                hc8Var.j();
                rye.a.b(hc8Var, lb3Var, qyeVar);
                hc8Var.t();
                break;
        }
    }
}
