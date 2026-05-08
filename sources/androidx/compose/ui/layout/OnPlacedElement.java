package androidx.compose.ui.layout;

import androidx.compose.ui.e;
import defpackage.j6g;
import defpackage.qx9;
import defpackage.sl8;
import defpackage.yqa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnPlacedElement;", "Lqx9;", "Lyqa;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class OnPlacedElement extends qx9<yqa> {
    public final Function1<sl8, j6g> b;

    /* JADX WARN: Multi-variable type inference failed */
    public OnPlacedElement(Function1<? super sl8, j6g> function1) {
        this.b = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        yqa yqaVar = new yqa();
        yqaVar.d0 = this.b;
        return yqaVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((yqa) cVar).d0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnPlacedElement) {
            return this.b == ((OnPlacedElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
