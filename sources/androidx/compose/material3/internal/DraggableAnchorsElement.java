package androidx.compose.material3.internal;

import androidx.compose.ui.e;
import defpackage.dwa;
import defpackage.iq2;
import defpackage.oa4;
import defpackage.q30;
import defpackage.qx9;
import defpackage.sa4;
import defpackage.th7;
import defpackage.wl7;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/DraggableAnchorsElement;", "T", "Lqx9;", "Lsa4;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DraggableAnchorsElement<T> extends qx9<sa4<T>> {
    public final q30<T> b;
    public final Function2<th7, iq2, Pair<oa4<T>, T>> c;
    public final dwa d;

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableAnchorsElement(q30<T> q30Var, Function2<? super th7, ? super iq2, ? extends Pair<? extends oa4<T>, ? extends T>> function2, dwa dwaVar) {
        this.b = q30Var;
        this.c = function2;
        this.d = dwaVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        sa4 sa4Var = new sa4();
        sa4Var.d0 = this.b;
        sa4Var.e0 = this.c;
        sa4Var.f0 = this.d;
        return sa4Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        sa4 sa4Var = (sa4) cVar;
        sa4Var.d0 = this.b;
        sa4Var.e0 = this.c;
        sa4Var.f0 = this.d;
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
