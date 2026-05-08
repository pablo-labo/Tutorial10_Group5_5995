package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.ux;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xx implements ga<ux.b> {
    public static final xx a = new xx();
    public static final List<String> b = u63.Z("userDisplayPreferenceMutations");

    @Override // defpackage.ga
    public final ux.b a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        ux.f fVar = null;
        while (mb8Var.D1(b) == 0) {
            cy cyVar = cy.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(cyVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            fVar = (ux.f) objA;
        }
        return new ux.b(fVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ux.b bVar) {
        ux.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("userDisplayPreferenceMutations");
        cy cyVar = cy.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(cyVar, false);
        ux.f fVar = bVar2.a;
        if (fVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, fVar);
        }
    }
}
