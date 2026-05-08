package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import defpackage.af1;
import defpackage.el1;
import defpackage.j6g;
import defpackage.qx9;
import defpackage.wf7;
import defpackage.wl7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Lqx9;", "Lel1;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BoxChildDataElement extends qx9<el1> {
    public final af1 b;
    public final boolean c;
    public final Function1<wf7, j6g> d;

    public BoxChildDataElement(af1 af1Var, boolean z, Function1 function1) {
        this.b = af1Var;
        this.c = z;
        this.d = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        el1 el1Var = new el1();
        el1Var.d0 = this.b;
        el1Var.e0 = this.c;
        return el1Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        el1 el1Var = (el1) cVar;
        el1Var.d0 = this.b;
        el1Var.e0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && wl7.b(this.b, boxChildDataElement.b) && this.c == boxChildDataElement.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
