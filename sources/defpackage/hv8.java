package defpackage;

import defpackage.cv8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hv8 implements ga<cv8.d> {
    public static final hv8 a = new hv8();
    public static final List<String> b = u63.a0("label", "suid");

    @Override // defpackage.ga
    public final cv8.d a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                strA = ha.i.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    return new cv8.d(strA, strA2);
                }
                strA2 = ha.i.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, cv8.d dVar) {
        cv8.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("label");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, dVar2.a);
        hc8Var.u0("suid");
        nmaVar.b(hc8Var, lb3Var, dVar2.b);
    }
}
