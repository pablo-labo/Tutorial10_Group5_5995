package androidx.compose.ui.layout;

import defpackage.am8;
import defpackage.vf9;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final Object a(vf9 vf9Var) {
        Object objG = vf9Var.g();
        am8 am8Var = objG instanceof am8 ? (am8) objG : null;
        if (am8Var != null) {
            return am8Var.V0();
        }
        return null;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, String str) {
        return eVar.o(new LayoutIdElement(str));
    }
}
