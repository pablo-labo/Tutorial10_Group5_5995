package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class ty2 implements ga<sy2> {
    public static final ty2 a = new ty2();

    @Override // defpackage.ga
    public final sy2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, sy2 sy2Var) {
        sy2 sy2Var2 = sy2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        sy2Var2.getClass();
        hva<bv2> hvaVar = sy2Var2.b;
        hva<String> hvaVar2 = sy2Var2.a;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("id");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("contextAndScope");
            ha.g gVar = ha.a;
            ena enaVar = new ena(cv2.a, false);
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
    }
}
