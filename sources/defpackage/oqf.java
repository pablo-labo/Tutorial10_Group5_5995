package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class oqf extends tu2 {
    public final UUID l(c2 c2Var) {
        t8e t8eVar = (t8e) this.a;
        if (!(t8eVar.b != null)) {
            c49.a.getClass();
            f49 f49Var = c49.d;
            if (f49Var != null) {
                f49Var.e("oqf", "Recreating tracker instance after it was removed. This will not be supported in future versions.");
            }
        }
        return t8eVar.c().c(c2Var);
    }
}
