package defpackage;

import defpackage.cbg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fbg implements ga<cbg.b> {
    public static final fbg a = new fbg();
    public static final List<String> b = u63.a0("id", "additionalInfo");

    @Override // defpackage.ga
    public final cbg.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String strA = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                str = (String) ha.a.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                strA = ha.i.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new cbg.b(str, strA);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, cbg.b bVar) {
        cbg.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0("additionalInfo");
        ha.i.b(hc8Var, lb3Var, bVar2.b);
    }
}
