package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import defpackage.af1;
import defpackage.qx9;
import defpackage.sj6;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "Lqx9;", "Lsj6;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HorizontalAlignElement extends qx9<sj6> {
    public final af1.a b;

    public HorizontalAlignElement(af1.a aVar) {
        this.b = aVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        sj6 sj6Var = new sj6();
        sj6Var.d0 = this.b;
        return sj6Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((sj6) cVar).d0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return wl7.b(this.b, horizontalAlignElement.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a);
    }
}
