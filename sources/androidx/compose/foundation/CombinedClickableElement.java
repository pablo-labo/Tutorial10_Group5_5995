package androidx.compose.foundation;

import androidx.compose.ui.e;
import defpackage.d3a;
import defpackage.g1f;
import defpackage.gu5;
import defpackage.ia;
import defpackage.j6g;
import defpackage.qx9;
import defpackage.tb2;
import defpackage.us3;
import defpackage.w40;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Lqx9;", "Ltb2;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CombinedClickableElement extends qx9<tb2> {
    public final d3a b;
    public final boolean c;
    public final boolean d;
    public final gu5<j6g> e;
    public final gu5<j6g> f;
    public final boolean g;

    public CombinedClickableElement() {
        throw null;
    }

    public CombinedClickableElement(d3a d3aVar, boolean z, gu5 gu5Var, gu5 gu5Var2) {
        this.b = d3aVar;
        this.c = z;
        this.d = true;
        this.e = gu5Var;
        this.f = gu5Var2;
        this.g = true;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new tb2(this.e, this.f, this.g, this.b, this.c, this.d);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        g1f g1fVar;
        tb2 tb2Var = (tb2) cVar;
        tb2Var.A0 = this.g;
        boolean z = false;
        boolean z2 = tb2Var.z0 == null;
        gu5<j6g> gu5Var = this.f;
        if (z2 != (gu5Var == null)) {
            tb2Var.i2();
            us3.f(tb2Var).U();
            z = true;
        }
        tb2Var.z0 = gu5Var;
        boolean z3 = tb2Var.k0;
        boolean z4 = this.d;
        boolean z5 = z3 != z4 ? true : z;
        tb2Var.o2(this.b, null, this.c, z4, null, null, this.e);
        if (!z5 || (g1fVar = tb2Var.o0) == null) {
            return;
        }
        g1fVar.K0();
        j6g j6gVar = j6g.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return wl7.b(this.b, combinedClickableElement.b) && this.c == combinedClickableElement.c && this.d == combinedClickableElement.d && this.e == combinedClickableElement.e && this.f == combinedClickableElement.f && this.g == combinedClickableElement.g;
    }

    public final int hashCode() {
        d3a d3aVar = this.b;
        int iD = w40.d(ia.f(ia.f((d3aVar != null ? d3aVar.hashCode() : 0) * 961, 31, this.c), 29791, this.d), 961, this.e);
        gu5<j6g> gu5Var = this.f;
        return Boolean.hashCode(this.g) + ((iD + (gu5Var != null ? gu5Var.hashCode() : 0)) * 961);
    }
}
