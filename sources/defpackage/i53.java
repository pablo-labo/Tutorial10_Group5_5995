package defpackage;

import defpackage.g53;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i53 implements ga<g53.a> {
    public static final i53 a = new i53();
    public static final List<String> b = u63.a0("emailPhoneRedactedResumeUrl", "nameEmailPhoneRedactedResumeUrl", "originalResumeUrl", "pdfResumeUrl");

    @Override // defpackage.ga
    public final g53.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Object objA = null;
        Object objA2 = null;
        Object objA3 = null;
        Object objA4 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                objA = ha.m.a(mb8Var, lb3Var);
            } else if (iD1 == 1) {
                objA2 = ha.m.a(mb8Var, lb3Var);
            } else if (iD1 == 2) {
                objA3 = ha.m.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 3) {
                    return new g53.a(objA, objA2, objA3, objA4);
                }
                objA4 = ha.m.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, g53.a aVar) {
        g53.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("emailPhoneRedactedResumeUrl");
        nma<Object> nmaVar = ha.m;
        nmaVar.b(hc8Var, lb3Var, aVar2.a);
        hc8Var.u0("nameEmailPhoneRedactedResumeUrl");
        nmaVar.b(hc8Var, lb3Var, aVar2.b);
        hc8Var.u0("originalResumeUrl");
        nmaVar.b(hc8Var, lb3Var, aVar2.c);
        hc8Var.u0("pdfResumeUrl");
        nmaVar.b(hc8Var, lb3Var, aVar2.d);
    }
}
