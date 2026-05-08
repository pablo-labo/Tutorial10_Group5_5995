package androidx.compose.foundation.selection;

import androidx.compose.ui.e;
import defpackage.d3a;
import defpackage.gu5;
import defpackage.ia;
import defpackage.j6g;
import defpackage.qed;
import defpackage.qx9;
import defpackage.ua7;
import defpackage.us3;
import defpackage.wl7;
import defpackage.wzd;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "Lqx9;", "Lwzd;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SelectableElement extends qx9<wzd> {
    public final boolean b;
    public final d3a c;
    public final ua7 d;
    public final boolean e;
    public final boolean f;
    public final qed g;
    public final gu5<j6g> h;

    public SelectableElement() {
        throw null;
    }

    public SelectableElement(boolean z, d3a d3aVar, ua7 ua7Var, boolean z2, boolean z3, qed qedVar, gu5 gu5Var) {
        this.b = z;
        this.c = d3aVar;
        this.d = ua7Var;
        this.e = z2;
        this.f = z3;
        this.g = qedVar;
        this.h = gu5Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        wzd wzdVar = new wzd(this.c, this.d, this.e, this.f, null, this.g, this.h);
        wzdVar.A0 = this.b;
        return wzdVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        wzd wzdVar = (wzd) cVar;
        boolean z = wzdVar.A0;
        boolean z2 = this.b;
        if (z != z2) {
            wzdVar.A0 = z2;
            us3.f(wzdVar).U();
        }
        wzdVar.o2(this.c, this.d, this.e, this.f, null, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.b == selectableElement.b && wl7.b(this.c, selectableElement.c) && wl7.b(this.d, selectableElement.d) && this.e == selectableElement.e && this.f == selectableElement.f && wl7.b(this.g, selectableElement.g) && this.h == selectableElement.h;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.b) * 31;
        d3a d3aVar = this.c;
        int iHashCode2 = (iHashCode + (d3aVar != null ? d3aVar.hashCode() : 0)) * 31;
        ua7 ua7Var = this.d;
        int iF = ia.f(ia.f((iHashCode2 + (ua7Var != null ? ua7Var.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
        qed qedVar = this.g;
        return this.h.hashCode() + ((iF + (qedVar != null ? Integer.hashCode(qedVar.a) : 0)) * 31);
    }
}
