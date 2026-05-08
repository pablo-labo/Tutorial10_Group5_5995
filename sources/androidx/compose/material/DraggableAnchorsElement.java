package androidx.compose.material;

import androidx.compose.ui.e;
import defpackage.ct;
import defpackage.d40;
import defpackage.dwa;
import defpackage.qx9;
import defpackage.ta4;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/DraggableAnchorsElement;", "T", "Lqx9;", "Lta4;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DraggableAnchorsElement<T> extends qx9<ta4<T>> {
    public final d40<T> b;
    public final ct c;
    public final dwa d = dwa.a;

    public DraggableAnchorsElement(d40 d40Var, ct ctVar) {
        this.b = d40Var;
        this.c = ctVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        ta4 ta4Var = new ta4();
        ta4Var.d0 = this.b;
        ta4Var.e0 = this.c;
        ta4Var.f0 = this.d;
        return ta4Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ta4 ta4Var = (ta4) cVar;
        ta4Var.d0 = this.b;
        ta4Var.e0 = this.c;
        ta4Var.f0 = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return wl7.b(this.b, draggableAnchorsElement.b) && this.c == draggableAnchorsElement.c && this.d == draggableAnchorsElement.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
