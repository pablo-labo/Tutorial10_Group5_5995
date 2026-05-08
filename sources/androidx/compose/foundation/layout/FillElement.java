package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import defpackage.kb5;
import defpackage.o54;
import defpackage.qx9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Lqx9;", "Lkb5;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class FillElement extends qx9<kb5> {
    public final o54 b;
    public final float c;

    public FillElement(o54 o54Var, float f) {
        this.b = o54Var;
        this.c = f;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        kb5 kb5Var = new kb5();
        kb5Var.d0 = this.b;
        kb5Var.e0 = this.c;
        return kb5Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        kb5 kb5Var = (kb5) cVar;
        kb5Var.d0 = this.b;
        kb5Var.e0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.b == fillElement.b && this.c == fillElement.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
