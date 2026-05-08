package defpackage;

import defpackage.d36;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f36 implements ga<d36.a> {
    public static final f36 a = new f36();
    public static final List<String> b = u63.a0("query", "location");

    @Override // defpackage.ga
    public final d36.a a(mb8 mb8Var, lb3 lb3Var) {
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
                    return new d36.a(strA, strA2);
                }
                strA2 = ha.i.a(mb8Var, lb3Var);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, d36.a aVar) {
        d36.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("query");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, aVar2.a);
        hc8Var.u0("location");
        nmaVar.b(hc8Var, lb3Var, aVar2.b);
    }
}
