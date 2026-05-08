package androidx.compose.ui.draw;

import androidx.compose.ui.e;
import defpackage.gb4;
import defpackage.j6g;
import defpackage.qx9;
import defpackage.ya4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Lqx9;", "Lya4;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DrawBehindElement extends qx9<ya4> {
    public final Function1<gb4, j6g> b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(Function1<? super gb4, j6g> function1) {
        this.b = function1;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        ya4 ya4Var = new ya4();
        ya4Var.d0 = this.b;
        return ya4Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((ya4) cVar).d0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawBehindElement) {
            return this.b == ((DrawBehindElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
