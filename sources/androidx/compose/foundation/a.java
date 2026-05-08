package androidx.compose.foundation;

import defpackage.dce;
import defpackage.tbe;
import defpackage.tf7;
import defpackage.ytc;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static androidx.compose.ui.e a(androidx.compose.ui.e eVar, tbe tbeVar, dce dceVar, int i) {
        if ((i & 2) != 0) {
            dceVar = ytc.a;
        }
        return eVar.o(new BackgroundElement(0L, tbeVar, dceVar, tf7.a, 1));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, long j, dce dceVar) {
        return eVar.o(new BackgroundElement(j, null, dceVar, tf7.a, 2));
    }
}
