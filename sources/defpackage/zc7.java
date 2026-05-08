package defpackage;

import defpackage.wc7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zc7 implements ga<wc7.b> {
    public static final zc7 a = new zc7();
    public static final List<String> b = u63.a0("firstName", "lastName");

    @Override // defpackage.ga
    public final wc7.b a(mb8 mb8Var, lb3 lb3Var) {
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
                    return new wc7.b(strA, strA2);
                }
                strA2 = ha.i.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wc7.b bVar) {
        wc7.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("firstName");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("lastName");
        nmaVar.b(hc8Var, lb3Var, bVar2.b);
    }
}
