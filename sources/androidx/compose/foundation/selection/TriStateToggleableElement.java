package androidx.compose.foundation.selection;

import androidx.compose.ui.e;
import defpackage.d3a;
import defpackage.gu5;
import defpackage.ia;
import defpackage.inf;
import defpackage.j6g;
import defpackage.qed;
import defpackage.qtf;
import defpackage.qx9;
import defpackage.ua7;
import defpackage.us3;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableElement;", "Lqx9;", "Lqtf;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TriStateToggleableElement extends qx9<qtf> {
    public final inf b;
    public final d3a c;
    public final ua7 d;
    public final boolean e;
    public final qed f;
    public final gu5<j6g> g;

    public TriStateToggleableElement() {
        throw null;
    }

    public TriStateToggleableElement(inf infVar, d3a d3aVar, ua7 ua7Var, boolean z, qed qedVar, gu5 gu5Var) {
        this.b = infVar;
        this.c = d3aVar;
        this.d = ua7Var;
        this.e = z;
        this.f = qedVar;
        this.g = gu5Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        qtf qtfVar = new qtf(this.c, this.d, false, this.e, null, this.f, this.g);
        qtfVar.A0 = this.b;
        return qtfVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        qtf qtfVar = (qtf) cVar;
        inf infVar = qtfVar.A0;
        inf infVar2 = this.b;
        if (infVar != infVar2) {
            qtfVar.A0 = infVar2;
            us3.f(qtfVar).U();
        }
        qtfVar.o2(this.c, this.d, false, this.e, null, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.b == triStateToggleableElement.b && wl7.b(this.c, triStateToggleableElement.c) && wl7.b(this.d, triStateToggleableElement.d) && this.e == triStateToggleableElement.e && wl7.b(this.f, triStateToggleableElement.f) && this.g == triStateToggleableElement.g;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        d3a d3aVar = this.c;
        int iHashCode2 = (iHashCode + (d3aVar != null ? d3aVar.hashCode() : 0)) * 31;
        ua7 ua7Var = this.d;
        int iF = ia.f(ia.f((iHashCode2 + (ua7Var != null ? ua7Var.hashCode() : 0)) * 31, 31, false), 31, this.e);
        qed qedVar = this.f;
        return this.g.hashCode() + ((iF + (qedVar != null ? Integer.hashCode(qedVar.a) : 0)) * 31);
    }
}
