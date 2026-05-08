package androidx.compose.foundation.layout;

import defpackage.sl7;
import defpackage.tf7;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, sl7 sl7Var) {
        return eVar.o(new IntrinsicHeightElement(sl7Var, tf7.a));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar) {
        return eVar.o(new IntrinsicWidthElement(sl7.a, false, tf7.a));
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar) {
        return eVar.o(new IntrinsicWidthElement(sl7.b, true, tf7.a));
    }
}
