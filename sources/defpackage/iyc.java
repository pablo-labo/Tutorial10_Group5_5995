package defpackage;

import defpackage.dyc;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iyc implements ga<dyc.d> {
    public static final List<String> a = u63.Z("onlineStatus");

    public static dyc.d c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        dyc.f fVar = null;
        while (mb8Var.D1(a) == 0) {
            kyc kycVar = kyc.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(kycVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            fVar = (dyc.f) objA;
        }
        return new dyc.d(fVar);
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, dyc.d dVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        dVar.getClass();
        hc8Var.u0("onlineStatus");
        kyc kycVar = kyc.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(kycVar, false);
        dyc.f fVar = dVar.a;
        if (fVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, fVar);
        }
    }
}
