package androidx.compose.ui.input.pointer;

import androidx.compose.ui.e;
import defpackage.ia;
import defpackage.n94;
import defpackage.pwe;
import defpackage.q92;
import defpackage.qx9;
import defpackage.ueb;
import defpackage.w80;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;", "Lqx9;", "Lpwe;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StylusHoverIconModifierElement extends qx9<pwe> {
    public final w80 b = q92.b0;
    public final n94 c;

    public StylusHoverIconModifierElement(n94 n94Var) {
        this.c = n94Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new pwe(this.b, this.c);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        pwe pweVar = (pwe) cVar;
        ueb uebVar = pweVar.e0;
        w80 w80Var = this.b;
        if (!wl7.b(uebVar, w80Var)) {
            pweVar.e0 = w80Var;
            if (pweVar.f0) {
                pweVar.e2();
            }
        }
        pweVar.d0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        return wl7.b(this.b, stylusHoverIconModifierElement.b) && wl7.b(this.c, stylusHoverIconModifierElement.c);
    }

    public final int hashCode() {
        int iF = ia.f(this.b.b * 31, 31, false);
        n94 n94Var = this.c;
        return iF + (n94Var != null ? n94Var.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.b + ", overrideDescendants=false, touchBoundsExpansion=" + this.c + ')';
    }
}
