package androidx.compose.ui.layout;

import android.annotation.SuppressLint;
import androidx.compose.ui.e;
import defpackage.pm8;
import defpackage.qx9;
import defpackage.us3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/RulerProviderModifierElement;", "Lqx9;", "Landroidx/compose/ui/layout/b0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ModifierNodeInspectableProperties"})
final class RulerProviderModifierElement extends qx9<b0> {
    public final f b;

    public RulerProviderModifierElement(f fVar) {
        this.b = fVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new b0(this.b);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        b0 b0Var = (b0) cVar;
        f fVar = b0Var.e0;
        f fVar2 = this.b;
        if (fVar != fVar2) {
            b0Var.e0 = fVar2;
            pm8.j0(us3.f(b0Var), false, 7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.b : null) == this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
