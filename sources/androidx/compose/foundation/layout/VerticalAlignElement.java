package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import defpackage.af1;
import defpackage.hng;
import defpackage.qx9;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignElement;", "Lqx9;", "Lhng;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VerticalAlignElement extends qx9<hng> {
    public final af1.b b;

    public VerticalAlignElement(af1.b bVar) {
        this.b = bVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        hng hngVar = new hng();
        hngVar.d0 = this.b;
        return hngVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((hng) cVar).d0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return wl7.b(this.b, verticalAlignElement.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a);
    }
}
