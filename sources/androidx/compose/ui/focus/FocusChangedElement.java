package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import defpackage.j6g;
import defpackage.nl5;
import defpackage.qx9;
import defpackage.xm5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Lqx9;", "Lnl5;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class FocusChangedElement extends qx9<nl5> {
    public final Function1<xm5, j6g> b;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(Function1<? super xm5, j6g> function1) {
        this.b = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        nl5 nl5Var = new nl5();
        nl5Var.d0 = this.b;
        return nl5Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((nl5) cVar).d0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusChangedElement) {
            return this.b == ((FocusChangedElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
