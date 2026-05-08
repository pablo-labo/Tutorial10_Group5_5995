package defpackage;

import defpackage.vxc;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yxc implements ga<vxc.b> {
    public static final yxc a = new yxc();
    public static final List<String> b = u63.a0("success", "message");

    @Override // defpackage.ga
    public final vxc.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        Boolean bool = null;
        String str = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 == 0) {
                bool = (Boolean) ha.f.a(mb8Var, lb3Var);
            } else {
                if (iD1 != 1) {
                    break;
                }
                str = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (bool == null) {
            mh2.q(mb8Var, "success");
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        if (str != null) {
            return new vxc.b(str, zBooleanValue);
        }
        mh2.q(mb8Var, "message");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, vxc.b bVar) {
        vxc.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("success");
        ha.f.b(hc8Var, lb3Var, Boolean.valueOf(bVar2.a));
        hc8Var.u0("message");
        ha.a.b(hc8Var, lb3Var, bVar2.b);
    }
}
