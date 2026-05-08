package defpackage;

import defpackage.xj8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zj8 implements ga<xj8.b> {
    public static final zj8 a = new zj8();
    public static final List<String> b = u63.Z("suid");

    @Override // defpackage.ga
    public final xj8.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        while (mb8Var.D1(b) == 0) {
            strA = ha.i.a(mb8Var, lb3Var);
        }
        return new xj8.b(strA);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, xj8.b bVar) {
        xj8.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("suid");
        ha.i.b(hc8Var, lb3Var, bVar2.a);
    }
}
