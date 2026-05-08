package defpackage;

import defpackage.b32;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aia implements b32 {
    public static final aia a = new aia();

    @Override // defpackage.b32
    public final String a(iv7 iv7Var) {
        return b32.a.a(this, iv7Var);
    }

    @Override // defpackage.b32
    public final boolean b(iv7 iv7Var) {
        List<rlg> listI = iv7Var.i();
        listI.getClass();
        List<rlg> list = listI;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (rlg rlgVar : list) {
            rlgVar.getClass();
            if (b04.a(rlgVar) || rlgVar.u0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.b32
    public final String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}
