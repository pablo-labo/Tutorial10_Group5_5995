package defpackage;

import defpackage.ag;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fg implements ga<ag.c> {
    public static final fg a = new fg();
    public static final List<String> b = u63.Z("addConversationLabels");

    @Override // defpackage.ga
    public final ag.c a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ag.a aVar = null;
        while (mb8Var.D1(b) == 0) {
            dg dgVar = dg.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(dgVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            aVar = (ag.a) objA;
        }
        return new ag.c(aVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ag.c cVar) {
        ag.c cVar2 = cVar;
        hc8Var.getClass();
        lb3Var.getClass();
        cVar2.getClass();
        hc8Var.u0("addConversationLabels");
        dg dgVar = dg.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(dgVar, false);
        ag.a aVar = cVar2.a;
        if (aVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, aVar);
        }
    }
}
