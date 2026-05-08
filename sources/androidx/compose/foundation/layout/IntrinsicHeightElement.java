package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import defpackage.j6g;
import defpackage.ol7;
import defpackage.qx9;
import defpackage.sl7;
import defpackage.wf7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "Lqx9;", "Lol7;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class IntrinsicHeightElement extends qx9<ol7> {
    public final sl7 b;
    public final boolean c = true;
    public final Function1<wf7, j6g> d;

    public IntrinsicHeightElement(sl7 sl7Var, Function1 function1) {
        this.b = sl7Var;
        this.d = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        ol7 ol7Var = new ol7();
        ol7Var.d0 = this.b;
        ol7Var.e0 = this.c;
        return ol7Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ol7 ol7Var = (ol7) cVar;
        ol7Var.d0 = this.b;
        ol7Var.e0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.b == intrinsicHeightElement.b && this.c == intrinsicHeightElement.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
