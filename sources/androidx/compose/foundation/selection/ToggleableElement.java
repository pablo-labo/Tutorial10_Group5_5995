package androidx.compose.foundation.selection;

import androidx.compose.ui.e;
import defpackage.d3a;
import defpackage.hnf;
import defpackage.ia;
import defpackage.j6g;
import defpackage.qed;
import defpackage.qx9;
import defpackage.us3;
import defpackage.wl7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Lqx9;", "Lhnf;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ToggleableElement extends qx9<hnf> {
    public final boolean b;
    public final d3a c;
    public final boolean d;
    public final qed e;
    public final Function1<Boolean, j6g> f;

    public ToggleableElement() {
        throw null;
    }

    public ToggleableElement(boolean z, d3a d3aVar, boolean z2, qed qedVar, Function1 function1) {
        this.b = z;
        this.c = d3aVar;
        this.d = z2;
        this.e = qedVar;
        this.f = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new hnf(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        hnf hnfVar = (hnf) cVar;
        boolean z = hnfVar.A0;
        boolean z2 = this.b;
        if (z != z2) {
            hnfVar.A0 = z2;
            us3.f(hnfVar).U();
        }
        hnfVar.B0 = this.f;
        hnfVar.o2(this.c, null, false, this.d, null, this.e, hnfVar.C0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.b == toggleableElement.b && wl7.b(this.c, toggleableElement.c) && this.d == toggleableElement.d && wl7.b(this.e, toggleableElement.e) && this.f == toggleableElement.f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.b) * 31;
        d3a d3aVar = this.c;
        int iF = ia.f(ia.f((iHashCode + (d3aVar != null ? d3aVar.hashCode() : 0)) * 961, 31, false), 31, this.d);
        qed qedVar = this.e;
        return this.f.hashCode() + ((iF + (qedVar != null ? Integer.hashCode(qedVar.a) : 0)) * 31);
    }
}
