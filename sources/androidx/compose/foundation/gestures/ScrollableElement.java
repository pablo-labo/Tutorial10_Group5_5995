package androidx.compose.foundation.gestures;

import androidx.compose.ui.e;
import defpackage.d3a;
import defpackage.dwa;
import defpackage.ia;
import defpackage.jsd;
import defpackage.nsd;
import defpackage.qx9;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Lqx9;", "Ljsd;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ScrollableElement extends qx9<jsd> {
    public final nsd b;
    public final dwa c;
    public final boolean d;
    public final boolean e;
    public final d3a f;

    public ScrollableElement(nsd nsdVar, dwa dwaVar, boolean z, boolean z2, d3a d3aVar) {
        this.b = nsdVar;
        this.c = dwaVar;
        this.d = z;
        this.e = z2;
        this.f = d3aVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new jsd(null, null, this.f, this.c, null, this.b, this.d, this.e);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((jsd) cVar).o2(null, null, this.f, this.c, null, this.b, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return wl7.b(this.b, scrollableElement.b) && this.c == scrollableElement.c && this.d == scrollableElement.d && this.e == scrollableElement.e && wl7.b(this.f, scrollableElement.f);
    }

    public final int hashCode() {
        int iF = ia.f(ia.f((this.c.hashCode() + (this.b.hashCode() * 31)) * 961, 31, this.d), 961, this.e);
        d3a d3aVar = this.f;
        return (iF + (d3aVar != null ? d3aVar.hashCode() : 0)) * 31;
    }
}
