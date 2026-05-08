package androidx.compose.foundation.layout;

import defpackage.iq2;
import defpackage.tf7;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return eVar.o(new AspectRatioElement(tf7.a));
    }

    public static final boolean b(int i, int i2, long j) {
        int iJ = iq2.j(j);
        if (i > iq2.h(j) || iJ > i) {
            return false;
        }
        return i2 <= iq2.g(j) && iq2.i(j) <= i2;
    }
}
