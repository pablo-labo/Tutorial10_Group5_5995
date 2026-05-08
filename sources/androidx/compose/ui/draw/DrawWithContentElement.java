package androidx.compose.ui.draw;

import androidx.compose.ui.e;
import defpackage.j6g;
import defpackage.kb4;
import defpackage.qx9;
import defpackage.ss2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "Lqx9;", "Lkb4;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DrawWithContentElement extends qx9<kb4> {
    public final Function1<ss2, j6g> b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(Function1<? super ss2, j6g> function1) {
        this.b = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        kb4 kb4Var = new kb4();
        kb4Var.d0 = this.b;
        return kb4Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((kb4) cVar).d0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithContentElement) {
            return this.b == ((DrawWithContentElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
