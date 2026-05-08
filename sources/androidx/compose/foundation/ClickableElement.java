package androidx.compose.foundation;

import androidx.compose.ui.e;
import defpackage.d3a;
import defpackage.gu5;
import defpackage.ia;
import defpackage.j6g;
import defpackage.j72;
import defpackage.qed;
import defpackage.qx9;
import defpackage.ua7;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Lqx9;", "Lj72;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ClickableElement extends qx9<j72> {
    public final d3a b;
    public final ua7 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final qed g;
    public final gu5<j6g> h;

    public ClickableElement() {
        throw null;
    }

    public ClickableElement(d3a d3aVar, ua7 ua7Var, boolean z, boolean z2, String str, qed qedVar, gu5 gu5Var) {
        this.b = d3aVar;
        this.c = ua7Var;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = qedVar;
        this.h = gu5Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new j72(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((j72) cVar).o2(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return wl7.b(this.b, clickableElement.b) && wl7.b(this.c, clickableElement.c) && this.d == clickableElement.d && this.e == clickableElement.e && wl7.b(this.f, clickableElement.f) && wl7.b(this.g, clickableElement.g) && this.h == clickableElement.h;
    }

    public final int hashCode() {
        d3a d3aVar = this.b;
        int iHashCode = (d3aVar != null ? d3aVar.hashCode() : 0) * 31;
        ua7 ua7Var = this.c;
        int iF = ia.f(ia.f((iHashCode + (ua7Var != null ? ua7Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode2 = (iF + (str != null ? str.hashCode() : 0)) * 31;
        qed qedVar = this.g;
        return this.h.hashCode() + ((iHashCode2 + (qedVar != null ? Integer.hashCode(qedVar.a) : 0)) * 31);
    }
}
