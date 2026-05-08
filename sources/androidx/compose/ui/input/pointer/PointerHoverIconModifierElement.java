package androidx.compose.ui.input.pointer;

import androidx.compose.ui.e;
import defpackage.qx9;
import defpackage.teb;
import defpackage.ueb;
import defpackage.w80;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Lqx9;", "Lteb;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PointerHoverIconModifierElement extends qx9<teb> {
    public final w80 b;

    public PointerHoverIconModifierElement(w80 w80Var) {
        this.b = w80Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new teb(this.b);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        teb tebVar = (teb) cVar;
        ueb uebVar = tebVar.e0;
        w80 w80Var = this.b;
        if (wl7.b(uebVar, w80Var)) {
            return;
        }
        tebVar.e0 = w80Var;
        if (tebVar.f0) {
            tebVar.e2();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PointerHoverIconModifierElement) && wl7.b(this.b, ((PointerHoverIconModifierElement) obj).b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.b + ", overrideDescendants=false)";
    }
}
