package androidx.compose.foundation;

import androidx.compose.ui.e;
import defpackage.d3a;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, boolean z, d3a d3aVar) {
        return eVar.o(z ? new FocusableElement(d3aVar) : e.a.b);
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, boolean z, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return a(eVar, z, null);
    }
}
