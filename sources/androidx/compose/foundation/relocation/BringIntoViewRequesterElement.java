package androidx.compose.foundation.relocation;

import androidx.compose.ui.e;
import defpackage.fn1;
import defpackage.hn1;
import defpackage.in1;
import defpackage.qx9;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Lqx9;", "Lin1;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BringIntoViewRequesterElement extends qx9<in1> {
    public final fn1 b;

    public BringIntoViewRequesterElement(fn1 fn1Var) {
        this.b = fn1Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        in1 in1Var = new in1();
        in1Var.d0 = this.b;
        return in1Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        in1 in1Var = (in1) cVar;
        fn1 fn1Var = in1Var.d0;
        if (fn1Var instanceof hn1) {
            ((hn1) fn1Var).a.j(in1Var);
        }
        fn1 fn1Var2 = this.b;
        if (fn1Var2 instanceof hn1) {
            ((hn1) fn1Var2).a.b(in1Var);
        }
        in1Var.d0 = fn1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return wl7.b(this.b, ((BringIntoViewRequesterElement) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
