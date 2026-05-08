package androidx.compose.foundation;

import androidx.compose.ui.e;
import defpackage.ei7;
import defpackage.qx9;
import defpackage.ta7;
import defpackage.ts3;
import defpackage.ua7;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Lqx9;", "Lta7;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class IndicationModifierElement extends qx9<ta7> {
    public final ei7 b;
    public final ua7 c;

    public IndicationModifierElement(ei7 ei7Var, ua7 ua7Var) {
        this.b = ei7Var;
        this.c = ua7Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        ts3 ts3VarA = this.c.a(this.b);
        ta7 ta7Var = new ta7();
        ta7Var.f0 = ts3VarA;
        ta7Var.c2(ts3VarA);
        return ta7Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ta7 ta7Var = (ta7) cVar;
        ts3 ts3VarA = this.c.a(this.b);
        ta7Var.d2(ta7Var.f0);
        ta7Var.f0 = ts3VarA;
        ta7Var.c2(ts3VarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return wl7.b(this.b, indicationModifierElement.b) && wl7.b(this.c, indicationModifierElement.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
