package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.e;
import defpackage.qx9;
import defpackage.sea;
import defpackage.tea;
import defpackage.wl7;
import defpackage.xea;
import defpackage.yea;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Lqx9;", "Lxea;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class NestedScrollElement extends qx9<xea> {
    public final sea b;
    public final tea c;

    public NestedScrollElement(sea seaVar, tea teaVar) {
        this.b = seaVar;
        this.c = teaVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new xea(this.b, this.c);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        xea xeaVar = (xea) cVar;
        xeaVar.d0 = this.b;
        tea teaVar = xeaVar.e0;
        if (teaVar.a == xeaVar) {
            teaVar.a = null;
        }
        tea teaVar2 = this.c;
        if (teaVar2 == null) {
            xeaVar.e0 = new tea();
        } else if (teaVar2 != teaVar) {
            xeaVar.e0 = teaVar2;
        }
        if (xeaVar.c0) {
            tea teaVar3 = xeaVar.e0;
            teaVar3.a = xeaVar;
            teaVar3.b = null;
            xeaVar.f0 = null;
            teaVar3.c = new yea(xeaVar);
            xeaVar.e0.d = xeaVar.Q1();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return wl7.b(nestedScrollElement.b, this.b) && wl7.b(nestedScrollElement.c, this.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        tea teaVar = this.c;
        return iHashCode + (teaVar != null ? teaVar.hashCode() : 0);
    }
}
