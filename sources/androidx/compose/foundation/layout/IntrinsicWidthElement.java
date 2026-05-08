package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import defpackage.j6g;
import defpackage.qx9;
import defpackage.sl7;
import defpackage.vl7;
import defpackage.wf7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "Lqx9;", "Lvl7;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class IntrinsicWidthElement extends qx9<vl7> {
    public final sl7 b;
    public final boolean c;
    public final Function1<wf7, j6g> d;

    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicWidthElement(sl7 sl7Var, boolean z, Function1<? super wf7, j6g> function1) {
        this.b = sl7Var;
        this.c = z;
        this.d = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        vl7 vl7Var = new vl7();
        vl7Var.d0 = this.b;
        vl7Var.e0 = this.c;
        return vl7Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        vl7 vl7Var = (vl7) cVar;
        vl7Var.d0 = this.b;
        vl7Var.e0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.b == intrinsicWidthElement.b && this.c == intrinsicWidthElement.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
