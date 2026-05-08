package defpackage;

import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class cv2 implements ga<bv2> {
    public static final cv2 a = new cv2();

    @Override // defpackage.ga
    public final bv2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, bv2 bv2Var) {
        bv2 bv2Var2 = bv2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        bv2Var2.getClass();
        hc8Var.u0(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX);
        hc8Var.T0(ry2.HQM_DRADIS.a());
        hva.c cVar = bv2Var2.a;
        hc8Var.u0("scope");
        ha.g gVar = ha.a;
        ena enaVar = new ena(oy2.a, false);
        V v = cVar.a;
        if (v == 0) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, v);
        }
    }
}
