package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.ui.e;
import defpackage.af1;
import defpackage.c20;

/* JADX INFO: loaded from: classes.dex */
public final class ghd implements fhd {
    public static final ghd a = new ghd();

    @Override // defpackage.fhd
    public final e a(e eVar, float f) {
        if (f <= 0.0d) {
            yd7.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return eVar.o(new LayoutWeightElement(f, true));
    }

    public final e b(e eVar, c20.c cVar) {
        return eVar.o(new VerticalAlignElement((af1.b) cVar));
    }
}
