package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import defpackage.an8;
import defpackage.qx9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Lqx9;", "Lan8;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LayoutWeightElement extends qx9<an8> {
    public final float b;
    public final boolean c;

    public LayoutWeightElement(float f, boolean z) {
        this.b = f;
        this.c = z;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        an8 an8Var = new an8();
        an8Var.d0 = this.b;
        an8Var.e0 = this.c;
        return an8Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        an8 an8Var = (an8) cVar;
        an8Var.d0 = this.b;
        an8Var.e0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.b == layoutWeightElement.b && this.c == layoutWeightElement.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }
}
