package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.e;
import defpackage.af1;

/* JADX INFO: loaded from: classes.dex */
public final class qb2 implements pb2 {
    public static final qb2 a = new qb2();

    @Override // defpackage.pb2
    public final e a(e eVar, boolean z) {
        return eVar.o(new LayoutWeightElement(1.0f, z));
    }

    public final e b(e eVar, af1.a aVar) {
        return eVar.o(new HorizontalAlignElement(aVar));
    }
}
