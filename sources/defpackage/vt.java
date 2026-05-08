package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class vt implements ga<ut> {
    public static final vt a = new vt();

    @Override // defpackage.ga
    public final ut a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ut utVar) {
        ut utVar2 = utVar;
        hc8Var.getClass();
        lb3Var.getClass();
        utVar2.getClass();
        hc8Var.u0("resumeFileId");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, utVar2.a);
        hc8Var.u0("clientName");
        gVar.b(hc8Var, lb3Var, utVar2.b);
        hc8Var.u0("status");
        u8d u8dVar = utVar2.c;
        u8dVar.getClass();
        hc8Var.T0(u8dVar.a());
        hva<String> hvaVar = utVar2.d;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("replacementResumeFileId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
