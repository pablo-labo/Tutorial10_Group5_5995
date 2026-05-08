package defpackage;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class xia {
    public static final e.c a(ts3 ts3Var, int i) {
        e.c cVar = ts3Var.k().f;
        if (cVar == null || (cVar.d & i) == 0) {
            return null;
        }
        while (cVar != null) {
            int i2 = cVar.c;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return cVar;
            }
            cVar = cVar.f;
        }
        return null;
    }
}
